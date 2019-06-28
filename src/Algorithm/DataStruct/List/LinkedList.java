package Algorithm.DataStruct.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/27
 * \* Time: 10:47
 * \
 */
public class LinkedList {
    //定义头节点
    Node head=null;
    //定义一个结点类
    class Node{
        String data;//结点的内容
        Node next;//指向下一个结点的地址
        //创建构造方法构造链表
        Node(String data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
//        linkedList.insertNode( "第一个结点" );
//        linkedList.insertNode( "第二个结点" );
//        linkedList.insertNode( "第三个结点" );
//        linkedList.insertNode( "第四个结点" );
//        linkedList.insertNode( "第五个结点" );
//        linkedList.printList();
        linkedList.insertNodeHead( "第6" );
        linkedList.printList();
        linkedList.insertNodeHead( "第七" );
        linkedList.printList();

//        System.out.println(linkedList.length());
//        System.out.println(linkedList.deleteNode( 1));
//        System.out.println(linkedList.getValue( 4 ));
//        linkedList.printList();
//        linkedList.RecursionList( head );
//        Node node=null;
//        node.data="第二个结点";
//        linkedList.deletNodeNoHead( node );

    }
    //插入结点,尾部插入
    public  void insertNode(String data){
        Node newNode=new Node( data );
        if (head==null){
            head=newNode;
            return;
        }
        Node tmp=head;
        while (tmp.next!=null){
            tmp=tmp.next;
        }
        tmp.next=newNode;
    }

    //插入结点，头部插入
    public void insertNodeHead(String data){
        //创建需要插入的node对象
        Node node=new Node( data );
        if (head==null){
            head=node;
            return;
        }
        //取得头结点的下一个结点
        Node nextNode=head.next;
        //让node指向头结点的下一个结点，而不是头结点指向头结点的下一个结点
        node.next=nextNode;
        //让头结点的下一个结点指向node
        head.next=node;
    }

    //删除单链表某个位置的元素
    public boolean deleteNode(int position){
        //如果删除的位置小于1或者大于当前链表的长度就返回false
        if (position<1||position>length()){
            return false;
        }
        //如果删除的是头结点，把头结点的下一个结点赋值为头结点，
        //头结点就会变成垃圾被回收，返回true
        if (position==1){
            head=head.next;
            return true;
        }
        //否则定义一个计数器，初始值为2，因为不可能是头结点了,所以不是1
        int j=2;
        //定义上一个结点为头结点
        Node preNode=head;
        //当前结点为头结点的下一个结点
        Node currentNode=preNode.next;
        //当当前结点不为空时
        while (currentNode!=null){
            //如果删除的元素的位置position等于j
            if (j==position){
                //把当前结点的下一个结点赋值给上一个结点的地址域
                //这样当前结点就不存在了，删除，返回true
                preNode.next=currentNode.next;
                return  true;
            }
            //把上一个结点和当前结点都往后移一位,继续执行循环
            preNode=currentNode;
            currentNode=currentNode.next;
            //累加器叠加
            j++;
        }
        return  false;
    }

//    public boolean deleteNode(int index){
//        if (index<1||index>length()){
//            System.out.println("索引选取不合适");
//            return  false;
//        }
//        if (index==1){
//            head=head.next;
//            return true;
//        }
//        int i=2;
//        Node preNode=head;
//        Node currentNode=preNode.next;
//        while (currentNode!=null){
//            if (i==index){
//                preNode.next=currentNode.next;
//                 return true;
//            }
//            preNode=currentNode;
//            currentNode=currentNode.next;
//            i++;
//        }
//        return false;
//    }


    //不知道头指针的情况下删除指定元素
//    public boolean deletNodeNoHead(Node n){
//        if (n==null||n.next==null){
//            return  false;
//        }
//       String tmp=n.data;
//        n.data=n.next.data;
//        n.next.data=tmp;
//        n.next=n.next.next;
//        System.out.println("删除成功");
//        return  true;
//    }


    //递归输出单链表
    public  void RecursionList(Node head){
        if (head!=null){
            RecursionList( head );
            System.out.println("结点的数据："+head.data);
        }
    }

    //输出单链表
    public  void printList(){
        Node tmp=head;
        while (tmp!=null){
            System.out.println(tmp.data);
            tmp=tmp.next;
        }
    }

    //获取单链表的长度
    public int length(){
        int length=0;
        Node tmp=head;
        while (tmp!=null){
            length++;
            tmp=tmp.next;
        }
        return  length;
    }

    //读取单链表某个位置的数据
    public String getValue(int position){
        if (position<1||position>length()){
             return "该位置无元素";
        }
        if (position==1){
            return head.data;
        }
        int j=2;
        Node tmp=head.next;
        while (tmp!=null){
            if (position==j){
                return tmp.data;
            }
            tmp=tmp.next;
            j++;
        }
        return "未找到元素";
    }


}
