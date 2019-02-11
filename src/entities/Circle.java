package entities;

import entities.enums.Color;

public class Circle extends Shape {

	private Double radius;
	Double PI = 3.1415;
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public Double area() {
		return PI * Math.pow(radius, 2);
	}

}
