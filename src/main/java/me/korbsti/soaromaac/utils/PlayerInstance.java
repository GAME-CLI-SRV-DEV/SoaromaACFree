package me.korbsti.soaromaac.utils;

import me.korbsti.soaromaac.Main;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.geysermc.floodgate.api.FloodgateApi;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;

public class PlayerInstance {
    public Player player;

    Main instance;

    String playerName;
    public Double alivePacketEnabler;
    public Double allMovementChange;
    public Boolean allMovementChangeRunning;
    public Instant beforeAlivePacket;
    public Instant beforeBlock;
    public Instant nukerFirst;
    public Instant nukerLast;
    public Integer nukerSample;
    public String lastPacket;
    public Location beforePacketIrr;
    public Integer usedElytra;
    public Float beforePlayerPitch;
    public Double beforePlayerX;
    public Double beforePlayerY;
    public Location currentLocation;
    public Integer badPacketsANum;
    public Boolean playerOnGround;
    public Integer semiPredID;
    public Boolean semiPred;
    public Float beforePlayerYaw;
    public HashMap<String, Integer> cheatsFlagged = new HashMap<>();
    public Double beforePlayerZ;
    public Integer timeBUntilFlag;
    public ArrayList<Player> playerNearbyEntities = new ArrayList<>();

    public ArrayList<MovementPacket> checkMovementPackets = new ArrayList<>();

