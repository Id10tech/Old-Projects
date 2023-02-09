#imports:
import random

#variables:
randomNum = round(100*(random.random()))

#main:
print("WELCOME TO THE RANDOM NUMBER GUESSING GAME!")
print("Guess the number between 1 and 100 within 5 tries to get a prize!\n")

#first guess:
firstGuess = int(input("What is your first guess?\n"))

distance1 = abs(randomNum-firstGuess)
if 0 < distance1 <= 10:
  print("Your guess is within 10 numbers")
elif 10 < distance1 <= 25:
  print("Your guess is within 25 numbers")
elif 25 < distance1 <= 50:
  print("Your guess is within 50 numbers")

if 100 >= firstGuess > randomNum:
  print("Too Big!\n")
elif 0 <= firstGuess < randomNum:
  print("Too Small!\n")
elif firstGuess == randomNum:
  print("You WON!")
  quit()
else:
  print("?")
  
#2nd guess
secondGuess= int(input("What is your second guess?\n"))

distance2 = abs(randomNum-secondGuess)
if 0 < distance2 <= 10:
  print("Your guess is within 10 numbers")
elif 10 < distance2 <= 25:
  print("Your guess is within 25 numbers")
elif 25 < distance2 <= 50:
  print("Your guess is within 50 numbers")


if 100 >= secondGuess > randomNum:
  print("Too Big!\n") 
elif 0 <= secondGuess < randomNum:
  print("Too Small!\n")
elif secondGuess == randomNum:
  print("You WON!")
  quit()
else:
  print("?")


#3rd guess
thirdGuess= int(input("What is your third guess?\n"))

distance3 = abs(randomNum-thirdGuess)
if 0 < distance3 <= 10:
  print("Your guess is within 10 numbers")
elif 10 < distance3 <= 25:
  print("Your guess is within 25 numbers")
elif 25 < distance3 <= 50:
  print("Your guess is within 50 numbers")

if 100 >= thirdGuess > randomNum:
  print("Too Big!\n")
elif 0 <= thirdGuess < randomNum:
  print("Too Small!\n")
elif thirdGuess == randomNum:
  print("You WON!")
  quit()
else:
  print("?")

#4rth guess
fourthGuess= int(input("What is your fourth guess?\n"))

distance4 = abs(randomNum-fourthGuess)
if 0 < distance4 <= 10:
  print("Your guess is within 10 numbers")
elif 10 < distance4 <= 25:
  print("Your guess is within 25 numbers")
elif 25 < distance4 <= 50:
  print("Your guess is within 50 numbers")

if 100 >= fourthGuess > randomNum:
  print("Too Big!\n")
elif 0<= fourthGuess < randomNum:
  print("Too Small!\n")
elif fourthGuess == randomNum:
  print("You WON!")
  quit()
else: 
  print("?")

#5th guess
fifthGuess= int(input("What is your fifth guess?\n"))

if 100 >= fifthGuess > randomNum:
  print("You lost, but it was: " + str(randomNum))
elif 0<= fifthGuess < randomNum:
  print("You lost, but it was: " + str(randomNum))
elif fifthGuess == randomNum:
  print("You WON!")