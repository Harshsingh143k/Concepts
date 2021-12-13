package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regular_expresison {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("jdbc");//creating pattern(what keyword ypu want to find in it)
        Matcher m = p.matcher("abjdbcnmjiujdbckohjdbc");//creating target for finding pattern
        //using find keyword
        int cnt=0;
        while(m.find()){//here we  ARE counting repatation pattern in target string
            cnt++;
        }
        System.out.println("we found pattern "+cnt+" no of times in target string");
        while(m.find()){
            System.out.println("starting "+m.start());//it will provide starting index of thr pattern
            System.out.println("ending "+m.end());//it will provide ending index of the pattern
            System.out.println("return pattern "+m.group());//it will return the pattern

        }
    }
}

