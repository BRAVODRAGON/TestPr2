package Java_Junior_Developer_for_3_mounth.PR285QueueLinkedList;

public class StuckLinkedList extends BaseOnLinkedListDataStorage {
    LinkedList one;
    LinkedList two;

    @Override
    public int get() {
        int value;
        LinkedList temp = first;
        int amount = size();
        int flag = 2;
        if (first != null) {
            while (temp != null) {
                if (flag % 2 == 0) {
                    one = temp;
                } else {
                    two = temp;
                }
                temp = temp.next;
                flag++;
            }
            if (amount > 1) {
                if (one.next == null) {
                    value = one.value;
                    two.next = null;
                    BaseOnLinkedListDataStorage.last = two;
                } else {
                    value = two.value;
                    one.next = null;
                    BaseOnLinkedListDataStorage.last = one;
                }
            } else {
                value = first.value;
                BaseOnLinkedListDataStorage.first = null;
                BaseOnLinkedListDataStorage.last = null;
            }
            count--;
            return value;
        } else {
            return 0;
        }
    }
}
