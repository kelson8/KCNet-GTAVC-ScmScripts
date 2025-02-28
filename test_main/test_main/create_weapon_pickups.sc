// main/create_clothes_pickups.sc
//--------------------
MISSION_START

// Weapon pickups
SCRIPT_NAME wpnpck

SET_DEATHARREST_STATE OFF

{
    LVAR_INT grenadePickup
    // Weapon pickup test
    // X: -855.896
    // Y: -601.899
    // Z: 11.104

    // WHILE NOT HAS_MODEL_LOADED BAT
    WHILE NOT HAS_MODEL_LOADED GRENADE
        WAIT 0
    ENDWHILE

    // https://library.sannybuilder.com/#/vc/script/extensions/default/0213
    // https://library.sannybuilder.com/#/vc/script/enums/PickupType
    // CREATE_PICKUP BAT PICKUP_ON_STREET -855.896 -601.899 12.1

    CREATE_PICKUP_WITH_AMMO GRENADE PICKUP_ON_STREET_SLOW 999 -858.896 -602.010 11.2 grenadePickup
}

MISSION_END