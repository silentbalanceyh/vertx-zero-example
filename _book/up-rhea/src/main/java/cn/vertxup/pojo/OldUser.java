package cn.vertxup.pojo;

import java.io.Serializable;

public class OldUser implements Serializable {
    private String userName;
    private String pwd;
    private String emailAccount;

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(final String pwd) {
        this.pwd = pwd;
    }

    public String getEmailAccount() {
        return this.emailAccount;
    }

    public void setEmailAccount(final String emailAccount) {
        this.emailAccount = emailAccount;
    }

    @Override
    public String toString() {
        return "OldUser{" +
                "userName='" + this.userName + '\'' +
                ", pwd='" + this.pwd + '\'' +
                ", emailAccount='" + this.emailAccount + '\'' +
                '}';
    }
}
