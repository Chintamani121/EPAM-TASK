package BytesPart1.Task4;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Student[] studentArray = {
                new Student("A", "3"),
                new Student("B", null),
                new Student(null, null),
                null
        };
        Stream<Student> stream = Arrays.stream(studentArray)
                .sorted(Comparator.comparing((Student x) ->
                        (x==null || x.getGrade() == null) ? "z" : x.getGrade())
                        .thenComparing(x->(x==null || x.getId() == null) ? "z" : x.getId()));
        Student[] sortedStudentArray = stream.toArray(Student[]::new);


        for(Student a : sortedStudentArray) System.out.println(a);
    }
}
