package test.school.bean;

import java.util.Date;

public class StopVisit {
    private Integer stopVisitId;

    private String adress;

    private Integer injudge;

    private Date inTime;

    private Date leftTime;

    private String rt;

    private Integer visitedTimes;

    private String beat;

    private Integer handlejudge;

    private String mac;

    public Integer getStopVisitId() {
        return stopVisitId;
    }

    public void setStopVisitId(Integer stopVisitId) {
        this.stopVisitId = stopVisitId;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public Integer getInjudge() {
        return injudge;
    }

    public void setInjudge(Integer injudge) {
        this.injudge = injudge;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Date getLeftTime() {
        return leftTime;
    }

    public void setLeftTime(Date leftTime) {
        this.leftTime = leftTime;
    }

    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt == null ? null : rt.trim();
    }

    public Integer getVisitedTimes() {
        return visitedTimes;
    }

    public void setVisitedTimes(Integer visitedTimes) {
        this.visitedTimes = visitedTimes;
    }

    public String getBeat() {
        return beat;
    }

    public void setBeat(String beat) {
        this.beat = beat == null ? null : beat.trim();
    }

    public Integer getHandlejudge() {
        return handlejudge;
    }

    public void setHandlejudge(Integer handlejudge) {
        this.handlejudge = handlejudge;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }
}