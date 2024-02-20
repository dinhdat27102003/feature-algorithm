/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test567;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap 1 doan : ");
        str1 = sc.nextLine();
        String[] arStr = str1.split("");
        int dem = 0;
        int demw = 0;
        for(int i = 0;i<arStr.length;i++){
            if(i==arStr.length-1){
                if(arStr[i].equals("w")){
                    if(demw!=0){
                        break;
                    }
                    else{
                        dem++;
                    
                    }
                }
                break;
            }
            else{
                String a = arStr[i]+arStr[i+1];
                if(a.equals("aw")||a.equals("aa")||a.equals("dd")||a.equals("oo")||a.equals("ow")){
                    dem++;
                    
                }
                if(arStr[i].equals("w")){
                    if(demw!=0){
                        
                    }else{
                        dem++;
                    demw = 1;
                    
                    }
                }
            }
            
        }
        System.out.println(dem+"");
    }
    
}
