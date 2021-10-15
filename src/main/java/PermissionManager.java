public class PermissionManager {
    private PermissionLevel mCurrentLevel = PermissionLevel.USER;

    public String getPermissionLevel() {
        String role;

        switch(mCurrentLevel) {

            case DEVELOPER:
                role = "Developer";
                break;

            case ADMIN:
                role = "Admin";
                break;

            case USER:
                role = "User";
                break;
            default:
                throw new IllegalStateException("Value is Unexpected : " + mCurrentLevel);
        }
        return role;
    }

    public void get_and_setPermissionLevel(PermissionLevel permissionLevel) {
        mCurrentLevel = permissionLevel;
    }
}