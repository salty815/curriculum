
// 問1
let numbers = [2, 5, 12, 13, 15, 18, 22];

//ここに答えを実装してください。↓↓↓
let num = 0;
for (let numIndex = 0; numIndex < numbers.length; numIndex++) {
    if (numbers[numIndex] % 2 === 0) {
        num = numbers[numIndex];
        isEven(num);
    }
}

function isEven(num) {
    console.log(num + 'は偶数です');
}

// 問2
class Car {
    constructor(gass, num) {
        this.gass = gass;
        this.num = num;
    }

    getNumGas() {
        console.log("ガソリンは" + this.gass + "です。ナンバーは" + this.num + "です")
    }
}

// let testCar = new Car("sekiyu", 1234);
// testCar.getNumGas();












