import java.util.Scanner;
public class Rectangle{
	public static void main(String[]args){
	Scanner keyboard = new Scanner(System.in);
	double width=0.0;
	double height=0.0;
	double perimeter=0.0;
	double area=0.0;
	
	System.out.print("Enter width ");
	width = keyboard.nextDouble();
	System.out.print("Enter height ");
	height = keyboard.nextDouble();

	perimeter = 2*(width+height);
	area = width*height;

	System.out.println("Perimeter of this rectanlge is " + perimeter);
	System.out.println("Area of this rectangle is " + area);
	}
}	
