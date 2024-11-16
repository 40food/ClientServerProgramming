package SystemA_1.Components.Add;

import SystemA_1.Framework.CommonFilterImpl;

import java.io.IOException;

public class AddFilter extends CommonFilterImpl {
    @Override
    public boolean specificComputationForFilter() throws IOException {
        int checkBlank = 4;
        int numOfBlank = 0;
        boolean isBlank=false;
        int idx = 0;
        byte[] buffer = new byte[64]; //읽은 바이트들 저장
        boolean is12345=false;
        boolean is23456=false;
        int byte_read = 0;

        while(true) {
            while(byte_read != '\n' && byte_read != -1) {
                byte_read = in.read(); //한 바이트(한 글자)씩 읽음
                if(byte_read == ' ') isBlank=true; numOfBlank++;
                if(byte_read != -1) buffer[idx++] = (byte)byte_read;
                if(isBlank&& //빈칸이 4개를 넘어갔으며 빈칸일 때마다=과목체크할때마다
                    numOfBlank > checkBlank&&
                    buffer[idx-5]=='1'&&buffer[idx-4]=='2'&&buffer[idx-3]=='3'&&buffer[idx-2]=='4'&& buffer[idx-1]=='5')
                    is12345=true;
                if(isBlank&&
                    numOfBlank>checkBlank&&
                    buffer[idx-5]=='2'&&buffer[idx-4]=='3'&&buffer[idx-3]=='4'&&buffer[idx-2]=='5'&&buffer[idx-1]=='6')
                    is23456=true;
            }
            for(int i = 0; i<idx; i++){
                out.write((char)buffer[i]);
                //엔터용 바이트 두 개, 종료용 바이트 하나 빼고 바이트 삽입
                if(i==idx-3&&!is12345)out.write(" 12345".getBytes());
                if(i==idx-3&&!is23456)out.write(" 23456".getBytes());
            }

            if (byte_read == -1) return true; //반복문 종료
            //초기화
            isBlank=false;
            is12345=false;
            is23456=false;
            numOfBlank = 0;
            idx = 0;
            byte_read = '\0';
        }
    }
}
