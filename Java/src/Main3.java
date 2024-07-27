public class Main3 {
    public static void main(String[] args) {
        int age = 13;
        if (age >= 18) {
            System.out.println("You are elgible to vote!");
            System.out.println("Please mark your ballot!");
        }
        else {
            System.out.println("You are NOT yet elgible to vote!");
            System.out.println("Please wait until you are 18 or older!");
            System.out.println("Please come back in:\n" + (18 - age) + " years!\n");
        }

        String status = "Commander";
        if (status == "Trooper") {
            System.out.println("You are a trooper\n");
        }
        else if (status == "Commander") {
            System.out.println("You are a commander\n");
        }
        else {
            System.out.println("Please check your clone rank\n");
        }

        String GARstatus = "Trooper";
        if (GARstatus == "Trooper" && GARstatus != "Commander") {
            System.out.println("You are a trooper\n");
        }
        else if (GARstatus == "Commander" || GARstatus == "General") {
            System.out.println("You are a commander\n");
        }
        else {
            System.out.println("Please check your military rank again\n");
        }

     }
}
