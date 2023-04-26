# Guess-The-Number-Game

 --> Main: I made a simple game to guess an aleatory number between 0 and 10.
 
 --> How I made it:
 
 - Created a scanner object to scan the varibles more after in the program.
 
 - Start a Do-While loop to show at least one time what is inside the loop and repeat if the answer is wrong.
 
 - declare a variable with a random number using "answer = (int) (Math.random() * 11)", it will choose a number between 0 and 10 but we set the limit at 11 because this function have the base on 0 and it means that it start counting from 0 and not 1. It always be less 1 value.
 
 - Do a SOUT to ask the first answer and use the scanner to input the user's number guess.
 
 - Made an If to verify if the number entered by the user's is correct or not. If it is correct, it will show a message indicating that the number is correct. If it is incorrect, it will show a message indicating that the number is incorrect and a hint depending on the number being bigger or lower than the random number generated until the user's guess the correct option.
