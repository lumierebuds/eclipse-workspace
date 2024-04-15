package com.kh.chap04_sync.part01_synchronize.run;

public class Run {
	/*
	 * 동기화? 
	 * 멀티 쓰레드 프로그램에서 스레드간에 "경쟁상태"에 있는 "공유자원"에 대한 "임계영역"을 지정해주는 것
	 * -----------------------------------------------------------------------------
	 * 정수기 = 공유자원
	 * 사람들 = 스레드 
	 * 
	 * 정수기를 쓰는 사람들을 줄 세우는게 아닌, 방에 정수기가 있고 열쇠를 통해 이를 접근해서 물을 마실 수 있다. 
	 * -----------------------------------------------------------------------------
	 * 
	 * 멀티 쓰레드 프로그램에서 여러 쓰레드가 "동시에" 하나의 "공유자원"에 접근하는 것을 경쟁상태라고 부름
	 * 이를 방지하기 위해 하나의 공유자원에 접근할때는 하나의 쓰레드만 접근할 수 있도록 통제해야하는데 통제하기 위해 
	 * 해당 자원을 임계영역(통제영역)으로 지정을하고 이 통제를 하기 위해서는 "동기화"가 필요함. 
	 * 
	 * 동기화시 프로세스가 느려질 수 있다. 
	 * 
	 */

	public static void main(String[] args) {

	}
}
