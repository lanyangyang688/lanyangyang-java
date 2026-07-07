package com.set;


/**
 * @author lanyangyang
 */
@SuppressWarnings("all")
public class HashSetStructure {
    static void main(String[] args) {

        //模拟一个HashSet的底层 （HashMap的底层结构）
        //1.创建一个数组，数组的类型是 Node[]
        //2.大家经常吧Node数组称为表
        Node[] table = new Node[16];
        System.out.println("table = " + table);
        //3.创建结点
        Node john = new Node (null,"john");

        table [2] = john;
        Node jack = new Node (null,"jack");
        john.next = jack;//将jack挂载到john
        Node rose = new Node (null,"rose");
        jack.next = rose;
        Node luck = new Node (null,"luck");
        table[3] = luck;
        System.out.println("table = " + table);


    }
}
class Node {//结点 储存数据，可以指向下一个结点，从而形成链表
    Object item;//存放数据
    Node next;//指向下一个结点

    public Node(Node next, Object item) {
        this.next = next;
        this.item = item;
    }
}
