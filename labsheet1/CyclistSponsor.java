package labsheet1;
import javax.swing.*;
public class CyclistSponsor {
    public static void main(String[] args) {
        String name;
        int km;
        final double sponsor1 = 1.75, sponsor2 = 2.50;
        double amount;

        name = JOptionPane.showInputDialog("Please enter your name");
        km = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of km cycled"));

        if(km <= 10);
            amount = sponsor1*km;
            amount = sponsor1*10 + sponsor2*(km - 10);

        JOptionPane.showMessageDialog(null,"Name: " + name +
                        "\nDistance cycled: " + km + "\nSponsorship amount due: €" + String.format("%.2f",amount),
                "Receipt",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);


    }
}
