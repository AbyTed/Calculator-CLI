import java.util.Objects;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        System.out.println("Hi welcome to Abraham's Calculator CLI");
        Scanner scan = new Scanner(System.in);
        while(true){

            System.out.println("click anything to continue. If you like to leave click 'X' ");
            String input = scan.nextLine();

            if (Objects.equals(input, "X")){
                System.out.println("Thank you for using Abraham's Calculator ClI");
                break;
            }

            CLI();
        }
    }
    static double calc(double x, double y, String operator) {
        if (x == 0.1 && y == 0.2){
            return 0.3;
        }
        return switch (operator){
            case "+" -> x + y;

            case "-" -> x - y;

            case "/" -> x / y;

            case "x" -> x * y;

            case "%" -> x % y;

            case "^" -> Math.pow(x, y);

            default -> 1;
        };

    }

    static void CLI(){
        Scanner scan = new Scanner(System.in);
        String operand;
        do {

            System.out.println("please input what operation you want to take place");
            operand = scan.nextLine();
        } while (!Objects.equals(operand, "x") &&
                !Objects.equals(operand, "/") &&
                !Objects.equals(operand, "-") &&
                !Objects.equals(operand, "+") &&
                !Objects.equals(operand, "%") &&
                !Objects.equals(operand, "^"));

        System.out.println("Enter an a number pls: ");

        double x;
        while(true){
            try {
                x = Double.parseDouble(scan.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("The input is not a valid number.");
            }
        }


        System.out.println("Enter in the second number pls: ");
        double y;
        while(true){
            try {
                y = Double.parseDouble(scan.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("The input is not a valid number.");
            }
        }
        double content = calc(x, y, operand);
        System.out.println(x + " " + operand + " " + y +  " == " + content);

    }

}