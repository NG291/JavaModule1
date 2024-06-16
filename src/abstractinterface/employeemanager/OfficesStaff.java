package abstractinterface.employeemanager;

public class OfficesStaff extends Staff {
    public OfficesStaff() {}
    public OfficesStaff(String id, String name, String phone, String email, String position) {
        super(id, name, phone, email, position);
    }

    @Override
    public String getType() {
        return "OfficesStaff" ;
    }


}
