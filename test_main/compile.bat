@echo off

:: Compile
.\gta3sc.exe compile "test_main.sc" --config=gtavc --guesser

:: Copy
echo Copying files
CALL copy.bat
