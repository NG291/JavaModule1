package inheritance.point2andpoint3d;

import javafx.geometry.Point3D;

public class Main {
    public static void main(String[] args) {
        Point3d p1 = new Point3d(1.0f, 2.0f, 3.0f);
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        System.out.println(p1.getZ());
        p1.setXYZ(3.0f, 2.0f, 1.0f);
   System.out.println(p1);

    }
}
