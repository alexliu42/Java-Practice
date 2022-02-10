public class DisplayAPattern {
    public static void printJAVA(){
        for (int i = 0; i < 4; i++) {
            if(i == 0){
                System.out.println("    J       A       V     V     A");
            }
            if(i == 1){
                System.out.println("    J      A A       V   V     A A");
            }
            if (i == 2){
                System.out.println("J   J     AAAAA       V V     AAAAA");
            }
            else if (i == 3){
                System.out.println(" J J     A     A       V     A     A");
            }            
        }

    }
        
    
    public static void main(String [] args){
        printJAVA();
    }
    
}
