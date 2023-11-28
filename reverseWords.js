function reverseWords(sentence) {
  let words = sentence.split(' ');
  let reversedWords = [];

  for (let word of words) {
    let reversedWord = '';
    for (let i = word.length - 1; i >= 0; i--) {
      reversedWord += word[i];
    }
    reversedWords.push(reversedWord);
  }

  return reversedWords.join(' ');
}

const sentence = "This is a sunny day";
const reversedSentence = reverseWords(sentence);
console.log(reversedSentence); 
