const fs = require('fs');
const nums = fs.readFileSync(0).toString().trim().split(' ').map(ele => Number.parseInt(ele));
let countArr = new Array(7).fill(0);
nums.forEach((ele) => {
    countArr[ele] += 1;
})
countArr.forEach((ele, index) => {
    if (index === 0) return;
    console.log(`${index} - ${ele}`);
})