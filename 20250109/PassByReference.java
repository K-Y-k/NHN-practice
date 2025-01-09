public class PassByReference {
    /* ??? pass By value??. ???? ??? pass By Reference?? ????. */
    public static void addOne(int[] i) {
        i[0] += 1;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(array); // ???
    }
}
