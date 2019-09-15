import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListTest {
    public static void main(String[] args)
    {
//        addFromMidTestA(20000);
//        addFromMidTestL(20000);
        deleteFromHeaderTestA(20000);
        deleteFromHeaderTestL(20000);
    }



    public static void remove(ArrayList<String> list)
    {
        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String str = it.next();

            if (str.equals("b")) {
                it.remove();
            }
        }

    }
    public static void remove2(ArrayList<String> list)
    {
        for (String s : list)
        {
            if (s.equals("b"))
            {
                list.remove(s);
            }
        }
    }


    /**
     *
     * @param DataNum
     */
    public static void addFromMidTestA(int DataNum) {
        ArrayList<String> list = new ArrayList<String>(DataNum);
        int i = 0;

        long timeStart = System.currentTimeMillis();
        while (i < DataNum) {
            int temp = list.size();
            list.add(temp/2,i + "aaavvv");
            i++;
        }
        long timeEnd = System.currentTimeMillis();

        System.out.println("ArrayList从集合中间位置新增元素花费的时间" + (timeEnd - timeStart));
    }

    public static void addFromMidTestL(int DataNum)
    {
        LinkedList<String> list=new LinkedList<String>();
        int i=0;
        long timeStart=System.currentTimeMillis();
        while(i<DataNum)
        {
            int temp = list.size();
            list.add(temp/2, i+"aaavvv");
            i++;
        }
        long timeEnd=System.currentTimeMillis();

        System.out.println("LinkedList从集合中间位置新增元素花费的时间"+(timeEnd-timeStart));
    }




    public static void deleteFromHeaderTestA(int DataNum) {
        ArrayList<String> list = new ArrayList<String>();
        int i = 0;

        while (i < DataNum) {
            list.add(i + "aaavvv");
            i++;
        }
        long timeStart = System.currentTimeMillis();
        i=0;

        while (i < DataNum) {
            list.remove(0);
            i++;
        }


        long timeEnd = System.currentTimeMillis();

        System.out.println("ArrayList从集合头部位置删除元素花费的时间" + (timeEnd - timeStart));
    }

    /**
     *
     * @param DataNum
     */
    public static void deleteFromMidTestA(int DataNum) {
        ArrayList<String> list = new ArrayList<String>();
        int i = 0;
        while (i < DataNum) {
            list.add(i + "aaavvv");
            i++;
        }
        long timeStart = System.currentTimeMillis();
        i=0;

        while (i < DataNum) {
            int temp = list.size();
            list.remove(temp/2);
            i++;
        }


        long timeEnd = System.currentTimeMillis();

        System.out.println("ArrayList从集合中间位置删除元素花费的时间" + (timeEnd - timeStart));
    }

    public static void deleteFromTailTestA(int DataNum) {
        ArrayList<String> list = new ArrayList<String>();
        int i = 0;
        while (i < DataNum) {
            list.add(i + "aaavvv");
            i++;
        }

        long timeStart = System.currentTimeMillis();

        i=0;

        while (i < DataNum) {
            int temp = list.size();
            System.out.println(list.remove(temp - 1));
            i++;

        }
        long timeEnd = System.currentTimeMillis();

        System.out.println("ArrayList从集合尾部位置删除元素花费的时间" + (timeEnd - timeStart));
    }

    public static void deleteFromHeaderTestL(int DataNum)
    {
        LinkedList<String> list=new LinkedList<String>();
        int i=0;

        while(i<DataNum)
        {
            list.add(i+"aaavvv");
            i++;
        }
        long timeStart=System.currentTimeMillis();

        i=0;
        while(i<DataNum)
        {
            list.removeFirst();
            i++;
        }

        long timeEnd=System.currentTimeMillis();

        System.out.println("LinkedList从集合头部位置删除元素花费的时间"+(timeEnd-timeStart));
    }

    public static void deleteFromMidTestL(int DataNum)
    {
        LinkedList<String> list=new LinkedList<String>();

        int i=0;
        while(i<DataNum)
        {
            list.add(i+"aaavvv");
            i++;
        }

        long timeStart=System.currentTimeMillis();

        i=0;
        while(i<DataNum)
        {
            int temp = list.size();
            list.remove(temp/2);
            i++;
        }

        long timeEnd=System.currentTimeMillis();

        System.out.println("LinkedList从集合中间位置删除元素花费的时间"+(timeEnd-timeStart));
    }



    public static void addFromHeaderTest(int DataNum) {
        ArrayList<String> list = new ArrayList<String>(DataNum);
        int i = 0;

        long timeStart = System.currentTimeMillis();

        while (i < DataNum) {
            list.add(0,i+"aaavvv");
            i++;
        }
        long timeEnd = System.currentTimeMillis();

        System.out.println("ArrayList从集合头部位置新增元素花费的时间" + (timeEnd - timeStart));
    }

    public static void getByForTest(int DataNum) {
        ArrayList<String> list = new ArrayList<String>();
        int i = 0;

        while (i < DataNum) {
            list.add(i + "aaavvv");
            i++;
        }
        long timeStart = System.currentTimeMillis();

        for (int j = 0; j < DataNum; j++) {
            System.out.println(list.get(j));
        }

        long timeEnd = System.currentTimeMillis();

        System.out.println("ArrayList for(;;)循环花费的时间" + (timeEnd - timeStart));
    }

    public static void getByIteratorTest(int DataNum) {
        ArrayList<String> list = new ArrayList<String>();
        int i = 0;

        while (i < DataNum) {
            list.add(i + "aaavvv");
            i++;
        }
        long timeStart = System.currentTimeMillis();

        for (Iterator<String> it=list.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }

        long timeEnd = System.currentTimeMillis();

        System.out.println("ArrayList 迭代器迭代循环花费的时间" + (timeEnd - timeStart));
    }
}
