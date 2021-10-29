package zyh.Algorithm.DataStruct.Queue;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/29
 * \* Time: 10:28
 * \
 */
public class LinkedQueue {
class Node{
    Node next;
    String data;
    Node(String data){
        this.data=data;
    }
}
Node head=null;
Node front;
Node rear;
//构造链队列
    LinkedQueue(){
        front=head;
        rear=head;
    }

//插入链队列
     public  void insert(String data){
      Node node=new Node( data );
      if (front==null){
          /**
           * 如果头结点为空，就把新节点node设置为头结点，
           * 让队头和队尾都指向新结点
           */
             front=rear=head=node;
             return;
         }
      //让新节点变为队尾
       rear.next=node;
       rear=node;
       }
//出队
    public  void del(){
        //如果队尾等于队头的下一个元素，则删除后将队尾和队头指向头结点
        //队尾等于队头
        if (rear==front.next){
            front.next=null;
            rear=front;
            return;
        }
        //如果队列中只有一个元素，就将链表变为空
        if (rear==front){
            rear=front=null;
            return;
        }
        front.next=front.next.next;
    }


       //遍历链队列
    public  void printLinkedQueue(){
        Node tmp=front;
        //循环遍历队头，循环结束时返回队头元素
        while (front!=null){
            System.out.println(front.data);
            front=front.next;
        }
        front=tmp;
    }
    public static void main(String[] args) {
        LinkedQueue queue=new LinkedQueue();
        queue.insert( "第一个结点" );
        queue.insert( "第二个结点" );
        queue.insert( "第三个结点" );
        queue.insert( "第四个结点" );
        queue.printLinkedQueue();
        System.out.println("队头:"+queue.front.data);
        System.out.println("队尾:"+queue.rear.data);
        System.out.println("---出队前---");
        queue.del();
        queue.del();
        queue.del();
        queue.del();
        queue.printLinkedQueue();
    }
}