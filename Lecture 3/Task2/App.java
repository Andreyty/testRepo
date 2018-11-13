import java.util.stream.Collectors;

import java.util.*;

public class App {
    private static List<Student> studentsGroup = new ArrayList<>();

    static {
        Random random = new Random();
        String[] studentName = {"Ian","Peter","Vasiliy","Nikolai","Ted","Bob","Augusta","Vanessa","Vivien","Bruce","Iosif","Vladimir","Max","Stefan","Luk"};
        String[] studentLastName = {"Sputnikoff","Donavan","Douglas","Gren","Muller","Winesteine","Ferrari","Alonso","Lebowski","Lee","Sheen","Tai","Chaushesku","Sutin","Van Goge"};
        for (int i = 0; i < 10; i++) {
            studentsGroup.add(new Student(i + 95, studentName[random.nextInt(14)], studentLastName[random.nextInt(14)], random.nextInt(13)+17));
        }
    }

    public static void main(String[] args) {
        System.out.println("initial List: ");
        System.out.println(studentsGroup);
        System.out.println();
        System.out.println("List sorted by age: ");
        sortAge();
        System.out.println(studentsGroup);
        System.out.println();
        System.out.println("List of students filtered by first letter in Second name: ");
        System.out.println(filterSt("D"));
        System.out.println();
        System.out.println("Students group average age: ");
        System.out.println(standsArithmetic());
        System.out.println();
        System.out.println("List of students filtered by Id > 100: ");
        System.out.println(filterMap(createMap()));
    }

    private static void sortAge() {
        studentsGroup.sort(new CompareStudents());
    }

    private static List<Student> filterSt(String x) {
        List<Student> fSt = new ArrayList<>();
        for (Student i : studentsGroup) {
            if (i.getLastName().startsWith(x)) {
                fSt.add(i);
            }
        }
        return fSt;
    }


    private static double standsArithmetic() {
        int sr = 0;
        for (Student student : studentsGroup) {
            sr += student.getAge();
        }
        return sr / studentsGroup.size();
    }

    private static Map<Integer, Student> createMap() {
        Map<Integer, Student> map = new HashMap<>();
        for (Student student : studentsGroup) {
            map.put(student.getId(), student);
        }
        return map;
    }

    private static Map<Integer, Student> filterMap(Map<Integer, Student> map) {
        Map<Integer, Student> outputMap = new HashMap<>();
        for (Integer i : map.keySet()) {
            if (i > 100) {
                outputMap.put(i, map.get(i));
            }
        }
        return outputMap;
    }
}