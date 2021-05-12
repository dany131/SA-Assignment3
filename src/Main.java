public class Main {
    public static void main(String[] args) {

        Employee model = new Employee();

        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model, view);

        // For data used by the model
        model.createEmployee("Fa18bsse0049", "Danyal", "Nasir", "Male", "4/2/20", 646587200);
        model.createEmployee("Fa18bsse0050", "Ali", "Shah", "Male", "4/6/20", 64658);
        model.createEmployee("Fa18bsse0051", "Uzair", "Shoaib", "Male", "5/2/21", 64658729);
        model.createEmployee("Fa19bsse0052", "Khadija", "Khaddo", "Female", "1/1/21", 64658729);

        controller.updateViewAll();

        controller.updateView(1);

        controller.deleteEmployee(1);



    }

}
