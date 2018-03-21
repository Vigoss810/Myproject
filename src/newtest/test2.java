package newtest;


import java.util.Stack;

public class test2 {//用两个栈实现一个队列
   private Stack<Integer> stack1 = new Stack();
   private Stack<Integer> stack2 = new Stack();

    public void push(int node) {//入队，将元素a入栈1
        stack1.push(node);
    }

    public int pop() {//判断栈B是否为空，如果为空，则将栈A中所有元素pop，并push进栈B，栈B出栈；如果不为空，栈B直接出栈。
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                int node = stack1.pop();
                stack2.add(node);
            }
        }

        return stack2.pop();
    }

    public static void main(String[] args) {
        test2 test=new test2();
        test.push(1);
        test.push(2);
        System.out.println(test.pop());

    }
}
