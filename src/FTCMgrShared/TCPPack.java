package FTCMgrShared;
import java.io.Serializable;


	public class TCPPack implements Serializable {
		private static final long serialVersionUID = 1L;
	    public eAnswerStatus      AnswerState      = eAnswerStatus.NONE;
	    public ePackType          PackType         = ePackType.NONE;

	    public boolean FieldState = false;
	    
	    public Robot R1 = new Robot();
	    public Robot R2 = new Robot();
	    public Robot B1 = new Robot();
	    public Robot B2 = new Robot();
	    
	    public int FieldID = 0;
	    
	    public static enum eAnswerStatus {
	        NONE, OK, FAIL
	    }

	    public static enum ePackType {
	        NONE, REFRESH_REQUEST, BYE, REFRESH
	    }
	}