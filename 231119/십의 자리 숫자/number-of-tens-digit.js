const fs = require('fs');
const arr = fs.readFileSync(0).toString().trim().split(' ').map(ele => Number.parseInt(ele));
let countArr = new Array(10).fill(0);

for (let i = 0; i < arr.length; i++) {
    if (arr[i] === 0) break;
    if (arr[i] < 10) continue;
    countArr[Number.parseInt((arr[i]/10))]++;
}

countArr.forEach((ele, index) => {
    if (index === 0) return;
    console.log(`${index} - ${ele}`);
})