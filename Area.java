import javax.swing.*;
import java.util.Locale;

public class Area {

    public void DisplayMenu(){

        String menu;
        menu = JOptionPane.showInputDialog(
                """
                        AREAS FOR PARKING
                         1. DEFENCE
                         2. SADDAR
                         3. GULSHAN
                         4. FB AREA
                         5. CLIFTON
                        """
        );
        if(menu.toLowerCase(Locale.ROOT).equals("defence")){
            JOptionPane.showMessageDialog(null, "VIEW AVAILIBLE PARKINGS","PARKINGS",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"\n" +
                    "                        AVALIBLE SLOTS\n" +
                    "                         1. A2\n" +
                    "                         2. B1\n" +
                    "                         3. B2\n" +
                    "                        ");
            JOptionPane.showConfirmDialog(null,"RETURN TO MENU");

        }

        else if(menu.toLowerCase(Locale.ROOT).equals("saddar")){
            JOptionPane.showMessageDialog(null, "VIEW AVAILIBLE PARKINGS","PARKINGS",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"\n" +
                    "                        AVALIBLE SLOTS\n" +
                    "                         1. A2\n" +
                    "                         2. B1\n" +
                    "                        ");
            JOptionPane.showConfirmDialog(null,"RETURN TO MENU");

        }

        else if(menu.toLowerCase(Locale.ROOT).equals("gulshan")){
            JOptionPane.showMessageDialog(null, "VIEW AVAILIBLE PARKINGS","PARKINGS",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"\n" +
                    "                        AVALIBLE SLOTS\n" +
                    "                         1. A1\n" +
                    "                         2. A2\n" +
                    "                         3. B1\n" +
                    "                        ");
            JOptionPane.showConfirmDialog(null,"RETURN TO MENU");
        }

        else if(menu.toLowerCase(Locale.ROOT).equals("fb area")){
            JOptionPane.showMessageDialog(null, "VIEW AVAILIBLE PARKINGS","PARKINGS",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"\n" +
                    "                        AVALIBLE SLOTS\n" +
                    "                         1. A1\n" +
                    "                         2. A2\n" +
                    "                         3. B1\n" +
                    "                        ");
            JOptionPane.showConfirmDialog(null,"RETURN TO MENU");
        }

        else if(menu.toLowerCase(Locale.ROOT).equals("clifton")){
            JOptionPane.showMessageDialog(null, "VIEW AVAILIBLE PARKINGS","PARKINGS",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"\n" +
                    "                        AVALIBLE SLOTS\n" +
                    "                         1. A1\n" +
                    "                         2. A3\n" +
                    "                         3. B2\n" +
                    "                        ");
            JOptionPane.showConfirmDialog(null,"RETURN TO MENU");
        }



    }
}
