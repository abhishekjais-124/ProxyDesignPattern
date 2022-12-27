
public class EmployeeDaoProxyImpl implements EmployeeDao{
    EmployeeDaoImpl employee;

    public EmployeeDaoProxyImpl(EmployeeDaoImpl employee) {
        this.employee = employee;
    }

    @Override
    public void create(String client, String payload) {
        if (client == "ADMIN"){
            employee.create(client, payload);
            return;
        }
        System.out.println("ACCESS DENIED");
    }

    @Override
    public void get(String client, int id) {
        if (client == "ADMIN" || client == "USER"){
            employee.get(client, id);
            return;
        }
        System.out.println("ACCESS DENIED");
    }

    @Override
    public void delete(String client, int id) {
        if (client == "ADMIN"){
            employee.delete(client, id);
            return;
        }
        System.out.println("ACCESS DENIED");
    }
}
