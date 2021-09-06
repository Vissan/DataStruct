import com.sun.org.apache.xerces.internal.impl.xpath.regex.REUtil;

import java.util.EventListener;

interface MyList {
   public void clear(); // 将一个已经存在的线性表置成空表

   public boolean isEmpty(); // 判断当前线性表中的数据元素个数是否为0,若为0则函数返回true，否则返回false

   public int length(); // 求线性表中的数据元素个数并由函数返回其值

   public Object get(int i) throws Exception;// 读取到线性表中的第i个数据元素并由函数返回其值。其中i取值范围为：0≤i≤length()-1,如果i值不在此范围则抛出异常

   public void insert(int i, Object x) throws Exception;// 在线性表的第i个数据元素之前插入一个值为x的数据元素。其中i取值范围为：0≤i≤length()。如果i值不在此范围则抛出异常,当i=0时表示在表头插入一个数据元素x,当i=length()时表示在表尾插入一个数据元素x

   public void remove(int i) throws Exception;// 将线性表中第i个数据元素删除。其中i取值范围为：0≤i≤length()- 1,如果i值不在此范围则抛出异常

   public int indexOf(Object x);// 返回线性表中首次出现指定元素的索引，如果列表不包含此元素，则返回 -1

   public void display();// 输出线性表中的数据元素

}

public class LinearList implements MyList{

   /**
    * 创建线性表
    */
   private Object [] elem;
   private int curLen;

   public LinearList(int maxsize){
      this.curLen = 0;
      elem = new Object[maxsize];
   }

   @Override
   public void clear() {
      curLen = 0;
   }

   @Override
   public boolean isEmpty() {
      return curLen == 0;
   }

   @Override
   public int length() {
      return curLen;
   }

   @Override
   public Object get(int i) throws Exception {
      /*
       * 判断数组的范围
       */
      if(i<0||i>elem.length-1){ //elem.length应该是length-1
         throw new Exception("数组越界");
      }
      return elem[i];
   }

   @Override
   public void insert(int i, Object x) throws Exception {
      if(elem.length==curLen){
         throw new Exception("表已满");
      }
      if(i<0||i>curLen){
         throw new Exception("插入位置不合理");
      }
      System.arraycopy(elem, i, elem, i + 1, curLen - i);
      elem[i] = x;
      curLen++;
   }

   @Override
   public void remove(int i) throws Exception {
      if (i < 0 || i > curLen - 1) // i小于1或者大于表长减1
         throw new Exception("删除位置不合理");// 输出异常

      // 被删除元素之后的元素左移
      if (curLen - 1 - i >= 0) System.arraycopy(elem, i + 1, elem, i, curLen - 1 - i);
      curLen--;
   }

   @Override
   public int indexOf(Object x) {
      int count = 0;
      while (count < curLen && !elem[count].equals(x))
         count++;
      if(count<curLen)
         return count;
      else
         return -1;
   }

   @Override
   public void display() {
      for(int i = 0; i<curLen; i++){
         System.out.println(elem[i]);
      }
   }

   public static void main(String[] args) throws Exception{
      LinearList test = new LinearList(10);
      test.insert(0,1);
      test.insert(1, 2);
      test.insert(2, 3);
      test.insert(3, 4);
      test.insert(4, 5);
      test.insert(5, 6);
      test.insert(6, 7);
      test.insert(7, 8);
      test.remove(4);
      test.display();
   }
}
