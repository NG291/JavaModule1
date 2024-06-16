package abstractinterface.employeemanager;

public abstract class Staff {

    protected String id;
    protected String name;
    protected String phone;
    protected String email;
    protected String position;


    public Staff() {}
    public Staff(String id, String name, String phone, String email, String position) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.position=position;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public  String  getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public abstract String getType();
    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                ", Type: " + getType()+
                '}';
    }
}
