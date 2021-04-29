package lessons16Alexander;

public class Rectangle {
    int sideA;
    int sideB;
    int area;
    String col;

    public int getSideA(){
        return sideA;
    }
   public void setSideA(int a){
       sideA = a;
   }

   public int getSideB(){
        return sideB;
   }
   public  void setSideB(int b){
       sideB = b;
   }

   public int getArea (){
         area = sideA * sideB;
       return area;
   }

   public void setColor(String color){
       col = color;
   }
   public String getColor(){
        if(area % 2 == 0){
            col = "Зеленый";
            return col;
        }
       if(area % 3 == 0){
           col = "Зеленый";
           return col;
       }
       if(area % 5 == 0){
           col = "Зеленый";
           return col;
       }else return col = "Неизвестный цвет";
   }


}

