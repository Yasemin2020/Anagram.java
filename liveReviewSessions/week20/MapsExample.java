package week20;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapsExample {
    public static void main(String[] args) {
        Map<String,Object> empOne = new LinkedHashMap<>();
        empOne.put("First_Name","Steven");
        empOne.put("Last_Name","King");
        empOne.put("Job_ID","AD_PRES");
        empOne.put("Salary",24000);
        empOne.put("Deparment_ID",90);
        System.out.println("empOne = " + empOne);


    }
}
//"FIRST_NAME"    "LAST_NAME"    "JOB_ID"    "SALARY"    "DEPARTMENT_ID" : Keys
//
//map1
//"Steven"        "King"        "AD_PRES"        24000        90          : FirstEmp
//
//map2
//"Neena"            "Kochhar"    "AD_VP"            17000        90     : secondEmp
//
//map3
//"Lex"            "De Haan"    "AD_VP"            17000        90     : thirdEmp
//
//@Zafer Arasan
//What about if there is same name employee?