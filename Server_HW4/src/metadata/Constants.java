package metadata;

import java.util.HashMap;

/**
 * The Constants class stores important variables as constants for later use.
 */
public class Constants {

    // Request (1xx) + Response (2xx)
    public final static short CMSG_AUTH = 101;
    public final static short SMSG_AUTH = 201;
    public final static short CMSG_HEARTBEAT = 102;
    public final static short SMSG_HEARTBEAT = 202;
    public final static short CMSG_PLAYERS = 103;
    public final static short SMSG_PLAYERS = 203;
    public static final short CMSG_TEST = 104;
    public static final short SMSG_TEST = 204;
    
    // Authentication:  x1x
    public final static short CMSG_REGISTER = 111;
    public final static short SMSG_REGISTER = 211;
    public final static short CMSG_LOGIN = 112;
    public final static short SMSG_LOGIN = 212;
    
    // Lobby APIs:      x2x
    public final static short CMSG_GETLOBBIES = 121;
    public final static short SMSG_GETLOBBIES = 221;
    public final static short CMSG_CREATELOBBY = 122;
    public final static short SMSG_CREATELOBBY = 222;
    public final static short CMSG_JOINLOBBY = 123;
    public final static short SMSG_JOINLOBBY = 223;
    public final static short CMSG_STARTGAME = 124;
    public final static short SMSG_STARTGAME = 224;
    public final static short CMSG_JOINGAME = 125;
    public final static short SMSG_JOINGAME = 225;

    // Other
    public static final String CLIENT_VERSION = "1.00";
    public static final int TIMEOUT_SECONDS = 90;
    
    
    
    //Characters
    public final static HashMap<String, Integer> characters;

    static {
        characters = new HashMap<>();
        characters.put("Bog_lord", 0);
        characters.put("Girl", 1);
        characters.put("Max", 2);
        characters.put("Winston", 3);
    }

}
