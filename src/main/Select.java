package src.main;

public class Select {
    protected float mark;
    protected String location;
    protected String nameTeacher;
    protected int teacherId;

    public void setMarkAndLocation(float m, String l, String nt, int tId) {
        this.mark = m;
        this.location = l;
        this.nameTeacher = nt;
        this.teacherId = tId;
    }

    public float getMark() {
        return this.mark;
    }

    public String getLocation() {
        return this.location;
    }

    public String getNameTeacher() {
        return this.nameTeacher;
    }

    public int getTecherId() {
        return this.teacherId;
    }
}