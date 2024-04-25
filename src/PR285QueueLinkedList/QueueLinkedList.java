package Java_Junior_Developer_for_3_mounth.PR285QueueLinkedList;

public class QueueLinkedList extends BaseOnLinkedListDataStorage {

    @Override
    public int get() {
        int value;
        if(BaseOnLinkedListDataStorage.first != null) {
            value = BaseOnLinkedListDataStorage.first.value;
            BaseOnLinkedListDataStorage.first = BaseOnLinkedListDataStorage.first.next;
            count--;
            return value;
        } else {
            BaseOnLinkedListDataStorage.last = null;
            return 0;
        }
    }
}
