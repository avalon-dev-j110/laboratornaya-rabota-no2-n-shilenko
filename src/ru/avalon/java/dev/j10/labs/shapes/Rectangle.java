package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon {
	private PointImpl A;
	private PointImpl B;
	private PointImpl C;
	private PointImpl D;
	private float length;
	private float width;
	private float perimeter;
	private float area;
	
	public Rectangle(PointImpl A, PointImpl C) {
		this.A = A;
		this.C = C;
		this.setPointsBandD();
		this.length = calcLength();
		this.width = calcWidth();
		this.perimeter = calcPerimeter();
		this.area = calcArea();
	}
	
	private void setPointsBandD() {
		this.B = new PointImpl(A.getX(), C.getY());
		this.D = new PointImpl(A.getY(), C.getX());
	}

	protected float calcPerimeter() {
		return 2 * (length + width);
	}
	
	@Override
	public float getPerimeter() {
		return perimeter;
	}
	
	protected float calcArea() {
		return length * width;
	}
	
	@Override
	public float getArea() {
		return area;
	}
	
	protected float calcLength() {
		return (float)Math.sqrt(Math.pow(A.getX() - D.getX(), 2) + Math.pow(A.getY() - D.getY(), 2 ));
	}
	
	public float getLength() {
		return length;
	}
	
	protected float calcWidth() {
		return (float)Math.sqrt(Math.pow(A.getX() - B.getX(), 2) + Math.pow(A.getY() - B.getY(), 2 ));
	}

	public float getWidth() {
		return width;
	}

	public PointImpl getA() {
		return A;
	}

	public void setA(PointImpl A) {
		this.A = A;
		this.setPointsBandD();
		this.length = calcLength();
		this.width = calcWidth();
		this.perimeter = calcPerimeter();
		this.area = calcArea();
	}

	public PointImpl getC() {
		return C;
	}

	public void setC(PointImpl C) {
		this.C = C;
		this.setPointsBandD();
		this.length = calcLength();
		this.width = calcWidth();
		this.perimeter = calcPerimeter();
		this.area = calcArea();
	}

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
