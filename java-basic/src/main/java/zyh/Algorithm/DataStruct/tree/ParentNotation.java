package zyh.Algorithm.DataStruct.tree;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/2
 * \* Time: 15:31
 * \
 */
//树的双亲表示法
public class ParentNotation {
    public static final int MAX_SIZE=100;
    //构造一个结点 parent存储父节点，data存储值
    class Node{
        int parent;//存储父节点的位置
        Character data;
        Node(int parent,char data){
            this.data= data;
            this.parent=parent;
        }
    }
    Node[] arr=new Node[MAX_SIZE];
    int root;
    int numbers;

}