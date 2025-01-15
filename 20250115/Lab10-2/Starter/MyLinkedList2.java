public class MyLinkedList2 implements List {
    Node headNode;
    
    public MyLinkedList2() {
        this.headNode = null;
    }

    private class Node {
        private Object data;
        private Node nextNode;

        Node(Object data) {
            this.data = data;
            this.nextNode = null;
        }

        public Object getData() {
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
    public void add(Object data) {
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
    }

    //
    // implements remove method of List interface
    //
    public void remove(int index) {
        if (this.headNode == null) {
            throw new LinkedListInvalidOperationException("List is empty");
        }

        if (index == 0) {
            headNode = headNode.nextNode;
        } else {
            Node currentNode = headNode;

            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNextNode();
            }
    
            currentNode.setNextNode(currentNode.getNextNode().getNextNode());
        }
    }

    //
    // implements get method of List interface
    //
    public Object get(int index) {
        // 음수 예외 처리
        

        // 비어있을 때 예외 처리


        Node currentNode = headNode;

        
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNextNode();
        }

        return currentNode.getData();
    }

    //
    // implements size method of List interface
    //
    public int size() {
        int count = 0;

        if (headNode == null) {
            return count;
        } else {
            count = 1;
            
            Node currentNode = headNode;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
                count++;
            }
    
            return count;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        Node currentNode = headNode;

        while (currentNode.getNextNode() != null) {
            result.append(currentNode.getData()).append(", ");

            currentNode = currentNode.getNextNode();
        }

        result.append(currentNode.getData());
        result.append("]");

        return result.toString();
    }
}
