package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon {
	private PointImpl A;
	private PointImpl B;
	private PointImpl C;
	private float sideAB;
	private float sideBC;
	private float sideCA;
	private float perimeter;
	private float area;
	
	public Triangle(PointImpl A, PointImpl B, PointImpl C) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.setSideLengths();
		this.perimeter = calcPerimeter();
		this.area = calcArea();
	}
	
	protected float calcSideLength(PointImpl beg, PointImpl end) {
		return (float)Math.sqrt(Math.pow(beg.getX() - end.getX(), 2) + Math.pow(beg.getY() - end.getY(), 2 ));
	}
	
	private void setSideLengths() {
		this.sideAB = calcSideLength(this.A, this.B);
		this.sideBC = calcSideLength(this.B, this.C);
		this.sideCA = calcSideLength(this.C, this.A);
	}

	protected float calcPerimeter() {
    	return (float)(sideAB + sideBC + sideCA);
    }
	
	@Override
	public float getPerimeter() {
		return perimeter;
	}
    
    protected float calcArea() {
    	float semiPerimeter = (calcPerimeter() / 2);
    	return (float)Math.sqrt(semiPerimeter * (3 * semiPerimeter - (sideAB + sideBC + sideCA)));
    }
    
	@Override
	public float getArea() {
		return area;
	}
	
    public float getSideAB() {
		return sideAB;
	}

	public float getSideBC() {
		return sideBC;
	}

	public float getSideCA() {
		return sideCA;
	}

	public PointImpl getA() {
		return A;
	}

	public void setA(PointImpl A) {
		this.A = A;
		setSideLengths();
		this.perimeter = calcPerimeter();
		this.area = calcArea();
	}

	public PointImpl getB() {
		return B;
	}

	public void setB(PointImpl B) {
		this.B = B;
		setSideLengths();
		this.perimeter = calcPerimeter();
		this.area = calcArea();
	}

	public PointImpl getC() {
		return C;
	}

	public void setC(PointImpl C) {
		this.C = C;
		setSideLengths();
		this.perimeter = calcPerimeter();
		this.area = calcArea();
	}

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
