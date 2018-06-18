import java.util.Scanner;

public class TimUocChungMax {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        a = scanner.nextInt();
        System.out.println("Enter b");
        b = scanner.nextInt();
        if (a == 0 || b == 0)
        System.out.println(" khong co uoc chung");
        while (a!=b){
            if( a > b )
                a = a - b;
            else
                b= b-a;

        }
        System.out.println("Uoc Chung la: " + a);



    }
}
