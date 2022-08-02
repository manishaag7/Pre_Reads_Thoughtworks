import processing.core.PApplet;

class Ball{
    public static final int DIAMETER = 20;
    int start,height,speed;
    public Ball(int start,int height,int speed) {
        this.start = start;
        this.height = height;
        this.speed = speed;
    }

}

public class FourBallsOOP extends PApplet{
    public static final int WIDTH = 600;
    public static final int HEIGHT = 400;

    Ball ball1,ball2,ball3,ball4;

    int speed1=1,speed2=2,speed3=3,speed4=4;
    int height1= HEIGHT/5,height2= 2*HEIGHT/5,height3= 3*HEIGHT/5,height4= 4*HEIGHT/5;

    public static void main(String[] args){
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        ball1=new Ball(0,height1,speed1);
        ball2=new Ball(0,height2,speed2);
        ball3=new Ball(0,height3,speed3);
        ball4=new Ball(0,height4,speed4);
    }

    @Override
    public void draw() {
        drawCircle(ball1);
        drawCircle(ball2);
        drawCircle(ball3);
        drawCircle(ball4);
    }

    private void drawCircle(Ball Obj) {
        ellipse(Obj.start,Obj.height,Ball.DIAMETER,Ball.DIAMETER);
        Obj.start+=Obj.speed;
    }

}
