# GTAVC-ScmScripts
This repo will contain a lot of testing that I am creating for VC and ReVC, I am using some of the original scripts as a base for this.

### test-main folder
* add_blips.sc - Add most blips from the original scripts
* import.sc - Blank script
* setup_barriers.sc - Setup the barriers for the bridges and disable the ped paths, this can be toggled by changing 0 to 1 in the file.
* setup_game.sc - Add never wanted, infinite health, and extra money toggles into this file, I will possibly move the player stuff into here.
* setup_garages.sc - Setup the pay n spray garages.
* setup_teleporters.sc - Setup the teleport markers on the map, incomplete.


### Root folder
* compile.bat - This will compile using gta3sc.exe if found, it'll copy to what path is set in the copy.bat file.
* copy.bat - Called from compile.bat which copies a file to the folder.

### About
These can be compiled by using the gta3sc compiler from here:
* https://github.com/thelink2012/gta3sc

I excluded the exe from the repo, but it can be downloaded from their link, just download the latest version on the right side where it has releases.

When you download that file, extract the contents into the 'test_main' folder.

**WARNING**, before running this copy script, verify the path is correct, and be sure to backup the 'freeroam_miami.scm' and 'main.scm'.

If you want to use the scripts for copying this to freeroam_miami.scm in the Vice City folder, modify the value in 'test_main/copy.bat'

```
Change the value in here to your vice city path (I am using a modified
 build of ReVC, that's where this path is coming from.
)

Change this
copy "test_main.scm" "C:\Rockstar Games\GTA Vice City\ViceExtended\data\freeroam_miami.scm"

To something like this, or wherever your GTA Vice City is located.
If your GTA Vice City is located in the 'Rockstar Games' folder like above:
copy "test_main.scm" "C:\Rockstar Games\GTA Vice City\data\freeroam_miami.scm"

To replace the main.scm:


```

### License
This project is licensed under the GPLV3 license
