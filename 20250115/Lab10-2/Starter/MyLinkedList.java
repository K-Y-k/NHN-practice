public class MyLinkedList implements MyList {
    Node headNode;
    private int index = 0;

    public MyLinkedList() {
        this.headNode = null;
    }

    private class Node {
        private int data;
        private Node nextNode;

        Node(int data) {
            this.data = data;
            this.nextNode = null;
        }

        public int getData() {
            return this.data;
        }

        public void setNextNode(Node node) {
            this.nextNode = node;
        }

        public Node getNextNode() {
            return this.nextNode;
        }
    }

    
    //
    // implements add method of List interface
    //
    public void add(int data) {
        Node node = new Node(data);

        if (headNode == null) {
            headNode = node;
        } else {
            Node currentNode = headNode;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.nextNode = node;
        }
        index++;
    }

    //
    // implements remove method of List interface
    //
    public int remove(int index) {
        if (headNode == null) {
            throw new LinkedListInvalidOperationException("List is empty");
        }

        Node currentNode = headNode;
        int removeData = currentNode.getData();

        if (index == 0) {
            headNode = currentNode.nextNode;
        } else {
            for (int i = 0; i < index-1; i++) {
                System.out.println(currentNode.getData());

                currentNode = currentNode.getNextNode();
            }
    
            removeData = currentNode.getNextNode().getData();
            currentNode.setNextNode(currentNode.getNextNode().getNextNode());
        }
        
        index--;
        return removeData;
    }

    //
    // implements get method of List interface
    //
    public int get(int index) {
        Node currentNode = headNode;

        if (index == 0) {
            return currentNode.getData();
        } else {
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.getNextNode();
            }

            return currentNode.getData();
        }
    }

    //
    // implements size method of List interface
    //
    public int size() {
        return index;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        Node currentNode = headNode;

        for (int i = 0; i < index; i++) {
            result.append(currentNode.getData());
            currentNode = currentNode.getNextNode();

            if (i == index-1) {
                break;
            }
            result.append(", ");
        }

        result.append("]");

        return result.toString();
    }
}
