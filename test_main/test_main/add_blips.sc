// test_main/add_blips.sc
//--------------------
MISSION_START

SCRIPT_NAME blips

SET_DEATHARREST_STATE OFF

{
    // Handles for the blips
    LVAR_INT	respray_garage1 respray_garage2	respray_garage3	respray_garage4	respray_garage5
    LVAR_INT weapon_shop1_blip weapon_shop2_blip weapon_shop3_blip
    LVAR_INT hardware_shop1 hardware_shop2 hardware_shop3
    // Coords
    VAR_FLOAT ammu1X ammu1Y ammu1Z 
    VAR_FLOAT ammu2X ammu2Y ammu2Z 
    VAR_FLOAT ammu3X ammu3Y ammu3Z
    VAR_FLOAT hard1X hard1Y hard1Z 
    VAR_FLOAT hard2X hard2Y hard2Z 
    VAR_FLOAT hard3X hard3Y hard3Z

    ammu1X = -63.4 
    ammu1Y = -1481.8 
    ammu1Z = 9.4

    ammu2X = 364.9 
    // ammu2Y = 1055.7 
    ammu2Y = 1051.5
    // ammu2Z = 18.2
    ammu2Z = 21.0

    ammu3X = -677.0 
    ammu3Y = 1205.6 
    ammu3Z = 10.0

    hard1X =  202.7 
    hard1Y = -474.1 
    hard1Z = 10.1

    hard2X = 364.9 
    hard2Y = 1078.0 
    hard2Z = 18.0
 
    hard3X = -967.5 
    hard3Y = -693.2 
    hard3Z = 10.3

    add_blips:
    WAIT 0
    // Pay N Sprays
    ADD_SHORT_RANGE_SPRITE_BLIP_FOR_COORD -3.8 -1265.8 12.0 RADAR_SPRITE_SPRAY respray_garage1 //South beach
    ADD_SHORT_RANGE_SPRITE_BLIP_FOR_COORD 319.0 441.3 12.0 RADAR_SPRITE_SPRAY respray_garage2 //Vice Point
    ADD_SHORT_RANGE_SPRITE_BLIP_FOR_COORD -903.0 -1261.1 12.0 RADAR_SPRITE_SPRAY respray_garage3 //Docks
    ADD_SHORT_RANGE_SPRITE_BLIP_FOR_COORD -876.2 -105.5 12.0 RADAR_SPRITE_SPRAY respray_garage5 //Main road haiti

    // Weapon shops
    ADD_SHORT_RANGE_SPRITE_BLIP_FOR_COORD ammu1X ammu1Y ammu1Z RADAR_SPRITE_GUN weapon_shop1_blip
    ADD_SHORT_RANGE_SPRITE_BLIP_FOR_COORD ammu2X 1051.5 21.0 RADAR_SPRITE_GUN weapon_shop2_blip
    ADD_SHORT_RANGE_SPRITE_BLIP_FOR_COORD ammu3X ammu3Y ammu3Z RADAR_SPRITE_GUN weapon_shop3_blip


    // Hardware shops
    ADD_SHORT_RANGE_SPRITE_BLIP_FOR_COORD hard1X hard1Y hard1Z RADAR_SPRITE_HARDWARE hardware_shop1
    ADD_SHORT_RANGE_SPRITE_BLIP_FOR_COORD 364.8 1086.5 21.0 RADAR_SPRITE_HARDWARE hardware_shop2
    ADD_SHORT_RANGE_SPRITE_BLIP_FOR_COORD hard3X hard3Y hard3Z RADAR_SPRITE_HARDWARE hardware_shop3

}

MISSION_END