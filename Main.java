import javax.swing.JOptionPane;
import java.util.Scanner;

interface Login{
    String UserName="admin";
    String Password="1234";
}

public class Main implements Login{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String User;
        String Pwd;
        Area a1 = new Area();
        Car c1 = new Car();
        //String[] License = new String[0];

        for(int i = 0; true; i++){

            User = JOptionPane.showInputDialog("Enter User Name");
            Pwd = JOptionPane.showInputDialog("Enter your Password");

            if (Login.UserName.equals(User) && Login.Password.equals(Pwd)) {
                JOptionPane.showMessageDialog(null, "Succesful Login", "My Output", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("\n\n");
               JOptionPane.showMessageDialog(null,"\t\t\t\t\t\t*   WELCOME TO PARKING MANANGMENT SYSYEM    *");
               JOptionPane.showMessageDialog(null,"AREA TO PARK\nEnter 1 to continue");
              System.out.print("\t\t\t\t\t\t                Enter Here: ");

                int opt;
                opt = sc.nextInt();

                do{if (opt == 1) {
                    System.out.println("\t\t\t\t\t\t*********************************************");
                    System.out.println("\t\t\t\t\t\t*   WELCOME TO PARKING MANANGMENT SYSYEM    *");
                    System.out.println("\t\t\t\t\t\t*                MAIN MENU                  *");
                    System.out.println("\t\t\t\t\t\t*********************************************\n");
                    System.out.println("\t\t\t\t\t\t               2. VIEW PARKING ");
                    System.out.println("\t\t\t\t\t\t               3. PARK MY CAR");
                    System.out.println("\t\t\t\t\t\t               4. FIND MY CAR");
                    System.out.print("\t\t\t\t\t\t               Select Option: ");
                    opt = sc.nextInt();
                    if(opt == 2){
                        System.out.println("\t\t\t\t\t\t               VIEW PARKING");
                        a1.DisplayMenu();
                        System.out.println("\t\t\t\t\t\t               press 1 to return to menu");
                        opt = sc.nextInt();
                    }
                    else if(opt == 3){
                        System.out.println("\t\t\t\t\t\t               PARK MY CAR");
                        c1.parkcar();
                        System.out.println("\t\t\t\t\t\t               press 1 to return to menu");
                        opt = sc.nextInt();
                    }
                    else if(opt == 4){
                        System.out.println("\t\t\t\t\t\t               FIND MY CAR");
                        c1.findcar();
                        System.out.println("\t\t\t\t\t\t               press 1 to return to menu");
                        opt = sc.nextInt();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Incorrect input", "ERROR INPUT", JOptionPane.ERROR_MESSAGE);
                    }

                }
                }
                while (opt<=4);


                System.exit(0);

            }
            else{
                JOptionPane.showMessageDialog(null, "Incorrect UserName or Password","My Output",JOptionPane.WARNING_MESSAGE);

            }
            if(i==1){
                JOptionPane.showMessageDialog(null, "Incorrect UserName or Password 1 Attempt Left","My Output",JOptionPane.WARNING_MESSAGE);
            }
            if(i==2){
                JOptionPane.showMessageDialog(null, "Incorrect UserName or Password Try Again Later!","My Output",JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }

        }


    }

}