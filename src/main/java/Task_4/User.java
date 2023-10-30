package Task_4;

public class User {
    private String userId;
    private UserInfo userInfo;

    public User(String userId, UserInfo userInfo) {
        this.userId = userId;
        this.userInfo = userInfo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
