# ske_snakeredesign
Redesign snake and ladder game

What have I made change to the design
From the GameActivity class, i have take the logical parts out and put them in as follow;

1. Game - contains BoadController and the GameActivtiy methods involving taking turn, roll a die, and etc.
2. BoardController - contains the actual Board but the controller itself controls the position of Player.
3. Board - contains 2 Players and holds the size of the board.
4. Player - contains its position and color.
5. Die - contains static method that get a random number.

- Game is a singleton.
- GameActivity contains Game class. Game delegates the logical parts for GameActivity.
- GameActivity now holds only ui parts.
- BoardView also holds only ui parts of the board


