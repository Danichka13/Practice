package bonusTwo;

public class List {

    private LinkList head;

    public List() {
        head = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public int length() {
        int count = 0;
        LinkList temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void add(int data) {
        LinkList temp = new LinkList(data);
        temp.next = head;
        head = temp;
    }

    public void addInDiffPlace(int index, int data) {
        if (isEmpty()) {
            //System.out.println("Список пуст");
            add(data);
            return;
        }

        LinkList elem = head;
        LinkList temp = new LinkList(data);
        if (index == 1) {
            add(data);
            return;
        }
        if (index - 1 > length()) {
            System.out.println("Индекс превышает длину списка");
        } else if (index < 1) {
            System.out.println("Индекс меньше 1");
        } else {
            int i = 0;
            while (i < index - 2) {
                elem = elem.next;
                i++;
            }
            temp.next = elem.next;
            elem.next = temp;
        }


    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }
        head = head.next;
    }

    public void removeByIndex(int index) {
        LinkList cur = head;
        LinkList prev = head;
        int i = 1;

        while (cur != null && i != index) {
            prev = cur;
            cur = cur.next;
            i++;
        }
        if (cur != null) {
            if (cur == head) {
                remove();
            } else {
                prev.next = cur.next;
            }
        }
    }

    public void compare(List info) {
        LinkList temp = head;
        LinkList comp = info.head;
        while (temp != null) {
            if (temp.data != comp.data) {
                System.out.println("Списки разные");
                return;
            }
            temp = temp.next;
            comp = comp.next;
        }
    }

    public String toString() {
        LinkList temp = head;
        String str = "";
        while (temp != null) {
            str += temp.data + "; ";
            temp = temp.next;
        }
        return str;
    }

    public void sort() {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }
        LinkList first = head;
        LinkList second = head.next;
        LinkList last = null;

        while (first.next != last) {
            while (second != null) {
                if (first.data > second.data) {
                    swap(first, second);
                }
                first = first.next;
                if (second.next == last) {
                    last = second;
                }
                second = second.next;
            }
            first = head;
            second = first.next;
        }
    }

    public void clear() {

        while (head != null) {
            head = head.next;
        }
    }

    public void print() {
        LinkList temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private void swap(LinkList var1, LinkList var2) {
        int temp = var1.data;
        var1.data = var2.data;
        var2.data = temp;
    }
}
