package utils;

import java.io.Serializable;

public class Point implements Serializable {
    private static final long serialVersionUID = 4350420193796601374L;
    private final double x;
    private final double y;

    public Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point(Point p) {
    	this.x = p.getX();
    	this.y = p.getY();
    }
    
    private Double getX() {
        return this.x;
    }

    private Double getY() {
        return y;
    }

    public Point makeCopy() {
        return new Point(this.x, this.y);
    }

    public double distanceBetweenPoints(Point a) {
         return Math.sqrt(Math.pow(a.x - this.x, 2) + Math.pow(a.y - this.y, 2));
    }

    @Override
    public String toString() {
        return "(" + String.format("%.2f", this.x) + ", " + String.format("%.2f", this.y) + ")";
    }
}