import random
answer = random.randint(0, 100)

# i = 3 
# while i > 0: 
#     user_guess = int(input("What is your guess? "), 10)
#     print(f'Remaining trials: {i}')

#     if user_guess == answer: 
#         print(f'Right! The answer is {user_guess}')
#         break
#     elif user_guess < answer:
#         print(f'Your guess of {user_guess} is too low!')

#     elif user_guess > answer:
#         print(f'Your guess of {user_guess} is to high!')
    
#     i -= 1

# def mySum(numbers: list[float], sum: float = 0) -> float:
#     for num in numbers:
#         sum += num
#     return sum

# print(f'Sum of ([1,2,3], 4) is {mySum([1,2,3], 4)}')

# def myAverage(numbers: list[float] ) -> float:
#     length: int = 0
#     for number in numbers:
#         length += 1
#     return mySum(numbers) / len(numbers)

# print(f'Average of ([1,2,3]) is {myAverage([1,2,3])}')

# def wordsLengthStatistics(words: list[str]) -> tuple[int, ...]:

#     return (
#         min(words), 
#         max(words), 
#         myAverage(words)
#     )

# print(f'Min, Max, Average: {wordsLengthStatistics(["a","aa","aaa"])}')

# d: int = 0
# h: int = input("Enter a hex number to convert to decimal: ")
# for power, digit in enumerate(reversed(h)):
#     d += int(digit, 16) * (16 ** power)
# print(d)

# for index, letter in enumerate(["a","b","c","d"]):
#     print(f"letter {letter} at index {index}")

# name: str = input("What is your name ? ")
# triangle: str = ""
# for letter in name:
#     triangle += letter
#     print(triangle)

word: str = input("Enter a word: ")
if word[0] in 'aeiou':
    print(f'{word}way')
else:
    print(f'{word[1:]+word[0]}ay')
