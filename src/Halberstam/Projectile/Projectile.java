package Halberstam.Projectile;

public class Projectile
{
    private final double angle;
    private final double v;
    private double radianAngle;
    private double time;

    public Projectile(double angle, double v)
    {
        this.angle = angle;
        this.v = v;
        radianAngle = Math.toRadians(angle);
        time = 0;   // time should always start at 0
    }

    public double getTime() {
        return time;
    }

    public double getV() {
        return v;
    }

    public double getAngle() {
        return angle;
    }

    public void incTime(double delta)
    {
        time+=delta;
    }

    public double getX()
    {

        return Math.cos(radianAngle) * v * time;
    }

    public double getY()
    {
        return Math.sin(radianAngle) * v * time - .5 * 9.8 * Math.pow(time,2);
    }


}
