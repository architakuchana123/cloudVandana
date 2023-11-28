function descendingSort(array) {
  for (let i = 0; i < array.length - 1; i++) {
    for (let j = i + 1; j < array.length; j++) {
      if (array[i] < array[j]) {
        [array[i], array[j]] = [array[j], array[i]];
      }
    }
  }

  return array;
}

const array = [5, 2, 4, 1, 3];
const sortedArray = descendingSort(array);
console.log(sortedArray); 
