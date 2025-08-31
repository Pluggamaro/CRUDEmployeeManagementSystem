import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // creating instance of scanner and employee service to be used

    private final static EmployeeService service = new EmployeeService();
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){
        //mock data with first 2 employees, one cashier and another, admin 
        service.addEmployee("Gopolang Mothuba", "Cashier", 9000);
        service.addEmployee("Edith Mongwa", "Admin", 15000);

        // data entry loop

        while(true){
            //display Menu to user
            printMenu();
            //acquiring input using helper method
            int choice = getInteger("Enter your choice: ");

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    updateEmployee();
                    break;
                case 3:
                    //deleteEmployeeById();
                    break;
                case 4:
                    //viewEmployeeById();
                    break;
                case 5:
                    //viewAllEMployees();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    //consuming scanner 
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid! Please enter a valid number within the prescribed range above!");

            }

        }

    }

    private static void addEmployee(){
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee role: ");
        String role = scanner.nextLine();
        double salary = getDouble("Enter employee's salary: ");
        Employee newEmployee = service.addEmployee(name, role, salary);
        System.out.println(newEmployee);
    }

    private static void updateEmployee(){
        int id = getInteger("Enter the employee's ID you want to update: ");

        if(service.getByEmployeeId(id) == null){
            
        }

    }

    //helper method receiving prompt and returning choice
    private static int getInteger(String prompt){
        while(true){
            try{
            System.out.print(prompt);
            int value = scanner.nextInt();
            //consuming the trailing newline character
            scanner.nextLine();
            return value;
            }catch(InputMismatchException e){
                System.out.println("Enter a WHOLE number!");
                //removing the faulty input's character
                scanner.nextLine();
            }
        }

    }

    //helper method for double input

    private static double getDouble(String prompt){
        while (true) {

            try{
                System.out.print(prompt);
                double value = scanner.nextDouble();
                scanner.nextLine();

                return value;
            }catch(InputMismatchException e){
                System.err.println("Enter a number!");
                scanner.nextLine();
            }
            
        }
    }

    static void printMenu(){
        
        //intial hero-like section

        System.out.println("========Employee Management System========");

        //creating menu of 7 options

        String [] options = {"1. Add New Employee",
                             "2. Update An Employee",
                             "3. Delete An Employee",
                             "4. View Employee By Id",
                             "5. View All Employees",
                             "6. EXIT"};

        for(int i = 0 ; i < options.length; i++){
            System.out.println(options[i]);
        }

    }
   

}
