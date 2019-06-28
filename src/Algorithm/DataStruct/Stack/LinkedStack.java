package Algorithm.DataStruct.Stack;

import Algorithm.DataStruct.List.LinkedList;

import java.awt.*;
import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/28
 * \* Time: 10:38
 * \
 */
public class LinkedStack {
    class Node{
        Node next;
        String data;
        Node(String data){
            this.data=data;
        }
    }

   private  Node head=null;//定义头结点当做栈顶
   private int size;//记录栈中元素的个数

    //入栈
    public void insert(String data){
        Node node=new Node( data );
        if (head==null) {
            head = node;
            return;
        }
        //先将头结点保存到tmp
        Node tmp=head;
        //将新节点变为头结点
        head=node;
        //将新的头结点的next指向之前的头结点tmp
        head.next=tmp;
        size++;
    }

    //出栈
    public void pop(){
        System.out.println(head.data+"出栈");
        //将头结点变为下一个结点
        head=head.next;
        //大小减1
        size--;
    }
    //入栈和出栈的时间复杂度都为0（1）

    //输出链栈某个位置的数据
    public String getValueByIndex(int index){
        int j=1;
        while(j<=index){
            head=head.next;
            j++;
        }
        return head.data;
    }

    //遍历链栈
    public void printStack(){
        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }



    public static void main(String[] args) {
        LinkedStack linkedList=new LinkedStack();
        linkedList.insert( "第一个栈节点" );
        linkedList.insert( "第二个栈节点" );
        linkedList.insert( "第三个栈节点" );
        linkedList.pop();
        linkedList.printStack();
//        System.out.println( linkedList.getValueByIndex( 1 ));
    }
}