import java.util.*;
import <insert package>.AvgCalc;

public class AvgCalcDriver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        List<Double> arrayList = new ArrayList<Double>();  // Makes objects for scanning and an array list that takes doubles

        while (true) {
        	
            try {
                System.out.print("Enter a number (type 'done' to calculate the average): ");
                String input = scan.nextLine();

                if (input.equalsIgnoreCase("done")) {
                    break;
                }  // If input it "done", it finishes the code by prompting the average calculation

                double num = Double.parseDouble(input);  // creates a double from input (regardless of input type)

                if (num < 0 || num > 200) {
                    throw new Exception("Values must be less than 200 and greater than 0.");
                }  // If number is greater than 200 or less than 0, throws an exception

                arrayList.add(num);

            } 
            
            catch (NumberFormatException e) {
                System.out.println(e.getMessage() + " - Please enter a valid number.");
            }  // Catches exception for whether input is a number or not
            
            catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }  // Catcheds exception for whether number is greater than 200 or less than 0
        }

        try {
            double[] array = new double[arrayList.size()];  // Creates a new array that is the set size of the arraylist

            for (int i = 0; i < arrayList.size(); i++) {
                array[i] = arrayList.get(i);  // Adds all the numbers inputed into the array
                
                if (array.length < 2) {
                	throw new IllegalArgumentException("Not enough numbers.");
                }  // Throws exception for whether there are enough number in the array
            }

            AvgCalc calc = new AvgCalc(array);
            double avg = calc.avg();  // Makes new calc object to calculate the average of the array
            
            System.out.println("Average: " + avg);
            
        } 
        
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage() + " Please enter more numbers.");
        }  // Catches the error if there aren't enough numbers in the array
        
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}

