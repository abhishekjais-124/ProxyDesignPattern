public class Main {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoProxyImpl(new EmployeeDaoImpl());
        employeeDao.create("ADMIN", "data1");
        employeeDao.get("USER",  2);
        employeeDao.delete("USER", 1);
    }
}