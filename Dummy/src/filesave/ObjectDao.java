package filesave;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import encapsulation.Food;

public class ObjectDao {

	/*
	 * 객체 단위 입출력시 필요한 보조스트림
	 * 기반스트림: 파일(File)로 기록할것이기 때문에 FileOutputStream
	 * 보조스트림: 객체(Object)를 출력할 것이기 때문에 ObjectOutputStream
	 * 
	 */

	public void fileSave(String fileName) {
		File file = new File(fileName); // 전달받은 fileName으로 파일 객체를 생성한다.
		Food food = new Food("사과", 20); // Food 객체 샘플 : "사과", 20

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file, true))) {
			oos.writeObject(food);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void fileRead(String fileName) {
		// try ~ with ~ resource 구문으로 close가 되고 flush()도 자동으로 호출되게 만들었다.
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));) {

			while (true) {
				System.out.println(ois.readObject());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("모두 읽었습니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
