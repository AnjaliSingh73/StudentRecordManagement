public class Admin extends StudentRecord {
    private static final String adminPassword="admin@123";

    public boolean checkPassword(String adminPassword){
        return (adminPassword.equals(Admin.adminPassword));
    }
}
