package kg.itacademy.practice;


public class ChessBoard {

    private Rectangle[][] fields = new Rectangle[8][8];
    private Circle[] circles = new Circle[12];

    public boolean fillField(Rectangle field) {
        if (field == null) {
            return false;
        }

        if (field.getLocation().getX() >= 8 || field.getLocation().getX() < 0) {
            return false;
        }

        if (field.getLocation().getY() >= 8 || field.getLocation().getY() < 0) {
            return false;
        }

        fields[field.getLocation().getX()][field.getLocation().getY()] = field;

        return true;
    }

    public Rectangle getField(int i, int j) {
        return fields[i][j];
    }

    public boolean addCircles(Circle circle) {
        if (circle == null) {
            return false;
        }

        for(int i = 0; i < circles.length; i++) {
            if (circles[i] == null) {
                circles[i] = circle;
                return true;
            }
        }

        return false;
    }

    public Circle getCircle(int i, int j) {
        for(Circle circle : circles) {
            if (circle == null) {
                continue;
            }
            if (circle.getLocation() == null) {
                continue;
            }
            if (circle.getLocation().getX() == i && circle.getLocation().getY() == j) {
                return circle;
            }
        }
        return null;
    }

}
