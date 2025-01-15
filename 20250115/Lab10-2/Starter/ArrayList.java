import java.util.Arrays;

public class ArrayList implements List {
    private Object[] elements;
    private int index = 0;

    public ArrayList() {
        this.elements = new Object[10];
    }


    //
    // implements add method of List interface
    //
    public void add(Object data) {
        if (this.index == elements.length-1) {
            throw new ArrayListInvalidAddException("Full size, So Can't add");
        }

        elements[this.index] = data;
        this.index++;
    }

    //
    // implements remove method of List interface
    //
    public void remove(int index) {
        for (int i = index; i < this.index; i++) {
            elements[i] = elements[i+1];
        }

        this.index--;
    }

    //
    // implements get method of List interface
    //
    public Object get(int index) {
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
