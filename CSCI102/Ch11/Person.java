class Person{
   private String name = "";
   private String address = "";
   private String phone = "";
   private String eMail = "";
   
   public Person(String name, String address, String phone, String eMail){
      this.name = name;
      this.address = address;
      this.phone = phone;
      this.eMail = eMail;
   }
   
   public String getName(){
      return name;
   }
   
   public void setName(String n){
      name = n;
   }
   
   public String getAddress(){
      return address;
   }
   
   public void setAddress(String n){
      address = n;
   }
   
   public String getPhone(){
      return phone;
   }
   
   public void setPhone(String n){
      phone = n;
   }
   
   public String getEMail(){
      return eMail;
   }
   
   public void setEMail(String n){
      eMail = n;
   }
   
    public String toString(){
      return "Class: " + this.getClass().getSimpleName() + " Name: " + this.getName();
   }

}