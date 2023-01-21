package homework9;

public class MyArrayList {
    public int k = 0;
    Object[] myArray = new Object[0];
    Object[] newArray = new Object[0];
    public void add(Object value){
        if(myArray.length == 0){
            k++;
            myArray = new Object[k];
            myArray[k-1] = value;
        } else {
            k++;
            newArray = new Object[k];
            System.arraycopy(myArray, 0, newArray, 0, myArray.length);
            newArray[k-1] = value;
            myArray = newArray;
        }

    }
    public void remove(int index){
        if(myArray.length == 0){
            System.out.println("There's nothing to remove");
        } else {
            k--;
            newArray = new Object[k];
            System.arraycopy(myArray, 0, newArray, 0, index);
            System.arraycopy(myArray, index + 1, newArray, index, myArray.length - index - 1);
            myArray = newArray;
        }
    }
    public void clear(){
        newArray = new Object[0];
    }
    public int size(){
        return newArray.length;
    }
    public Object get(int index){
        return newArray[index];
    }
    public static void main(String[] args) {
        MyArrayList array = new MyArrayList();
        array.add("1");
        array.add("2");
        array.add("3");
        //array.clear();
        array.remove(2);
        System.out.println(array.size());
        System.out.println(array.get(0));
        System.out.println(array.get(1));


    }

}
