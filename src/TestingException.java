import java.io.IOException;

public class TestingException {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strary = new String[5];

		try {
			for (int i = 0; i < 6; i++) {
				strary[i] ="san";
				
				if(i == 4) throw new IOException("");
			}
			
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Exception occur null");
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Exception occur out of arrya");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
