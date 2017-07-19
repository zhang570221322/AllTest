import org.junit.Test;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Created by zwl on 2017/7/19.
 * May god bless me
 */
public class JavaUtilObjectsTest {
    @Test
    public void test1(){
        Student obj_01 = new Student("zhangsan", 30);
        Student obj_02 = new Student("zhangsan", 20);

        // 1
        System.out.println("01. Objects.compare----->" + Objects.compare(obj_01, obj_02, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        }));

        // 2
        System.out.println("02. Objects.deepEquals----->" + Objects.deepEquals(obj_01, obj_02));

        // 3
        System.out.println("03. Objects.equals----->" + Objects.equals(obj_01, obj_02));

        // 4
        Object[] obj_04 = new Object[]{obj_01, obj_02};
        System.out.println("04. Objects.hash---->" + Objects.hash(obj_04));

        // 5
        System.out.println("05. Objects.hashCode---->" + Objects.hashCode(obj_01));

        // 6
        Object obj_06 = null;
        System.out.println("06. Objects.isNull----->" + Objects.isNull(obj_06));

        // 7
        Object obj_07 = null;
        System.out.println("07. Objects.nonNull---->" + Objects.nonNull(obj_07));

        // 8
        Object obj_08 = 1;
        System.out.println("08. Objects.requireNonNull----->" + Objects.requireNonNull(obj_08));

        // 9
        Object obj_09 = 1;
        System.out.println("09. Objects.requireNonNull----->" + Objects.requireNonNull(obj_09, "The object cann't be null."));

        // 10
        Object obj_10 = 1;
        System.out.println("10. Objects.requireNonNull----->" + Objects.requireNonNull(obj_10, new Supplier<String>(){
            @Override
            public String get() {
                return "The Object cann't be null...";
            }
        }));

        // 11
        Object obj_11 = "123";
        System.out.println("11. Objects.toString----->" + Objects.toString(obj_11));

        // 12
        Object obj_12 = "222";
        System.out.println("12. Objects.toString----->" + Objects.toString(obj_12, "234") + "<----->" + Objects.toString(null, "234"));
    }
    class Student {
        private String name;
        private Integer age;

        public Student(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public int hashCode() {
            return this.getAge();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;

            Student other = (Student) obj;
            //if (age != other.age)
            //  return false;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            return true;
        }
    }
}
