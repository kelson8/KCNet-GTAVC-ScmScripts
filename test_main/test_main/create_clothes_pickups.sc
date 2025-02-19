// main/create_clothes_pickups.sc
//--------------------
MISSION_START

// Clothes pickups
SCRIPT_NAME clthpck

SET_DEATHARREST_STATE OFF

{
    // Variables for mission
VAR_INT clothes2_created clothes3_created clothes4_created clothes5_created clothes6_created 
VAR_INT clothes7_created clothes8_created clothes9_created clothes10_created clothes11_created clothes12_created clothes13_created       
VAR_INT hotel_clothes_created mansion_clothes_created save1_clothes_created save2_clothes_created save3_clothes_created save4_clothes_created save5_clothes_created 
VAR_INT clothes_pickup1 clothes_pickup2 clothes_pickup3 clothes_pickup4 clothes_pickup5 clothes_pickup6  
VAR_INT clothes_pickup7 clothes_pickup8 clothes_pickup9 clothes_pickup10 clothes_pickup11 clothes_pickup12 clothes_pickup13 
VAR_INT mansion_clothes /*safehouse_clothes1*/ safehouse_clothes2 /*safehouse_clothes3 safehouse_clothes4 safehouse_clothes5 safehouse_clothes6 safehouse_clothes7*/ 
VAR_INT safehouse_created1 safehouse_created2 safehouse_created3 safehouse_created4 safehouse_created5 safehouse_created6 safehouse_created7
VAR_INT number_of_packages_collected jason_knife earned_free_python earned_free_body_armour earned_free_chainsaw earned_free_flame_thrower earned_free_laserscope earned_free_minigun earned_free_rocket
VAR_INT bonus_weapons_created1 bonus_weapons_created2 bonus_weapons_created3 bonus_armour1 bonus_gun1 bonus_gun2 bonus_gun3 bonus_gun4 bonus_gun5 bonus_gun6
VAR_INT moneybag1 boomshine1 hockeymask1 coketotem1 shootingtrophy suitbag1 pornoposter1 trophy_created
VAR_INT shit_counter bollox cheat_clothes crap_created 
VAR_INT flamer trophys helibox rubbish1 shovel1 gundocs gash_bag1 gash_bag2 pizzmess1 pizzmess2 pizzbox photos initial_painting new_painting 
VAR_INT clothes_help_flag final_clothes 

VAR_INT starting_tracksuit hunter_created south_beach_hunter  

    CREATE_CLOTHES_PICKUP -384.5 -591.9 25.3 1 mansion_clothes   
	CREATE_CLOTHES_PICKUP 226.4 -1265.6 20.1 1 clothes_pickup1
	CREATE_CLOTHES_PICKUP 97.5 -1133.6 10.4 2 clothes_pickup2
	CREATE_CLOTHES_PICKUP 364.2 1086.1 19.0 3 clothes_pickup3
	CREATE_CLOTHES_PICKUP 106.5 253.0 21.7 4 clothes_pickup4
	CREATE_CLOTHES_PICKUP -1024.5 -433.9 10.9 5 clothes_pickup5
	//CREATE_CLOTHES_PICKUP -1024.5 -433.9 10.9 5 clothes_pickup5
	CREATE_CLOTHES_PICKUP 405.7 -485.6 12.3 6 clothes_pickup6
	CREATE_CLOTHES_PICKUP 414.3 1042.0 25.4 8 clothes_pickup7
	CREATE_CLOTHES_PICKUP -917.4 885.1 11.0 10 clothes_pickup9
	CREATE_CLOTHES_PICKUP -917.4 885.1 11.0 10 clothes_pickup10
	CREATE_CLOTHES_PICKUP -917.4 885.1 11.0 10 clothes_pickup11
	CREATE_CLOTHES_PICKUP -917.4 885.1 11.0 10 clothes_pickup12
	CREATE_CLOTHES_PICKUP 465.3 -57.4 15.7 7 clothes_pickup13
	CREATE_CLOTHES_PICKUP -917.4 885.1 11.0 10 clothes_pickup8
	//CREATE_CLOTHES_PICKUP 414.3 1042.0 25.4 8 safehouse_clothes1
	CREATE_CLOTHES_PICKUP 414.3 1042.0 25.4 8 safehouse_clothes2
	//CREATE_CLOTHES_PICKUP 414.3 1042.0 25.4 8 safehouse_clothes3
	//CREATE_CLOTHES_PICKUP 414.3 1042.0 25.4 8 safehouse_clothes4
	//CREATE_CLOTHES_PICKUP 414.3 1042.0 25.4 8 safehouse_clothes5
	//CREATE_CLOTHES_PICKUP 414.3 1042.0 25.4 8 safehouse_clothes6
	//CREATE_CLOTHES_PICKUP 414.3 1042.0 25.4 8 safehouse_clothes7
	CREATE_CLOTHES_PICKUP -1200.3 -322.9 10.9 11 starting_tracksuit
	CREATE_CLOTHES_PICKUP -382.6 -585.9 25.3 12 final_clothes







create_clothes_main_loop:
WAIT 0

// This fades the screen but doesnt give the player the new clothes.
// Also it breaks the player animations and other stuff.
IF HAS_PICKUP_BEEN_COLLECTED clothes_pickup6
		GOSUB changing_clothes_part1

		IF IS_PLAYER_PLAYING player

        	UNDRESS_CHAR scplayer PLAYER6
        // DRESS_CHAR scplayer
    	ENDIF
		GOSUB changing_clothes_part2
ENDIF

GOTO create_clothes_main_loop

}



changing_clothes_part1:
{
IF IS_PLAYER_PLAYING player
	SET_FADING_COLOUR 0 0 1
	DO_FADE 500 FADE_OUT
	WHILE GET_FADING_STATUS
		WAIT 0
	ENDWHILE
ENDIF

IF IS_PLAYER_PLAYING player
	SET_EVERYONE_IGNORE_PLAYER player ON
  	SET_PLAYER_CONTROL player OFF
ENDIF
}

changing_clothes_part2:	
{
IF IS_PLAYER_PLAYING player
	LOAD_ALL_MODELS_NOW
	IF IS_PLAYER_PLAYING player
		DRESS_CHAR scplayer
	ENDIF
	SET_EVERYONE_IGNORE_PLAYER player OFF
	IF NOT IS_WANTED_LEVEL_GREATER player 2
		CLEAR_WANTED_LEVEL player
	ENDIF
  	SET_PLAYER_CONTROL player ON
	DO_FADE 500 FADE_IN
	PRINT_HELP ( CLOHELP ) //Clean Clothes!!
ENDIF

}

MISSION_END