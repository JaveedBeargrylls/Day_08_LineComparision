import java.util.Scanner;
public class lineComparision{
public static void main(String args[]){
//System.out.println("welcome to the line comparision");
Scanner sc=new Scanner(System.in);
// taking inputs
		System.out.println("Enter the value of X1 and X2");
		int x1=sc.nextInt();
		int x2=sc.nextInt();
		
		System.out.println("Enter the value of Y1 and Y2");
		int y1=sc.nextInt();
		int y2=sc.nextInt();
		
		
		System.out.println("Enter the value of A1 and A2");
		int a1 = sc.nextInt();
                int a2 = sc.nextInt();

		System.out.println("Enter the value of B1 and B2");
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		
		// Formula for line calculation	
		double line1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (x2 - x1));
		double line2 = Math.sqrt((a2 - a1) * (a2 - a1) + (a2 - a1) * (b2 - b1));
		
		System.out.println("line1 = "+line1);
		System.out.println("line2 = "+line2);
	if( line1 == line2 ){
	System.out.println(line1+" & "+line2+" are equal");
	}
	else if( line1 > line2 ){
	System.out.println(line1 +" greater than "+line2);
	}
	else
	System.out.println(line1+" smaller than "+line2);

}
}

