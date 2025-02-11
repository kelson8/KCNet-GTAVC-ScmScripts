// test_main/setup_garages.sc
//--------------------
MISSION_START

SCRIPT_NAME garages

SET_DEATHARREST_STATE OFF

{

setup_garages:
LVAR_INT	respray_garage1 respray_garage2	respray_garage3	respray_garage4	respray_garage5

SET_GARAGE (-914.129, -1263.54, 10.706) (-907.137, -1246.626) (-906.3, -1266.9) (14.421) GARAGE_RESPRAY respray_garage1//docks sprayshop
SET_GARAGE (-1014.341 -857.732 6.325) (-1001.315 -857.732) (-1014.341 -841.532) (10.885) GARAGE_RESPRAY respray_garage2//carshowroom sprayshop
SET_ROTATING_GARAGE_DOOR respray_garage2
SET_GARAGE (-886.157 -115.158 9.992) (-882.699 -108.312) (-876.7 -119.83) (15.58) GARAGE_RESPRAY respray_garage3//haiti
SET_GARAGE (323.9 427.4 10.0) (326.3 434.5) (313.9 430.53) (15.7) GARAGE_RESPRAY respray_garage4//nbeachbt
SET_GARAGE (-7.55 -1253.77 9.322) (-7.55 -1261.2) (2.64 -1253.7)(14.4)  GARAGE_RESPRAY respray_garage5//ocean drive area

}

MISSION_END