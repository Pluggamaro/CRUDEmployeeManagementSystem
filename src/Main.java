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
            break;
        }

    }

    static void printMenu(){
        
        //intial hero-like section

        System.out.println("========Employee Management System========");

        //creating menu of 7 options

        String [] options = {"1. Add New Employee","2. View All Employees",
                             "3. View Employee By Id",
                             "4. Update An Employee",
                             "5. Delete An Employee","6. EXIT"};

        for(int i = 0 ; i < options.length; i++){
            System.out.println(i);
        }

    }

}
