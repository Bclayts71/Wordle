# Android Project 1 - *Name of App Here*

Submitted by: Brendan Clayton

Wordle is an android app that recreates a simple version of the popular word game [Wordle](https://www.nytimes.com/games/wordle/index.html). 

Time spent: **6** hours spent in total

## Required Features

The following **required** functionality is completed:

- [x] **User has 3 chances to guess a random 4 letter word**
- [x] **After 3 guesses, user should no longer be able to submit another guess**
- [x] **After each guess, user sees the "correctness" of the guess**
- [x] **After all guesses are taken, user can see the target word displayed**

The following **optional** features are implemented:

- [ ] User can toggle betweeen different word lists
- [ ] User can see the 'correctness' of their guess through colors on the word 
- [ ] User sees a visual change after guessing the correct word
- [x] User can tap a 'Reset' button to get a new word and clear previous guesses
- [ ] User will get an error message if they input an invalid guess
- [ ] User can see a 'streak' record of how many words they've guessed correctly.

The following **additional** features are implemented:

* [ ] List anything else that you can get done to improve the app functionality!

## Video Walkthrough

Here's a walkthrough of implemented user stories:

![Project1](https://user-images.githubusercontent.com/69495267/215628974-4a791ce6-a400-43c9-8f78-b9ebc0f14c14.gif)

GIF created with ...  

[ScreenToGif](https://www.screentogif.com/) for Windows

## Notes

Two of the challenges I encountered with this app were getting the keyboard to vanish and getting the app to reset. To solve the keyboard problem, I found
a solution where I hide the keyboard from the window after every button press. For the other issue regarding the app reseting, I found a method called finish()
and a method called startActivity() that I used to reset the app after every game.

## License

    Copyright [yyyy] [name of copyright owner]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
