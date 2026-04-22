class Employee extends Person{
   private String office = "";
   private int salary = 0;
   private String date = "";
   
   public Employee(String office, int salary, String date, String name, String address, String phone, String eMail){
      super(name, address, phone, eMail);
      this.office = office;
      this.salary = salary;
      this.date = date;
   }
   
   public String getOffice(){
      return office;
   }
   
   public void setOffice(String n){
      office = n;
   }
   
   public int getSalary(){
      return salary;
   }
   
   public void setSalary(int n){
      salary = n;
   }
   
   public String getDate(){
      return date;
   }
   
   public void setDate(String n){
      date = n;
   }
   
    public String toString(){
      return "Class: " + this.getClass().getSimpleName() + " Name: " + super.getName();
   }
}