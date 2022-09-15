public class hashTable {
    public empNodeList[] hashList;
    public int size;

    public hashTable(int size) {
        this.size = size;
        hashList = new empNodeList[size];
        for (int i = 0; i < hashList.length; i++) {
            hashList[i] = new empNodeList();
        }
    }

    public void add(empNode emp)
    {
        int num = hashFun(emp.id);
        hashList[num].add(emp);
    }

    public void find(int id)
    {
        int num = hashFun(id);
        empNode emp = hashList[num].find(id);
        if(emp != null)
        {
            System.out.println(emp);
        }
        else
        {
            System.out.println("未找到");
        }
    }

    public void delete(int id)
    {
        int num = hashFun(id);
        empNode emp = hashList[num].find(id);
        if(emp == null)
        {
            System.out.println("没有此id");
            return;
        }
        hashList[num].delete(id);
        System.out.println("删除成功");

    }

    public void showList()
    {
        for (int i = 0; i < hashList.length; i++) {
            if(!hashList[i].isEmpty())
            {
                hashList[i].show();
                System.out.println();
            }

        }
    }

    public int hashFun(int id)
    {
        return id % size;
    }

}
