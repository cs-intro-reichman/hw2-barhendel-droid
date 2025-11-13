public class TimeCalc {
    public static void main(String[] args) {
         String timeStr = args[0];
         int minutesToAdd = Integer.parseInt(args[1]); 
         String hhStr = timeStr.substring(0,2);
         String mmStr = timeStr.substring(3,5);
         int hh = Integer.parseInt(hhStr);
         int mm = Integer.parseInt(mmStr);
         int totalMinutes = hh * 60 + mm + minutesToAdd;
         int totalHours = (totalMinutes / 60) % 24;
         int remainingMinutes = totalMinutes % 60;
        if (totalHours < 10) {
            hhStr = "0" + totalHours;
        } else {
            hhStr = totalHours + "";
        }
        if (remainingMinutes < 10) {
            mmStr = "0" + remainingMinutes;
        } else {
            mmStr = remainingMinutes + "";
        }
          System.out.println(hhStr + ":" + mmStr);  
    }
}