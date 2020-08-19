package shapes01;

class TwoDShape	{
	double width;
	double height;
	
	void showDimensions()	{
		System.out.print("Wysokość: " + height);
		System.out.print("\nSzerokość: " + width);
		System.out.println();
	}
}

class Triangle extends TwoDShape	{
	String style;
	
	double area()	{
		return height * width / 2;
	}
	
	void showStyle()	{
		System.out.println("Trójkąt jest " + style);
	}
}

class Rectangle extends TwoDShape	{
	
	boolean isSquare()	{
		if(width == height) return true;
		return false;
	}
	
	double area()	{
		return height * width;
	}
}



class Shapes {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		t1.width = 4.0;
		t1.height = 4.0;
		t1.style = "wypełniony";
		
		t2.width = 8.0;
		t2.height = 12.0;
		t2.style = "pusty";
		
		r1.width = 3.0;
		r1.height = 4.0;
		
		r2.width = 6.0;
		r2.height = 6.0;
		
		System.out.println("Inormacje o t1: ");
		t1.showStyle();
		t1.showDimensions();
		System.out.println("Powierzchnia wynosi " + t1.area());
		
		System.out.println();
		
		System.out.println("Inormacje o t2: ");
		t2.showStyle();
		t2.showDimensions();
		System.out.println("Powierzchnia wynosi " + t2.area());
		
		System.out.println();
		
		System.out.println("Informacje o r1: ");
		System.out.println("Jest kwadratem: " + r1.isSquare());
		System.out.println("Powierzchnia wynosi " + r1.area());
		
		System.out.println();
		
		System.out.println("Informacje o r2: ");
		System.out.println("Jest kwadratem: " + r2.isSquare());
		System.out.println("Powierzchnia wynosi " + r2.area());
	}

}
