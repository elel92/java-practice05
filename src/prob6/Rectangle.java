package prob6;

public class Rectangle extends Shape implements Resizable{
	public Rectangle(double w, double h) {
		super.w = w;
		super.h = h;
	}

	@Override
	public double getArea() {
		return super.w * super.h;
	}

	@Override
	public double getPerimeter() {
		return (super.w + super.h) * 2;
	}

	@Override
	public void resize(double s) {
		super.w *= s;
		super.h *= s;
	}
}
