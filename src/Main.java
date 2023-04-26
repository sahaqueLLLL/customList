

public class Main  {
    public static void main(String[] args) {
        CustomList<Integer> list = new CustomList<>();
        list.add(7);    //0
        list.add(5);    //1
        list.add(1);    //2
        list.add(7);    //3
        list.add(0);    //4
        list.add(11);    //5
        list.add(9);    //6
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getValue() + " ");
        }
        list.delete(4);
        list.delete(1);
        list.delete(2);
        list.delete(3);
        list.delete(0);
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getValue() + " ");
        }
        list.add(55);
        list.add(121);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getValue() + " ");
        }








    }}