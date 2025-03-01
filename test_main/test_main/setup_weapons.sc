// test_main/setup_teleporters.sc
//--------------------
MISSION_START

SCRIPT_NAME weapon1

SET_DEATHARREST_STATE OFF

START_NEW_SCRIPT give_weapons

// Oh the minigun breaks this, it works fine in this file.

// Give the player weapons
{
give_weapons:
    WAIT 0

    // Pistol, MP5, and Minigun
    REQUEST_MODEL COLT45
    REQUEST_MODEL MP5LNG
    WHILE NOT HAS_MODEL_LOADED COLT45
    OR NOT HAS_MODEL_LOADED MP5LNG
    // OR NOT HAS_MODEL_LOADED MINIGUN
    // OR NOT HAS_MODEL_LOADED MINIGUN2
        WAIT 0
    ENDWHILE

    // Minigun
    // REQUEST_MODEL MINIGUN
    
    // WHILE NOT HAS_MODEL_LOADED MINIGUN
    //     WAIT 0
    // ENDWHILE
    // REQUEST_MODEL MINIGUN

    // Shotgun
    // REQUEST_MODEL SHOTGSPA
    // WHILE NOT HAS_MODEL_LOADED SHOTGSPA
    //     WAIT 0
    // ENDWHILE


    GIVE_WEAPON_TO_CHAR scplayer WEAPONTYPE_PISTOL 9999
    // GIVE_WEAPON_TO_CHAR scplayer WEAPONTYPE_MINIGUN 9999
    GIVE_WEAPON_TO_CHAR scplayer WEAPONTYPE_MP5 9999
    // GIVE_WEAPON_TO_CHAR scplayer WEAPONTYPE_SHOTGUN 9999

    // GOTO main_loop
}



MISSION_END