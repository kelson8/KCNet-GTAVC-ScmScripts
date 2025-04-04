// test_main/setup_game.sc
//--------------------
MISSION_START

SCRIPT_NAME gamest

SET_DEATHARREST_STATE OFF

{
    // Toggles
    // 1 = On
    // 0 = Off
    LVAR_INT neverWanted
    neverWanted = 0

    LVAR_INT infiniteHealth
    infiniteHealth = 0

    LVAR_INT extraMoney
    extraMoney = 1

    LVAR_INT infiniteStamina
    infiniteStamina = 1
    

    main_setup:
    WAIT 0

    // Test a custom command, this probably won't work.
    // Set player health to 50
    // This didn't work
    // TODO Fix this, adding this into Script9.cpp.
    // KCNET_TEST scplayer 50

    // Set never wanted
    IF neverWanted = 1
        SET_MAX_WANTED_LEVEL 0
    ENDIF

    // Set the player to invincible
    // TODO Fix this to work, the never wanted seems to work.
    IF infiniteHealth = 1
        SET_CHAR_PROOFS scplayer TRUE TRUE TRUE TRUE TRUE
    ENDIF

    // Give the player a bunch of money
    IF extraMoney = 1
        ADD_SCORE player 99999
    ENDIF

    // Set infinite stamina
    IF infiniteStamina = 1
        SET_PLAYER_NEVER_GETS_TIRED player TRUE
    ENDIF
}

MISSION_END