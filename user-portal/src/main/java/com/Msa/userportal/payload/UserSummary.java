package com.Msa.userportal.payload;

import com.Msa.userportal.model.DBFile;

public class UserSummary {

    private Long id;
    private String username;
    private DBFile avatar;

    public UserSummary(Long id, String username, DBFile avatar) {
        this.id = id;
        this.username = username;
        this.avatar = avatar;
    }

    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public DBFile getAvatar() { return avatar; }

    public void setAvatar(DBFile avatar) { this.avatar = avatar; }
}
