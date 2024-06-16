package abstractinterface.employeemanager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManageStaff manageStaff = new ManageStaff(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Employee Management Menu -----");
        System.out.println("1. Add Staff");
        System.out.println("2. Show All Staff");
        System.out.println("3. Show Office Staff");
        System.out.println("4. Show Factory Staff");
        System.out.println("5. Show shipper Staff");
        System.out.println("6. Exit");
        System.out.print("Choose an option: ");
        while (true) {
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStaffMenu(manageStaff, scanner);
                    break;
                case 2:
                    manageStaff.showAllStaff();
                    break;
                case 3:
                    manageStaff.showStaffByType("Office");
                    break;
                case 4:
                    manageStaff.showStaffByType("Factory");
                    break;
                case 5:
                    manageStaff.showStaffByType("Shipper");
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStaffMenu(ManageStaff manageStaff, Scanner scanner) {
        System.out.println("----- Add Staff -----");
        System.out.print("Enter Staff ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Staff Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Staff Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter Staff Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Staff Position");
        String position = scanner.nextLine();
        System.out.println("Select Staff Type:");
        System.out.println("1. Office Staff");
        System.out.println("2. Factory Staff");
        System.out.println("3.Shipper Staff");
        System.out.print("Choose an option: ");
        int typeChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (typeChoice) {
            case 1:
                Staff officeStaff = new OfficesStaff(id, name, phone, email, position);
                manageStaff.addStaff(officeStaff);
                break;
            case 2:
                System.out.print("Enter Factory Staff idFactory: ");
                String idFactory = scanner.nextLine();
                System.out.print("Enter Factory Staff Type: ");
                String type = scanner.nextLine();

                Staff factoryStaff = new FactoryStaff(id, name, phone, email, position, idFactory, type);
                manageStaff.addStaff(factoryStaff);
                break;
            case 3:
                System.out.print("Enter transportation: ");
                String transportation = scanner.nextLine();

                Staff shipper = new Shipper(id, name, phone, email, position, transportation);
                manageStaff.addStaff(shipper);
                break;
            default:
                System.out.println("Invalid type choice.");
        }
    }
}

