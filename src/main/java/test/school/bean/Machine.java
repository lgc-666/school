package test.school.bean;

public class Machine {
    private Integer mid;

    private String machineid;

    private String classname;

    private String status;

    private String leastrssi;

    private String beat;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMachineid() {
        return machineid;
    }

    public void setMachineid(String machineid) {
        this.machineid = machineid == null ? null : machineid.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getLeastrssi() {
        return leastrssi;
    }

    public void setLeastrssi(String leastrssi) {
        this.leastrssi = leastrssi == null ? null : leastrssi.trim();
    }

    public String getBeat() {
        return beat;
    }

    public void setBeat(String beat) {
        this.beat = beat == null ? null : beat.trim();
    }
}