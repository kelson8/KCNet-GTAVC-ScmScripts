
// test_main/setup_barriers.sc
//--------------------
MISSION_START

SCRIPT_NAME barrset

SET_DEATHARREST_STATE OFF

// Most of this was copied from inital.sc from the original scripts.

{

// Toggle this right here.
// VAR_INT barriersEnabled
// barriersEnabled = 1

// Only run if enabled
// IF barriersEnabled = 1


// Disable ped roads on these paths.
// ****************************VICECITY SWITCHED OFF ROAD AND PED NODES*********************

// ped nodes

//SWITCH_PED_ROADS_OFF -665.92 -1051.05 2.0 -694.58 -1481.50 50.0 // Counterfeiting boat
//SWITCH_PED_ROADS_OFF -1351.75 210.05 5.0 -1233.96 0.31 30.0 // Scrap Yard
//SWITCH_PED_ROADS_OFF -761.90 1193.19 6.0 -671.44 1311.88 40.0 // Compound behind Ammunation for Bike3
SWITCH_PED_ROADS_OFF -956.0 -355.0 5.0 -898.0 -328.0 25.0  // El Banco Corrupto Grande
SWITCH_PED_ROADS_OFF 411.0 -600.0 -10.0 451.0 -553.0 30.0 //Ocean drive back alleyway (Middle)
SWITCH_PED_ROADS_OFF 450.0 -509.0 -10.0 472.0 -489.0 30.0 //Ocean drive back alleyway (North)
SWITCH_PED_ROADS_OFF 355.0 -773.0 -10.0 324.0 -808.0 30.0 //Ocean drive back alleyway (South)
SWITCH_PED_ROADS_OFF 371.0 -503.0 -10.0 403.0 -490.0 30.0 //Cop shop (South beach)
SWITCH_PED_ROADS_OFF 357.0 -506.0 -10.0 384.0 -475.0 30.0 //Cop shop (South beach)
SWITCH_PED_ROADS_OFF 363.0 -476.0 -10.0 378.0 -468.0 30.0 //Cop shop (South beach)
SWITCH_PED_ROADS_OFF 383.0 -488.0 -10.0 398.3 -470.5 30.0 //Cop shop (South beach)
SWITCH_PED_ROADS_OFF 376.66 -453.85 -10.00 328.91 -504.02 30.0 //Cop Shop (Used in bank1)
SWITCH_PED_ROADS_OFF -395.0 -579.0 19.0 -338.0 -560.0 30.0 // Diaz Mansion
SWITCH_PED_ROADS_OFF -671.71 1236.53 20.0 -667.16 1231.51 25.0 // Roof of Bike3 mission
SWITCH_PED_ROADS_OFF -733.84 1255.72 8.0 -728.34 1259.73 20.0 // inside Bike3 compound
SWITCH_PED_ROADS_OFF 474.0 1250.0 17.0 356.0 1003.0 32.0 // BIG MALL
SWITCH_PED_ROADS_OFF 236.0 -1281.5 0.0 232.3 -1267.6 32.0 // Front of Hotel
SWITCH_PED_ROADS_OFF -395.6 -658.6 0.0 -363.2 -636.7 32.0 // Back of mansion
SWITCH_PED_ROADS_OFF -237.8 -1387.1 0.0 -228.7 -1331.8 32.0 // Next to Colonels boat

//SWITCH_PED_ROADS_OFF -614.6 -1518.0 0.0 -579.5 -1479.1 30.0 //  Boat house
//SWITCH_PED_ROADS_OFF -664.3 -1498.8 0.0 -620.0 -1469.4 30.0 //  Boat house
SWITCH_PED_ROADS_OFF -692.193 -1522.901 0.0 -575.311 -1453.378 30.0//BOAT YARD
SWITCH_PED_ROADS_OFF -896.098 -593.101 0.0 -855.09 -548.64 30.0//ICECREAM
SWITCH_PED_ROADS_OFF -1031.494 -902.312 0.0 -949.479 -821.592 30.0//CAR YARD
SWITCH_PED_ROADS_OFF -1176.038 -266.898 0.0 -1012.796 -158.26 30.0//PRINTWORKS
SWITCH_PED_ROADS_OFF -112.495 920.349 0.0 9.705 1025.694 30.0//PORNSTUDIO
SWITCH_PED_ROADS_OFF -1012.06 181.561 0.0 -982.06 216.561 30.0//TAXIFIRM

SWITCH_PED_ROADS_OFF -787.8 -519.4 10.0 -657.5 -475.2 20.0 // Star Island gates mainland
SWITCH_PED_ROADS_OFF -230.0 -464.5 10.0 56.85 -459.8 20.0 // Star Island gates ocean beach
SWITCH_PED_ROADS_OFF -99.8 1041.9 0.0 -129.0 1097.4 30.0 //  porn island road block					 
SWITCH_PED_ROADS_OFF -214.6 -948.8 0.0 -258.7 -920.6 30.0 //  South road block
SWITCH_PED_ROADS_OFF 189.8 230.3 0.0 248.0 258.5 30.0 //  Golf course road block
SWITCH_PED_ROADS_OFF -38.0 84.3 0.0 -102.3 95.1 30.0 //  Golf course road block
SWITCH_PED_ROADS_OFF -396.4 -583.6 15.0 -360.5 -555.6 33.0 //  Mansion main hall
SWITCH_PED_ROADS_OFF 468.0 -77.0 0.0 490.0 -54.0 30.0 // MALIBU
SWITCH_PED_ROADS_OFF 354.9 -483.1 21.0 406.0 -490.0 0.0 // POLICE STATION
// car nodes

SWITCH_ROADS_OFF -583.92 1371.84 8.0 -383.40 1531.17 25.0 // Dirtbike track
//SWITCH_ROADS_OFF -693.19 1169.85 8.0 -658.35 754.23 15.0 // alleyway infront of AnnuNation for Bike2
SWITCH_ROADS_OFF 86.0 250.0 15.0 -100.0 281.0 30.0 // entrance to golf club
SWITCH_ROADS_OFF 411.0 -600.0 -10.0 451.0 -553.0 30.0 //Ocean drive back alleyway (Middle)
SWITCH_ROADS_OFF 450.0 -509.0 -10.0 472.0 -489.0 30.0 //Ocean drive back alleyway (North)
SWITCH_ROADS_OFF 355.0 -773.0 -10.0 324.0 -808.0 30.0 //Ocean drive back alleyway (South)
SWITCH_ROADS_OFF 259.0 -941.0 -10.0 284.0 -925.0 30.0 //Ocean drive back alleyway (South South)
SWITCH_ROADS_OFF -1102.0 76.0 -10.0 -1126.0 58.9.0 30.0 //Haitian Base 
SWITCH_ROADS_OFF -787.8 -519.4 10.0 -657.5 -475.2 20.0 // Star Island gates	mainland
SWITCH_ROADS_OFF -230.0 -464.5 10.0 165.85 -459.8 20.0 // Star Island gates ocean beach
SWITCH_ROADS_OFF -99.8 1041.9 0.0 -129.0 1097.4 30.0 // porn island road block
SWITCH_ROADS_OFF -214.6 -948.8 0.0 -258.7 -920.6 30.0 //  South road block
SWITCH_ROADS_OFF 189.8 230.3 0.0 248.0 258.5 30.0 //  Golf course road block
SWITCH_ROADS_OFF -38.0 84.3 0.0 -102.3 95.1 30.0 //  Golf course road block
SWITCH_ROADS_OFF 175.0 236.1 0.0 161.0 242.4 30.0 //  Golf course road block
SWITCH_ROADS_OFF 149.8 231.4 0.0 136.0 235.3 30.0 //  Golf course road block
SWITCH_ROADS_OFF 63.4 188.6 0.0 49.4 189.7 30.0 //  Golf course road block

// Setup the barriers
VAR_INT	strike_gate	star_gate_1 star_gate_2

CREATE_OBJECT_NO_OFFSET comgate1closed -715.082 -489.689 12.549 star_gate_1
DONT_REMOVE_OBJECT star_gate_1
CREATE_OBJECT_NO_OFFSET comgate2closed -181.451 -472.61 11.353 star_gate_2
SET_OBJECT_HEADING star_gate_2 102.0
DONT_REMOVE_OBJECT star_gate_2

//PORN STUDIO ROADBLOCK
VAR_INT porn_roadblock

CREATE_OBJECT_NO_OFFSET nt_roadblockCI -97.3 1061.8 11.6 porn_roadblock
DONT_REMOVE_OBJECT porn_roadblock

//GOLF COURSE ROADBLOCK
VAR_INT golf_roadblock
									   
CREATE_OBJECT_NO_OFFSET nt_roadblockGF -81.46 81.358 21.04 golf_roadblock
//SET_OBJECT_HEADING golf_roadblock 35.0
DONT_REMOVE_OBJECT golf_roadblock

//GOLF COURSE GATES
/*VAR_INT golf_gates_closed

CREATE_OBJECT_NO_OFFSET golf_gatesclosed 107.671 -227.729 20.634 golf_gates_closed
DONT_REMOVE_OBJECT golf_gates_closed
*/

//SOUTH ROADBLOCK
VAR_INT south_roadblock	pier_closed	taxi_closed	boat_closed
VAR_INT mansion_doors mansion_closed mansion_open

CREATE_OBJECT_NO_OFFSET wsh_roadblock -242.671 -935.667 16.198 south_roadblock
DONT_REMOVE_OBJECT south_roadblock

CREATE_OBJECT_NO_OFFSET mansion_new_doors -391.19 -575.906 24.071 mansion_doors
DONT_REMOVE_OBJECT mansion_doors

CREATE_OBJECT_NO_OFFSET man_doorclosed -378.542 -554.006 20.067 mansion_closed
DONT_REMOVE_OBJECT mansion_closed

CREATE_OBJECT_NO_OFFSET wshperdrclsd -266.496 -1214.563 9.02 pier_closed
DONT_REMOVE_OBJECT pier_closed

CREATE_OBJECT_NO_OFFSET haitaxidr -1010.466 199.125 11.95 taxi_closed
DONT_REMOVE_OBJECT taxi_closed

CREATE_OBJECT_NO_OFFSET b_hse_doors -640.012 -1485.941 15.457 boat_closed
DONT_REMOVE_OBJECT boat_closed

// VAR_INT flag_strip_doors_closed flag_strip_doors_open strip_doors
// VAR_INT strip_doors
CREATE_OBJECT_NO_OFFSET stripclbdrclsd 97.203 -1469.731 10.578 strip_doors
DONT_REMOVE_OBJECT strip_doors


VAR_INT strip_door_poledance
CREATE_OBJECT_NO_OFFSET strpbckdrclsd 68.988 -1444.242 10.727 strip_door_poledance
DONT_REMOVE_OBJECT strip_door_poledance


// ENDIF // barriersEnabled = 1
}

MISSION_END