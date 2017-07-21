package cn.codingblock.array.orderedarray;

import cn.codingblock.array.utils.Logger;

public class OrderedArrayTest {

    public static void main(String[] args) {
        OrderedArray array = new OrderedArray(100);
        array.insert(1);
        array.insert(3);
        array.insert(5);
        array.insert(2);
        array.insert(10);
        array.insert(9);
        array.insert(6);
        array.insert(7);
        array.insert(4);
        array.insert(0);
//        int n = 50;
//        for(int i = 0; i < n; i++) {
//            array.insert(array.getRandomInt(n));
//        }
        array.display();
        Logger.println("find index:" + array.find(10));
        Logger.println("delete index:" + array.delete(10));
        array.display();
    }
}
