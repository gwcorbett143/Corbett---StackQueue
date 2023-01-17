public class StackNode <N>{

    private N data; //instance data adapted from OG node class
    private StackNode nxt; //nxt is the most important variable because it stacks the data

    public StackNode(N arg, StackNode n){ //StackNode constructor
        data = arg; //the type of data gets set
        nxt = n; //the next variable is set here
    }

    public void setData(N arg){ //sets a variable in stack to the new argument
        data = arg;
    }

    public N getData(){//returns the data from a varible
        return data;
    }

    public StackNode getNxt() { //returns the next value in the stack
        return nxt;
    }

    public void setNxt(StackNode n) { //sets the variable thata on the top of teh stack
        nxt = n;
    }
}
