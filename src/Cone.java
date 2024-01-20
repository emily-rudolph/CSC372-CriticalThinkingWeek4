import java.lang.Math.*;

public class Cone extends Shape {
    private double radius; 
    private double height; 

    public Cone(double radius, double height) { 
        this.radius = radius; 
        this.height = height; 
    }

    @Override
    public double surface_area() { 
        double a; 
        a = Math.PI * this.radius * (this.radius + Math.sqrt(Math.pow(this.height,2) + Math.pow(this.radius,2))); 
        return a; 
    }

    @Override
    public double volume() { 
        double v; 
        v = (Math.PI * Math.pow(this.radius, 2) * this.height)/3; 
        return v; 
    }

    @Override
    public String toString() {
        String s; 
        s = String.format( "The surface area of the cone is: %f \nThe volume of the cone is %f \n", this.surface_area(), this.volume()); 
        return s;
    }

}

