package SingletonAndPrototype;
public class Test {
    public static void main(String[] args) {
        try {
            // 프로토타입 객체
            Book book1 = new Book();
            Book book2 = new Book();
            System.out.println("book1 = " + book1);
            System.out.println("book2 = " + book2);

            // 싱글톤타입 객체
            Configurator conf1 = new Configurator();
            Configurator conf2 = new Configurator();
            System.out.println("conf1 = " + conf1);
            System.out.println("conf2 = " + conf2);
            System.out.println();

            ObjectRepository.register(book1);
            ObjectRepository.register(book2);
            ObjectRepository.register(conf1);
            ObjectRepository.register(conf2);

            System.out.println(ObjectRepository.getObject("Book"));
            System.out.println(ObjectRepository.getObject("Book"));
            System.out.println(ObjectRepository.getObject("Configurator"));
            System.out.println(ObjectRepository.getObject("Configurator"));

        } catch (IllegalArgumentException e) {
        }
    }
}