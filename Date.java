/*
 * Created Winnah Acal
 */
public class Date {

      private int day;
      private int month;
      private int year;

      public Date(){

      }

      public Date(int x, int y, int z){ 
            this.day = x;
            this.month = y;
            this.year = z;
      }


      public int getDay() {
      	return day;
      }

      public void setDay(int day) {
            this.day = day;
      }

      public int getMonth() {
            return month;
      }

      public void setMonth(int month) {
            this.month = month;
      }

      public int getYear() {
            return year;
      }

      public void setYear(int year) {
            this.year = year;
      }

      public void setDate(int year, int month, int day) {
            if (year < 1){
                  throw new IllegalArgumentException(); 
            }
            else{
                  if (month < 1 && month > 12){
                        throw new IllegalArgumentException(); 
                  }
                  else{
                        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                              if (day > 31){
                                    throw new IllegalArgumentException();
                              }else{

                              }
                        }
                        else if(year % 4 == 0 && month == 2){
                              if ( day > 29){
                                    throw new IllegalArgumentException();
                              }else{

                              }
                        }
                        else if(month == 2){
                              if ( day > 28){
                                    throw new IllegalArgumentException();
                              }else{

                              }
                        }
                        
                        else{
                              if (day > 30){
                                    throw new IllegalArgumentException();
                              }else{

                              }
                        }
                  }      
            }
            this.year = year;
            this. month = month;
            this.day = day;
      }

      public String toString() {
            return String.format ("%d/%d/%d", day, month, year);
      }

}
