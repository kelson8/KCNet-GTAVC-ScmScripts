@echo off

:: Compile
.\gta3sc.exe compile "test_main.sc" --config=gtavc --guesser

:: Copy
@REM echo Copying files
CALL copy.bat
