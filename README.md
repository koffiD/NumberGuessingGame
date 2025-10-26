🎯 Number Guessing Game (Java)

A simple console-based Number Guessing Game built in Java.
The program randomly selects a number between 1 and 10, and the player has three attempts to guess it correctly.

🧠 How It Works

The program generates a random number between 1 and 10.

The user is prompted to guess the number.

The user has 3 attempts to guess correctly.

The program provides feedback after each guess:

✅ Correct guess → congratulates the player and ends the game.

❌ Wrong guess → asks the player to try again (if attempts remain).

If the player fails all attempts, the correct number is revealed.

🧩 Code Explanation
Key Features:

Uses the Random class to generate numbers.

Uses the Scanner class for user input.

Implements a for loop to limit attempts.

Utilizes a boolean flag (guessCorrectly) to track success.

Core Logic
Random random = new Random();
int targetNumber = random.nextInt(10) + 1;
int attempts = 3;
boolean guessCorrectly = false;


The loop checks the user’s input:

for (int i = 1; i <= attempts; i++) {
    int userGuess = input.nextInt();
    if (userGuess == targetNumber) {
        System.out.println("Congrats! You have guessed the correct number");
        guessCorrectly = true;
        break;
    } else {
        System.out.println("Wrong guess");
        if (i < attempts) System.out.println("Try again");
    }
}

🖥️ Example Output
Guess a number between 1 and 10
You have 3 attempts. Good luck!

Attempt 1: Enter your guess
5
x Wrong guess
Try again

Attempt 2: Enter your guess
8
Congrats! You have guessed the correct number


If all attempts are used:

You've used all attempts. The correct number was: 4

⚙️ Requirements

Java JDK 8 or later

Any Java IDE (e.g., Eclipse, IntelliJ IDEA, VS Code) or command-line setup

🚀 How to Run

Clone the repository or copy the code into your IDE.

Compile the program:

javac NumberGuessingGame.java


Run the program:

java NumberGuessingGame


Follow on-screen instructions to play the game!
