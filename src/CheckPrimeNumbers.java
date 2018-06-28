import java.util.Scanner;
public class CheckPrimeNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap vao 1 so");
            int number = scanner.nextInt();
            if (number < 2)
                System.out.println(number + "Khong phai so nguyen to");
            else {
                int i = 2, j = 2;
                boolean check = true;
                while (j <= Math.sqrt(number)) {
                    if (number % i == 0) {
                        check = false;
                        break;
                    }
                    i++;

                }
                if( check )
                    System.out.println(number + "La so nguyen to");
                else
                    System.out.println(number + "khong phai so nguyen to");
            }
        }
    }

