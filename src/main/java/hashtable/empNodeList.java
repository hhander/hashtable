package hashtable;

public class empNodeList {
    public empNode head;

    public void add(empNode emp)
    {
        if(head == null)
        {
            head = emp;
            return;
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

            if(tmp == null)
            {
                return null;
            }

        }

    }

    public void delete(int id)
    {
        if(head.id == id)
        {
            head = null;
            return;
        }
        empNode emp = head;
        while(true)
        {
            if(emp.next == null)
            {
                return;
            }

            if(emp.next.id == id)
            {
                emp.next = emp.next.next;
                break;
            }

            emp = emp.next;
        }



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
            System.out.print(tmp);
            if(tmp.next == null)
            {
                break;
            }
            tmp = tmp.next;
        }
    }
}
