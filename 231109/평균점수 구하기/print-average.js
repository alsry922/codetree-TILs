const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split(' ');
const scores = input.map(Number.parseFloat);
const sum = scores.reduce((acc, curr) => {
    return acc + curr;
});
const average = (sum / scores.length).toFixed(1);
console.log(average);