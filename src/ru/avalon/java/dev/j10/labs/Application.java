package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.PointImpl;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;

public class Application {

    public static void main(String[] args) {
        Shape[] shapes = {
        	new Circle(new PointImpl(3.0f, 6.0f), new PointImpl(6.0f, 7.0f)), 
        	new Rectangle(new PointImpl(2.0f, 8.0f), new PointImpl(3.0f, 23.0f)), 
    		new Triangle(new PointImpl(3.0f, 6.0f), new PointImpl(6.0f, 13.0f), new PointImpl(8.0f, 19.0f)), 
    		new Triangle(new PointImpl(1.0f, 2.0f), new PointImpl(6.0f, 9.0f), new PointImpl(5.0f, 10.0f)), 
    		new Circle(new PointImpl(1.0f, 7.0f), new PointImpl(5.0f, 5.0f)), 
    		new Rectangle(new PointImpl(8.0f, 8.0f), new PointImpl(10.0f, 10.0f)), 
    		new Rectangle(new PointImpl(3.0f, 6.0f), new PointImpl(6.0f, 13.0f)), 
    		new Circle(new PointImpl(6.0f, 8.0f), new PointImpl(10.0f, 6.0f)),
    		new Circle(new PointImpl(2.0f, 5.0f), new PointImpl(3.0f, 4.0f)), 
    		new Triangle(new PointImpl(4.0f, 6.0f), new PointImpl(7.0f, 15.0f), new PointImpl(8.0f, 20.0f))
        };
        
        for(Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
        
        System.out.println();
        
        System.out.println(searchArea(shapes));
        
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Application).
         */
    }
    static Shape searchArea(Shape[] array) {
    	Shape maxArea = null;
    	float maxValue = 0.0f;
    	for(Shape shape : array) {
    		if(shape.getArea() > maxValue) {
    			maxValue = shape.getArea();
    			maxArea = shape;
    		}
    	}
    	return maxArea;
    }
}
