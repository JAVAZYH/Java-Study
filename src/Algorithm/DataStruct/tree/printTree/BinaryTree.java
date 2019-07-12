package Algorithm.DataStruct.tree.printTree;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/2
 * \* Time: 19:18
 * \
 */
//构建二叉树
public class BinaryTree {

    Node root=new Node(1,"A");
    Node nodeB=new Node(1,"B");
    Node nodeC=new Node(1,"C");
    Node nodeD=new Node(1,"D");
    Node nodeE=new Node(1,"E");
    Node nodeF=new Node(1,"F");
    Node nodeG=new Node(1,"G");
    Node nodeH=new Node(1,"H");
    Node nodeK=new Node(1,"K");


}
class  Node{
    int id;
    String data;
    Node left;
    Node right;
    Node(int id,String data){
        this.id=id;
        this.data=data;
    }
}
