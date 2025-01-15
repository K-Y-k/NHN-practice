public class Test {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add(1);
        list1.add("Celine");
        list1.add(3);
        list1.add(4.0);
        list1.add(5);

        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));

        System.out.println(list1);
        System.out.println("size: " + list1.size());

        list1.remove(1);

        System.out.println(list1);
        System.out.println("size: " + list1.size());


        System.out.println();


        List list2 = new LinkedList();
        list2.add(1);
        list2.add(2);
        list2.add("Celine");
        list2.add(4.0);
        list2.add(5);
        list2.add(6);

        System.out.println(list2.get(0));
        System.out.println(list2.get(1));
        System.out.println(list2.get(2));
        System.out.println("size: " + list2.size());
        System.out.println(list2);

        list2.remove(1);
        System.out.println(list2);
        System.out.println("size: " + list2.size());

        list2.remove(2);
        System.out.println(list2);
        System.out.println("size: " + list2.size());
    }
}
