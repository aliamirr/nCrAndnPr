import java.util.Scanner;

public class NcrAndNpr {
    double fact(double n) {
        int i = 1;
        double fact = 1;
        while(i <= n){
            fact *= i++; // (fact = fact * i;)
                         // i++     and i++ all in one line
        }
        return fact; //return it inside the "fact".
    }

    double permutation(int n, int r) {
        double per = fact(n)/fact(n - r);
        return per;
    }

    double combination(int n, int r) {
        double com = fact(n)/(fact(n-r)*fact(r));
        return com;
    }
    public static void main(String[] args) {
        NcrAndNpr p = new NcrAndNpr( );

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Enter the value of r: ");
        int r = sc.nextInt();

        if(n>r) {
            System.out.println("The value of " +n+" p "+r+" is: "+p.permutation(n,r));
            System.out.println("The value of " +n+" c "+r+" is: "+p.combination(n,r));
        }
        else
            System.out.println("n value should be greater than or equals to r value.");

    }
}