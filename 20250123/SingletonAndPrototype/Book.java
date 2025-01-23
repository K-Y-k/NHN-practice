package SingletonAndPrototype;
// 프로토타입 설정 어노테이션
@CreationType(type=ObjectType.Prototype)
public class Book implements DataBean {
    private int bookNo;
    private String name;
    private String author;

    public Book() {}
    public Book(int bookNo, String name, String author) {
        this.bookNo = bookNo;
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getBookNo() {
        return bookNo;
    }

    public String getAuthor() {
        return author;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    
    // @Override
    // public DataBean clone() {
    //     System.out.print("복사를 실행합니다.");
    //     return new Book(this.bookNo, this.name, this.author);
    // }

   
    @Override
    public DataBean clone() throws CloneNotSupportedException {
        return (DataBean) super.clone();
    }
}
