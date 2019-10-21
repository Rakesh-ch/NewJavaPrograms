package patterns;

public class Triangle {

	public void triangle1() {
		for (int i = 1; i <= 10; i++) {

			for (int k = 10; k >= i; k--) {

				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			}
		}
	
	public void triangle2()
	{
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int j=9; j>=i; j--)
			{
				System.out.print(" *");
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.triangle1();
		t.triangle2();

	}

}
