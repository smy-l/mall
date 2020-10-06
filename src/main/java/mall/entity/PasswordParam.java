package mall.entity;

public class PasswordParam {

  public String newPassword;
  public String oldPassword;
  public String username;

  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  public String getOldPassword() {
    return oldPassword;
  }

  public void setOldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public String toString() {
    return "PasswordParam{" +
            "newPassword='" + newPassword + '\'' +
            ", oldPassword='" + oldPassword + '\'' +
            ", username='" + username + '\'' +
            '}';
  }
}
