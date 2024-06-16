package abstractinterface.employeemanager;

public class FactoryStaff extends Staff {
    protected String idFactory;
    protected String type;
    protected FactoryStaff(){}
    public FactoryStaff(String idFactory, String type) {
        this.idFactory = idFactory;
        this.type = type;
    }
    public FactoryStaff(String id, String  name,String phone, String email, String position, String idFactory, String type) {
        super(id, name, phone, email, position);
        this.idFactory = idFactory;
        this.type = type;
    }

    public String getType() {
        return "FactoryStaff";
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdFactory() {
        return idFactory;
    }

    public void setIdFactory(String idFactory) {
        this.idFactory = idFactory;
    }
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                ", idFactory='" + idFactory + '\'' +
                ", type='" + type + '\'' +
                ", Type: " + getType()+
                '}';
    }
}
