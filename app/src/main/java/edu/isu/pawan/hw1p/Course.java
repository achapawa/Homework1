package edu.isu.pawan.hw1p;

import java.util.ArrayList;
import java.util.Vector;

public class Course {
    private Object depName;
    private  Integer courNumber;
    private  String  courName;
    private Integer NoOfCredit;
    private static ArrayList<String> depmtArray;

    public Course( Object depName, Integer courNumber,String courName, Integer NoOfCredit){
        this.depName=depName;
        this.courNumber=courNumber;
        this.courName=courName;
        this.NoOfCredit=NoOfCredit;
    }

    public Object getDepName() {
        return depName;
    }

    public Integer getCourNumber() {
        return courNumber;
    }

    public String getCourName() {
        return courName;
    }

    public Integer getNoOfCredit() {
        return NoOfCredit;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public void setCourName(String courName) {
        this.courName = courName;
    }

    public void setNoOfCredit(Integer noOfCredit) {
        NoOfCredit = noOfCredit;
    }

    public void setCourNumber(Integer courNumber) {
        this.courNumber = courNumber;
    }

    @Override
    public String toString() {
        return String.format("%s  %s  %s  %s",depName,courNumber,courName,NoOfCredit);
    }

}
