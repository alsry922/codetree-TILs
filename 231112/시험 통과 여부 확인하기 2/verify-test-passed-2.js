const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');
const students = Number.parseInt(input[0]);
let scores = [];

for (let i = 1; i < input.length; i++) {
    
    scores.push(input[i].split(' ').map(ele => Number.parseInt(ele)));
}

let passCnt = 0;
scores.forEach(score => {
    const sum = score.reduce((acc, curr) => {
        return acc + curr;
    });
    const average = sum / score.length;
    if (average > 60) {
        passCnt++;
        console.log('pass');
    } else {
    console.log('fail');
    }
});

console.log(passCnt);