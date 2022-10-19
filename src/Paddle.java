import processing.core.PApplet;

public class Paddle extends PApplet
{
    private PApplet applet;
    private float x, y, xSpeed;
    private int boxHeight, boxWidth;

    public Paddle(PApplet app)
    {
        applet = app;
        x = 400;
        y = 450;
        boxHeight = 50;
        boxWidth = 200;
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
            if (applet.keyCode == LEFT)
            {
                x -= xSpeed;
            }
            if (applet.keyCode == RIGHT)
            {
                x += xSpeed;
            }
        }

    }

    public float getX()
    {
        return x;
    }
    public float getY()
    {
        return y;
    }
}
