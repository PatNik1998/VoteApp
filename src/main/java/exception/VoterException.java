package exception;

public class VoterException extends  Exception {

    private VoterErrorCode errorCode;


    public VoterException(VoterErrorCode errorCode){
        this.errorCode = errorCode;
    }

    public VoterErrorCode getErrorCode() {
        return errorCode;
    }
}
