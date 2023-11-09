const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');
const numOfSubject = Number.parseInt(input[0]);
const scores = input[1].split(' ').map(Number.parseFloat);
const sumOfScores = scores.reduce((acc, curr) => {
    return acc+curr;
})
const average = (sumOfScores / numOfSubject).toFixed(1);

console.log(average);

if (average >= 4.0) {
    console.log('Perfect');
} else if (average >= 3.0) {
    console.log('Good');
} else {
    console.log('Poor');
}