WinWait("[TITLE:Opening ; CLASS:MozillaDialogClass]","", 20)
; Perform keyboard ALT key + s key to select Save File Radio button using keyboard shortcut.
Send("!s")
; Wait for 9 seconds
Sleep(9000)
; Press Keyboard ENTER button.
Send("{ENTER}")


