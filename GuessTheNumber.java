import java.util.Scanner;

public class GuessTheNumber{
    public static void main(String[] args) {
        int n=(int)(Math.random()*100);
        System.out.println("Guess the number between 1 to 100: ");
    while(true){
        Scanner sc = new Scanner(System.in);
        
        int num= sc.nextInt();
        if(num==n){
            System.out.println("Yayy!! You guessed the correct number: "+ n);
            break;
        }
        else if(num<n && num>0){
            System.out.println("Choose a larger number");
        }
        else if(num>n){
            System.out.println("Choose a smaller number");
        }
        else if(num==-1){
            break;
        } 

    
    }
    
}
}
