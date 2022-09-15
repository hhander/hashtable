import java.util.Scanner;

public class hashTableDemo {
    public static void main(String[] args) {
        hashTable ht = new hashTable(10);

        do{
            Scanner sc = new Scanner(System.in);
            menu();
            System.out.println("请输入选择");
            int choose = sc.nextInt();

            switch (choose)
            {
                case 1:
                    System.out.println("请输入名字");

                    String name = sc.next();
                    System.out.println("请输入id");
                    int id = sc.nextInt();

                    empNode emp = new empNode(id,name);
                    ht.add(emp);
                    break;
                case 2:
                    System.out.println("请输入需要删除的id");
                    int i = sc.nextInt();
                    ht.delete(i);
                    break;
                case 3:
                    ht.showList();
                    break;
                default:
                    break;
            }


        }while(true);
    }

    public static void menu()
    {
        System.out.println("__________________________________");
        System.out.println("_______    1.add       ___________");
        System.out.println("_______    2.delete    ___________");
        System.out.println("_______    3.show      ___________");
        System.out.println("__________________________________");
        System.out.println("__________________________________");
    }
}
