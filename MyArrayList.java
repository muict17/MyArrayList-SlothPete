public class MyArrayList<T> {

    private T[] element = (T[]) new Object[10];
    private int index = 0;

    public T[] UpdateSize() {
        T[] new_element = (T[]) new Object[element.length + 1];
        int i = 0;
        for (T each : element) {
            new_element[i] = each;
            i++;
        }

        return this.element = new_element;
    }

    public void ADD(T input) {
        if (index == element.length) {
            UpdateSize();
        }
        this.index++;
        this.element[index - 1] = input;
    }

    public void REMOVE(int index) {
        this.element[index] = null;
        T[] temp_element = (T[]) new Object[element.length - 1];
        int i = 0;
        for (T each : element) {
            if (each != null) {
                temp_element[i] = each;
                i++;
            }
        }
        this.index--;
        this.element = temp_element;
    }

    public T GET(int index) {
        return this.element[index];
    }

    public void PrintData() {
        for (T each : element) {
            if (each != null) {
                System.out.print(each + " ");
            }
        }
    }

    public int Size() {
        int count = 0;
        for (T each : element) {
            if (each != null) {
                count++;
            }
        }

        return count;
    }


}