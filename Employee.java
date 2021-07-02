public class Employee extends Object implements Comparable<Employee>
{
private String name,age,sal,desig,emailId;
private int id,deptno;
		
		
		
public Employee(String name, String age, String sal, String desig, String emailId, int id, int deptno)
   {
			super();
			this.name = name;
			this.age = age;
			this.emailId = emailId;
			this.id = id;
			this.deptno = deptno;
	 }

		public Employee() {
	
	      }

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public String getSal() {
			return sal;
		}
		public void setSal(String sal) {
			this.sal = sal;
		}
		public String getDesig() {
			return desig;
		}
		public void setDesig(String desig) {
			this.desig = desig;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getDeptno() {
			return deptno;
		}
		public void setDeptno(int deptno) {
			this.deptno = deptno;
		}
		
		@Override
		public int hashCode() 
		{
			return id;
		}

		@Override
		public String toString() {
			return this.name +" "+ this.emailId +" "+this.age+ " "+this.sal+ " "
					+this.desig + " "+ this.deptno;
		}
		
		@Override
		public boolean equals(Object obj) 
		{
			Employee u1 = (Employee)obj;
			
			String e1 = u1.getEmailId();
			String e2 = this.emailId;
			
			boolean b1 = e1.equals(e2);
			
			return b1;
			
		}

		@Override
		public int compareTo(Employee e) 
		{
	        Employee u1 = (Employee)e;
			
			String e1 = u1.getEmailId();
			String e2 = this.emailId;	
			
			int res = e1.compareTo(e2);
			return res;
		}
		
		
	}


