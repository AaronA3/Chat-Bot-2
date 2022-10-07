import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

       //Start Here!
       Scanner input = new Scanner(System.in);
       String name = input.nextLine();
       Bot2 z = new Bot2(name);
       z.greeting();
       System.out.println("What is your favorite animal?");
       String favAnim = input.nextLine();
       z.favoriteAnimal(favAnim);
       System.out.println("Where do you live?");
       String location = input.nextLine();
       z.home(location);
       System.out.println("What is your favorite number?");
       int num = input.nextInt();
       z.favoriteNumber(num);
       z.goodbye();
       
    }
}