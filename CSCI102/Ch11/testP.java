class testP{
   public static void main(String[] args){
      Person a = new Person("bob", "123 road", "5832657483", "bob@bob.com");
      System.out.println(a.toString());
      
      Student b = new Student("freshman", "bob", "123 road", "4636574832", "bob@bob1.com");
      System.out.println(b.toString());
      
      Employee c = new Employee("office a", 60000, "06/17/17", "bob", "123 road", "4638292378", "bob@bob2.com");
      System.out.println(c.toString());
      
      Faculty d = new Faculty(16, "part time", "office a", 16000, "07/19/22", "bob", "123 road", "4638294637", "bob@bob3.com");
      System.out.println(d.toString());
      
      Staff e = new Staff("teacher", "office b", 32000, "08/19/20", "bob", "123 road", "4638294637", "bob@bob4.com");
      System.out.println(e.toString());
   }
}