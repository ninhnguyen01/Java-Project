import java.util.Scanner;

public class Main4 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("What time is it?");
        int time = scanner.nextInt();

        switch (time) {
            case 12:
                System.out.println("It is lunch time! " + "The time is "+ time + ". Please take a break!");
                break;
            
            case 5:
                System.out.println("Shift is over! " + "The time is "+ time + ". Please stop working!");
                break;
        
            default:
                System.out.println("Please check the time again later!");
                break;
        }
    }
    
}
