
public class TabuadaTurbinada {

	public static void main(String[] args) {
		int i = 1, t;
		
			while(i<=10) {
				int y = 1;
				while(y<=10) {
					t = i*y;
					System.out.println(i+"X"+y+"="+t);
					i++;
					
					y++;
				}
			}
	}
}


