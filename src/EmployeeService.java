import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class EmployeeService {
    //using a hashmap to store the employees by id and employee generics
    private final Map<Integer, Employee> employeeMap = new HashMap<>();
    //using int wrapper class instead of flawed increment for thread-safety
    private final AtomicInteger idCounter = new AtomicInteger();

    //Create

    public Employee addEmployee(String name, String role, double salary){
        //first generate new id
        int newId = idCounter.incrementAndGet();
        Employee newEmployee = new Employee(newId, name, role, salary);
        employeeMap.put(newId, newEmployee);

        return newEmployee;

    }

    //Read by id

    public Employee getByEmployeeId(int id){
        return employeeMap.get(id);
    }

    //Read all employees by return an arraylist

    public List<Employee> getAllEmployees(){
        return new ArrayList<>(employeeMap.values());
    }

    //Update using unique employee ID

    public Employee updateEmployee(int id, String name, String role, double salary){
        if(employeeMap.containsKey(id)){
            Employee updatedEmployee = new Employee(id, name, role, salary);
            employeeMap.put(id, updatedEmployee);
            return updatedEmployee;
        }
        return null;
    }

    //Delete by id, using boolean for verification of action 

    public boolean deleteByEmployeeId(int id){
        if(employeeMap.containsKey(id)){
            employeeMap.remove(id);
            // ensuring employee is removed
            if(employeeMap.containsKey(id)){
                return true;
            }else return false;
        }
        return false;
    }

}
