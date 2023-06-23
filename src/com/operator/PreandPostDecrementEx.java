package operator;

public class PreandPostDecrementEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		int y=20;

		//System.out.println(x);
		//System.out.println(y);
		System.out.println(--x + --y); //9 + 19  9  19
		System.out.println(--x + --y); //8    18
		
		
		int a=20;
		int b=30;
		
		//System.out.println(a-- + b--); //20   +  30 
		//System.out.println(a-- +b--);  //
		System.out.println(a-- + --b);  //20  + 29
		System.out.println(--a  +b  --);  // 19  28
		
		
		
	}

}
