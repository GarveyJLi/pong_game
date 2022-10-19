import processing.core.PApplet;

public class Ball
{
    private int score, deadBall = 0;
    private PApplet applet;
    private float x, y, xSpeed, ySpeed, ballDiameter;


    public Ball(PApplet app)
    {
        applet = app;
        x = (float) (Math.random() * applet.width - 50);
        y = (float) (100);
        xSpeed = 1;
        ySpeed = 1;
        ballDiameter = (float) 50;
    }

    public void display()
    {
        applet.fill(0);
        applet.ellipse(x, y, ballDiameter, ballDiameter);
    }

    public void move()
    {
        x += xSpeed;
        y += ySpeed;
    }

    public void checkCollisions(Paddle p)
    {
        if ((x - (ballDiameter / 2)) + ballDiameter > applet.width || x - (ballDiameter / 2) < 0)
        {
            xSpeed = xSpeed * -1;
        }
        if (y - (ballDiameter / 2) < 0 /*|| (y - (ballDiameter / 2)) + ballDiameter > applet.height*/)
        {
            ySpeed = ySpeed * -1;

        }
        if ((x > p.getX() && x < p.getX() + 200) && (y - (ballDiameter / 2)) + ballDiameter > 449)
        {
            ySpeed *= -1;
            if (score >= 0)
            {
                if (Math.abs(ySpeed) < 10)
                {
                    ySpeed *= (Math.random() * 0.3 + 1);
                }
                if (Math.abs(xSpeed) < 10)
                {
                    xSpeed *= (Math.random() * 0.3 + 1);
                }
            }
            //applet.background((int)(Math.random() * 255),(int)Math.random() * 255,(int)Math.random() * 255);
            if ((ySpeed > 0 || ySpeed < 0) && (xSpeed > 0 || xSpeed < 0))
            {
                score++;
            }
        }
        if (((y - (ballDiameter / 2)) + ballDiameter > 450 ))
        if ((y - (ballDiameter / 2)) + ballDiameter > applet.height)
        {
            ySpeed = 0;
            xSpeed = 0;
            deadBall++;

        }

    }

    /*public void checkCollisions2(Paddle2 p2)
    {
        /*if ((x - (ballDiameter / 2)) + ballDiameter > applet.width || x - (ballDiameter / 2) < 0)
        {
            xSpeed = xSpeed * -1;
        }
        if (y - (ballDiameter / 2) < 0 || (y - (ballDiameter / 2)) + ballDiameter > applet.height)
        {
            ySpeed = ySpeed * -1;

        }
        if ((x > p2.getX2() && x < p2.getX2() + 100) && (y - (ballDiameter / 2)) + ballDiameter >= p2.getY2())
        {
            ySpeed = (ySpeed + 1) * -1;
            if (xSpeed > 0)
            {
                xSpeed += 1;
            }
            if (xSpeed < 0)
            {
                xSpeed -= 1;
            }
            score++;

        }
        if ((y - (ballDiameter / 2)) + ballDiameter > applet.height)
        {
            ySpeed = 0;
            xSpeed = 0;
        }

    }
*/
    public int getScore()
    {
        return score;
    }

    public double getxSpeed()
    {
        double xs = Math.abs(xSpeed);
        return xs;
    }

    public double getySpeed()
    {
        double ys = Math.abs(ySpeed);
        return ys;
    }
    public double getBalls()
    {
        return deadBall;
    }
}
