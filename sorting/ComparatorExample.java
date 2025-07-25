package sorting;

import java.util.*;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

class AgeComparator implements Comparator<STudent> {
    public int compare(STudent s1, STudent s2) {
        if (s1.age == s2.age)
            return 0;
        else if (s1.age > s2.age)
            return 1;
        else
            return -1;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<STudent> list = new ArrayList<>();

        list.add(new STudent(101, "Ram", 22));
        list.add(new STudent(102, "Shyam", 20));
        list.add(new STudent(103, "Hari", 21));

        System.out.println("Sorting students by age:");
        Collections.sort(list, new AgeComparator());

        for (STudent s : list) {
            System.out.println(s.id + " " + s.name + " " + s.age);
        }
    }
}
