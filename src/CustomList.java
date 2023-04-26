public class CustomList<E> {
    public static class Node<E> {
        private E value;

        Node<E> nextLink;
        int index;

        Node(E value) {
            this.value = value;
            index = indexCount;
            indexCount++;
        }
        public E getValue() {
            return this.value;
        }
    }
     static int indexCount = 0;

    private Node<E> last;

    CustomList() {
        last = null;
    }
    private int size = 0;

    public void add(E value) {
        Node<E> newNode = new Node<>(value);
        newNode.nextLink = last;
        last = newNode;
        size++;
     }
     public void delete(int index) {
         Node<E> current = last;
         if (index == 0) {
             for (int i = size - 1; i > 0; i--) {
                 current = current.nextLink;
             }
             current.nextLink = null;   //удаление
             size--;
             indexCount--;
             current = last;
             last.index -= 1;  //переиндексация
             for (int i = size; i > 1; i--) {
                 current.nextLink.index -= 1;
                 current = current.nextLink;
             }
         } else {
             for (int i = size - 1; i > index + 1; i--) {
                 current =  current.nextLink;
             }
             current.nextLink = current.nextLink.nextLink; //удаление
             size--;
             indexCount--;
             current = last;
             last.index -= 1;     //переиндексация
             for (int i = size; i > index + 1; i--) {
                 current.nextLink.index -= 1;
                 current = current.nextLink;
             }
         }


     }
     public Node<E> get(int index) {
         Node<E> current = last;
         while (current.index != index) {
             current = current.nextLink;
         }
         return current;
     }
     public int size() {
        return this.size;
     }




}