    public Long autoClickBInner;
    public Integer noSlowDownD;
    public Long slowTimerBTime;
    public Integer slowTimerPacketB;
    public Instant slowTimerInstantB;
    public Double elytraMaxY;
    public Integer elytraMaxYCounter;
    public Location timerBLocation;
    public String configType;
    public ArrayList<Material> blocksMined;
    public Boolean startAsyncTaskXRAY;
    public Double semiPredANum;
    public Integer samePitchAndYaw;
    public String serverVersion = "";
    public Entity damagedEntity;
    public Double semiPredBNum;
    public Integer elytraFlightB;
    public Double bHopAlternative;
    public Integer notInsideBoat;
    public Double lastPlayerYSpeed;
    public Integer speedMboat;
    public Integer irrMovementSetterB;
    public Location beforePacketIrrB;
    public Integer beforeGamemodeCreative;
    public Integer nearbyShulkerBox;
    public Boolean smartMovementPunch;
    public Boolean smartMovementKnockback;
    public Float whenHittingYaw;
    public Float whenHittingPitch;
    public Double blinkNum;
    public Long autoClickerBTemp;
    public Long autoClickerBFlag;
    public Boolean ignoreOdd;
    public Double cancelX;
    public Double cancelY;
    public Double cancelZ;
    public Integer speedMaxYNFlagHashMap;
    public Integer playerLogCount;
    public Instant autoClickerB;
    public Instant currentAlivePacket;
    public Instant currentBlock;
    public Integer disableAntiCheatID;
    public Boolean enableNotifications;
    public Integer explosionID;
    public Double fastClimbNumCheck;
    public Double fluidWalkLavaNum;
    public Double fluidWalkNCP;
    public Double fluidWalkNum;
    public Double fluidWalkPlaceHolder;
    public Double fluidWalkUntilHackingAlt;
    public Double flyCheck;
    public Double flyState;
    public Integer discordNum;
    public Double glidePlayer;
    public Boolean GoingDown;
    public Double gotInBoatTillCheckingSpeed;
    public Double healthWhenFallen;
    public Double healthWhenFalling;
    public Boolean hit;
    public Integer inslowableBlockUntilFlag;
    public Long playerTime;
    public Integer predictedYDown;
    public Integer counterForItemAttribute;
    public Double increaseAmountForItemAttribute;
    public Double jumpsOnWaterTillHacking;
    public Boolean isUsingElytra;
    public Boolean lastFallDamage;
    public Double lastUpSpeed;
    public Integer standingOnBoat;
    public Double longJumpFromX;
    public Double longJumpFromY;
    public Double longJumpFromZ;
    public Integer irrMovementSetter;
    public Double longJumpNum;
    public Integer lowSpeed;
    public Integer irrTimeCount;
    public Boolean muted;
    public Boolean nearBoat;
    public Double noFall;
    public Double noSlowShiftNum;
    public Integer num;
    public Double numFly;
    public Double numFlyCheck;
    public Double numFlyCheckLev;
    public Double onSlime;
    public Double placedBlockCounter;
    public Double playerChecking;
    public Double playerClicks;
    public HashMap<Player, Player> playerDouble = new HashMap<>();
    public Boolean playerEnableAntiCheat;
    public Double playerEventNumber;
    public Boolean playerFrozen;
    public Double playerInAirHop;
    public Boolean playerIsHit;
    public Double playerNumKicked;
    public Double playerNumOfViolations;
    public Double playerPing;
    public Float playerPitch;
    public Double playerRunning;
    public Double playerSetter;
    public Double playerSpeed;
    public Double playersYBeforeCoord;
    public Double playersYBeforeCoordAlt;
    public Double playersYCheck;
    public Double playersYCoord;
    public Double playerUntilSpiderHacking;
    public Boolean playerUsingElytra;
    public Integer elytraSecondCounter;
    public String playerWorld;
    public Double playerX;
    public Double playerY;
    public Float playerYaw;
    public Double playerZ;
    public Integer sameYCoord;
    public Boolean setCancelled;
    public Integer speedMaxFlagXZL;
    public Boolean speedSlime;
    public Double speedWater;
    public Double spiderCountNum;
    public Double spiderState;
    public Double stepNum;
    public Boolean teleported;
    public Boolean timerFlag;
    public Integer predictedYUp;
    public Integer userPlaceholder;
    public Integer violationLoggerHash;
    public Integer baritonePacketSample;
    public Integer baritoneUntilHacking;
    public Integer glideCountB;
    public Integer counter;
    public Double warnCount;
    public Boolean baritoneSetOne;
    public Boolean baritoneSetTwo;
    public Integer counterB;
    public Boolean typingKey;
    public Integer counterC;
    public Boolean isFloodGatePlayer;
    public ArrayList<String> data;
    public ArrayList<String> namespace;
    public ArrayList<String> key;
    public String currentPath;
    public Integer baritoneResetCounter;
    public Integer elytraFlightNum;
    public ArrayList<Object> customPayload;
    public ArrayList<Double> medianSpeedCounter;
    public ArrayList<Integer> medianYPos;
    public Double lastSpeed;
    public Integer irrStartupLimiter;


    public Boolean elytraUse;
    public Integer elytraUseScheduler;
    public ArrayList<Double> baritoneJumpSpeedsOne= new ArrayList<>();
    public ArrayList<Double> baritoneJumpSpeedsTwo = new ArrayList<>();
    public ArrayList<Double> baritoneJumpSpeedsOneB = new ArrayList<>();
    public ArrayList<Double> baritoneJumpSpeedsTwoB = new ArrayList<>();
    public ArrayList<Double> baritoneJumpSpeedsOneC = new ArrayList<>();
    public ArrayList<Double> baritoneJumpSpeedsTwoC = new ArrayList<>();
    public ArrayList<Double> baritoneSpeedYCoordOneC = new ArrayList<>();
    public ArrayList<Double> baritoneSpeedYCoordTwoC = new ArrayList<>();
    public ArrayList<Double> baritoneSpeedYCoordOne = new ArrayList<>();
    public ArrayList<Double> baritoneSpeedYCoordTwo = new ArrayList<>();
    public ArrayList<Double> baritoneSpeedYCoordOneB = new ArrayList<>();
    public ArrayList<Double> baritoneSpeedYCoordTwoB = new ArrayList<>();
    public ArrayList<Location> locationA = new ArrayList<>();
    public ArrayList<Location> locationB = new ArrayList<>();
    public ArrayList<Location> locationC = new ArrayList<>();
    public ArrayList<Location> locationAA = new ArrayList<>();
    public ArrayList<Location> locationBB = new ArrayList<>();
    public ArrayList<Location> locationCC = new ArrayList<>();
    public Boolean underBlock;
    public Integer underBlockSCHID;
    public Boolean underIce;
    public Integer underIceID;
    public Integer x;
    public Boolean underStair;
    public Integer underStairID;
    public Integer slimeID;

