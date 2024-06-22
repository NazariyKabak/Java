package booleansAndConditionals;

public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "snowy";
        switch (weather){
            case "sunny":
                System.out.println("Shorts");
                break;
            case "snowy":
                System.out.println("Winter jacket");
                break;
            case "rainy":
                System.out.println("take umbrella");
                break;
            case "cloudy":
                System.out.println("Jeans");
                break;
        }

        // Section 2: User role
        int role = 1;
        switch (role){
            case 1:
                System.out.println("Admin");
                break;
            case 2:
                System.out.println("Redactor");
                break;
            case 3:
                System.out.println("User");
                break;
        }

        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;


        // Section 5: Age and income
        int age = 25;
        int income = 50000;
        // Determine eligibility for a specific credit card based on age and income
        // Decide whether to use if-else or switch

        // Section 1: Traffic light colors
        String lightColor = "green";
        // Determine what action to take based on the traffic light color (e.g., green, yellow, red)
        // Decide whether to use if-else or switch

        // Section 2: Exam grade
        int grade = 85;
        // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
        // Decide whether to use if-else or switch

        // Section 3: Browser type
        String browser = "Chrome";
        // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge, or Opera
        // Decide whether to use if-else or switch
        
        

    }
}
