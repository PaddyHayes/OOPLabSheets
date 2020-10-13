package labsheet1;
import java.util.Scanner;

public class PlanetGravity {
    public static void main(String[] args) {
        final float g = 9.81f;
        float mp, me, rp, re, gp;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the mass of the planet earth");
        me = input.nextFloat();
        System.out.print("Please enter the radius of the planet earth");
        re = input.nextFloat();
        System.out.print("Please enter the mass of the other planet");
        mp = input.nextFloat();
        System.out.print("Please enter the radius of the other planet");
        rp = input.nextFloat();

        gp = g*mp*re*re/(me*rp*rp);

        System.out.println("\n\nThe acceleration due to gravity on the other planet is " +
                String.format("%.2f",gp) + " m/s/s");
    }
}
