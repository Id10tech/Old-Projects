#imports
import time
import sys
import random

#functions

def slowPrint(str):
   for c in str + '\n':
     sys.stdout.write(c)
     sys.stdout.flush()
     time.sleep(3./100)

def endingDialogue():
    slowPrint("\nThat was a close one, huh?")
    slowPrint("\nYou know, I like you...")

    playerAnswer = input("Would you like to be my aprrentice? I like to have luck by my side...")

    if playerAnswer == "no" or playerAnswer == "No":
        slowPrint("YOU'RE GONNA REGRET EVER TALKING TO ME!")
    elif playerAnswer == "yes" or playerAnswer == "Yes":
        slowPrint("I'm glad you're here! We can start today...")
    else:
        slowPrint("I don't understand you- I can't help you then...")

    quit()

#main
slowPrint("Welcome to Rock, Paper, Scissors!\n")

choices = ["Rock", "Paper", "Scissors"]
computerChoice = random.choice(choices)

playerChoice = str(input("Would you like to play Rock, Paper, or Scissors?\n\n"))

if playerChoice == "rock" or playerChoice == "Rock":
    slowPrint("\nYou chose to play Rock")
elif playerChoice == "paper" or playerChoice == "Paper":
    slowPrint("\nYou chose to play Paper")
elif playerChoice == "scissors" or playerChoice == "Scissors":
    slowPrint("\nYou chose to play Scissors")
else:
  slowPrint("\nPlease enter a valid choice")
  quit()


if computerChoice == "Rock":
    slowPrint("\nComputer chose Rock")
elif computerChoice == "Paper":
    slowPrint("\nComputer chose Paper")
elif computerChoice == "Scissors":
    slowPrint("\nComputer chose Scissors")


if playerChoice == "Rock" or playerChoice == "rock" and computerChoice == "Rock":
    slowPrint("\nIt's a tie!")
    quit()
elif playerChoice == "Paper" or playerChoice == "paper" and computerChoice == "Paper":
  slowPrint("\nIt's a tie!")
  quit()
elif playerChoice == "Scissors" or playerChoice == "scissors" and computerChoice == "Scissors":
  slowPrint("\nIt's a tie!")
  quit()
elif playerChoice == "Rock" or playerChoice == "rock" and computerChoice == "Scissors":
    slowPrint("\nYou win! Rock breaks scissors!")
    
elif playerChoice == "Paper" or playerChoice == "paper" and computerChoice == "Rock":
    slowPrint("\nYou win! Paper covers rock!")
    
  
elif playerChoice == "Scissors" or playerChoice == "scissors" and computerChoice == "Rock":
    slowPrint("\nYou lose! Rock breaks scissors!")
    quit()
elif playerChoice == "Paper" or playerChoice == "paper" and computerChoice == "Scissors":
    slowPrint("\nYou lose! Scissors cut paper!")
    quit()
  
elif playerChoice == "Rock" or playerChoice == "rock" and computerChoice == "Paper":
    slowPrint("\nYou lose! Paper covers rock!")
    quit()
  
elif playerChoice == "Scissors" or playerChoice == "scissors" and computerChoice == "Paper":
    
  
  slowPrint("\nYou win!       Scissors cut paper!")

slowPrint("\nHmph! You get to live another day!")
slowPrint("\nTry")
slowPrint(".")
slowPrint(".")
slowPrint(".")
time.sleep(3)
print("\nSOME OF THIS!!!")
slowPrint("\nHa ha ha! You're in my hands now...")

  

#variables:
randomNum = round(100*(random.random()))

#main:
slowPrint("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nWELCOME TO THE RANDOM NUMBER GUESSING GAME!")
slowPrint("\nGuess the number between 1 and 100 within 5 tries to get a prize!\n")

#first guess:
firstGuess = int(input("\nWhat is your first guess?\n"))

distance1 = abs(randomNum-firstGuess)
if 0 < distance1 <= 10:
  slowPrint("Your guess is within 10 numbers\n")
elif 10 < distance1 <= 25:
  slowPrint("Your guess is within 25 numbers\n")
elif 25 < distance1 <= 50:
  slowPrint("Your guess is within 50 numbers\n")

if 100 >= firstGuess > randomNum:
  slowPrint("Too Big!\n")
elif 0 <= firstGuess < randomNum:
  slowPrint("Too Small!\n")
elif firstGuess == randomNum:
  slowPrint("You WON!")
  endingDialogue()
  quit()
else:
  slowPrint("?")
  
#2nd guess
secondGuess= int(input("What is your second guess?\n"))

distance2 = abs(randomNum-secondGuess)
if 0 < distance2 <= 10:
  slowPrint("Your guess is within 10 numbers")
elif 10 < distance2 <= 25:
  slowPrint("Your guess is within 25 numbers")
elif 25 < distance2 <= 50:
  slowPrint("Your guess is within 50 numbers")


if 100 >= secondGuess > randomNum:
  slowPrint("Too Big!\n") 
elif 0 <= secondGuess < randomNum:
  slowPrint("Too Small!\n")
elif secondGuess == randomNum:
  slowPrint("You WON!")
  endingDialogue()
else:
  slowPrint("?")


#3rd guess
thirdGuess= int(input("What is your third guess?\n"))

distance3 = abs(randomNum-thirdGuess)
if 0 < distance3 <= 10:
  slowPrint("Your guess is within 10 numbers")
elif 10 < distance3 <= 25:
  slowPrint("Your guess is within 25 numbers")
elif 25 < distance3 <= 50:
  slowPrint("Your guess is within 50 numbers")

if 100 >= thirdGuess > randomNum:
  slowPrint("Too Big!\n")
elif 0 <= thirdGuess < randomNum:
  slowPrint("Too Small!\n")
elif thirdGuess == randomNum:
  slowPrint("You WON!")
  endingDialogue()
else:
  slowPrint("?")

#4rth guess
fourthGuess= int(input("What is your fourth guess?\n"))

distance4 = abs(randomNum-fourthGuess)
if 0 < distance4 <= 10:
  slowPrint("Your guess is within 10 numbers")
elif 10 < distance4 <= 25:
  slowPrint("Your guess is within 25 numbers")
elif 25 < distance4 <= 50:
  slowPrint("Your guess is within 50 numbers")

if 100 >= fourthGuess > randomNum:
  slowPrint("Too Big!\n")
elif 0<= fourthGuess < randomNum:
  slowPrint("Too Small!\n")
elif fourthGuess == randomNum:
  slowPrint("You WON!")
  endingDialogue()
else: 
  slowPrint("?")

#5th guess
fifthGuess= int(input("What is your fifth guess?\n"))

if 100 >= fifthGuess > randomNum:
  slowPrint("You lost, but it was: " + str(randomNum))
  quit()
elif 0<= fifthGuess < randomNum:
  slowPrint("You lost, but it was: " + str(randomNum))
  quit()
elif fifthGuess == randomNum:
  slowPrint("You WON!")
  endingDialogue()
else:
  quit()