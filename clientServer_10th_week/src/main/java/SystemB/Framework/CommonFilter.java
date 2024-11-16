/**
 * Copyright(c) 2019 All rights reserved by JU Consulting
 */
package SystemB.Framework;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public interface CommonFilter extends Runnable{
    //아웃풋으로 연결
    public void connectOutputTo(int num, CommonFilter filter) throws IOException;
    //인풋으로 연결
    public void connectInputTo(int num, CommonFilter filter) throws IOException;
    //들어오는 파이프의 값 받기
    public PipedInputStream getPipedInputStream(int num);

    //나가는 파이프의 값 받기
    public PipedOutputStream getPipedOutputStream(int num);
}
