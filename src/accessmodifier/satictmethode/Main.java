package accessmodifier.satictmethode;

public class Main {
    public static void main(String[] args) {
        Student.change();
        Student S1=new Student(111,"hoang");
        Student S2=new Student(222,"Lam");
        Student S3=new Student(333,"Anh");
     S1.display();
     S2.display();
     S3.display();
    }

}
