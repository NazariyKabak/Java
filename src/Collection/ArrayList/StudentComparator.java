package Collection.ArrayList;

import java.util.Comparator;
import java.util.Objects;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int cmp= Objects.compare(s1.getName(),s2.getName(),Comparator.naturalOrder());
        if (cmp==0){
            cmp=Integer.compare(s1.getAge(),s2.getAge());
            if (cmp==0){
                cmp=Double.compare(s1.getRating(),s2.getRating());
            }
        }
        return cmp;
    }
}
