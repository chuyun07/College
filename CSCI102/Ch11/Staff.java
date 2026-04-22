class Staff extends Employee{

   private String title = "";
   
   public Staff(String title, String office, int salary, String date, String name, String address, String phone, String eMail){
      super(office, salary, date, name, address, phone, eMail);
      this.title = title;
   }
   
   public String getTitle(){
      return title;
   }
   
   public void setTitle(String n){
      title = n;
   }
   
   public String toString(){
      return "Class: " + this.getClass().getSimpleName() + " Name: " + super.getName();
   }
}