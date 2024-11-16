package SystemA_3.Components.ID;

import SystemA_3.Framework.CommonFilterImpl;

import java.io.IOException;

public class IDFilter extends CommonFilterImpl {
    @Override
    public boolean specificComputationForFilter() throws IOException {
        int checkBlank = 1;
        int numOfBlank = 0;
        int idx = 0;
        byte[] buffer = new byte[64];
        boolean is2013 = false;
        int byte_read = 0;

        while(true) {
            while(byte_read != '\n' && byte_read != -1) {
                byte_read = in.read(); //한 바이트(한 글자)씩 읽음
                if(byte_read == ' ') numOfBlank++;
                if(byte_read != -1) buffer[idx++] = (byte)byte_read;
                if(numOfBlank == checkBlank &&
                    buffer[idx-9]=='2'&&buffer[idx-8]=='0'&&buffer[idx-7]=='1'&&buffer[idx-6]=='3')
                    is2013 = true;
            }
            if(is2013) {
                for(int i = 0; i<idx; i++)
                    out.write((char)buffer[i]);
            }
            if (byte_read == -1) return true; //반복문 종료
            is2013 = false;
            idx = 0;
            numOfBlank = 0;
            byte_read = '\0';
        }
    }
}
