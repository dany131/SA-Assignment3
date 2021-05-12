import java.util.ArrayList;

public class Employee {
    private String EmployeeID;
    private String FirstName;
    private String LastName;
    private String Gender;
    private String HiredDate;
    private int Salary;

    private ArrayList<Employee> allEmployees = new ArrayList<>();



    Employee(){}
    public Employee(String EmployeeID, String FirstName, String LastName, String Gender, String HiredDate, int Salary) {
        this.EmployeeID = EmployeeID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Gender = Gender;
        this.HiredDate = HiredDate;
        this.Salary = Salary;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getHiredDate() {
        return HiredDate;
    }

    public void setHiredDate(String hiredDate) {
        HiredDate = hiredDate;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public void createEmployee(String EmployeeID, String FirstName, String LastName, String Gender, String HiredDate, int Salary) {
        Employee employee = new Employee(EmployeeID, FirstName, LastName, Gender, HiredDate, Salary);
        allEmployees.add(employee);

    }

    public void deleteEmployee(int index) {
        allEmployees.remove(index);
    }

    public ArrayList<Employee> getAllEmployee() {
        return allEmployees;
    }

    public Employee getEmployeeAt(int index) {
        return allEmployees.get(index);
    }


}
