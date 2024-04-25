package Java_Junior_Developer_for_3_mounth.PR285QueueLinkedList;

public abstract class BaseOnLinkedListDataStorage implements DataStorage {
    static LinkedList first;
    static LinkedList last;
    static int count;


    @Override
    public final void add(int value) {
        LinkedList linkedList = new LinkedList(value);
        if (first != null) {
            last.next = linkedList;
            last = linkedList;
        } else {
            first = linkedList;
            last = linkedList;
        }
        count++;
    }

    @Override
    public final int size() {
        return count;
    }

    public String asString() {
        String str = "";
        LinkedList link = first;
            while (link != null) {
                str = str + link.value;
                link = link.next;
            }
        return str;
    }
}
