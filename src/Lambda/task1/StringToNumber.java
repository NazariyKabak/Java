package Lambda.task1;

public class StringToNumber {
    static String intDlInvalid(String str){
        StringBuffer a = new StringBuffer(str);
        String validChar ="0123456789";
        int i =(a.charAt(0)=='-'?-1:0);
        for (;i<a.length();){
            if (validChar.indexOf(a.charAt(i)) <0){
                a.delete(i,i+1);
            }else {
                i++;
            }
        }
        return a.toString();
    }
    static String doubleDlInvalid(String str){
        StringBuffer a = new StringBuffer(str);
        for (int i=a.toString().lastIndexOf('.');a.toString().indexOf('.')<i;){
            a.delete(i,i+1);
            i=a.toString().lastIndexOf('.');
        }
        String validChar =".0123456789";
        int i =(a.charAt(0)=='-'?-1:0);
        for (;i<a.length();){
            if (validChar.indexOf(a.charAt(i)) <0){
                a.delete(i,i+1);
            }else {
                i++;
            }
        }
        return a.toString();
    }


}
