import java.util.*;
public class calarea {
	static double area(double a, double b) {
		double area= 0.5*a*b;
		return area;
	}
	static double area(double a) {
		double area= 3.14*a*a;
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Scanner second= new Scanner(System.in);
		System.out.println("Enter 1 for triangle and 2 for circle");
		int choice= sc.nextInt();
		if(choice==1) {
			System.out.println("Enter the base");
			double base= sc.nextDouble();
			System.out.println("Enter the height");
			double height= second.nextDouble();
			double ans= area(base,height);
			System.out.println(ans);
		}
		else {
			System.out.println("Enter the radius");
			double radius= sc.nextDouble();
			double ans= area(radius);
			System.out.println(ans);
		}

	}

}
