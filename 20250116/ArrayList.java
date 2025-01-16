public class ArrayList<E> implements List<E> {
    private E[] elements;
    private int index = 0;

    public ArrayList() {
        this.elements = (E[])new Object[10];
    }

    public ArrayList(int size) {
        this.elements = (E[])new Object[size];
    }

    public void add(E item) {
        this.elements[this.index] = item;
        this.index++;
    }

    public E get(int index) {
        return this.elements[index];
    }

    public void remove(int index) {
        for (int i = index; i < this.index; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.index--;
    }

    public int size() {
        return this.index;
    }

    public E[] getElements() {
        return this.elements;
    }

    
    public boolean isEmpty() {
        return this.index == 0 ? true : false;
    }
}