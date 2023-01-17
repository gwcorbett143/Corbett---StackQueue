import java.util.EmptyStackException;

//an object representing data structure Stack
public class Stack<N>{
    private StackNode<N> top = null; //reference to the "top" Node of the Stack
    private int size = 0; //number of elements in Stack

    //empty constructor
    public Stack(){}

    //returns instance data size
    public int size(){
        return size;
    }

    //returns true if stack is empty
    public boolean isEmpty(){
        return (top == null);
    }

    //adds a new element to the top of stack
    public void push(N arg){ //adds a new item to the stack
        StackNode n = new StackNode(arg, top);//this allows values to be assigned accurately
        top = n; //sets teh top value to the argument provided
        size++; //adds 1 more to the stack
    }

    public N pop(){ //removes the top variable
        N data = null; //sets the value to null because it doesn't matter
        if (isEmpty() != true){ //if the stack isn't empty, then the value can be popped
            data = (N) top.getData(); //sets the data to the top value
            StackNode temp = top; //temp gets set to the top variable to keep it
            top = top.getNxt(); //the next variable gets set to the top
            temp.setNxt(null); //basically deletes the old next in the stack and brings up the next next variable
            size--; //decreases the size by one
        }
        return data;
    }

    public N peek(){ //returns the top variable
        N data = null; //data is set to non-existent basically
        if(isEmpty()) { //if there is no variable their can't be a top value
            throw new EmptyStackException(); //the stack is empty when this command is executed
        }else{
            data = (N) top.getData(); //saves the top value
        }
        return data;//returns the value that was saved
    }
}
