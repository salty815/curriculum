function addText() {
    //①入力欄のテキストを取得
    let tx1 = document.querySelector('#text1').value;

    //②出力欄のテキストエリアを取得
    let area1 = document.querySelector('#area1').value;

    //③出力欄に入力された文字列を足していく
    area1 += tx1 + "\n";
    document.querySelector('#area1').value = area1;
}

function deleteText() {
    //④出力欄のテキストを空にする
    document.querySelector('#area1').value = null;

    //⑤入力欄のテキストを空にする
    document.querySelector('#text1').value = null;
}