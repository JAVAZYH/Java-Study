package zyh.Algorithm.DataStruct.Queue;

import java.util.Arrays;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/6/29
 * \* Time: 9:00
 * \
 */
public class LoopQueue {
        private final static  int MAX_SIZE=6;
        String[] arr;
        int front;
        int rear;
        LoopQueue(){
            this.arr=new String[MAX_SIZE];
            front=0;
            rear=0;
        }
        //获取队列长度
        public  int getLength(){
            return  (rear-front+MAX_SIZE)%MAX_SIZE;
        }

        //入队
        public void add(String data){
            /**
             * (rear+1)%MAX_SIZE==front是判断队列是否满的公式
             * 判断队列是否满，但是队列其中还有一个空元素的位置，
             * 这样做是因为区分开队列是否为空或者满
             * 如果用rear=front来判断队列是否满会出现队列为空时，
             * rear=front，无法区分队列为空还是满
             */

            if ((rear+1)%MAX_SIZE==front){
                System.out.println("队列已满");
                return;
            }
            //将数据插入队尾
            arr[rear]=data;
            //队尾后移一位
            rear=(rear+1)%MAX_SIZE;
        }

        //出队
        public void del(){
            if (rear==front){
                System.out.println("队列为空");
                return;
            }
            //把队头的元素清空
            arr[front]=null;
            //队头元素加1
            front=(front+1)%MAX_SIZE;
        }
        //遍历队列
        public  void printQueue(){
            int tmp=front;
            while (front!=rear){
                System.out.println(arr[front]);
                front=(front+1)%MAX_SIZE;
            }
            front=tmp;
        }
    public static void main(String[] args) {
              LoopQueue loopQueue=new LoopQueue();
              loopQueue.add( "0" );
              loopQueue.add( "1" );
              loopQueue.add( "2" );
        System.out.println( Arrays.toString( loopQueue.arr ) );
        loopQueue.printQueue();
        loopQueue.del();
//        loopQueue.del();
        loopQueue.add( "3" );
        loopQueue.add( "4" );
        System.out.println( Arrays.toString( loopQueue.arr ) );
//        System.out.println( Arrays.toString( loopQueue.arr ) );

        //              loopQueue.printQueue();
//        System.out.println();
//        System.out.println(1%MAX_SIZE);


    }
}