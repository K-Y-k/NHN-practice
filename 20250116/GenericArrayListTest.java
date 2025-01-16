public class GenericArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Celine");
        list.add("James");
        list.add("Jason");

        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("Celine", 1));
        list2.add(new Student("Jason", 3));
        list2.add(new Student("kyk", 2));

        
        Department department = new Department(1, "Computer Engineering");
        department.add(new Student("aaa", 3));
        department.add(new Student("bbb", 2));
        department.add(new Student("ccc", 4));
        department.add(new Student("ddd", 1));

        for (Student student : department) {
            System.out.println(student);
        }

        department.sort();

        for (Student student : department) {
            System.out.println(student);
        }
    }
}
