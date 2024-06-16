package abstractinterface.employeemanager;

public class Shipper extends Staff {
    protected String transportation;
    public Shipper() {}

    @Override
    public String getType() {
        return "Shipper";
    }

    public Shipper(String transportation) {
        this.transportation = transportation;
    }
    public Shipper( String id, String name,String phone, String email, String position, String transportation) {
        super(id,name, phone, email, position);
        this.transportation = transportation;
    }
    public String getTransportation() {
        return transportation;
    }
    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                ", transportation='" + transportation + '\'' +
                ", Type: " + getType()+
                '}';
    }
}
