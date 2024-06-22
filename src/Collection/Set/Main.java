package Collection.Set;

import Collection.ArrayList.Student;
import Collection.ArrayList.StudentComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run6();
    }
    public void run() {
        Set<Integer> set = new HashSet<>(List.of(2,3,4,20,5,6,7,8,9,1,16));
        System.out.println(set.size());
        System.out.println(set);
    }
    private void run1() {
        Student student1 = new Student("Nazar", 21,95);
        Student student2 = new Student("Bob", 33,85.4);
        Student student3 = new Student("Max", 24,79);
        Student student4 = new Student("Yana", 28,91.2);
        Student student5 = new Student("Jake", 21,80);
        Set<Student> students = new HashSet<>(List.of(student1, student2, student3, student4));
        System.out.println(students.contains(student1));
        System.out.println(students.contains(student5));
        students.remove(student1);
        student1.setName("Neyzr");
        students.add(student1);
        System.out.println(students);
        System.out.println(students.contains(student1));
    }
    public void run2(){
        Student student1 = new Student("Nazar", 21,95);
        Student student2 = new Student("Bob", 33,85.4);
        Student student3 = new Student("Max", 24,79);
        Student student4 = new Student("Yana", 28,91.2);
        Student student5 = new Student("Jake", 21,80);
        List<Student> students = new ArrayList<>(List.of(student1, student2, student3, student4,student5));
        Collections.sort(students, Comparator.comparing(Student::getName)
                .thenComparingInt(Student::getAge)
                .thenComparingDouble(Student::getRating));
        for(Student student : students){
            System.out.println(student);
        }
    }
    public void run3(){
        Student student1 = new Student("Nazar", 21,95);
        Student student2 = new Student("Bob", 33,85.4);
        Student student3 = new Student("Max", 24,79);
        Student student4 = new Student("Yana", 28,91.2);
        Student student5 = new Student("Max", 21,80);
        List<Student> students = List.of(student1, student2, student3, student4, student5);
        Map<String,Integer> map = new TreeMap<>();
        for(Student student : students){
            map.merge(student.getName(), 1, Integer::sum);
//            if(map.containsKey(student.getName())){
//                map.put(student.getName(), map.get(student.getName())+1);
//            }else {
//                map.put(student.getName(), 1);
//            }
        }
        for (Map.Entry<String, Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }

    public void run4(){
        var queue= new PriorityQueue<Integer>(List.of(10,1,4,5,6,7,8,2,3,9));
        System.out.println(queue);
        for (Integer i : queue) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(queue.poll());
        System.out.println(queue);
        queue.offer(8);
        while (!queue.isEmpty()){
            System.out.print(queue.poll()+" ");
        }
        System.out.println();
    }

    public void run5(){
        List<Integer> list = new ArrayList<>(List.of(2,3,4,6,1,10,7,9));
//        Collections.sort(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }

    public void run6(){
        Student student1 = new Student("Nazar", 21,95);
        Student student2 = new Student("Bob", 21,85.4);
        Student student3 = new Student("Max", 24,79);
        Student student4 = new Student("Yana", 24,91.2);
        Student student5 = new Student("Max", 21,80);
        List<Student> students = List.of(student1,student2,student3,student4,student5);
        Map<Integer,List<Student>> map = new TreeMap<>(); //Для кожного віку отримати список студентів
        for (Student student : students) {
//            List<Student> list=map.get(student.getAge());
//            if (list==null){
//                list=new ArrayList<>();
//                map.put(student.getAge(),list);
//            }
//            list.add(student);
            List<Student> list = map.computeIfAbsent(student.getAge(), k -> new ArrayList<>());
            list.add(student);
        }
        for (Map.Entry<Integer, List<Student>> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
