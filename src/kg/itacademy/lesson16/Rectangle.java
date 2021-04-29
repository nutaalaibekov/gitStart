package kg.itacademy.lesson16;

public class Rectangle {
    int width;
    int height;
    int area;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    String color = "black";

    public int getWidth() {
        return width;
    }
    public void setWidth(int w) {
        if (w <= 0) {
            System.err.println("Нельзя задавать отрицательое знач");
        } else {
            width = w;
            System.out.println("Одобрено");
        }

    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int h) {
        if (h <= 0) {
            System.err.println("Нельзя задавать отрицательое знач");
        } else {
            height = h;
            System.out.println("Одобрено");
        }
    }

    public int getArea() {
        area = width * height;
        return area;
    }

}