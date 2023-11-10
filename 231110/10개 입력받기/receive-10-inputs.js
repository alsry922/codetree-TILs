const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split(' ');
const arr = input.map(ele => Number.parseInt(ele));

let zeroValIdx = 0;
const scoresTillZero = [];
for (key in arr) {
    if (!(arr[key] <= 0 || zeroValIdx < Number(key))) {
            scoresTillZero.push(arr[key]);
            zeroValIdx++;
    }
}

const sum = scoresTillZero.reduce((acc, curr) => {
    return acc + curr;
})

const average = (sum / scoresTillZero.length).toFixed(1);

console.log(sum, average);