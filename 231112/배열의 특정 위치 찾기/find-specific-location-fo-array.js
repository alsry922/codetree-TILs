const fs = require('fs');
const arr = fs.readFileSync(0).toString().trim().split(' ').map(ele => Number.parseInt(ele));

let eventLength = 0
const evenOrderSum = arr.reduce((acc, curr, index) => {
    if (index % 2 === 1) {
        eventLength++;
        return acc + curr;
    }
    return acc;
}, 0);

let mulOfThreeLength = 0;
const mulOfThreeOrderSum = arr.reduce((acc, curr, index) => {
    if (index % 3 === 2) {
        mulOfThreeLength++;
        return acc + curr;
    }
    return acc;
}, 0);

console.log(evenOrderSum, (mulOfThreeOrderSum / mulOfThreeLength).toFixed(1));