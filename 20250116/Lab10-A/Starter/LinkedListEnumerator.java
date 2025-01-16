public class LinkedListEnumerator implements Enumerator {
    LinkedList list;

    public LinkedListEnumerator(LinkedList linkedList) {
        this.list = linkedList;
    }

    // 다음이 있는지 확인 메소드
    @Override
    public boolean hasNext() {
        // if (currentNode.nextNode == null) {
        //     return false;
        // } else {
        //     currentNode = currentNode.nextNode;
        //     return true;
        // }
        return list.head != null;
    }

    // 다음 원소 값을 갖는 메소드
    @Override
    public Object next() {
        Object data = list.head.data;
        list.head = list.head.nextNode;

        return data;
    }
}
