// test_main/spawn_vehicles.sc
//--------------------
MISSION_START

SCRIPT_NAME spawnv1

SET_DEATHARREST_STATE OFF

    

// Test this later

//***************** Begin vehicle spawners ******************/
// TODO Stop this from spawning two vehicles in VC.
{
    // Spawn in a cheetah in spot #1
    // This syntax came from the original scripts.
    VAR_INT car1
    LVAR_FLOAT car1spawnX car1spawnY car1spawnZ car1Heading
    car1spawnX = -853.0
    car1spawnY = -569.0
    car1spawnZ = 13.0
    car1Heading = -82.793

    spawn_car1:
    WAIT 0

    REQUEST_MODEL CHEETAH
        WHILE NOT HAS_MODEL_LOADED CHEETAH
            WAIT 0
        ENDWHILE

        // LOAD_ALL_MODELS_NOW
        // CREATE_CAR HUSTLER (10.0 10.0 0.0) car
        // CREATE_CAR CHEETAH 1029.952 -933.744 14.972 car1
        CREATE_CAR CHEETAH car1spawnX car1spawnY car1spawnZ car1

        SET_CAR_HEADING car1 car1Heading
        // Test for changing the colors of the car.
        // CHANGE_CAR_COLOUR car 126 3

        // Oops this launches the car elsewhere in GTA 3.
        // Warp the player into the car.
        // IF IS_PLAYER_PLAYING player
            // WARP_CHAR_INTO_CAR scplayer car1
        // ENDIF

        // Set the car health
        // SET_CAR_HEALTH car 250

        // MARK_CAR_AS_NO_LONGER_NEEDED car1

        // Make the car invincible
        // SET_CAR_PROOFS car TRUE TRUE TRUE TRUE TRUE

        // TODO Respawn the car if the player dies.

        // This can blow up the car
        // EXPLODE_CAR car
}

//***************** End vehicle spawners ******************/

//***************** Begin airport vehicle spawners ******************/


{
    // Spawn in a cheetah in airport spot #1
    // This syntax came from the original scripts.
    VAR_INT airportCar1
    LVAR_FLOAT airportCar1X airportCar1Y airportCar1Z airportCar1Heading
    airportCar1X = -1455.1
    airportCar1Y = -1149.2
    airportCar1Z = 15.2
    airportCar1Heading = -82.793

    spawn_airport_car1:
    WAIT 0

    REQUEST_MODEL CHEETAH
        WHILE NOT HAS_MODEL_LOADED CHEETAH
            WAIT 0
        ENDWHILE
        CREATE_CAR CHEETAH airportCar1X airportCar1Y airportCar1Z airportCar1

        SET_CAR_HEADING airportCar1 airportCar1Heading
}


{
    // Spawn in a Infernus in airport spot #2
    // This syntax came from the original scripts.
    VAR_INT airportCar2
    LVAR_FLOAT airportCar2X airportCar2Y airportCar2Z airportCar2Heading
    // airportCar2X = -1458.7
    airportCar2X = -1455.7
    airportCar2Y = -1141.5
    airportCar2Z = 15.2
    airportCar2Heading = -82.793

    spawn_airport_car2:
    WAIT 0

    REQUEST_MODEL INFERNUS
        WHILE NOT HAS_MODEL_LOADED INFERNUS
            WAIT 0
        ENDWHILE
        CREATE_CAR INFERNUS airportCar2X airportCar2Y airportCar2Z airportCar2

        SET_CAR_HEADING airportCar2 airportCar2Heading
}

{
    // Spawn in a Rhino in airport spot #3
    // This syntax came from the original scripts.
    VAR_INT airportCar3
    LVAR_FLOAT airportCar3X airportCar3Y airportCar3Z airportCar3Heading
    airportCar3X = -1455.7
    // airportCar3Y = -1141.5
    airportCar3Y = -1128.1
    airportCar3Z = 15.2
    airportCar3Heading = -82.793

    spawn_airport_car3:
    WAIT 0

    REQUEST_MODEL RHINO
        WHILE NOT HAS_MODEL_LOADED RHINO
            WAIT 0
        ENDWHILE
        CREATE_CAR RHINO airportCar3X airportCar3Y airportCar3Z airportCar3

        SET_CAR_HEADING airportCar3 airportCar3Heading
}

{
    // Spawn in a Police Maverick in airport spot #4
    // This syntax came from the original scripts.
    VAR_INT airportCar4
    LVAR_FLOAT airportCar4X airportCar4Y airportCar4Z airportCar4Heading
    airportCar4X = -1441.7
    // airportCar4Y = -1141.5
    airportCar4Y = -1126.5
    airportCar4Z = 15.2
    airportCar4Heading = -82.793

    spawn_airport_car4:
    WAIT 0

    REQUEST_MODEL MAVERICK
        WHILE NOT HAS_MODEL_LOADED MAVERICK
            WAIT 0
        ENDWHILE
        CREATE_CAR MAVERICK airportCar4X airportCar4Y airportCar4Z airportCar4

        SET_CAR_HEADING airportCar4 airportCar4Heading
}

/*
Location #4
 Y:  Z: 15.2
*/

//***************** End airport vehicle spawners ******************/

//***************** Begin vehicle main loop ******************/ 

// These can be re-used
/* */
// This works!
// I got the idea for the syntax from the original scripts
vehicle_spawn_main_loop:
WAIT 0



// Remove the marker if the player gets in or the car blows up.
IF IS_CAR_DEAD car1
    // REMOVE_BLIP car1_blip
    MARK_CAR_AS_NO_LONGER_NEEDED car1
ENDIF

IF IS_CAR_DEAD airportCar1
    MARK_CAR_AS_NO_LONGER_NEEDED airportCar1
ENDIF

// IF IS_CHAR_IN_CAR scplayer car1
    // REMOVE_BLIP car1_blip
// ENDIF

GOTO vehicle_spawn_main_loop

//***************** End vehicle main loop ******************/ 

MISSION_END