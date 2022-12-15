package any;

import java.util.Scanner;

public class name {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int num1,num2,choose;
	System.out.println("put the first number:");
	num1 = scanner.nextInt();
	System.out.println("put the secund number:");
	num2 = scanner.nextInt();
	System.out.println("please choose the operator that you want:");
	System.out.println("1-addition\n2- subtruction\n3- multiplication\n4- division");
	System.out.println("your choice:");
	choose = scanner.nextInt();
	if(choose==1) {
		System.out.println("addition:" + (num1 +num2));}
	else if(choose==2) {
	System.out.println("subtruction :" + (num1-num2));}
	else if(choose==3) {
	System.out.println("multiplication :"+ (num1 * num2));
	
	
}
	else if(choose==4) {
		if(num2==0 )  System.out.println("meaningless:");
	}  else { System.out.println("division:" + (num1/num2)); } 
	
}
}