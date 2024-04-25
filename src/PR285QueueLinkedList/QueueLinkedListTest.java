package Java_Junior_Developer_for_3_mounth.PR285QueueLinkedList;

public class QueueLinkedListTest {
    public static void main(String[] args) {
        QueueLinkedList list = new QueueLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list.asString());

        System.out.println(list.get());
        System.out.println(list.asString());
        System.out.println(list.get());
        System.out.println(list.asString());
        System.out.println(list.get());
        System.out.println(list.asString());
        System.out.println(list.get());
        System.out.println(list.asString());
        System.out.println(list.get());
        System.out.println(list.asString());

        System.out.println(list.size());
        System.out.println(BaseOnLinkedListDataStorage.last);

    }
}
