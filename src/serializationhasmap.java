import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;


public class serializationhasmap {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(12, "Laghuta");
		map.put(1, "arg1");
		map.put(13, "Amit");
		map.put(2, "arg6");
		map.put(18, "Vihaan");
		map.put(2, "arg4");
		map.put(0, "arg3");
		
		FileOutputStream fis = new FileOutputStream("D://abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fis);
		oos.writeObject(map);
		 oos.close();
         fis.close();

	}

}
