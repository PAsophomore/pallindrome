
/*algorithm:
 -> take an user inputterd number
 -> store it in a temporary variable(here n)
 -> reverse the number using the temporary variable
 -> compare the original number with the reversed number
     -> if same then print palindrome number
*/
//CODE
import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0, n = num;
        while (n > 0) {
            int r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (num == sum)
            System.out.println(num + " is a palindrome number ");
        else
            System.out.println(num + " is not palindrome number ");
        sc.close();
    }
}