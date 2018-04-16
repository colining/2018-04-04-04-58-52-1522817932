package practice1;

public class SecurityChecker {
    public boolean checkPermission(User user, Permission permission) {
        if (user == null || permission == null){
            return false;
        }
        return true;
    }

    public boolean isAdmin() {

        //todo code
        return false;
    }
}
