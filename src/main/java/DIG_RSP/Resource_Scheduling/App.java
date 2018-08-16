package DIG_RSP.Resource_Scheduling;

class Emp
{
//instance var
int eid;
String ename;
float eSal;

Emp(int eid, String ename, float eSal)
{
//Conversion of local values to instance values
this.eid=eid;
this.ename=ename;
this.eSal= eSal;
}

void disp()
{
System.out.println("emp id is ="+eid);
System.out.println("emp employe name is ="+ename);
System.out.println("emp Salary is ="+eSal);
}
    public static void main( String[] args )
    {
    	Emp e1 = new Emp(2200, "Asim", 1000);
    	e1.disp();
       
    }
}
