public class LinkedList implements List {
    private Node headNode;
    private int count = 0;

    public LinkedList() {
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

    public void add(Object data) {
        Node newNode = new Node(data);

        if (headNode == null) {
            this.headNode = newNode;
            return;
        }

        Node lastNode = this.headNode;
        while(lastNode.getNextNode() != null) {
            lastNode = lastNode.getNextNode();
        }

        lastNode.setNextNode(newNode);
        this.count++;
    }

    public void remove(int index) {
        if (this.headNode == null) {
            throw new LinkedListInvalidOperationException("List is empty");
        }

        if (index == 0) {
            this.headNode = this.headNode.getNextNode();
        }

        Node tempNode = this.getNode(index - 1);
        tempNode.setNextNode(tempNode.getNextNode().getNextNode());

        this.count--;
    }

    private Node getNode(int index) {
        Node currentNode = this.headNode;
        int count = 0;

        while(currentNode != null) {
            if (count == index) {
                return currentNode;
            }
            count++;
            currentNode = currentNode.getNextNode();
        }

        throw new LinkedListInvalidOperationException("Cannot remove data");
    }

    public Object get(int index) {
        Node currentNode = this.headNode;
        int count = 0;

        while(currentNode != null) {
            if (count == index) {
                return currentNode.getData();
            }
            count++;
            currentNode = currentNode.getNextNode();
        }
        throw new LinkedListInvalidOperationException("Cannot remove data");
    }


    public int size() {
        return this.count;
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
