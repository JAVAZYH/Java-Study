package Algorithm.DataStruct.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/27
 * \* Time: 21:37
 * \
 */
public class DoubleLinkedList {
    class Node{
        Node pre;
        Node next;
        String data;
        public Node (String data){
            this.data=data;
        }
    }
    Node head=null;

    public  void insert(int index,String data){
        //构建一个新结点
        Node node=new Node( data );
        if (head==null){
             head=node;
             return;
        }
        //让currentNode指向需要插入的结点
        Node currentNode=head;
        int j=1;
        while (j<index){
            currentNode=currentNode.next;
            j++;
        }

        //如果当前结点是尾结点
        if (currentNode.next==null){
            //让node结点的指针为空，并且让之前的尾结点指向当前结点
            node.next=null;
            currentNode.next=node;
        }else{
            //如果currentNode不是尾结点
            //1.新结点node的前驱指向当前结点
            //2.新结点node的后继指向当前结点的下一结点，至此node的结点的前驱和后继已经设置完毕
            //3.让当前结点的下一结点currentNode.next的前驱指向新结点node
            //4.让当前结点的后继指向新节点node
            node.pre=currentNode;
            node.next=currentNode.next;
            currentNode.next.pre= node;
            currentNode.next=node;
        }
     }

     //删除指定位置的结点
      public void delete(int index){
        Node currentNode=head;
        int j=1;
        while (j<index){
            currentNode=currentNode.next;
            j++;
        }
        if (currentNode.next==null){
            currentNode.pre.next=null;
        }else if(currentNode.pre==null){
            head=head.next;
        }
        else{
            currentNode.pre.next=currentNode.next;
        }
      }

  //从头指针遍历
    public  void printList(){
     Node node=head;
     while (node!=null){
         System.out.println(node.data);
         node=node.next;
     }
    }
    public static void main(String[] args) {
        DoubleLinkedList linkedList=new DoubleLinkedList();
        linkedList.insert(0,"第一个结点" );
        linkedList.insert( 1,"第二个结点" );
        linkedList.insert( 1,"第三个结点" );
        linkedList.insert( 1,"第四个结点" );
        linkedList.printList();
        linkedList.delete( 1 );
        linkedList.printList();
    }


}