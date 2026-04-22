import java.util.*;
class Lab9{
   static void printMenu(){
      System.out.println("1) Search for word\n2) Add word\n3) Delete Word\n4) Word count\n5) Unique words\n6) Print words\n7) Exit");
      System.out.println();
      System.out.println("Choose a menu option: ");
   }
   static boolean searchForWord(String[] arr, String word){
      for(int i = 0; i < arr.length; i++){
         if(arr[i].equals(word)){
            return true;
         }
      }
      return false;
   }
   static String[] addWord(String[] arr, String word){
      String[] arr1 = new String[arr.length + 1];
      for(int i = 0; i < arr.length; i++){
         arr1[i] = arr[i];
      }
      arr1[arr1.length - 1] = word;
      return arr1;
   }
   static String[] deleteWord(String[] arr, String word){
      String[] arr1 = new String[arr.length - 1];
      int count = 0;
      for(int i = 0; i < arr1.length; i++){
         if(count < 1 && arr[i].equals(word)){
            count++;
         }
         arr1[i] = arr[i];
      }
      return arr1;
   }
   static void printWords(String[] arr){
      int counter = 0;
      for(int i = 0; i < arr.length; i++){
         if(counter < 5){
            System.out.print(arr[i] + " ");
            counter++;
         }
         else{
            System.out.println();
            System.out.print(arr[i] + " ");
            counter = 1;
         }
      }
      System.out.println();
   }
   static int wordCount(String[] arr, String word){
      int counter = 0;
      for(int i = 0; i < arr.length; i++){
         if(arr[i].equals(word)){
            counter++;
         }
      }
      return counter;
   }
   static void uniqueWords(String[] arr){
      HashMap<String, Boolean> cloud = new HashMap<>();
      for(int i = 0; i < arr.length; i++){
         if(cloud.get(arr[i]) == null){
            System.out.print(arr[i] + " ");
            cloud.put(arr[i], true);
         }
      }
      System.out.println();
   }
   public static void main(String[] args){
      String[] wordStore = new String[0];
      Scanner kb = new Scanner(System.in);
      int choice = 0;
      do{
         System.out.println();
         printMenu();
         choice = kb.nextInt();
         String choiceString;
         switch(choice){
            case 1: 
               System.out.println("enter a word");
               choiceString = kb.next();
               if(searchForWord(wordStore, choiceString)){
                  System.out.println("present");
                  }
               else{
                  System.out.println("not present");
               }
            break;
            case 2: 
               System.out.println("enter a word");
               choiceString = kb.next();
               wordStore = addWord(wordStore, choiceString);
            break;
            case 3: 
               System.out.println("enter a word");
               choiceString = kb.next();
               wordStore = deleteWord(wordStore, choiceString);
            break;
            case 4: 
               System.out.println("enter a word");
               choiceString = kb.next();
               System.out.println("Word Count: " + wordCount(wordStore, choiceString));
            break;
            case 5: 
               System.out.println("Pressed 5");
               uniqueWords(wordStore);
            break;
            case 6: 
               System.out.println("Pressed 6");
               printWords(wordStore);
            break;
         }
      }while(choice < 7);
      System.out.println();
   }
}