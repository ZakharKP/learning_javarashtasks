# Biathlon

Amigo, can you imagine, in the 21st century there was such a sport &ndash; biathlon. People were skiing and shooting at
prepared target sites. In one series of shooting, it was necessary to close 5 targets. shooting
occurred both standing and lying down, but we will not go into details. The best representatives of the genus
human average shooting accuracy reached 90%, for strong middlings &ndash; 81.5%.
I wrote a program that creates a competition, adds 30 biathletes to it. Each of
they randomly set the accuracy (in the range from 0.815 to 0.900). Penalty for each miss &ndash; plus
20 seconds to the result. The competition also sets the number of firing lines &ndash; 4 and the distance that
biathletes must overcome &ndash; 20 km.
I also created a control athlete with hardcoded stats:
Speed: 20 km/h;
Hit Probability: 0.900 (90%);
Number of misses: 2 (20 hits in total. At 90 percent accuracy, 2 misses are expected);
You need to travel 20 km at a speed of 20 km/h. The required time is 1 hour, that is, 3600 seconds.
Race time (including penalty seconds): 3600 + 2 * 20 = 3640 seconds.
I want to determine how fast each athlete should ride, given their random number of misses,
so that the result in seconds is the same as that of the control athlete. At the beginning I output the result
control athlete, then all the results. At the end, I take out all the athletes who have the same time,
as in the control athlete. For some athletes, due to rounding, the final time differs by fractions
seconds. We don't need those. The rest of the race time is exactly 3640 seconds, like the control athlete, but
they are not displayed in the section "ATHLETES WITH THE SAME TIME TOTAL AS THE REFERENCE ATHLETE:".

Your task is to make one change in the code (add, remove, or change one character) to fix the bug you found.
Please note: all roundings are correct, and there is no need to add new ones!


## Requirements:
1. It is forbidden to change the data types of constants.
2. Display in the section "ATHLETES WITH THE SAME TOTAL TIME AS THE CONTROL ATHLETE:" must contain all athletes 
	who have the same time as the control athlete.
3. Make one change to the Game class.
4. Do not change the Constants class.
5. Do not change the Solution class.
6. Don't change the Sportsman class.