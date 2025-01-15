import java.util.Arrays;

public class MyArrayList implements MyList {
    private int[] elements;
    private int index = 0;

    public MyArrayList() {
        this.elements = new int[50];
    }


    //
    // implements add method of List interface
    //
    public void add(int data) {
        if (index == elements.length-1) {
            throw new ArrayListInvalidAddException("Full size, So Can't add");
        }

        elements[index] = data;
        index++;
    }

    //
    // implements remove method of List interface
    //
    public int remove(int index) {
        int removeData = elements[index];

        for (int i = index; i < elements.length-1; i++) {
            elements[i] = elements[i+1];
        }

        this.index--;

        return removeData;
    }

    //
    // implements get method of List interface
    //
    public int get(int index) {
        return elements[index];
    }

    //
    // implements size method of List interface
    //
    public int size() {
        return index;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
