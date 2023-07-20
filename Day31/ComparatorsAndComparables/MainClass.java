package ComparatorsAndComparables;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class MainClass {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(93,"Reedam"));
        students.add(new Student(67, "Pragya"));
        students.add(new Student(49,"Harsh"));
        students.add(new Student(85,"Ayush"));
        students.add(new Student(13,"Reedam"));

//        Collections.sort(students, new SortByNameThenMarks());
                        //

        // anonymous class method
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if(o1.name.equals(o2.name)){
//                    return o1.marks - o2.marks;
//                }else{
//                    return o1.name.compareTo(o2.name);
//                }
//            }
//        });

        // lambda syntax
//        Collections.sort(students, ( o1,  o2)-> {
//                if(o1.name.equals(o2.name)){
//                    return o1.marks - o2.marks;
//                }else{
//                    return o1.name.compareTo(o2.name);
//                }
//            });

//        Collections.sort(students, ( o1,  o2)->  o1.name.compareTo(o2.name));

        // If we want to avoid using class
        Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks));

        students.forEach(System.out::println);

    }
}

//class SortByNameThenMarks implements Comparator<Student>{
//
//    @Override
//    public int compare(Student o1, Student o2) {
//        if(o1.name.equals(o2.name)){
//            return o1.marks - o2.marks;
//        }else{
//            return o1.name.compareTo(o2.name);
//        }
//    }
//}
