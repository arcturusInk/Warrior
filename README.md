Focus:
    Functions,
    CLASSES,
    ARRAYLIST,
    I/O

Problem:
We will model a game of medieval times. Our world is filled with warriors. Naturally what warriors like to do is fight. To the death.
So we happily let them. Each warrior starts out with a name and a certain amount of strength. Each time he fights, he loses some strength.
(He gets to keep his name.) If his opponent is stronger than he is, then he loses all of his strength, in which case he is dead, or at the
very least pretty useless as a fighter. Otherwise he loses as much strength as his opponent had. Of course, if he and his opponent had
the same strength then they are both losers. Even losers are allowed to pick a fight. It doesn't require having any strength in order
to do battle with someone else. Not that you stand much of a chance of winning anything, but perhaps it's worth getting beaten (again)
just to have those 15 seconds of fame.

Your program will read in a file of commands. There are three types of commands:
•	Warrior creates a new warrior with the specified name and strength.
•	Battle causes a battle to occur between two warriors.
•	Status lists all warriors, alive or dead, and their strengths.

A sample input file looks like:
Warrior Jim 42
Warrior Lancelot 15
Warrior Arthur 15
Warrior Torvalds 20
Warrior Gates 8
Status
Battle Arthur Lancelot
Battle Jim Lancelot
Battle Torvalds Gates
Battle Gates Lancelot
Status

The name of the input file will be "warriors.txt". Note that the commands do not have to appear in that order.
The only requirement is that a Battle command cannot appear until the specified warriors have been seen.
The Status command displays how many warriors there, then displays each one with his strength.
The Warrior command does not display anything. The Battle command displays one line to says who is fighting
whom and a second line to report the results, as shown below.

The output (which would display on the screen) for this file should look like:
There are: 5 warriors
Warrior: Jim, strength: 42
Warrior: Lancelot, strength: 15
Warrior: Arthur, strength: 15
Warrior: Torvalds, strength: 20
Warrior: Gates, strength: 8
Arthur battles Lancelot
Mutual Annihilation: Arthur and Lancelot die at each other's hands
Jim battles Lancelot
He's dead Jim
Torvalds battles Gates
Torvalds defeats Gates
Gates battles Lancelot
Oh, NO! They're both dead! Yuck!
There are: 5 warriors
Warrior: Jim, strength: 42
Warrior: Lancelot, strength: 0
Warrior: Arthur, strength: 0
Warrior: Torvalds, strength: 12
Warrior: Gates, strength: 0
