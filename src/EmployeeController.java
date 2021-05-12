public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView(int index) {
        System.out.println("");
        System.out.println("-- The Employee at index no " + index + " is:");
        view.printEmployeeDetails(model.getEmployeeAt(index).getEmployeeID(),
                model.getEmployeeAt(index).getFirstName(), model.getEmployeeAt(index).getLastName(), model.getEmployeeAt(index).getGender(),
                model.getEmployeeAt(index).getHiredDate(), model.getEmployeeAt(index).getSalary());
    }

    public void updateViewAll() {
        System.out.println("-- All Employees are :");
        for (int i = 0; i < model.getAllEmployee().size(); i++) {

            view.printEmployeeDetails(model.getAllEmployee().get(i).getEmployeeID(),
                    model.getAllEmployee().get(i).getFirstName(), model.getAllEmployee().get(i).getLastName(), model.getAllEmployee().get(i).getGender(),
                    model.getAllEmployee().get(i).getHiredDate(), model.getAllEmployee().get(i).getSalary());


        }

    }

    public void deleteEmployee(int index) {
        System.out.println("");
        model.deleteEmployee(index);
        System.out.println("-- The Employee at index no " + index + " is deleted");
        updateViewAll();
    }


}
