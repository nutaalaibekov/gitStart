package kg.itacademy.lesson32;

public enum WeekDays {
    MONDAY(1, "ПН"),
    TUESDAY(2, "ВТ"),
    WEDNESDAY(3, "СР"),
    THURSDAY(4, "ЧТ"),
    FRIDAY(5, "ПТ"),
    SATURDAY(6, "СБ"),
    SUNDAY(7, "ВС");

    private int code;
    private String ru;

    WeekDays(int code, String ru) {
        this.code = code;
        this.ru = ru;
    }


    public int getCode() {
        return this.code;
    }
    public String getRu() {
        return this.ru;
    }
}
