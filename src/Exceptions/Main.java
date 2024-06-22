package Exceptions;



import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.List.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run5();
        int []a = new int []{1,2,3,4,5};
    }
    public void run5() {
        int[] array = new int[]{11, 5, -4, 8, 4, 7};
        for (int i = 0; i <= array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
    }
    public void run() {

        try(BufferedReader br = Files.newBufferedReader(Path.of("file.txt"))) {

            String s;
            while((s=br.readLine())!=null){
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {
            System.err.println("file not found!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    
    private void run1() {
        List<Student> students = new ArrayList<>(of(
                new Student("John", 25, 75.2),
                new Student("Jake", 21, 85.2),
                new Student("Nazar", 22, 95.2),
                new Student("Mike", 15, 81.2)
        ));
        writeStudents(students);
        readStudents();
    }

    private  void writeStudents(List<Student> st1) {
        try (var out = new ObjectOutputStream(Files.newOutputStream(Path.of("students.bin")))) {
//            out.writeObject(st1);
            for (Student s : st1) {
                out.writeObject(s);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public void readStudents(){
        try (var rd = new ObjectInputStream(Files.newInputStream(Path.of("students.bin")))) {
            List<Student> students = new ArrayList<>();
            for (var i=0;i<4;i++){
                Student s = (Student) rd.readObject();

            }
            for (Student s : students) {
                System.out.println(s);
            }
        }catch (IOException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }

}
