package variables;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run5();
    }
    public void run() {
        int passenger =5;
        System.out.println(passenger);

        int busTickets=passenger;
        System.out.println(busTickets);

        /**updating variables**/
        passenger=7;
        System.out.println(passenger);
        System.out.println(busTickets);
        busTickets=passenger;
        System.out.println(busTickets);
        passenger=10;
        System.out.println(passenger);
        System.out.println(busTickets);
        long apples=10000;
        System.out.println(apples);
        //
        int bagOfSweets1 = 5;
        int bagOfSweets2 = 10;

        long starsInMilkyWay = 250_000_000_000L; //250 billion
        long starsInAndromeda = 1_000_000_000_000L; // 1 trillion

        double testScore = 6.7;

        System.out.println("Fred and George collected "+bagOfSweets1+" sweets");
        System.out.println("There are "+(starsInMilkyWay+starsInAndromeda)+ " stars in the Milky Way and Andromeda galaxies.");

        System.out.println("Fred has "+ (bagOfSweets2-bagOfSweets1)+" more sweets than George");
        System.out.println("The Andromeda Galaxy has " +(starsInAndromeda-starsInMilkyWay)+ " more stars than the Milky Way");

        System.out.println("Snape made an error on his excel, accidentally multiplying Ron's score to:" +(testScore*1.25));
        System.out.println("Snape caught the error. Furious, he divided Ron's score to: "+(testScore/2.0));

        System.out.println("10 is an even number, since dividing 10 by 2 has a remainder of: " + (10%2.0));
        System.out.println("5 is an odd number, since dividing 5 by 2 has a remainder of: "+(5%2));

        int counter = 0;
        counter++;
        counter++;
        counter++;
        System.out.println(counter);
        counter--;
        counter--;
        counter--;
        System.out.println(counter);
    }

    public void run1(){
        int ants = 2000;
        double purchasedBlocksOfCheese = 1;

        System.out.println("There are " + ants + " ants, and " + purchasedBlocksOfCheese + " block of cheese.");
        System.out.println("Each ant carried " + (purchasedBlocksOfCheese / ants) + " from the total cheese amount");

        double salary = 5423.94;
        System.out.println("Mortgage Broker: What is your monthly salary in dollars?");
        System.out.println("My monthly salary is: " + salary);
        System.out.println((double) ants);
    }

    public void run2(){
        //*********PART A: PICKING UP THE USER'S ANSWERS*********
        System.out.println("Welcome. Thank you for taking the survey");
        Scanner in = new Scanner(System.in);
        int counter=0;


        System.out.println("What is your name?");
        String name=in.nextLine();
        counter++;



        System.out.println("How much money do you spend on coffee?");
        double coffeePrice=in.nextDouble();
        counter++;

        System.out.println("How much money do you spend on fast food?");
        double foodPrice=in.nextDouble();
        counter++;


        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount=in.nextInt();
        counter++;

        System.out.println("How many times a week do you buy fast food?");
        int foodAmount=in.nextInt();
        counter++;
        in.close();

        //*********PART B: RESPONDING TO THE USER**********
        System.out.println("Thank you "+name+" for answering all " +counter+" questions");
        System.out.println("Weekly, you spend "+(coffeePrice*coffeeAmount)+ " on coffee");
        System.out.println("Weekly, you spend " +(foodAmount*foodPrice)+ " on food");
    }

    public void run3(){
        /************** Debugging **************/

        int exam1Score = 85;
        int exam2Score = 90;
        int exam3Score = 95;

        int total = 100;

        double decimalScore1 = (double) exam1Score / total;
        double decimalScore2 = (double) exam2Score / total;
        double decimalScore3 = (double) exam3Score / total;

        double decimalAverage = (decimalScore1 + decimalScore2 + decimalScore3) / 3.0;

        System.out.println("The decimal average is: " + decimalAverage);
    }

    public void run4(){

//        Scanner scanner = new Scanner(System.in);
//
//        // nextInt() example
//        System.out.print("\nEnter your age, your friend's age, and your parent's age: ");
//        int yourAge = scanner.nextInt();
//        int friendAge = scanner.nextInt();
//        int parentAge = scanner.nextInt();
//
//        System.out.println("Ages: You - " + yourAge +", Friend - " +friendAge +", Parent - " + parentAge);
//
//        System.out.print("\nEnter a greeting: ");
//        scanner.nextLine();
//        String greeting = scanner.nextLine();
//
//        System.out.println("Greeting: " + greeting);
//
//        // nextDouble() example
//        System.out.print("\nEnter the price of a book, a coffee, and a meal: ");
//        double bookPrice = scanner.nextDouble();
//        double coffeePrice = scanner.nextDouble();
//        double mealPrice = scanner.nextDouble();
//
//        System.out.println("Prices: Book - " + bookPrice + ", Coffee - " + coffeePrice + ", Meal - " + mealPrice);
//
//        System.out.print("\nEnter a restaurant name: ");
//        scanner.nextLine();
//        String restaurant = scanner.nextLine();
//
//        System.out.println("Restaurant: " + restaurant);
//
//        // nextLong() example
//        System.out.print("\nEnter the population of three cities: ");
//        long city1Population = scanner.nextLong();
//        long city2Population = scanner.nextLong();
//        long city3Population = scanner.nextLong();
//
//
//        System.out.println("Populations: City 1 - " + city1Population + ", City 2 - " + city2Population + ", City 3 - " + city3Population + "\n");
//
//        System.out.print("\nEnter the name of the most populous city: ");
//        scanner.nextLine();
//        String cityName = scanner.nextLine();
//
//        System.out.println("Most populous city: " + cityName);
//
//        // next() example
//        System.out.print("\nEnter three colors: ");
//        String color1 = scanner.next();
//        String color2 = scanner.next();
//        String color3 = scanner.next();
//
//
//        System.out.println("Colors: 1 - " + color1 + ", 2 - " + color2 + ", 3 - " + color3 +"\n");
//
//        System.out.print("\nEnter your favorite color combination: ");
//        scanner.nextLine();
//        String colorCombination = scanner.nextLine();
//        System.out.println("Favorite color combination: " + colorCombination);
//
//        scanner.close();
        Scanner scan = new Scanner(System.in);

        String line1 = scan.nextLine();
        String line2 = scan.nextLine();
        String line3 = scan.nextLine();
        String line4 = scan.nextLine();
        String line5 = scan.nextLine();
    }

    public void run5(){
        System.out.println("Hello!What is your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hi " + name +". I`m.Javabot. Where are you from?");
        String city=scan.nextLine();
        System.out.println("I here it`s beautiful at "+city+"! I`m from a place called Oracle. How old are you?");
        int age =scan.nextInt();
        System.out.println("So you are "+age+",cool! I`m 400 years old!");
        System.out.println("This means I`m 8 times older than you!");
        System.out.println("Enough about me. What`s your favourite lang?");
        scan.nextLine();
        String lang = scan.nextLine();
        System.out.println(lang+", that`s great! Nice chatting with you "+name+"."+" I have to log off now. See ya!");
        scan.close();
    }

}
