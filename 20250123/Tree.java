
// 트리는 비교 해야하기에
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        this.key = item;
        left = right = null;
    }

}

public class Tree {
    Node root;

    public Tree() {
        this.root = null;
    }

    public void add(int key) {
        System.out.println("순회 시작");
        root = addNode(root, key);
    }

    public Node addNode(Node node, int key) {
        if (node == null) {
            node = new Node(key);
            System.out.println();
            return node;
        }

        if (key < node.key) {
            node.left = addNode(node.left, key);
            System.out.println("왼쪽 순회 " + node.left.key);
        } else if (key > node.key) {
            node.right = addNode(node.right, key);
            System.out.println("오른쪽 순회 " + node.right.key);
        }

        System.out.println();

        return node;
    }

    public void print() {
        Node currentNode = root;
        System.out.println(currentNode.key);

        while (currentNode.left != null) {
            currentNode = root.left;
            System.out.println(currentNode.key);
        }
    }
}

class Test {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.add(3);
        tree.add(1);
        tree.add(2);
        tree.add(4);
        tree.add(5);
        
        tree.print();

    }
}
