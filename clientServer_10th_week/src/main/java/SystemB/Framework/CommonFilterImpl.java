/**
 * Copyright(c) 2021 All rights reserved by Jungho Kim in Myungji University.
 */
package SystemB.Framework;

import java.io.EOFException;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public abstract class CommonFilterImpl implements CommonFilter {
	//파이프는 기본적으로 자바에 존재
	protected PipedInputStream in = new PipedInputStream();
	protected PipedInputStream in2 = new PipedInputStream();
	protected PipedOutputStream out = new PipedOutputStream();
	protected PipedOutputStream out2 = new PipedOutputStream();

	public void connectOutputTo(int num,CommonFilter nextFilter) throws IOException {
		if(num==1) out.connect(nextFilter.getPipedInputStream(1));
		else out2.connect((nextFilter.getPipedInputStream(2)));
	}
	public void connectInputTo(int num,CommonFilter previousFilter) throws IOException {
		if(num==1)in.connect(previousFilter.getPipedOutputStream(1));
		else in2.connect(previousFilter.getPipedOutputStream(2));
	}
	public PipedInputStream getPipedInputStream(int num) {
		if(num==1)return in;
		else return in2;
	}
	public PipedOutputStream getPipedOutputStream(int num) {
		if(num==1)return out;
		else return out2;
	}
	
	abstract public boolean specificComputationForFilter() throws IOException;
	// Implementation defined in Runnable interface for thread
	// 스레드로 실행시키기 위한 자바 코드
	public void run() {
		try {
			specificComputationForFilter();
		} catch (IOException e) {
			if (e instanceof EOFException) return;
			else System.out.println(e);
		} finally {
			closePorts();
		}
	}
	private void closePorts() {
		try {
			out.close();
			out2.close();
			in.close();
			in2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
