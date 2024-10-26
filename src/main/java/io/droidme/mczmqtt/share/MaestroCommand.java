package io.droidme.mczmqtt.share;

import static io.droidme.mczmqtt.share.MaestroCommandCategory.*;

public enum MaestroCommand {

    // Deamon Control Messages
    REFRESH(0, "Refresh", DAEMON ),
    GETINFO(0, "GetInfo", GET_INFO),
    T_SETPOINT(42, "temperature", SET),
    CHRONOSTAT(1111, "onoff", SET),
    CHRONOSTAT_T1(1108, "temperature", SET),
    CHRONOSTAT_T2(1109, "temperature", SET),
    CHRONOSTAT_T3(1110, "temperature", SET),
    POWER_LEVEL(36, "int", SET),
    SILENT_MODE(45, "onoff", SET),
    ACTIVE_MODE(35, "onoff", SET),
    ECO_MODE(41, "onoff", SET),
    SOUND_EFFECTS(50, "onoff", SET),
    POWER(34, "onoff", SET),
    FAN_STATE(37, "int", SET),      // 0, 1, 2, 3 ,4,  5 ,6
    DUCTED_FAN1(38, "int", SET),    // 0, 1, 2, 3 ,4,  5 ,6
    DUCTED_FAN2(39, "int", SET),    // 0, 1, 2, 3 ,4,  5 ,6
    CONTROL_MODE(40, "onoff", SET),
    PROFILE(149, "int", SET),

    // Untested, proceed with caution
    FEEDING_SCREW(34, "49", SET), // 49 as parameter to socket for feeding screw activiation
    CELSIUS_FAHRENHEIT(49, "int", SET),
    SLEEP(57, "int", SET),
    SUMMER_MODE(58, "onoff", SET),
    PELLET_SENSOR(148, "onoff", SET),
    ADAPTIVE_MODE(149, "onoff", SET),
    ANTI_FREEZE(154, "int", SET),
    RESET_ACTIVE(2, "255", SET),
    RESET_ALARM(1, "255", SET),

    // Probably bit dangerous ;)
    //FACTORY_RESET(46, "onoff", SET),

    // Diagnostics commands
    DIAGNOSTICS(100, "onoff", DIAGNOSTIC),
    D_RPM_FAM_FUME(1, "int", DIAGNOSTIC),
    D_RPM_WORM_WHEEL(2, "int", DIAGNOSTIC),
    D_ACTIVE(3, "int", DIAGNOSTIC),
    D_IGNITOR( 4, "onoff", DIAGNOSTIC),
    D_FRONT_FAN(5, "percentage", DIAGNOSTIC),
    D_DUCTED_FAN1(6, "percentage", DIAGNOSTIC),
    D_DUCTED_FAN2(7, "percentage", DIAGNOSTIC),

    // Datetime commands
    // The value to the command has to be given as string in the format - > "ddmmYYYYHHmm", e.g. "171220201636" for the date 17/12/2020 04:36 pm.
    SET_DATE_TIME( 0, "datetime", SET_DATETIME);


    int id;                             // maestro command id to be sent via ws
    String type;                        // command type
    MaestroCommandCategory category;    // command category


    MaestroCommand(int id, String type, MaestroCommandCategory category) {
        this.id = id;
        this.type = type;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public MaestroCommandCategory getCategory() {
        return category;
    }
}
