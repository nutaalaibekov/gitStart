package kg.itacademy.lesson16;

public class Rectangle {
    int width;
    int height;
    int area;

    public int getWidth() {
        return width;
    }
    public void setWidth(int w) {
        width = w;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int h) {
        height = h;
    }

    public int getArea() {
        area = width * height;
        return area;
    }

}