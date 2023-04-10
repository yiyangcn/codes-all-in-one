package test;

import java.util.Date;

import javafx.scene.control.Spinner;

class Test {
    public static void main(String[] args) {
        String value = "10" + String.format("%07d", Integer.valueOf(011));
        String code = "012223";
        String codeReplace = code.replaceAll("^(0+)", "");
        System.out.println(codeReplace);
        // System.out.println(value);  
        String planCode = value.substring(1,8).replaceAll("^(0+)", "");
        // System.out.println(planCode);
        Date date = new Date(Long.valueOf(1661779512));
        // System.out.println(date);
    }
}