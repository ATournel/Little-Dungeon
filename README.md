### Welcome to,

# *Little Dungeon* Wiki

**Little Dungeon** is a dungeon crawler game only playable on console.

It is written in **Java**.

It uses:  
* Classes  
* Loops
* *if* statements (a lot)
* Randoms
* Scanners

1. Classes

   I used inheritance not to repeat code for similar classes, like Hero class and Foe class both inherit from the Character class.  
   It also has the following classes:  
     - Chest: randomly found after each fight, this class determines wich possible loot to get in a regular or boss chest  
     - Room: used to create 10 pregenerated rooms with 1, 2 or 3 foes in it  
     - BigTexts: where I wrote all the methods containing long texts  
     - Magic: to manage the five different kinds of hero magics in the game  
     - Weapon: to create the equipable weapons for the Hero  
     - Armor: same as Weapon  
     - Potion: I created this class to have different kinds of potions(life and mana)
     - Game: the Game class is where all the magic happens, it contains the *main* method
     
2. Loops

   Loops are used in this game for repetitive consecutive actions such as generating a trap, followed by a room and then a chest but five times in a row.
   It allows code to be smaller while the user experience gets longer.
   
3. *if* statements

   A lot of conditions are used to determine the following actions available to the player.
   That is where the *if*, *else if* and *esle* statements come at use.
   Wether it is to determine conditions of victory/defeat, wich ending to display to the player or even if a player may or may not open a chest, those statements are very handy.
   
4. Randoms

   There are a lot of randoms involded. 
   I used them for:
      - Traps: player randomly face a trap when entering a room
      - Loots: foes randomly drop some loot, loot also randomly determined
      - Chest: same as foe loots
      - Rooms: randomly select five rooms between the ten available, rooms may repeat themselves
      - Foes: randomly displays 1, 2 or 3 foes in each room the player visits
      - BossChests: the first one randomly loots a legendary item but the second and third ones loot according to previous loots
      
 5. Scanners
 
   Scanners are used to allow the player to select one the different choices offered to him.
      
 ### That's it for the technical part.
 
 To end this README, I just have one more thing to say.
 
 Please play the game, I hope you will have some fun, I thought of four different endings for you!
 
 Don't hesitate to give me some feedback, you most probably face some balancing issues. 
 Still, I hope you won't...
 
 Again, have fun, and thank you for reading!
 
 Mr Toto.
