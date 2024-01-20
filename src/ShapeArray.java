public class ShapeArray {
    public static void main(String[] args) {

    Sphere sphere = new Sphere(5); 
    Cylinder cylinder = new Cylinder(5,5); 
    Cone cone = new Cone(5, 5); 

    Shape[] shapes = {sphere, cylinder, cone}; 
    for (Shape i : shapes) {
        System.out.println(i.toString()); 
      }
    }
}


