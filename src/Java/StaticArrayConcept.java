package Java;

public class StaticArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Basic array declaration
		
		// 1. array is fixed in size
		// 2. array allows same kind of data type
		// 3. to overcome, to have diff kind of data types, use object array
		int[] i= new int[4];
		i[0]=100;
		i[1]=200;
		i[2]=300;
		i[3]=400;
		System.out.println(0);
		System.out.println(3);
		// length= highest index + 1
		// highest index= len-1
		// lowest index is always 0
		
		int len=i.length;
		System.out.println(len);
		System.out.println(i[3]);
		// run time error: =====> System.out.println(i[4]);
		// String array
		String []name= {"vinay","vijay","vikram","suprith"};
		
		for(int p=0;p<name.length;p++) {
			System.out.println(name[p]);
			
	        }
		// for-each string array
		for (String name1:name) {
			System.out.println(name1);
		}
       // using object array, creating different types of data types
		
		Object []obj= {"vinay",23,12.33,true,'f'};
		for(Object ob:obj)
		{
		  System.out.println(ob);	
		}
		
		
	}

}
