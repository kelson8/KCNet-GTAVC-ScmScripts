MISSION_START

SCRIPT_NAME telepr1

SET_DEATHARREST_STATE OFF

// TODO Setup some test markers in GTA 3.

//***************** Begin teleports ******************/
// Teleport to the hot dog stands
// {
//     cart_teleport:
//     WAIT 0
//     IF IS_PLAYER_PLAYING player
//         // IF IS_CHAR_IN_AREA_ON_FOOT_3D scplayer (-15.0, 5.0 4.0) (-14.0 2.0 0.0) TRUE
//         IF IS_CHAR_IN_AREA_ON_FOOT_3D scplayer (2501.9, -1658.1, 12.0) (2502.9, -1655.1, 14.0) TRUE
//             REQUEST_COLLISION -2157.6257 -425.5779
//             LOAD_ALL_MODELS_NOW
//             SET_CHAR_COORDINATES scplayer -2157.6257 -425.5779 -100.0
//             ADD_SCORE player 100 // some money to buy food
//         ENDIF
//     ENDIF
//     GOTO cart_teleport
// }

// // TODO Figure out how to put text above these teleports.
// // Teleport back to spawn
// // I got this working, I had to set this to a bit higher on the Z value for the first set of coords.
// {
//     teleport_cart_spawn:
//     WAIT 0
//     IF IS_PLAYER_PLAYING player
//         IF IS_CHAR_IN_AREA_ON_FOOT_3D scplayer (-2160.0, -421.9, 38.0) (-2161.0, -418.9, 32.3) TRUE
//             REQUEST_COLLISION -1.0 18.0
//             LOAD_ALL_MODELS_NOW
//             SET_CHAR_COORDINATES scplayer 2497.6, -1655.5, 13.3
//         ENDIF
//     ENDIF
//     GOTO teleport_cart_spawn
// }

//***************** End teleports ******************/

MISSION_END