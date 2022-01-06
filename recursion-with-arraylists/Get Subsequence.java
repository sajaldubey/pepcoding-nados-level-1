import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(gss(str));
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        String semistr = str.substring(1);

        ArrayList<String> semiarr = gss(semistr);
        ArrayList<String> res = new ArrayList<>();

        for(String itr : semiarr){
            res.add("" + itr);
        }

        for(String itr : semiarr){
            res.add(ch + itr);
        }

        return res;
    }

}