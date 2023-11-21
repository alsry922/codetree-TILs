const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n')
const [n, q] = input[0].split(' ').map(ele => Number.parseInt(ele));
const arr = input[1].split(' ').map(ele => Number.parseInt(ele));
for (let i = 2; i < input.length; i++) {
    const query = input[i].split(' ').map(ele => Number.parseInt(ele));
    const qType = query[0];
    if (qType === 1) {
        const order = query[1];
        handleQueryTypeOne(arr, order);
    } else if(qType === 2) {
        const target = query[1];
        handleQueryTypeTwo(arr, target);
    } else if (qType === 3) {
        const from = query[1];
        const to = query[2];
        handleQueryTypeThree(arr, from, to);
    }
}

function handleQueryTypeOne(arr, order) {
    console.log(arr[order-1]);
}

function handleQueryTypeTwo(arr, target) {
    const index = arr.findIndex(ele => ele === target);
    console.log(index === -1 ? 0 : index+1);
}

function handleQueryTypeThree(arr, from, to) {
    console.log(arr.slice(from-1, to).join(' '));
}