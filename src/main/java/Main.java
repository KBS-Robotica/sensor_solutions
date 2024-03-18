import arduino.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        Arduino arduino = new Arduino("COM3", 9600);

        arduino.openConnection();
        System.out.println("Enter 1 to switch LED on and 0 to switch LED off");

        char input = ob.nextLine().charAt(0);
        while(input != 'n'){
            arduino.serialWrite(input);
            input = ob.nextLine().charAt(0);
        }

        ob.close();
        arduino.closeConnection();
    }
}