    public PlayerInstance(Player player, Main instance) {
        this.player = player;
        this.playerName = player.getName();
        this.instance = instance;
    }

    public void setDefaultPlayerVariables() {
        playerName = player.getName();
        playerEnableAntiCheat = true;
        blocksMined = new ArrayList<Material>();
        startAsyncTaskXRAY = true;
        medianSpeedCounter = new ArrayList<Double>();
        medianYPos = new ArrayList<Integer>();
        lastSpeed = 4.4;
        cheatsFlagged = new HashMap<>();
        playerWorld = player.getWorld().getName();
        speedWater = 0.0;
        playerIsHit = false;
        stepNum = 0.0;
        longJumpNum = 0.0;
        lowSpeed = 0;
        hit = false;
        lastPlayerYSpeed = 0.0;
        speedMaxFlagXZL = 0;
        teleported = false;
        underBlock = false;
        sameYCoord = 0;
        longJumpFromY = 0.0;
        irrMovementSetter = 0;
        notInsideBoat = 0;
        longJumpFromX = 0.0;
        numFlyCheckLev = 0.0;
        violationLoggerHash = 0;
        underIce = false;
        longJumpFromZ = 0.0;
        setCancelled = true;
        if (playerFrozen == null) {
            playerFrozen = false;
        }
        if (playerNumKicked == null) {
            playerNumKicked = 0.0;
        }
        slowTimerBTime = 0L;
        elytraMaxYCounter = 0;
        playerUsingElytra = false;
        setCancelled = false;
        playerClicks = 0.0;
        playerEventNumber = 0.0;
        fluidWalkLavaNum = 0.0;
        elytraUse = false;
        elytraUseScheduler = 0;
        underBlockSCHID = 0;
        underIceID = 0;
        underStairID = 0;
        elytraUseScheduler = 0;
        baritoneJumpSpeedsOne = new ArrayList<Double>();
        baritoneJumpSpeedsTwo = new ArrayList<Double>();
        baritoneJumpSpeedsOneB = new ArrayList<Double>();
        baritoneJumpSpeedsTwoB = new ArrayList<Double>();
        baritoneSpeedYCoordOne = new ArrayList<Double>();
        baritoneSpeedYCoordTwo = new ArrayList<Double>();
        elytraUseScheduler = 0;
        discordNum = 0;
        key = new ArrayList<String>();
        namespace = new ArrayList<String>();
        data = new ArrayList<String>();
        nukerSample = 0;
        baritoneJumpSpeedsOneC = new ArrayList<Double>();
        baritoneJumpSpeedsTwoC = new ArrayList<Double>();
        baritoneSpeedYCoordOneC = new ArrayList<Double>();
        baritoneSpeedYCoordTwoC = new ArrayList<Double>();
        locationA = new ArrayList<Location>();
        locationB = new ArrayList<Location>();
        locationC = new ArrayList<Location>();
        key = new ArrayList<String>();
        namespace = new ArrayList<String>();
        data = new ArrayList<String>();
        customPayload = new ArrayList<Object>();
        elytraFlightNum = 0;
        counterB = 0;
        baritoneResetCounter = 0;
        playerOnGround = false;
        playerPing = 0.0;
        timerFlag = false;
        inslowableBlockUntilFlag = 0;
        glidePlayer = 0.0;
        longJumpFromY = 0.0;
        beforeGamemodeCreative = 0;
        longJumpFromX = 0.0;
        longJumpFromZ = 0.0;
        num = 0;
        numFlyCheck = 0.0;
        lastFallDamage = false;
        semiPredBNum = 0.0;
        jumpsOnWaterTillHacking = 0.0;
        allMovementChange = 0.0;
        numFly = 0.0;
        underStair = false;
        elytraSecondCounter = 0;
        fluidWalkNum = 0.0;
        flyState = 0.0;
        numFlyCheckLev = 0.0;
        beforePacketIrrB = player.getLocation();
        flyCheck = 0.0;
        allMovementChangeRunning = false;
        elytraMaxY = 0.0;
        noFall = 0.0;
        placedBlockCounter = 0.0;
        baritoneSetOne = true;
        baritoneSetTwo = false;
        speedSlime = false;
        fluidWalkNum = 0.0;
        longJumpNum = 0.0;
        autoClickerBFlag = (long) 0;

        GoingDown = false;
        glideCountB = 0;
        standingOnBoat = 0;
        speedMboat = 0;
        irrMovementSetterB = 0;
        noSlowDownD = 0;
        numFlyCheck = 0.0;
        nearbyShulkerBox = 0;
        spiderState = 0.0;
        flyCheck = 0.0;
        GoingDown = false;
        fluidWalkNum = 0.0;
        irrStartupLimiter = 0;
        numFly = 0.0;
        flyState = 0.0;
        usedElytra = 0;
        fluidWalkLavaNum = 0.0;
        playersYBeforeCoord = 0.0;
        healthWhenFalling = 20.0;
        elytraFlightB = 0;
        fluidWalkNCP = 0.0;
        fluidWalkLavaNum = 0.0;
        healthWhenFallen = 0.0;
        playersYBeforeCoordAlt = 0.0;
        onSlime = 0.0;
        fluidWalkUntilHackingAlt = 0.0;
        fluidWalkPlaceHolder = 0.0;
        playersYCheck = 0.0;
        stepNum = 0.0;
        isUsingElytra = false;
        playerLogCount = 0;
        playersYCoord = 0.0;
        baritoneUntilHacking = 0;
        baritonePacketSample = 0;
        lastFallDamage = false;
        onSlime = 0.0;
        whenHittingYaw = 0f;
        whenHittingPitch = 0f;
        badPacketsANum = 0;
        gotInBoatTillCheckingSpeed = 0.0;
        currentPath = "";
        noFall = 0.0;
        lastUpSpeed = 0.0;
        playerUntilSpiderHacking = 0.0;
        samePitchAndYaw = 0;
        lastPacket = "";
        setCancelled = false;
        speedMaxYNFlagHashMap = 0;
        smartMovementPunch = false;
        smartMovementKnockback = false;
        spiderCountNum = 0.0;
        fastClimbNumCheck = 0.0;
        fluidWalkLavaNum = 0.0;
        counter = 0;
        isFloodGatePlayer = false;
        noSlowShiftNum = 0.0;
        predictedYDown = 0;
        enableNotifications = true;
        counterForItemAttribute = 0;
        increaseAmountForItemAttribute = 0.0;
        elytraUseScheduler = 0;
        timeBUntilFlag = 0;
        predictedYUp = 0;
        semiPredANum = -1.0;
        autoClickerBTemp = 0L;
        semiPred = true;
        semiPredID = 0;

        if (instance.isUsingFloodgate) {
            isFloodGatePlayer = FloodgateApi.getInstance().isFloodgatePlayer(player.getUniqueId());
        }

        if (instance.ignorePlayers.contains(":bedrock")) {
            isFloodGatePlayer = true;
        }
        instance.death.disablerACPlayer(player, (int) instance.yamlConfig.getDouble("flag-system.disablerTimeOnJoin"));


    }

}