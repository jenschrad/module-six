import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        // scanner 
        Scanner input = new Scanner(System.in);

        // user input for bill amt
        System.out.print("Enter the bill amount: ");
        double bill = input.nextDouble();

        // user input for tip % 
        System.out.print("Enter the tip percentage (as a decimal): ");
        double tipPercent = input.nextDouble();

        // calculate the tip amt
        double tipAmount = bill * tipPercent;
        
        // calculate total with tip
        double total = bill + tipAmount;

        // display 
        System.out.println("Bill Amount: $" + bill);
        System.out.println("Tip Percentage: " + tipPercent);
        System.out.println("Tip Amount: $" + tipAmount);
        System.out.println("Total: $" + total);


        // close the scanner 
        input.close();
    
    }
}