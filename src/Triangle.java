public class Triangle extends GeometricObject {

	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;

	public Triangle() {
		this.side1 = 1;
		this.side2 = 1;
		this.side3 = 1;
	}

	public Triangle(double x, double y, double z) {
		this.side1 = x;
		this.side2 = y;
		this.side3 = z;
	}

	public double getSide1() {
		return this.side1;
	}

	public double getSide2() {
		return this.side2;
	}

	public double getSide3() {
		return this.side3;
	}

	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}

	public double getPerimeter() {
		return (side1 + side2 + side3);
	}

	public String toString() {
		/*
		 * System.out.println("The triangle's sides are \n Side 1: " + side1 +
		 * "\n Side2: " + side2 + "\n Side 3 " + side3);
		 * System.out.println("The triangle's area is: " + getArea());
		 * System.out.println("The triangle's perimeter is: " + getPerimeter());
		 */
		return "The triangle's sides are \n Side 1: " + side1 + "\n Side 2: "
				+ side2 + "\n Side 3: " + side3 + "\n The triangle's area is: "
				+ getArea() + "\n The triangle's perimeter is: "
				+ getPerimeter();
	}

}
