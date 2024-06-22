package Lambda.task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WorkWithFile {
    public static void writeVectorTXT(ArrayList v,String nameFile) throws IOException {
        String textForFile = v.toString()
                .replaceAll("^\\[|\\]$","")
                .replaceAll(",","");
        FileOutputStream fos = new FileOutputStream(nameFile);
        byte[] buffer = textForFile.getBytes();
        fos.write(buffer,0,buffer.length);
        fos.close();
    }

    public static ArrayList readVectorTXT(String nameFile) throws IOException {
        Scanner in = new Scanner(new FileInputStream(nameFile));
        String s = in.nextLine();
        in.close();
        String[] str = s.split(" ");
        ArrayList v = new ArrayList();
        if (str[0].indexOf(".")>=0){
            for (int i=0;i<str.length;i++){
                v.add(Double.parseDouble(str[i]));
            }
        }else {
            for (int i=0;i<str.length;i++){
                v.add(Integer.parseInt(str[i]));
            }
        }
        return v;
    }

    public static void writeMatrixTXT(ArrayList v,String nameFile) throws IOException {
        int n=(int) Math.sqrt(v.size());
        FileOutputStream fos = new FileOutputStream(nameFile);
        for (int i=0;i<n;i++){
            String strMatrixForFile="";
            for (int j=0;j<n;j++){
                strMatrixForFile+=v.get(i*n+j)+" ";
            }
            if (i<n-1){
                strMatrixForFile+="\n";
            }
            byte[] buffer = strMatrixForFile.getBytes();
            fos.write(buffer,0,buffer.length);
        }
        fos.close();
    }

    public static int numberStringInTXTFile(String nameFile) throws IOException {
        Scanner in = new Scanner(new FileInputStream(nameFile));
        int n=0;
        try {
            while (in.nextLine().getClass().getSimpleName().equals("String")) n++;
        }catch (NoSuchElementException e){
            in.close();
        }finally {
            return n;
        }
    }

    public static ArrayList readMatrixTXT(String nameFile) throws Exception{
        Scanner in = new Scanner(new FileInputStream(nameFile));
        ArrayList v = new ArrayList();
        String s;
        while (in.hasNextLine()){
            s = in.nextLine();
            String words[] = s.split(" ");
            if (words[0].indexOf(".")>=0){
                for (int i=0;i<words.length;i++){
                    v.add(Double.parseDouble(words[i]));
                }
            }else {
                for (int i=0;i<words.length;i++){
                    v.add(Integer.parseInt(words[i]));
                }
            }
        }
        in.close();
        return v;
    }

}
