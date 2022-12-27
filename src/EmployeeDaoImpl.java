public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, String payload) {
        System.out.println("Created entry in employee table with data: "+ payload);
    }

    @Override
    public void get(String client, int id) {
        System.out.println("Fetching data for the row id: " + id);
    }

    @Override
    public void delete(String client, int id) {
        System.out.println("Deleted row from the table whose row id: " + id);
    }
}
