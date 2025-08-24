public class Employee {
    private int employeeId;
    private String name;
    private String role;
    private double salary;

    Employee(int id, String name, String role, double salary){
        this.employeeId = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(int id){
        this.employeeId = id;
    }

    public String getName(){
        return name;
    }

    public void getName(String name){
        this.name = name;
    }

    public String getRole(){
        return role;
    }

    public void setRole(String role){
        this.role = role;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Employee details: [Id = "+employeeId+", Name = "+name+", Role ="+role+", Salary = "+salary+"]";
    }

}
