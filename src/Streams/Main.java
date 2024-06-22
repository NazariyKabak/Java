package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        new Main().run4();
    }



    private void run1() {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("John",25),
                new Employee("Mike",27),
                new Employee("Kate",21),
                new Employee("John",23),
                new Employee("Mary",35),
                new Employee("Jack",75)
        ));

//        List<String> names = map(employees, new Mapper<Employee, String>() {
//            @Override
//            public String map(Employee employee) {
//                return employee.getName();
//            }
//        });
//        List<String> names = map(employees, employee -> employee.getName());
//        List<String> names = map(employees,Employee::getName);
        List<String> names = employees.stream().map(Employee::getName).toList();
        System.out.println(names.getClass());
        names.forEach(System.out::println);
    }

    public <U,T> List<T> map(List<U> list, Mapper<U,T> mapper) {
        List<T> result = new ArrayList<>();
        for (U u:list){
            T elem = mapper.map(u);
            result.add(elem);
        }
        return result;
    }
    public void run2(){
        List<String> list=new ArrayList<>();
        list.add("Квбаса");
        list.add("Хліб");
        list.add("Сир");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
        list.add("eggs");

    }

    private void run3(){
        double start =0;
        double end =PI;
        int n=100_000_000;
        double h=(end - start)/n;
        double v= IntStream.range(0,n).parallel().mapToDouble(i->start+i*h).map(Math::sin).sum()*h;
        System.out.println(v);
    }

    private void run4() {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("John",25),
                new Employee("Mike",27),
                new Employee("Kate",21),
                new Employee("John",23),
                new Employee("Mary",35),
                new Employee("Jack",75)
        ));
        Optional<Integer> max=employees.stream().map(Employee::getAge).filter(age -> age <30).max(Comparator.naturalOrder());
        System.out.println(max);
    }
}
