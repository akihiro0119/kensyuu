package Collection;

import java.util.LinkedList;

class collectionTest9{
  public static void main(String args[]){
    LinkedList<String> array = new LinkedList<String>();

    array.offer("色が違う");
    array.offer("サイズが合わない");
    array.offer("壊れていた");

    System.out.println(array.poll());
    System.out.println(array.poll());

    array.offer("商品が違う");

    System.out.println(array.poll());
    System.out.println(array.poll());
  }
}
