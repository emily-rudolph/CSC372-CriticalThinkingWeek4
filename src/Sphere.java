import java.lang.Math.*;

public class Sphere extends Shape {
    private double radius; 

    public Sphere(double radius) { 
        this.radius = radius; 
    }

    @Override
    public double surface_area() { 
        double a; 
        a = 4 * Math.PI * Math.pow(this.radius, 2); 
        return a; 
    }

    @Override
    public double volume() { 
        double v; 
        v = (4 * Math.PI * Math.pow(this.radius, 3))/3; 
        return v; 
    }

    @Override
    public String toString() {
        String s; 
        s = String.format( "The surface area of the sphere is: %f \nThe volume of the sphere is %f \n", this.surface_area(), this.volume()); 
        return s;
    }

}
