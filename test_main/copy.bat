@echo off
setlocal
:: https://stackoverflow.com/questions/39498752/batch-file-copy-syntax-is-incorrect

:: https://stackoverflow.com/questions/1794547/how-can-i-make-an-are-you-sure-prompt-in-a-windows-batch-file
:: This below enables the prompt for copying, it's annoying so I disabled it.
@REM :PROMPT
@REM SET /p CONFIRM=Replace file? (Y/[N])? 
@REM if /I "%CONFIRM%" NEQ "Y" GOTO END

copy "test_main.scm" "C:\Rockstar Games\GTA Vice City\data\main.scm"

::echo File copied
@REM :END
@REM endlocal