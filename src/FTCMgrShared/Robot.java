package FTCMgrShared;

public class Robot {
	
	public static final int TEAM_STATUS_OK                  = 0x0000;
    public static final int TEAM_STATUS_WARNING             = 0x0001;
    public static final int TEAM_STATUS_ERROR               = 0x0002;
    public static final int TEAM_STATUS_DISABLED            = 0x0003;
	
    public int TeamID = 0;
    public eRobotState Status = eRobotState.BLUE;

    public Robot() {

    }

    public Robot(final int Team, final int Stat) {
        TeamID = Team;
        switch(Stat){
        case TEAM_STATUS_ERROR: Status = eRobotState.RED; break;
        case TEAM_STATUS_WARNING: Status = eRobotState.YELLOW; break;
        case TEAM_STATUS_OK: Status = eRobotState.GREEN; break;
        default: Status = eRobotState.BLUE; break;
        }
    }
    public Robot(final int Team, final eRobotState Stat){
    	TeamID = Team;
    	Status = Stat;
    }
    
    public static enum eRobotState{
    	RED,
    	YELLOW,
    	GREEN,
    	BLUE
    }
}
