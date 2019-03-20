import java.util.Scanner;
//
public class ShellSort {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
		// Ascending
        System.out.print("Masukan jumlah data yang diinginkan : ");
        int [] data=new int [in.nextInt()];
      
        for(int i=0;i<data.length;i++){
            System.out.printf("Masukan No. %d = ",(i+1));
            data[i]=in.nextInt();
        }
      
        System.out.println("Sebelum Sorting: ");
        for(int i=0;i<data.length;i++){
            System.out.printf("%d ",data[i]);
        }
      
        int jarak=data.length;
        boolean end;
        while (jarak>1){
            jarak/=2;
            end=false;
            while (end==false){
                end=true;
                for(int j=0;j<data.length-jarak;j++){
                    if (data[j]>data[j+jarak]){
                        int tukar=data[j];
                        data[j]=data[j+jarak];
                        data[j+jarak]=tukar;
                        end=false;
                    }
                }
            }   
        }
      
        System.out.println("\nSesudah Sorting: ");
        for(int i=0;i<data.length;i++){
            System.out.printf("%d ",data[i]);
        }
      
    }
}