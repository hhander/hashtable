public class empNodeList {
    public empNode head;

    public void add(empNode emp)
    {
        if(head == null)
        {
            head = emp;
        }
        empNode tmp = head;
        while(true)
        {
            if(tmp.next == null)
            {
                break;
            }
            tmp = tmp.next;
        }
        tmp.next = emp;
    }

    public boolean isEmpty()
    {
        if(head == null)
        {
            return true;
        }
        return false;
    }


    public empNode find(int id)
    {
        if(isEmpty())
        {
            System.out.println("信息为空");
            return null;
        }
        empNode tmp = head;
        while(true)
        {
            if(tmp.id == id)
            {
                return tmp;
            }
            tmp = tmp.next;
        }
    }

    public void delete(int id)
    {
        if(isEmpty())
        {
            System.out.println("链表为空");
            return;
        }
        empNode emp = find(id);
        if(emp == null)
        {
            System.out.println("不存在此id");
            return;
        }
        empNode tmp = head;
        while(true)
        {
            if(tmp.next.id == tmp.id)
            {
                break;
            }
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
    }

    public void show()
    {
        if(isEmpty())
        {
            System.out.println("链表为空");
            return;
        }
        empNode tmp = head;
        while(true)
        {
            System.out.println(tmp);
            if(tmp.next == null)
            {
                break;
            }
            tmp = tmp.next;
        }
    }
}
