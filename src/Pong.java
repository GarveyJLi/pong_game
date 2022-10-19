import processing.core.PApplet;

public class Pong extends PApplet
{
    Ball b, b2;
    Paddle p;
    //Paddle2 p2;

    public static void main(String[] args)
    {
        PApplet.main("Pong");
        PApplet.main("Paddle");
        //PApplet.main("Paddle2");
    }

    public void settings()
    {
        size(600, 500);
    }

    public void setup()
    {
        b = new Ball(this);
        b2 = new Ball(this);
        p = new Paddle(this);
        // p2 = new Paddle2(this);

    }

    public void draw()
    {
        background(255, 255, 255);


        b.display();
        b2.display();
        b2.move();
        b.move();
        b2.checkCollisions(p);
        b.checkCollisions(p);
        //b.checkCollisions2(p2);
        //b2.checkCollisions2(p2);
        //p2.display();
        p.display();
        //p2.move();
        p.move();
        textSize(20);
        textAlign(LEFT);
        text("Score: " + (b.getScore() + b2.getScore()), 500, 20);
        text("Y1 Speed: " + b.getySpeed(), 465, 40);
        text("X1 Speed: " + b.getxSpeed(), 465, 60);
        text("Y2 Speed: " + b2.getySpeed(), 465, 80);
        text("X2 Speed: " + b2.getxSpeed(), 465, 100);
        if (b.getxSpeed() == 0 && b2.getxSpeed() == 0)
        {
            textAlign(CENTER);
            textSize(50);
            text("GAME OVER", 250,50);
        }
        /*if (b.getBalls() + b2.getBalls() == 2)
        {
            textSize(50);
            text("GAME OVER", 300, 200);
        }*/

    }
}
