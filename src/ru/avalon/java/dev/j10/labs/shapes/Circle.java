package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse {
	public static final float PI = 3.14159f;
	private PointImpl circleCenter;
	private PointImpl pointOnCircle;
	private float radius;
	private float length;
	private float area;
	
	public Circle(PointImpl circleCenter, PointImpl pointOnCircle) {
		this.circleCenter = circleCenter;
		this.pointOnCircle = pointOnCircle;
		this.radius = calcRadius();
		this.length = calcLength();
		this.area = calcArea();
	}
	
	protected float calcRadius() {
		return (float)Math.sqrt(Math.pow(pointOnCircle.getX() - circleCenter.getX(), 2) + Math.pow(pointOnCircle.getY() - circleCenter.getY(), 2 ));
	}
	
	public float getRadius() {
		return radius;
	}
	
	protected float calcLength() {
		return (float)(2 * PI * radius);
	}

	@Override
	public float getLength() {
		return length;
	}
	
	protected float calcArea() {
		return (float)(PI * Math.pow(radius, 2));
	}

	@Override
	public float getArea() {
		return area;
	}
	
	public Point getCircleCenter() {
		return circleCenter;
	}

	public void setCircleCenter(PointImpl circleCenter) {
		this.circleCenter = circleCenter;
		this.radius = calcRadius();
		this.length = calcLength();
		this.area = calcArea();
	}

	public Point getPointOnCircle() {
		return pointOnCircle;
	}

	public void setPointOnCircle(PointImpl pointOnCircle) {
		this.pointOnCircle = pointOnCircle;
		this.radius = calcRadius();
		this.length = calcLength();
		this.area = calcArea();
	}

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
