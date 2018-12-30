import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Scanner;
public class WebPagesStats {
 
 
 public static void main(String[] args) {
 
 
  String fileName="CBS 20180601 PageViews.txt";
  int Visits[] = new int[117];
  int i=0;
  //System.out.println(fileName);
  Scanner reader;
  try {
   reader = new Scanner(new File("C:\\"+fileName));
   while (reader.hasNext()) {
    Visits[i] = reader.nextInt();
    i++;
    
    
   }
  } catch (FileNotFoundException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 
 
 
 
 int j = 0;
 String companyName = "";
 while (fileName.charAt(j)!=' ') {
  companyName = companyName + fileName.charAt(j);
  j++;
 }
 System.out.println("Website name: "+companyName);
 
 j++;
 String date = "";
 while (fileName.charAt(j)!=' ') {
  date = date + fileName.charAt(j);
  j++;
 }
 
 System.out.print("PageView Date: "+date.charAt(0));
 System.out.print(date.charAt(1));
 System.out.print(date.charAt(2));
 System.out.print(date.charAt(3));
 System.out.print("-");
 System.out.print(date.charAt(4));
 System.out.print(date.charAt(5));
 System.out.print("-");
 System.out.print(date.charAt(6));
 System.out.println(date.charAt(7));
 
Arrays.sort(Visits);
//for (int z=0; z<100; z++)
// System.out.print(Visits[z]);
j=1;
for (int index=99; index>0; index--) //compare each element to its neighbor
if (Visits[index]==Visits[index-1]){
 j++; //increment counter if neighboring elements are equal
 }
else {
 System.out.println("WebPage "+Visits[index]+" was viewed "+j+" times.");
 j=1;
 }
 
 
 
 
 
 }}