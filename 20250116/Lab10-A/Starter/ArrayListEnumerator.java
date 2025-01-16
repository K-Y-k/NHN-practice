/* ArrayList 기반의 Enumerator 구현체 */
public class ArrayListEnumerator implements Enumerator {
    ArrayList list;
    int index = 0;

    public ArrayListEnumerator(ArrayList arrayList) {
        this.list = arrayList;
    }

    // 다음이 있는지 확인 메소드
    @Override
    public boolean hasNext() {
        if (this.index == this.list.size()) {
            return false;
        } else {
            return true;
        }
    }

    // 다음 원소 값을 갖는 메소드
    @Override
    public Object next() {
        return this.list.get(this.index++);
    }
}
