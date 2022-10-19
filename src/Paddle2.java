import processing.core.PApplet;

public class Paddle2 extends PApplet
{
    private PApplet applet;
    private float x, y, xSpeed;
    private int boxHeight, boxWidth;
//ignore this entire thing
    public Paddle2(PApplet app)
    {
        applet = app;
        x = 0;
        y = 450;
        boxHeight = 50;
        boxWidth = 100;
        xSpeed = 20;
    }

    public void display()
    {
        applet.fill(0);
        applet.rect(x, y, boxWidth, boxHeight);
    }

    public void move()
    {
        if (applet.keyPressed)
        {
            if (applet.key == 'a')
            {
                x -= xSpeed;
            }
            if (applet.key == 'd')
            {
                x += xSpeed;
            }
        }

    }

    public float getX2()
    {
        return x;
    }
    public float getY2()
    {
        return y;
    }
}
