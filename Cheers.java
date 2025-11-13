
public class Cheers {
        public static void main(String[] args) {
	  String name = args[0].toUpperCase();
          int n = Integer.parseInt(args[1]);
          String specialLetters = "AEFHILMNORSX";
          for (int i = 0; i < name.length(); i++) { 
          char c = name.charAt(i);  

          if (specialLetters.indexOf(c) != -1) {
                System.out.println("Give me an  " + c + ": " + c + "!");
          } else {
                System.out.println("Give me a  " + c + ": " + c + "!");
          }; 
         

          }
          System.out.println("What does that spell?");
          for (int i = 0; i < n; i++) {
              System.out.println(name + "!!!");  
          };
                
        }
}
