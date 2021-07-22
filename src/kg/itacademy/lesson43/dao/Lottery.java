package kg.itacademy.lesson43.dao;

import kg.itacademy.lesson43.model.LotteryModel;
import kg.itacademy.lesson43.model.PrizeModel;
import kg.itacademy.lesson43.model.TicketModel;

import java.util.List;

public interface Lottery {
    // Создание лоттореи
    LotteryModel createLottery(LotteryModel lotteryModel);
    PrizeModel createPrize(LotteryModel lotteryModel, PrizeModel prizeModel);
    boolean createTickets(List<TicketModel> tickets);

    // Распространение билетов
    boolean sellTicket(Integer ticketId);

    // Розыгрыш призов
    boolean chooseWinner(TicketModel ticketModel, PrizeModel prizeModel);

    List<TicketModel> getAllTicetsByLottery(LotteryModel lotteryModel);
    List<PrizeModel> getAllPrizeByLottery(LotteryModel lotteryModel);
}
