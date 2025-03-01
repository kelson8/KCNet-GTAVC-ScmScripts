// test_main/setup_teleporters.sc
//--------------------
MISSION_START

SCRIPT_NAME telepo1

SET_DEATHARREST_STATE OFF

//***************** Begin teleport markers ******************/ 


// {
//     teleport_markers:
//     WAIT 0
//     LVAR_FLOAT playerX playerY playerZ

//     // This should get the players coords, although for a teleport marker it's not needed.
//     GET_CHAR_COORDINATES scplayer playerX playerY playerZ
//     // playerX + 5

//     // IF IS_PLAYER_PLAYING player
//     //     // IF IS_CHAR_IN_AREA_ON_FOOT_3D scplayer (-859.0, -604.0, 11.0) (-859.0, 608.0, 14.0) TRUE 
//     //     IF IS_CHAR_IN_AREA_3D scplayer (-859.0, -604.0, 11.0) (-859.0, -608.0, 14.0) TRUE 
//     //         // IF flag_player_on_mission = 0
//     //         // REQUEST_COLLISION playerX playerY

//     //         SET_CHAR_COORDINATES scplayer -834.0 -598.0 12.0
//     //     ENDIF
//     // ENDIF

//     // I think this is needed.
//     GOTO teleport_markers
// }

//***************** End teleport markers ******************/ 


{

//***************** Begin teleporters main loop ******************/ 
teleporters_main_loop:
WAIT 0

    // Teleport from cherry popper factory to airport
    IF IS_PLAYER_PLAYING player
        // IF IS_CHAR_IN_AREA_ON_FOOT_3D scplayer (-859.0, -604.0, 11.0) (-859.0, 608.0, 14.0) TRUE 
        IF IS_PLAYER_IN_AREA_2D player (-859.0, -604.0) (-855.0, -608.0) TRUE 
            // IF flag_player_on_mission = 0
            // REQUEST_COLLISION playerX playerY

            // SET_CHAR_COORDINATES scplayer -834.0 -598.0 12.0
            // SET_PLAYER_COORDINATES player -834.0 -598.0 12.0
            SET_PLAYER_COORDINATES player airportX airportY airportZ
        ENDIF
    ENDIF

    // airport1TeleportX airport1TeleportY airport1TeleportZ

    // Teleport from airport to cherry popper factory
    IF IS_PLAYER_PLAYING player
        IF IS_PLAYER_IN_AREA_2D player (airport1TeleportX airport1TeleportY) (-1443.4, -1116.0) TRUE 
            SET_PLAYER_COORDINATES player spawnX spawnY spawnZ
        ENDIF
    ENDIF

GOTO teleporters_main_loop


}
//***************** End teleporters main loop ******************/ 



MISSION_END