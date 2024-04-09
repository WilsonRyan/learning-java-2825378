import java.util.Scanner;

public class Main {

    //VOID means no return value
    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developr tea time...");
        System.out.println("Type in a random word and press Enter to start developer tea time.");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It is developer tea time!");
    }

    //DOUBLE means that the function will return a double
    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
    }

    public static double calculateSalary(int hoursPerWeek, double hourlyWage, int vacationDays) {
        if (hoursPerWeek < 0) {
            return -1;
        }
        if (hourlyWage < 0) {
            return -1;
        }
        if (vacationDays < 0) {
            return -1;
        }
        return (hoursPerWeek * hourlyWage * 52) - (vacationDays * (hourlyWage * 8));
    }

    public static void main(String[] args) {

        Student studentA = new Student("Ryan","Wilson",2018,3.3,"Computer Science");
        Student studentB = new Student("Alicia","Vallario",2017,3.7,"Communications");

        studentA.incrementExpectedGradYear();
        System.out.println(studentA.gradYear);

//        System.out.println(calculateSalary(40,15,8));

//        int studentAge = 15;
//        double studentGPA = 3.45;
//        String studentFirstName = "Ryan";
//        String studentLastName = "Wilson";
//        String studentFullName = studentFirstName + " " + studentLastName;
//        char studentFirstInitial = studentFirstName.charAt(0);
//        char studentLastInitial = studentLastName.charAt(0);
//        boolean hasPerfectAttendance = true;
//
//        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
//        System.out.println("What do you want to update it to?");
//
//        Scanner input = new Scanner(System.in);
//        studentGPA = input.nextDouble();
//
//  --------------------------------------------------------------------------------------------
//
//        System.out.println("Thanks! " + studentFirstName + " " + studentLastName + " has a new GPA of " + studentGPA + ".");
//        Scanner input = new Scanner(System.in);
//        boolean isOnRepeat = true;
//        while(isOnRepeat) {
//            System.out.println("Playing current song");
//            System.out.println("Would you like to take this song off of repeat? If so, answer yes");
//            String userInput = input.next();
//
//            if(userInput.equals("yes")) {
//                isOnRepeat = false;
//            }
//        }
//        System.out.println("Playing next song.");
//
//  --------------------------------------------------------------------------------------------
//
//        String question = "What is the combo for the 500KG bomb in Helldivers 2?";
//        String choice1 = "Up, Right, Down, Down, Right";
//        String choice2 = "Up, Right, Down, Down, Down"; // THIS IS THE CORRECT ONE!!
//        String choice3 = "Up, Down, Right, Right, Down";
//
//        System.out.println(question);
//        System.out.println("A - " + choice1);
//        System.out.println("B - " + choice2);
//        System.out.println("C - " + choice3);
//        boolean inQuiz = true;
//        while (inQuiz) {
//            Scanner input = new Scanner(System.in);
//            String userInput = input.next();
//            userInput = userInput.toUpperCase();
//            if (userInput.equals("B")) {
//                System.out.println("YOU ARE CORRECT!");
//                inQuiz = false;
//            } else if (userInput.equals("A")) {
//                System.out.println("You are incorrect. Try again");
//            } else if (userInput.equals("C")) {
//                System.out.println("You are incorrect. Try again");
//            } else {
//                System.out.println("Please input a valid input");
//            }
//        }
//
//  --------------------------------------------------------------------------------------------
//
//        System.out.println("Let's calculate the area of a triangle");
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Please input the base of the triangle (in inches).");
//        double base = input.nextDouble();
//
//        while (base <= 0) {
//            System.out.println("That's invalid. Please input the base of the triangle (in inches).");
//            base = input.nextDouble();
//        }
//
//        System.out.println("Please input the height of the triangle (in inches).");
//        double height = input.nextDouble();
//        while (height <= 0) {
//            System.out.println("That's invalid. Please input the base of the triangle (in inches).");
//            height = input.nextDouble();
//        }
//
//        double area = (base * height) / 2;
//        System.out.println("The area is " + area);
//
//  --------------------------------------------------------------------------------------------
//
//
//        System.out.println("Welcome the total meal price calculator.");
//        System.out.println("Please enter the total meal price.");
//        Scanner input = new Scanner(System.in);
//        double listedMeal = input.nextDouble();
//        System.out.println("Please enter the tip rate as a decimal. Ex: 12% = .12");
//        double tipAmount = input.nextDouble();
//        System.out.println("Please enter the tax rate as a decimal. Ex: 12% = .12");
//        double taxAmount = input.nextDouble();
//        double totalPrice = calculateTotalMealPrice(listedMeal, tipAmount, taxAmount);
//        System.out.println("The total meal price is: " + totalPrice);
//        System.out.println("How many people are splitting the bill?");
//        int amountOfPeople = input.nextInt();
//        double perPerson = totalPrice / amountOfPeople;
//        System.out.println("The total price per person is: " + perPerson);
//
//  --------------------------------------------------------------------------------------------
//
//        Triangle triangleA = new Triangle(15, 8, 15,8,17);
//        Triangle triangleB = new Triangle(3,2.598, 3,3,3);
//
//        double triangleAArea = triangleA.findArea();
//        System.out.println(triangleAArea);
//        System.out.println(triangleB.base);
//        System.out.println(Triangle.numOfSides);
//        System.out.println(triangleA.numOfSides); //same as the above line since numOfSides is a static attribute of triangle
//


    }
}
