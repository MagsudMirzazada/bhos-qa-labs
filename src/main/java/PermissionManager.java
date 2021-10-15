public class PermissionManager {
    private PermissionLevel mCurrentLevel = PermissionLevel.USER;

    public String getmCurrentLevel(){
        String permissionLevel = "";
        switch (mCurrentLevel){
            case USER:
                permissionLevel = "User";
                break;
            case ADMIN:
                permissionLevel = "Admin";
                break;
            case DEVELOPER:
                permissionLevel = "Developer";
                break;
        }
        return permissionLevel;
    }
    public void setPermissionLevel(PermissionLevel permissionLevel){
        mCurrentLevel = permissionLevel;
    }
}