package Day6.Labs;

public class MyArrayJub extends MyArrayBasic {
    public MyArrayJub(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
        this.data = new int[MAX_SIZE];
    }

    public void add(int a) {
        if (size >= MAX_SIZE) {
            data[size % 5] = a;
        } else {
            data[size] = a;
        }
        size += 1;
    }

    public void delete(int index) {
        if (size == 0) {
            System.out.println("WHAT R U DOING! THIS ARRAY IS EMPTY HAIYAA");
        } else {
            for (int i = index; i < size - 1; i++) {
                data[i] = data[i + 1];
                size--;
            }
            data[data.length - 1] = 0;
        }
    }
}
