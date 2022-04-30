//btnを取得
const btn = document.getElementById('btn');

// ボタンがクリックされたら、という処理の始まり
btn.addEventListener('click', function () {
    //①配列で「大吉」「中吉」「凶」を準備
    let results = ["大吉", "中吉", "凶"]

    //③取得した **btn** の「クリック」という文字を配列の中身の文字にランダムに変化させる
    btn.textContent = results[getRandomInt(3)];
}, false);

//②乱数を発生させて、その値を取得
function getRandomInt(max) {
    return Math.floor(Math.random() * max);
}