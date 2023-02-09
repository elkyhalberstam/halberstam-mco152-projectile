package Halberstam.projectile;

public class Main {

    public static void main(String[] args) {

        Projectile one = new Projectile(39, 77);

        for(int t=0; t<=10; t++)
        {
            one.incTime(1);
            System.out.println("t = " +t +": x = " + one.getX()+"\ty = " + one.getY());
        }
    }
}
