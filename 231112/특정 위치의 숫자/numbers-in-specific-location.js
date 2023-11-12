const fs = require('fs');
const arr = fs.readFileSync(0).toString().trim().split(' ').map((ele) => Number.parseInt(ele));
let result = 0;
arr.forEach((ele, index) => {
    if (index === 2
    || index === 4
    || index === 9) {
        result += ele;
    }
});

console.log(result);