class Faculty extends Employee{
   private int hours = 0;
   private String rank = "";
   
   public Faculty(int hours, String rank, String office, int salary, String date, String name, String address, String phone, String eMail){
      super(office, salary, date, name, address, phone, eMail);
      this.hours = hours;
      this.rank = rank;
   }
   
   public int getHours(){
      return hours;
   }
   
   public void setHours(int n){
      hours = n;
   }
   
   public String getRank(){
      return rank;
   }
   
   public void setRank(String n){
      rank = n;
   }
   public String toString(){
      return "Class: " + this.getClass().getSimpleName() + " Name: " + super.getName();
   }
}