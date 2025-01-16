public class Test1 {
    public static void main(String[] args) {
        Department department = new Department(1, "ComputerEngineering");
        department.add(new Student("Celine", 1));
        department.add(new Student("James", 2));
        department.add(new Student("kyk", 3));
        department.add(new Student("dddd", 4));

        
        // Enumerator enumerator = new ArrayListEnumerator(department.studentList);
        // while (enumerator.hasNext()) {
        //     Student s = (Student)enumerator.next();
        //     System.out.println(s.getName());
        // }
    }
}
