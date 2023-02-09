#imports
import time
import sys
import random

#functions

def slowPrint(str):
   for c in str + '\n':
     sys.stdout.write(c)
     sys.stdout.flush()
     time.sleep(3./60)


#main
slowPrint("Welcome to Rock, Paper, Scissors!\n")

choices = ["Rock", "Paper", "Scissors"]
computerChoice = random.choice(choices)

playerChoice = str(input("Rock, Paper, or Scissors?\n\n"))

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

elif playerChoice == "Paper" or playerChoice == "paper" and computerChoice == "Paper":
  slowPrint("\nIt's a tie!")

elif playerChoice == "Scissors" or playerChoice == "scissors" and computerChoice == "Scissors":
  slowPrint("\nIt's a tie!")

elif playerChoice == "Rock" or playerChoice == "rock" and computerChoice == "Scissors":
    slowPrint("\nYou win! Rock breaks scissors!")
  
elif playerChoice == "Paper" or playerChoice == "paper" and computerChoice == "Rock":
    slowPrint("\nYou win! Paper covers rock!")
  
elif playerChoice == "Scissors" or playerChoice == "scissors" and computerChoice == "Paper":
    slowPrint("\nYou win! Scissors cut paper!")
  
elif playerChoice == "Scissors" or playerChoice == "scissors" and computerChoice == "Rock":
    slowPrint("\nYou lose! Rock breaks scissors! " + computerChoice)
  
elif playerChoice == "Paper" or playerChoice == "paper" and computerChoice == "Scissors":
    slowPrint("\nYou lose! Scissors cut paper!")
  
elif playerChoice == "Rock" or playerChoice == "rock" and computerChoice == "Paper":
    slowPrint("\nYou lose! Paper covers rock!")