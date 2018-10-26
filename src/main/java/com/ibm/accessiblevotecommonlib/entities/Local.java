package com.ibm.accessiblevotecommonlib.entities;

public class Local {

    private long        ID;

    private String      Name;

    private Boolean     Enabled;

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

    public Local()
    {

    }

    public Local(long id, String name, Boolean enabled)
    {
        this.setID(id);
        this.setName(name);
        this.setEnabled(enabled);
    }

    public Local getLocalByID(long ID)
    {
        return new Local(1, "Local 1", true);
    }
}
