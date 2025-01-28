import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Enter Your Weight
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();

        //Enter Your Height
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = calculateBMI(weight, height);
        String category = determineBMICategory(bmi);

        System.out.println("Your BMI is: " + String.format("%.2f", bmi));
        System.out.println("Your BMI category is: " + category);
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String determineBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}
