package com.simplify.ApiUsers.entities;

public class LoginTeacher {
    private String email;
    private String password;
    private Boolean isTeach;

    public LoginTeacher() {
    }

    public LoginTeacher(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getTeach() {
        return isTeach;
    }

    public void setTeach(Boolean teach) {
        isTeach = teach;
    }
}
