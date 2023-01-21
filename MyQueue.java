package homework9;

public class MyQueue {
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
    public void pool(){
        if(myArray.length == 0){
            System.out.println("There's nothing to remove");
        } else {
            System.out.println(myArray[0]);
            k--;
            newArray = new Object[k];
            System.arraycopy(myArray, 1, newArray, 0, myArray.length - 1);
            myArray = newArray;
        }
    }
    public void peek(){
        if(myArray.length == 0){
            System.out.println("There's nothing to remove");
        } else {
            System.out.println(myArray[0]);
        }
    }
    public void clear(){
        newArray = new Object[0];
    }
    public int size(){
        return newArray.length;
    }
    public static void main(String[] args) {
        MyQueue array = new MyQueue();
        array.add("1");
        array.add("2");
        array.add("3");
        System.out.println(array.size());
        array.pool();
        array.peek();
        array.clear();
        System.out.println(array.size());



    }



}
