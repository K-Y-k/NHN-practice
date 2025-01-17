public class DepartmentTest {
    public static void main(String[] args) {
        Department<Student> department = new Department<>(1, "Computer Engineering");
        department.add(new Student("ccc", 3));
        department.add(new Student("aaa", 2));
        department.add(new Student("bbb", 4));
        department.add(new Student("ddd", 1));

        for (Student student : department) {
            System.out.println(student);
        }
        System.out.println();

        // department.sort(new StudentNameComparator()); // 구현한 Comparator를 전달
        department.sortByName();

        for (Student student : department) {
            System.out.println(student);
        }

        System.out.println();

        Department<Professor> department2 = new Department<>(1, "Computer Engineering");
        department2.add(new Professor(3, "xxx", "Computer Engineering"));
        department2.add(new Professor(2, "qqq", "Computer Engineering"));
        department2.add(new Professor(4, "bbb", "Computer Engineering"));
        department2.add(new Professor(1, "fff", "Computer Engineering"));

        for (Professor professor : department2) {
            System.out.println(professor);
        }
        System.out.println();

        department2.sortByName();

        for (Professor professor : department2) {
            System.out.println(professor);
        }
    }
}
