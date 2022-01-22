import java.util.Scanner;

public class PrimeNumber {
    public boolean primeNumber(){
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();

        int plus=0;

        for (int i=2; i<number;i++){
            boolean prime=true;
            if (number%i==0){
                System.out.println(i);
                plus++;
                prime=false;
                break;
            }

        }
        return false;
    }
}
