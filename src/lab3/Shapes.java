package lab3;

public class Shapes 
{
	int perimeter; 
	public int calculatePerimeter(int width, int height)
	{
		perimeter =  2*(width + height);
		System.out.println("Rectangle perimeter is : " + perimeter);
		return perimeter;
	}
	
	public int calculatePerimeter(int side)
	{
		perimeter = side*4;
		System.out.println("Square perimeter is : " + perimeter);
		return perimeter;
	}
	
	public int calculatePerimeter(int a, int b, int c)
	{
		perimeter = a+b+c;
		System.out.println("Triangle perimeter is : " + perimeter);
		return perimeter;
	}

}
