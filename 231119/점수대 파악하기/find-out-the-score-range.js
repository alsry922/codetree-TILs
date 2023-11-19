const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split(' ').map(ele => Number.parseInt(ele));
const zeroValIdx = input.findIndex(ele => ele === 0);
const scores = input.slice(0, zeroValIdx);
const countArr = new Array(11).fill(0);
scores.forEach(score => {
    countArr[Number.parseInt(score / 10)]++;
})
for (const [index, value] of [...countArr.entries()].reverse()) {
    if (index === 0) continue;
    console.log(`${index*10} - ${value}`);
}