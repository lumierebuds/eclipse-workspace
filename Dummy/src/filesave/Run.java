package filesave;

public class Run {

	public static void main(String[] args) {
		ObjectDao dao = new ObjectDao();
//		dao.fileSave("hello.txt");
		dao.fileRead("hello.txt");
	}
}
