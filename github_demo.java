import java.util.Scanner;

public class github_demo {
	public static void main(String[] args) {
        int num1, num2, sum;
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter num1: ");
        num1 = ip.nextInt();
        System.out.print("Enter num2: ");
        num2 = ip.nextInt();
        int an = 0;
        while(an != 4) {
        	System.out.print("1: show two number\n2: multiplication\n4: exit");
        	an = ip.nextInt();
        	if(an == 1)
        		System.out.print("num1: " + num1 + "\nnum2: " + num2 + "\n");
        	if(an == 2)
        		System.out.print("num1 * num2 is " + num1 *num2 + "\n");
        }
    }
}
