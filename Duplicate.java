public class Duplicate {  
    public static void main(String[] args) {         
        int [] arr = new int [] {101, 102, 103, 104, 102, 107, 108, 108, 103};   
        System.out.println("Duplicate elements in given array: ");  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  