// test_main/setup_peds.sc
//--------------------
MISSION_START


// Peds setup
SCRIPT_NAME pedsSt

SET_DEATHARREST_STATE OFF

// Spawn coords:

    // spawnX = -847.1
    // spawnY = -596.0
    // spawnZ = 12.0
    // spawnHeading = 16.6

{
    // Spawn in a cheetah for the ped to get in
    // TODO Test this
    // This syntax came from the original scripts.
    VAR_INT pedCar1
    LVAR_FLOAT pedCar1X pedCar1Y pedCar1Z pedCar1Heading
    pedCar1X = -842.5
    pedCar1Y = -594.9
    pedCar1Z = 12.0
    pedCar1Heading = -1.5

    spawn_ped_car1:
    WAIT 0

    REQUEST_MODEL CHEETAH
        WHILE NOT HAS_MODEL_LOADED CHEETAH
            WAIT 0
        ENDWHILE
        CREATE_CAR CHEETAH pedCar1X pedCar1Y pedCar1Z pedCar1

        SET_CAR_HEADING pedCar1 pedCar1Heading
}

{
    // This works!!
    // The ped model is perfect, I pissed off someone in the office lol.
    LVAR_INT ped1
    ped_spawn1:
        WAIT 0

        // Load the weapon model

        // Pistol
        // REQUEST_MODEL COLT45
        // WHILE NOT HAS_MODEL_LOADED COLT45
        //     WAIT 0
        // ENDWHILE

        WHILE NOT HAS_MODEL_LOADED WFYBU
		    WAIT 0
	    ENDWHILE



        // Create a ped near the spawn
        // This works
        CREATE_CHAR PEDTYPE_CIVFEMALE WFYBU -849.1 -598.0 12.0 ped1

        // They seem to get in the vehicle when the ped spawns in, sometimes they don't spawn in
        // TODO Make the ped drive away or something
        // SET_CHAR_OBJ_ENTER_CAR_AS_DRIVER ped1 pedCar1

        // This doesn't work
        // CAR_WANDER_RANDOMLY pedCar1

        // This gives them a weapon and makes them shoot the player
        // Give the ped a pistol
        // GIVE_WEAPON_TO_CHAR ped1 WEAPONTYPE_PISTOL 9999

        // Set the weapon as their current weapon
        // SET_CURRENT_CHAR_WEAPON ped1 WEAPONTYPE_PISTOL

        // Test for making them fight the player
        // This works for making them fight the player
        // SET_CHAR_OBJ_KILL_CHAR_ANY_MEANS ped1 scplayer


    // TODO Possibly mark the model as no longer needed

    // WAIT0
    // // Load models
    // // 023C: load_special_actor 'CAT' as 1 // models 290-299038B: 
    // //load_requested_models
    // // :MODEL_LOAD
    // if 823D:   not special_actor 1 loaded 
    // else_jump @MODEL_SPAWN 
    // WAIT 0 
    // GOTO @MODEL_LOAD :MODEL_SPAWN
// }
}



MISSION_END