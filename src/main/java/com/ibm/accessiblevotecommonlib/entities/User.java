package com.ibm.accessiblevotecommonlib.entities;

public class User implements java.io.Serializable {

    private long ID;

    private String Name;

    private Boolean Enabled;

    public long getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public Boolean getEnabled() {
        return Enabled;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setEnabled(Boolean enabled) {
        Enabled = enabled;
    }

    public User() {

    }

    public User(long id, String name, Boolean enabled) {
        this.setID(id);
        this.setName(name);
        this.setEnabled(enabled);
    }

    public User getUserByID(long ID) {
        return new User(1, "User 1", true);
    }


}
