package org.example;

public class Users {
    private int id;
    private String email;
    private String password;
    private String name;
    private String role;
    private String avatar;

    public Users(int id, String email, String password, String name, String role, String avatar) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.role = role;
        this.avatar = avatar;
    }

    public int getId() {
        return this.id;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return this.role;
    }

    public String getAvatar() {
        return this.avatar;
    }
}