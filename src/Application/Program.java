package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		List<Shape> shapeList = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int number = scanner.nextInt();

		for (int i = 1; i <= number; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char op = scanner.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			scanner.nextLine();
			Color color = Color.valueOf(scanner.nextLine());
			
			if(op == 'r' || op == 'R') {
				System.out.print("Width: ");
				double width = scanner.nextDouble();
				System.out.print("Height: ");
				double height = scanner.nextDouble();
				shapeList.add(new Rectangle(color, width, height));
			}
			else if(op == 'c' || op == 'C') {
				System.out.print("Radius: ");
				double radius = scanner.nextDouble();
				shapeList.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPES AREAS:");
		
		for(Shape shapeItem : shapeList) {
			System.out.println(String.format("%.2f", shapeItem.area()));
		}

		scanner.close();
	}

}
