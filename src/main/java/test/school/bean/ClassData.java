package test.school.bean;

public class ClassData {
    private Integer id;

    private String adress;

    private String newStudent;

    private Integer walkerNumber;

    private Integer inClassNumber;

    private Integer jumpOut;

    private Integer classNowNumber;

    private Integer hourClassNumber;

    private Integer hourInClassNumber;

    private String updatetime;

    private Integer hours;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public String getNewStudent() {
        return newStudent;
    }

    public void setNewStudent(String newStudent) {
        this.newStudent = newStudent == null ? null : newStudent.trim();
    }

    public Integer getWalkerNumber() {
        return walkerNumber;
    }

    public void setWalkerNumber(Integer walkerNumber) {
        this.walkerNumber = walkerNumber;
    }

    public Integer getInClassNumber() {
        return inClassNumber;
    }

    public void setInClassNumber(Integer inClassNumber) {
        this.inClassNumber = inClassNumber;
    }

    public Integer getJumpOut() {
        return jumpOut;
    }

    public void setJumpOut(Integer jumpOut) {
        this.jumpOut = jumpOut;
    }

    public Integer getClassNowNumber() {
        return classNowNumber;
    }

    public void setClassNowNumber(Integer classNowNumber) {
        this.classNowNumber = classNowNumber;
    }

    public Integer getHourClassNumber() {
        return hourClassNumber;
    }

    public void setHourClassNumber(Integer hourClassNumber) {
        this.hourClassNumber = hourClassNumber;
    }

    public Integer getHourInClassNumber() {
        return hourInClassNumber;
    }

    public void setHourInClassNumber(Integer hourInClassNumber) {
        this.hourInClassNumber = hourInClassNumber;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}