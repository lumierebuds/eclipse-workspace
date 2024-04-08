package com.kh.chap04_assist.part03_data.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataRun {

	// Data 스트림

	public static void main(String[] args) {

		DataRun dr = new DataRun();
		// dr.fileSave();
		dr.fileRead();
	}

	public void fileSave() {

		File f = new File("data.txt");

		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(f))) {

			// DataOutputStream : 자바의 자료형별 데이터 작성 가능.
			dos.writeBoolean(false);
			dos.writeInt(400);
			dos.writeDouble(0.12345);
			dos.writeUTF("안녕");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void fileRead() {
		try (DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"))) {
			// 주의점 : 저장된 자료형 순서대로 읽어올 것
			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
