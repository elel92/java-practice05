package prob6;

public class RectTriangle extends Shape {
	
	public RectTriangle(double w, double h) {
		super.w = w;
		super.h = h;
	}
	
	@Override
	public double getArea() {
		return super.w * super.h / 2;
	}

	@Override
	public double getPerimeter() {
		return Math.sqrt(Math.pow(super.w, 2) + Math.pow(super.h, 2)) + w + h;
	}
}
