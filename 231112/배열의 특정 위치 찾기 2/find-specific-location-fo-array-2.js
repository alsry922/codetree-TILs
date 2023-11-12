const fs = require('fs');
const arr = fs.readFileSync(0).toString().trim().split(' ').map(ele => Number.parseInt(ele));
let evenNumSum = 0;
let oddNumSum = 0;

arr.forEach((ele, index) => {
    if ((index+1) % 2 === 0) {
        evenNumSum += ele;
    } else {
        oddNumSum += ele;
    }
});

if (evenNumSum > oddNumSum) {
    console.log(evenNumSum - oddNumSum);
} else {
    console.log(oddNumSum - evenNumSum);
}