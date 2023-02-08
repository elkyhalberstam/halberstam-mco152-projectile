package Halberstam.projectile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectileTest
{
    @Test
    public void getX()
    {
        // given
        Projectile one = new Projectile(39, 77);
        // when
        one.incTime(6);
        double x = one.getX();
        // then
        assertEquals(359.0414, x, .0001);
    }

    @Test
    public void getY()
    {
        // given
        Projectile one = new Projectile(39, 77);
        // when
        one.incTime(6);
        double x = one.getY();
        // then
        assertEquals(114.3460, x, .0001);
    }
}