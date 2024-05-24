import java.awt.*;
import java.util.Random;

public class Shape {

    // Atributes
    private Color color;
    private double x;
    private double y;
    private double speedX;
    private double speedY;

    Random r = new Random();

    // Constructors

    public Shape() {
        this.color = this.colorGenerate();
        this.x = r.nextInt(500)+1;
        this.y = r.nextInt(500)+1;
        this.speedX = r.nextInt(10)+1;
        this.speedY = r.nextInt(10)+1;
    }

    // Methods

    public void move(){
        this.x+=speedX;
        this.y+=speedY;
    }

    private Color colorGenerate(){
        Random r = new Random();
        return new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
    }

    // public abstract void draw(Graphics g);

    // Getters and Setters

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getSpeedX() {
        return speedX;
    }

    public void setSpeedX(double speedX) {
        this.speedX = speedX;
    }

    public double getSpeedY() {
        return speedY;
    }

    public void setSpeedY(double speedY) {
        this.speedY = speedY;
    }

    // toString()

    @Override
    public String toString() {
        return "Shape{" +
                "color=" + color +
                ", x=" + x +
                ", y=" + y +
                ", speedX=" + speedX +
                ", speedY=" + speedY +
                '}';
    }
}
