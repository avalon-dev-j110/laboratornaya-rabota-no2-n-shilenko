package ru.avalon.java.dev.j10.labs.shapes;

/**
 * @author Nikolai Shilenko
 *
 */
public class PointImpl implements Point {
	private float X;
	private float Y;

	public PointImpl(float X, float Y) {
		this.X = X;
		this.Y = Y;
	}

	@Override
	public float getX() {
		return X;
	}

	public void setX(float X) {
		this.X = X;
	}
	
	@Override
	public float getY() {
		return Y;
	}

	public void setY(float Y) {
		this.Y = Y;
	}
	
	@Override
	public float getArea() {
		return 0;
	}
}
