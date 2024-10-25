package server.exception;

public enum ErrorList {
    FAIL_LOGIN(501,"로그인에 실패했습니다."),
    UNUSABLE_TOKEN(502, "토큰이 만료되었습니다. 로그아웃 후 다시 시도해주세요."),
    NULL_DATA(510,"필수 입력 값 중에 빈 값이 있습니다."),
    DUPLICATION_ID(511,"중복된 아이디입니다."),
    DUPLICATION_SID(512,"중복된 학번입니다."),
    NO_ID(513,"존재하지 않는 아이디입니다."),
    NO_PRECOURSE(520,"입력한 선수과목이 존재하지 않습니다."),
    IS_PRECOURSE(521,"해당 과목은 다른 과목의 선수과목이므로 지울 수 없습니다."),
    NO_COMPLETE_COURSE(530,"수강에 필요한 선수과목을 듣지 않았습니다."),
    DUPLICATION_REGIST(531,"이미 신청한 과목입니다."),
    DUPLICATION_COMPLETE_COURSE(532,"이미 수강 완료한 과목입니다."),
    ;

    private final int state;
    private final String message;

    ErrorList(int state, String message) {
        this.state=state;
        this.message=message;
    }

    int getState(){return state;}
    String getMessage(){return message;}
    @Override
    public String toString(){
        return state+": "+message;
    }
}
