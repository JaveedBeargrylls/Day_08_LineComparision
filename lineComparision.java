import java.util.Scanner;
public class lineComparision{
public static void main(String args[]){
//System.out.println("welcome to the line comparision");
Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of X1 and X2");
		int x1=sc.nextInt();
		int x2=sc.nextInt();
		
		System.out.println("Enter the value of Y1 and Y2");
		int y1=sc.nextInt();
		int y2=sc.nextInt();
		
		double length=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(x2-x1));
		System.out.println("Length of Line: "+length);
}
}

