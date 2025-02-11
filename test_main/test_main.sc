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


    // Get the player, the player char and mission status.
    VAR_INT player scplayer player_group
    VAR_INT flag_player_on_mission

    // Spawn coords
    VAR_FLOAT spawnX spawnY spawnZ spawnHeading
    // spawnX = 1055.150 
    // spawnY = -942.547
    // spawnZ = 14.2

    spawnX = -847.1
    spawnY = -596.0
    spawnZ = 12.0
    spawnHeading = -92.797

    // Pay N Sprays
    VAR_INT sprayshop1

    // Toggles
    // 1 = On
    // 0 = Off
    // Toggle never wanted
    VAR_INT neverWanted
    neverWanted = 0

    // I couldn't get this working in a function.
    // Set never wanted
    IF neverWanted = 1
        SET_MAX_WANTED_LEVEL 0
    ENDIF

    // Toggle a bunch of money given to the player.
    VAR_INT maxMoney
    maxMoney = 0
    //



    // Each script in a multifile should have a unique name.
    // This unique name may be used later on in a TERMINATE_ALL_SCRIPTS_WITH_THIS_NAME to kill the script.
    SCRIPT_NAME main

    // We'll learn more about this command later.
    SET_DEATHARREST_STATE OFF

    
    // The following commands should be used exactly as follow, with the first parameter as 0.
    // The compiler will, during the compilation process, replace the zeros with the correct values found during the compilation process.
    SET_TOTAL_NUMBER_OF_MISSIONS 0
    SET_PROGRESS_TOTAL 0
    SET_COLLECTABLE1_TOTAL 0

    // Create and spawn the player
    
    // TODO Move player functions into this.
    // GOSUB setup_player

    CREATE_PLAYER 0 spawnX spawnY spawnZ player
    SET_PLAYER_HEADING player spawnHeading
    GET_PLAYER_CHAR player scplayer

    // TODO Fix for VC
    // Disable the Callhan bridge barriers.
    // SET_VISIBILITY_OF_CLOSEST_OBJECT_OF_TYPE 1027.26 -933.796 15.042 50.0 indhelix_barrier FALSE 
    // SWAP_NEAREST_BUILDING_MODEL 1027.26 -933.796 15.042 50.0 indhelix_barrier LOD_land014  
    //
    

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

    // Move vehicle spawners into here
    LAUNCH_MISSION spawn_vehicles.sc

    // Set the player health and other stuff
    GOSUB give_weapons
    GOTO main_loop


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

    // TODO Add working Pay N Spray.
    // LAUNCH_MISSION import.sc




    // TODO Test a Pay N Spray
    // https://library.sannybuilder.com/#/gta3/script/enums/GarageType 
    // 5 = GARAGE_RESPRAY
    // SET_GARAGE 921.0 -367.5 9.8 928.7 -355.1 14.8 5 sprayshop1 //Pay N Spray #1.

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


// Setup the player
// TODO Move player functions into here.
// This crashes if I gosub to it..
    setup_player:
    
    WAIT 0

    // // Give the player a bunch of money
    // IF maxMoney = 1
    //     ADD_SCORE player 100000
    // ENDIF

    // // Give the player max health and armor on hand
    // // The health can go up to 1000, I had no idea the games limit was so high.
    // SET_CHAR_HEALTH scplayer 250
    // ADD_ARMOUR_TO_CHAR scplayer 100
    





    // Go back into the main loop.
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