/**
 * Copyright(c) 2019 All rights reserved by JU Consulting
 */
package SystemA_2.Framework;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public interface CommonFilter extends Runnable{
    //아웃풋으로 연결
    public void connectOutputTo(CommonFilter filter) throws IOException;
    //인풋으로 연결
    public void connectInputTo(CommonFilter filter) throws IOException;
    //들어오는 파이프의 값 받기
    public PipedInputStream getPipedInputStream();
    //나가는 파이프의 값 받기
    public PipedOutputStream getPipedOutputStream();
}
