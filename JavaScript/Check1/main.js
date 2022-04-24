
// 問1
let numbers = [2, 5, 12, 13, 15, 18, 22];
//ここに答えを実装してください。↓↓↓
for (const numIndex = 0; numIndex < numbers.length; numIndex++) {
    if (numbers[numIndex] % 2 === 0) {
        let num = numbers[numIndex];
        isEven();
    }
}

function isEven() {
    console.log(num + 'は偶数です');
}