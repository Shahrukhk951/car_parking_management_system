import javax.swing.*;
import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Car extends Viewparking{

    String NumPlate;
    String OwnerName;
    String Parking;



    public void parkcar(){
        NumPlate = JOptionPane.showInputDialog("LICENSE PLATE NUMBER");
        OwnerName = JOptionPane.showInputDialog("OWNER NAME");
        Parking = JOptionPane.showInputDialog(
                """
                        AREAS FOR PARKING
                         1. DEFENCE
                         2. SADDAR
                         3. GULSHAN
                         4. FB AREA
                         5. CLIFTON
                        """
        );
        if (Parking.toLowerCase(Locale.ROOT).equals("defence")){
            defence();
        }
        if (Parking.toLowerCase(Locale.ROOT).equals("saddar")){
            saddar();
        }
        if (Parking.toLowerCase(Locale.ROOT).equals("gulshan")){
            gulshan();
        }
        if (Parking.toLowerCase(Locale.ROOT).equals("fb area")){
            fbarea();
        }
        if (Parking.toLowerCase(Locale.ROOT).equals("clifton")){
            clifton();
        }

        try {
            FileWriter myWriter = new FileWriter("parking.txt",true);
            myWriter.write("\n" + "License Plate no: " + NumPlate+ "\n"+ "Owner Name: " + OwnerName+ "\n" + "Area: " +  Parking + "\n" + "Parking space: "+ Slot);
            PrintWriter out = new PrintWriter(myWriter);
            myWriter.close();
            System.out.println("Successfully Parked");

        } catch (IOException e) {
            System.out.println("error occurred.");
        }

    }
    public void findcar(){
        NumPlate = JOptionPane.showInputDialog("LICENSE PLATE NUMBER");
        try {
            File myObj = new File("parking.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }
}

