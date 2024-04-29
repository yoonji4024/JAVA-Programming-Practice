import java.util.Scanner;
import java.util.ArrayList;

public class Lab_2022311417 {
    static ArrayList<Integer> DecimalToBinary(int decimal){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        while (decimal > 0) {
            temp.add(0, decimal % 2);
            decimal = decimal / 2;
        }
        
        System.out.print("b ");
        
        for (int i = 0; i < temp.size(); i++) {
        	System.out.print(temp.get(i));
        }
        
        System.out.println();
        
        return temp;
    }
    
    static ArrayList<Integer> DecimalToOctal(int decimal) {
    	ArrayList<Integer> temp = new ArrayList<Integer>();
    	
    	while (decimal > 0) {
    		temp.add(0, decimal % 8);
    		decimal = decimal / 8;
    	}
    	
		System.out.print("o ");
        
        for (int i = 0; i < temp.size(); i++) {
        	System.out.print(temp.get(i));
        }
        
        System.out.println();
    	
    	return temp;
    }
    
    static ArrayList<Integer> DecimalToHexadecimal(int decimal) {
    	ArrayList<Integer> temp = new ArrayList<Integer>();
    	
    	while (decimal > 0) {
    		temp.add(0, decimal % 16);
    		decimal = decimal / 16;
    	}
    	
    	System.out.print("h ");
    	
    	for (int i = 0; i < temp.size(); i++) {
    		if (temp.get(i) < 10) {
    			System.out.printf("%d", temp.get(i));
    		}
    		else {
    			System.out.printf("%c", temp.get(i) + 87);
    		}
    	}
    	
    	return temp;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int decimal = scn.nextInt();
        
        DecimalToBinary(decimal);
        DecimalToOctal(decimal);
        DecimalToHexadecimal(decimal);
    }
}
