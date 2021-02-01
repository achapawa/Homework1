package edu.isu.pawan.hw1p;

import java.util.Vector;

public class appManager {
    public appManager() {
    }

    Vector<String> v1 = new Vector<>();

    public void storeDetails(String  c,String code) {
        c+=code;
        v1.add(c);
        //v1.add(code);
    }

    public String getResult() {

        return v1.toString();


    }

    public String getDepCode(String combo) {

        String code="";
        if (combo == "Computer") {
            code+="  CS ";
        }
        else if (combo=="Physics"){
            code+="  PHYS ";
        }
        else if(combo=="Mathematics"){
            code+="  MATH ";
        }
        else if(combo=="Chemistry"){
            code+="  CHEM ";
        } else if (combo == "Zoology") {
            code+="  ZOO ";
        }
        else {
            code+="  BTNY ";
        }

        return code;

    }

}