import processing.core.PApplet;
public class FourBalls extends PApplet{


    public static final int WIDTH = 600;
    public static final int HEIGHT = 400;
    public static final int DIAMETER = 20;

    int start1=0,start2=0,start3=0,start4=0;
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
    }

    @Override
    public void draw() {
        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();
    }

    private void drawCircle1() {
        ellipse(start1,height1,DIAMETER,DIAMETER);
        start1+=speed1;
    }

    private void drawCircle2() {
        ellipse(start2,height2,DIAMETER,DIAMETER);
        start2+=speed2;
    }

    private void drawCircle3() {
        ellipse(start3,height3,DIAMETER,DIAMETER);
        start3+=speed3;
    }

    private void drawCircle4() {
        ellipse(start4,height4,DIAMETER,DIAMETER);
        start4+=speed4;
    }

}
