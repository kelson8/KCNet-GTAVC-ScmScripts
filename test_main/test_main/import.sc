// main/import.sc
//--------------------
// Subscript files must be specialized with the MISSION_START / MISSION_END directives.
// But once again, remember, this is not a mission per se!
MISSION_START

SCRIPT_NAME import

// We'll learn more about this command later.
// But it's most likely you want to turn off this on subscripts.
SET_DEATHARREST_STATE OFF

// These are in interiors.sc
// VAR_INT flag_player_in_stripclub flag_player_in_mall player_car_interiors
// VAR_INT flag_strip_doors_closed flag_strip_doors_open strip_doors


VAR_INT counter_60_percent
counter_60_percent = 0

//STRIP CLUB
VAR_INT strpbuy_blip
VAR_INT strpbuy_price
VAR_INT strpbuy_pickup
VAR_INT strip_cash_pickup
VAR_INT stripclub_revenue
VAR_INT stripclub_asset_acquired
strpbuy_price = 30000
stripclub_revenue = 4000
stripclub_asset_acquired = 0

VAR_FLOAT player_x player_y player_z ground_z
VAR_FLOAT clothes_shopX clothes_shopY clothes_shopZ game_percentage

VAR_FLOAT strpbuyX strpbuyY strpbuyZ

// Cutscene stuff
VAR_INT cs_time  // timer for cutscenes
VAR_INT cs_player

// security.sc
VAR_INT ammo_slot_1 ammo_slot_2 ammo_slot_3 ammo_slot_4   
VAR_INT ammo_slot_5 ammo_slot_6 ammo_slot_7 ammo_slot_8   
VAR_INT ammo_slot_9   

VAR_INT	slot1_pickup_security slot2_pickup_security slot3_pickup_security slot4_pickup_security
VAR_INT	slot5_pickup_security slot6_pickup_security slot7_pickup_security slot8_pickup_security
VAR_INT	slot9_pickup_security 

VAR_INT weapon_model_slot_1 weapon_model_slot_2 weapon_model_slot_3 weapon_model_slot_4
VAR_INT weapon_model_slot_5 weapon_model_slot_6 weapon_model_slot_7 weapon_model_slot_8
VAR_INT weapon_model_slot_9


MISSION_END     // Terminates the script.

