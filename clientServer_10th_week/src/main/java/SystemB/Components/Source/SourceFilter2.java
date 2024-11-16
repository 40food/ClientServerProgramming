/**
 * Copyright(c) 2021 All rights reserved by Jungho Kim in Myungji University.
 */
package SystemB.Components.Source;

import SystemB.Framework.CommonFilterImpl;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SourceFilter2 extends CommonFilterImpl {
    private String sourceFile;

    public SourceFilter2(String inputFile){
        this.sourceFile = inputFile;
    }
    //input 파일을 받아 source파일로 설정
    @Override
    public boolean specificComputationForFilter() throws IOException {
        int byte_read;    
        BufferedInputStream br = new BufferedInputStream(new FileInputStream(new File(sourceFile)));
        while(true) {
            byte_read = br.read();
            if (byte_read == -1) return true;
            out2.write(byte_read);
            //common filter의 out에 한 바이트씩 흘려보냄
        }
    }
    //받은 source 파일을 한 바이트씩 읽음
}