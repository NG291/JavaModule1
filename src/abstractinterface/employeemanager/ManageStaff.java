package abstractinterface.employeemanager;

public class ManageStaff implements Interfact{
    protected Staff[] ListManageStaffs;
    protected int limit;
    protected int size;

    public ManageStaff( int limit) {
        this.ListManageStaffs= new Staff[limit];
        this.limit=limit;
        this.size=0;
    }
    public void addStaff(Staff staff) {
        if(this.limit==this.size){
            System.out.println("Staff full");
        }
        else {
            ListManageStaffs[size]=staff;
            this.size++;
        }
    }

    @Override
    public void showAllStaff() {
        if(this.size==0){
            System.out.println("Staff empty");
        }
        for(int i=0;i<this.size;i++){
            System.out.println(ListManageStaffs[i]);
        }

    }

    @Override
    public void showStaffByType(String type) {
        boolean found = false;
        if (this.size == 0) {
            System.out.println("Staff empty");
        } else {
            for (int i = 0; i < this.size; i++) {
                if (ListManageStaffs[i].getType().contains(type)) {
                    System.out.println(ListManageStaffs[i]);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No " + type + " staff found.");
            }
        }
    }
}

