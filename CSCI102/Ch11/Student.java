class Student extends Person{
   private static String status = "freshman";
   
   public Student(String status, String name, String address, String phone, String eMail){
      super(name, address, phone, eMail);
      this.status = status;
   }
   
   public String getStatus(){
      return status;
   }
   
   public void setStatus(String n){
      status = n;
   }
   
   public String toString(){
      return "Class: " + this.getClass().getSimpleName() + " Name: " + super.getName();
   }
}