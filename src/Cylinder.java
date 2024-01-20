public class Cylinder extends Shape {
    private double radius; 
    private double height; 

    public Cylinder(double radius, double height) { 
        this.radius = radius; 
        this.height = height; 
    }

    @Override
    public double surface_area() { 
        double a; 
        a = (2 * Math.PI * this.radius * this.height) + (2 * Math.PI* Math.pow(this.radius, 2)); 
        return a; 
    }

    @Override
    public double volume() { 
        double v; 
        v = Math.PI * Math.pow(this.radius, 2) * this.height; 
        return v; 
    }

    @Override
    public String toString() {
        String s; 
        s = String.format( "The surface area of the cylinder is: %f \nThe volume of the cylinder is %f \n", this.surface_area(), this.volume()); 
        return s;
    }

}