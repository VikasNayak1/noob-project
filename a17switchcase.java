import java.util.Scanner;
public class a17switchcase{
    public static void main(String[]args) {
        int age;
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch(age){
            case 18:                
            System.out.println("you are an adult");
            break;

            case 24:
            System.out.println("you can get job");
            break;

            case 60:
            System.out.println("you cant retire");
            break;

            default :
            System.out.println("you can enjoy!");
        }
        
        
        
        
        
        
        
        
        /*if (age>56){
            System.out.println("you are very experienced!");
        }
        else if (age>46) {
            System.out.println("you are little experienced");
        } else {
            System.out.println("you are not experienced");
        } */
    }
}