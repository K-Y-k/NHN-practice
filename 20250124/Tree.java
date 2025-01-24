import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 트리는 비교 해야하기에
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        this.key = item;
        left = right = null;
    }

}

public class Tree implements Iterable<Integer> {
    Node root;
    List<Integer> iteratorList = new ArrayList<>();

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

    // 전위 순회
    public void preOrder(Node node) {
        if (node != null) {
            System.out.println(node.key);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    // 중위 순회
    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.println(node.key);
            inOrder(node.right);
        }
    }
    // 후위 순회
    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.key);
        }
    }


    // 제거


    // iterator로 조회 
    // 리스트를 생성해서 전위/중위/후위로 순외하며 저장하고
    // 해당 리스트의 iterator로 반환
    private void setInOrderIterator(Node node) {
        if (node != null) {
            setInOrderIterator(node.left);
            iteratorList.add(node.key);
            setInOrderIterator(node.right);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        this.setInOrderIterator(this.root);
        return iteratorList.iterator();
    }
}

class TreeTest {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.add(3);
        tree.add(1);
        tree.add(2);
        tree.add(4);
        tree.add(5);
        
        System.out.println("전위 순회");
        tree.preOrder(tree.root);
        System.out.println();

        System.out.println("중위 순회");
        tree.inOrder(tree.root);
        System.out.println();

        System.out.println("후위 순회");
        tree.postOrder(tree.root);
        System.out.println();


        // 전위 순외 iterator
        Iterator<Integer> iterator = tree.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
