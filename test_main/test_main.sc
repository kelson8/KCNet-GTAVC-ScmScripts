// SCRIPT_START

// I somewhat got this working in ReVC, it works on the ReVC reverse engineered port.

{
    // TODO Figure out how to make a mod menu with this.
    // Actually, I could probably just use CLEO with ImGui

    // TODO Figure out how to make this into multiple scripts, how do I load the other scripts?

    // This is a tutorial about multifile scripts.
    // It assume you know the basics of the GTA3script language from the previous tutorial.

    // This multifile is for GTA SA since it contains more features than GTA III/VC, thus
    // we can explain more things than it would be possible by using III/VC as base.

    // The code in this tutorial should not really be used in a real world multifile!
    // This time, the code makes logical sense and **actually works**. But the variables are misplaced, which is bad for custom scripts.
    // Please check the stripped multifiles in the other thread (which?) for an actual base multifile source code.


    // https://gtaforums.com/topic/876461-learn-gta3script-in-y-minutes/
    // https://github.com/ThirteenAG/III.VC.SA.CLEOScripts/tree/master/gtasa
    // LVAR_INT scplayer

    // Toggles
    // 1 = On
    // 0 = Off

    // Add most blips to the game

    LVAR_INT addBlipsEnabled
    addBlipsEnabled = 1

    // Setup the Pay N Sprays and other garages.
    LVAR_INT setupGaragesEnabled
    setupGaragesEnabled = 1

    // Spawn the vehicles I have setup
    LVAR_INT spawnVehiclesEnabled
    spawnVehiclesEnabled = 1


    // Enable the setup_game.sc file, sets never wanted and infinte health if toggled in here so far.
    LVAR_INT setupGameEnabled
    setupGameEnabled = 1

    // Enable the clothes pickups around the map.
    // TODO Fix these to change the players clothes, they show up on the map.
    LVAR_INT clothesPickupsEnabled
    clothesPickupsEnabled = 0

    // Enable the weapon pickups I create.
    // TODO Fix these, why aren't these working?
    LVAR_INT weaponPickupsEnabled
    weaponPickupsEnabled = 0

    // Setup the teleporter markers, incomplete
    // LVAR_INT setupTeleportersEnabled
    // setupTeleportersEnabled = 1
    //

    // Add the barriers for the islands
    LVAR_INT setupBarriersEnabled
    setupBarriersEnabled = 0

    // Toggle the interiors test.
    // This seems to work properly now, tested at the police station
    // with the clothes6 teleport in my KCNet trainer.
    LVAR_INT interiorsTestEnabled 
    interiorsTestEnabled = 1

    // This should enable the test sliding gate at my Gate #1 warp in the KCNet Trainer.
    LVAR_INT gate1TestEnabled
    gate1TestEnabled = 1

    // Get the player, the player char and mission status.
    VAR_INT player scplayer player_group
    VAR_INT flag_player_on_mission

    // Spawn coords
    VAR_FLOAT spawnX spawnY spawnZ spawnHeading
    // Original
    
    // spawnX = -847.1
    // spawnY = -596.0
    // spawnZ = 12.0
    // spawnHeading = 16.6

    // New
    // Airport
    // spawnX = -1430.4
    spawnX = -1425.4
    // spawnY = -1141.7
    spawnY = -1130.7
    // spawnZ = 14.8
    spawnZ = 14.8
    spawnHeading = 101.2

    // Each script in a multifile should have a unique name.
    // This unique name may be used later on in a TERMINATE_ALL_SCRIPTS_WITH_THIS_NAME to kill the script.
    SCRIPT_NAME main

    SET_DEATHARREST_STATE OFF

    SET_TOTAL_NUMBER_OF_MISSIONS 0
    SET_PROGRESS_TOTAL 0
    SET_COLLECTABLE1_TOTAL 0

    // Create and spawn the player
    
    CREATE_PLAYER 0 spawnX spawnY spawnZ player
    // SET_PLAYER_HEADING player spawnHeading
    // SET_PLAYER_HEADING player spawnHeading
    GET_PLAYER_CHAR player scplayer
    SET_CHAR_HEADING scplayer spawnHeading

    // TODO Test this
    // RESTORE_CAMERA_JUMPCUT
    // Oops this breaks it.
    // POINT_CAMERA_AT_POINT spawnX spawnY spawnZ JUMP_CUT

    // A multifile must as well tell the game logic which variable to lookup when testing
    // whether the player is in a mission.
    flag_player_on_mission = 0
    DECLARE_MISSION_FLAG flag_player_on_mission

    // And respawning points.
    // Tip: Try removing those lines and dying / getting arrested.
    ADD_HOSPITAL_RESTART (spawnX spawnY spawnZ) (0.0)
    ADD_POLICE_RESTART (spawnX spawnY spawnZ) (0.0)

    // The game starts faded out, so let's fade in.
    // Tip: Try a new game, then a new game again, without the following lines.
    SET_PLAYER_CONTROL player ON
    DO_FADE 0 FADE_IN



    // TODO Fix this
    // Test car generator
    // LVAR_INT gen_car124
    // WHILE NOT HAS_MODEL_LOADED PATRIOT
    //     WAIT 0
    // ENDWHILE

    // CREATE_CAR_GENERATOR -1701.3724 -234.7718 13.8276 87.8929 PATRIOT CARCOLOUR_GREEN4 CARCOLOUR_GREY3 0 0 0 0 10000 gen_car124//army base
    // SWITCH_CAR_GENERATOR gen_car124 101

    // Spawn the Cheetah near the player to the left.
    // I had to move this above the GOSUB give_weapons for it to work.
    // START_NEW_SCRIPT spawn_car1

    // Setup most of the imports for the scripts
    LAUNCH_MISSION import.sc
    //

    IF spawnVehiclesEnabled = 1
    // Move vehicle spawners into here
        LAUNCH_MISSION spawn_vehicles.sc
    ENDIF

    // Add most blips to the game
    IF addBlipsEnabled = 1
        LAUNCH_MISSION add_blips.sc
    ENDIF

    // Setup the Pay N Sprays and other garages.
    IF setupGaragesEnabled = 1
        LAUNCH_MISSION setup_garages.sc
    ENDIF

    // Setup the game, sets never wanted and infinte health if toggled in here so far.
    // TODO Add more to this later.
    IF setupGameEnabled = 1
        LAUNCH_MISSION setup_game.sc
    ENDIF

    // Enable the clothes pickups on the map
    IF clothesPickupsEnabled = 1
        LAUNCH_MISSION create_clothes_pickups.sc
    ENDIF

    // Enable the weapon pickups I create
    IF weaponPickupsEnabled = 1
        LAUNCH_MISSION create_weapon_pickups.sc
    ENDIF

    // Setup the teleporters
    // IF setupTeleportersEnabled = 1
        // LAUNCH_MISSION setup_teleporters.sc
    // ENDIF

    // Add the barriers for the islands
    IF setupBarriersEnabled = 1
        LAUNCH_MISSION setup_barriers.sc
    ENDIF

    // I finally got this working, starting the script is inside the interiors.sc file.
    IF interiorsTestEnabled = 1
        LAUNCH_MISSION interiors.sc
    ENDIF


    // Set the player health and other stuff

    GOSUB give_weapons
    // GOTO main_loop


    // GOSUB setup_player


    // Disable traffic
    // SET_CAR_DENSITY_MULTIPLIER 0.0
    
    // Disable peds
    // SET_PED_DENSITY_MULTIPLIER 0.0

    // Give the player a few weapons to start off.
    // REQUEST_MODEL UZI
    // WHILE NOT HAS_MODEL_LOADED UZI
    //     WAIT 0
    // ENDWHILE

    // REQUEST_MODEL MINIGUN
    // WHILE NOT HAS_MODEL_LOADED MINIGUN
    //     WAIT 0
    // ENDWHILE

    // GIVE_WEAPON_TO_CHAR scplayer WEAPONTYPE_UZI 9999
    // GIVE_WEAPON_TO_CHAR scplayer WEAPONTYPE_MINIGUN 9999

    // Put an uzi on the ground as a pickup.
    
    // LVAR_INT pickup_weapon
    // CREATE_PICKUP_WITH_AMMO UZI PICKUP_ON_STREET_SLOW 1000 5.0 5.0 3.0 pickup_weapon
    //

    // Make it to where the player has infinite sprint
    // SET_PLAYER_NEVER_GETS_TIRED player 1

    // Now let's start some subscripts.
    //
    // Despite the command name, this does not create missions per se.
    // Just think of this as a version of START_NEW_SCRIPT but within a new file.

    // Make it to where the player cannot sprint
    // DISABLE_PLAYER_SPRINT player TRUE

    // IF IS_CHAR_DEAD player

    // Set the max wanted level to 0
    // SET_MAX_WANTED_LEVEL 0

    // Make the player invincible
    // SET_CHAR_PROOFS scplayer TRUE TRUE TRUE TRUE TRUE

    // Play the mission passed tune
    // PLAY_MISSION_PASSED_TUNE 2

}
// SCRIPT_END

