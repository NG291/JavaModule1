package OOP.QuanLySinhVien;

public class Student {
    protected int id;
    protected String name;
    protected String email;
    protected String phone;
    protected double GPA;
//Khai bao phuong thuc;
    public Student(
            int id,
            String name,
            String email,
            String phone,
            double GPA
    ){
        this.id = id;
        this.name =name;
        this.email= email;
        this.phone= phone;
        this.GPA=GPA;
    }
    public int getId(){
        return id;
    }
    public void SetId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void SetName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void SetEmail(String email){
        this.email=email;
    }
    public String getPhone(){
        return phone;
    }
    public void SetPhone(String phone){
        this.phone= phone;
    }
    public double getGPA(){
        return GPA;
    }
    public void SetGPA(double GPA){
        this.GPA=GPA;
    }
    public String toString(){
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", GPA=" + GPA +
                ", phone='" + phone + '\'' +
                '}';
    }
}
