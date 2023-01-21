package homework9;

public class MyStack {
    public int k = 0;
    Object[] myArray = new Object[0];
    Object[] newArray = new Object[0];
    public void push(Object value){
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
    public void size(){
        System.out.println(newArray.length);
    }
    public void pop(){
        if(myArray.length == 0){
            System.out.println("There's nothing to remove");
        } else {
            System.out.println(myArray[myArray.length - 1]);
            k--;
            newArray = new Object[k];
            System.arraycopy(myArray, 0, newArray, 0, myArray.length - 1);
            myArray = newArray;
        }
    }
    public void peek(){
        if(myArray.length == 0){
            System.out.println("There's nothing to remove");
        } else {
            System.out.println(myArray[myArray.length - 1]);
        }
    }
    public static void main(String[] args) {
        MyStack array = new MyStack();
        array.push("1");
        array.push("2");
        array.push("3");
        array.size();
        array.remove(2);
        array.size();
        array.pop();
        array.size();
        array.peek();
        array.clear();
        array.size();

    }
}
