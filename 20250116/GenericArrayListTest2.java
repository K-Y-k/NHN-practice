public class GenericArrayListTest2 {
    public static void main(String[] args) {
        // Comparator 활용
        // 자기 자신이 아닌 2개의 매개 객체를 비교한다.
        // 즉 기준을 선정한 Comparator를 구현하고 
        // sort 메소드에 해당 Comparator를 적용한다.
        Department2<Student> department = new Department2(1, "Computer Engineering");
        department.add(new Student("ccc", 3));
        department.add(new Student("aaa", 2));
        department.add(new Student("bbb", 4));
        department.add(new Student("ddd", 1));

        for (Student student : department) {
            System.out.println(student);
        }

        department.sort(new StudentNameComparator()); // 구현한 Comparator를 전달

        for (Student student : department) {
            System.out.println(student);
        }
    }
}
