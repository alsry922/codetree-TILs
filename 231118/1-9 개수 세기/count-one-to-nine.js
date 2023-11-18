const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');
const n = Number.parseInt(input[0]);
const arr = input[1].split(' ').map(ele => Number.parseInt(ele));
const countArr = new Array(10).fill(0);

arr.forEach((ele, index) => {
    countArr[ele] += 1;
});

for (let i = 1; i < countArr.length; i++) {
    console.log(countArr[i]);
}