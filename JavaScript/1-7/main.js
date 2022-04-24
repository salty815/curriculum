
class Taiyaki {
    constructor(name) {
        this.name = name;
    }

    interAnswer() {
        console.log("中身は" + this.name + "です");
    }
}

let taiyaki01 = new Taiyaki("あんこ");
let taiyaki02 = new Taiyaki("クリーム");
let taiyaki03 = new Taiyaki("チーズ");

taiyaki01.interAnswer();
taiyaki02.interAnswer();
taiyaki03.interAnswer();