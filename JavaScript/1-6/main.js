
// 問1
let scores = [10, 15, 20, 25]
console.log(scores);

for (let scoresIndex = 0; scoresIndex < scores.length; scoresIndex++) {
    if (scores[scoresIndex] % 2 === 0) {
        console.log(scores[scoresIndex] + "は偶数です");
    }
}

// 問2
let car = {
    gass: 20.5,
    num: 1234,
};
console.log(car);

for (const property in car) {
    console.log(property + " : " + car[property]);
}

console.log("ガソリンは" + car["gass"] + "です");
console.log("ナンバーは" + car["num"] + "です");
