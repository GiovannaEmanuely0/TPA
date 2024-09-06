
public class TabuadaTurbinada {

	public static void main(String[] args) {
		int i = 1, y = 1, t;
		
			while(i<=10) {
				while(y<=10) {
					t = i*y;
					System.out.println(i+"X"+y+"="+t);
					i++;
					
					y++;
				}
			}
	}
}


