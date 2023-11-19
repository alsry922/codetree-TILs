const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');
const countArr = new Array(4).fill(0);
input.forEach(ele => {
    const [symptom, temper] = ele.split(' ').map(ele => {
        if (isNaN(ele)) {
           return ele;
        }
        return Number.parseInt(ele);
    });
    let typeNum = 0;
    if (symptom == 'Y' && temper >= 37) {
        typeNum = 0;
    } else if (symptom == 'N' && temper >= 37) {
        typeNum = 1;
    } else if (symptom == 'Y' && temper < 37) {
        typeNum = 2;
    } else {
        typeNum = 3;
    }
    countArr[typeNum]++;
});

let answer = countArr.join(' ');
if (countArr[0] >= 2) {
    console.log(answer + ' E');
} else {
    console.log(answer);
}