package test.school.bean;

import java.util.Date;

public class Logrecord {
    private Integer id;

    private String deviceid;

    private String changevalue;

    private Date gentime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid == null ? null : deviceid.trim();
    }

    public String getChangevalue() {
        return changevalue;
    }

    public void setChangevalue(String changevalue) {
        this.changevalue = changevalue == null ? null : changevalue.trim();
    }

    public Date getGentime() {
        return gentime;
    }

    public void setGentime(Date gentime) {
        this.gentime = gentime;
    }
}