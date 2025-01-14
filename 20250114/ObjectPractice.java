public class ObjectPractice {
    public static void main(String[] args) {
        ObjectPractice o = new ObjectPractice();
        
        System.out.println(o.toString());
    }


    /* Object의 toString() 오버라이드 */
    @Override
    public String toString() {
        return "ObjectPractice class";
    }
}
