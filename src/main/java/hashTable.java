public class hashTable {
    public empNodeList[] hashList;
    public int size;

    public hashTable(int size) {
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

    public void showList()
    {
        for (int i = 0; i < hashList.length; i++) {
            if(!hashList[i].isEmpty())
            {
                hashList[i].show();
            }
            System.out.println();
        }
    }

    public int hashFun(int id)
    {
        return id % size;
    }

}