// This is required.
// Main loop
    main_loop:
    // WAIT 250
    WAIT 0

    GOTO main_loop


// Give the player weapons

    give_weapons:
    WAIT 0

    // Pistol, MP5, and Minigun
    REQUEST_MODEL COLT45
    REQUEST_MODEL MP5LNG
    WHILE NOT HAS_MODEL_LOADED COLT45
    OR NOT HAS_MODEL_LOADED MP5LNG
    // OR NOT HAS_MODEL_LOADED MINIGUN
        WAIT 0
    ENDWHILE

    // Minigun
    // REQUEST_MODEL MINIGUN
    // WHILE 
    //     WAIT 0
    // ENDWHILE

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


// Teleport to the hot dog stands
// {
//     cart_teleport:
//     WAIT 0
//     IF IS_PLAYER_PLAYING player
//         IF IS_CHAR_IN_AREA_ON_FOOT_3D scplayer (-15.0, 5.0 4.0) (-14.0 2.0 0.0) TRUE
//             REQUEST_COLLISION -2157.6257 -425.5779
//             LOAD_ALL_MODELS_NOW
//             SET_CHAR_COORDINATES scplayer -2157.6257 -425.5779 -100.0
//             ADD_SCORE player 100 // some money to buy food
//         ENDIF
//     ENDIF
//     GOTO cart_teleport
// }

// Teleport back to spawn
// This doesn't work for some reason.
// TODO Fix this part to work.
// {
//     teleport_cart_spawn:
//     WAIT 0
//     IF IS_PLAYER_PLAYING player
//         IF IS_CHAR_IN_AREA_ON_FOOT_3D scplayer (-2160.020, -421.998, 35.335) (-2161.020, -418.998, 35.335) TRUE
//             REQUEST_COLLISION -15.0, 5.0
//             LOAD_ALL_MODELS_NOW
//             SET_CHAR_COORDINATES scplayer 0.0 0.0 3.0
//         ENDIF
//     ENDIF
//     GOTO teleport_cart_spawn
// }

// TODO Setup a ped spawner
// Well this doesn't crash, but it doesn't work either..
// {
//     LVAR_INT ped1
//     ped_spawn1:

//     WAIT 0

//     // Load the model
//     WHILE NOT HAS_MODEL_LOADED BFYPRO
// 		WAIT 0
// 	ENDWHILE

//     CREATE_CHAR PEDTYPE_CIVFEMALE BFYPRO 9.808 0.982 5.109 ped1

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