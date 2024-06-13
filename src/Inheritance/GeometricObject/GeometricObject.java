package Inheritance.GeometricObject;

import java.util.Date;

public class GeometricObject {
    protected String color;
     protected boolean filled;
     protected Date dateCreated;
     public GeometricObject() {}
     public GeometricObject(String color, boolean filled, Date dateCre){
         this.color=color;
         this.filled = filled;
         this.dateCreated = dateCreated;
     }
     public String getName() {
         return color;
     }
     public void setName(String name) {
         this.color = name;
     }
     public boolean isFilled() {
         return filled;
     }
     public void setFilled(boolean filled) {
         this.filled = filled;
     }
     public Date getDateCreated() {
         return dateCreated;
     }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "name='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
