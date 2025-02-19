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

    main_setup:
    WAIT 0

    // Set never wanted
    IF neverWanted = 1
        SET_MAX_WANTED_LEVEL 0
    ENDIF

    // Set the player to invincible
    IF infiniteHealth = 1
        SET_CHAR_PROOFS scplayer TRUE TRUE TRUE TRUE TRUE
    ENDIF

    // Give the player a bunch of money
    IF extraMoney = 1
        ADD_SCORE player 99999
    ENDIF
}

MISSION_END