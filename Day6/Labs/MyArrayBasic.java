package Day6.Labs;

public class MyArrayBasic {
    int MAX_SIZE = 5;
    int size = 0;
    int[] data = new int[MAX_SIZE];

    public MyArrayBasic(int... b){
        MAX_SIZE = b.length;
        int[] data = new int[MAX_SIZE];

        for (int i = 0; i < b.length ; i++){
            data[i] = b[i];
            size++;
        }
    }

    @Override
    public String toString(){
        String output = "";
        output += "[ ";
        for (int i: data){
            output += "," + String.valueOf(i);
        }
        output += " ]";
        return output;
    }

    public void add(int a){
        data[size] = a;
        size += 1;
    }

    public void delete (int index){
        for(int i = index ; i < size -1 ; i++){
            data[i] = data[i+1];
            size--;
        }
        data[data.length-1] = 0;
    }

    public void insert (int value, int index){
        if(size + 1 > MAX_SIZE){
            return;
        }
        size++;
        for (int i = index + 1; i < size; i++){
            data[i] = data[i + 1];
        }
        data[index] = value;
    }

    public void IncreaseSize(){
        MAX_SIZE = MAX_SIZE*2;
        int[] newdata = new int[MAX_SIZE];
        for (int i = 0; i < data.length; i++){
            newdata[i] = data[i];
        }
        data = newdata;
    }
}
