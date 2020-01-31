package exception;

public enum  VoterErrorCode {

    EXISTS_VOTER("This voter already exists"),
    EXISTS_VOTE("This vote already exists"),
    NOT_EXISTS_VOTE("This vote not exists"),
    NOT_EXISTS_VOTER("This voter not exists");


    private String errorDescrip;

    VoterErrorCode(String errorDescrip){
        this.errorDescrip = errorDescrip;
    }

    public String getErrorDescrip() {
        return errorDescrip;
    }
}
