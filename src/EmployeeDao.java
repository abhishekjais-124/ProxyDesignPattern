public interface EmployeeDao {

    void create(String client, String payload);
    void get(String client, int id);
    void delete(String client, int id);
}
