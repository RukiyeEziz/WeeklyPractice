package practiceTest;

public class Application {

	public static void main(String[] args) {
		// output: A
		Object a1, b1, c ;
        a1 = new String("A");
        b1 = new String("B");
        c = a1;
        a1 = b1;
        System.out.println(""+c);
        
        // output: print 0 ten times
        int size = 10;
        int[] arr = new int[size];
        for (int i1 = 0 ; i1 < size ; ++i1)
           System.out.println(arr[i1]);
        ////////////
        
        //
        Application app1 = new Application();
        
        //loadMatrix();
        
        Application app2 = new Application();
        //( (I1) app2).m1(); // Exception in thread "main" java.lang.ClassCastException:
        
        //output: True True
        if (true)
        if (false)
           System.out.println("True False");
        else
           System.out.println("True True");
        
        ////////////
        


	}/// main
	
	
	interface I1{
		int VALUE = 1;
		void m1();
	}
	interface I2{
		int VALUE = 2;
		void m1();
	}	
	public void m1() { 
        System.out.println("Hello"); 
	}

		
	int[][] matrix = new int[2][3];
    
    int a[] = {1, 2, 3};
    int b[] = {4, 5, 6};
            
    public int compute(int x, int y){
        return a[x]*b[y];
    }
    
    public void loadMatrix(){
        for(int x=0; x<matrix.length; x++){
            for(int y=0; y<matrix[x].length; y++){
               matrix[x][y] = compute(x, y);
            }
        }
        
    }

	static String s1 = sM1("a");{
	      s1 = sM1("b");
	   }
	   static{
	      s1 = sM1("c");
	   }

	private static String sM1(String s){
	      System.out.println("sM1: " + s);  return s;
	   }

	
	
	

}
