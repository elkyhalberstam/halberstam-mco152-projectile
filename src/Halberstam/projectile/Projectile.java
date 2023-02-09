package Halberstam.projectile;

public class Projectile
{
    private final double angle;
    private final double velocity;
    private double radianAngle;
    private double time;

    public Projectile(double angle, double velocity)
    {
        this.angle = angle;
        this.velocity = velocity;
        radianAngle = Math.toRadians(angle);
        time = 0;   // time should always start at 0
    }

    public double getTime() {
        return time;
    }

    public double getVelocity() {
        return velocity;
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

        return Math.cos(radianAngle) * velocity * time;
    }

    public double getY()
    {
        return Math.sin(radianAngle) * velocity * time - .5 * 9.8 * (time*time);
    }


}
