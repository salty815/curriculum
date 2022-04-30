//①onchangeで使用されている関数の中身を実装してください。
function changeLang() {
    //select属性値の取得
    let lang = document.getElementById("lang").value;

    //属性値が日本語、英語、全て表示、それぞれの処理を記載
    if (lang === "日本語") {
        document.getElementById("jpn").style.display = 'block';
        document.getElementById("en").style.display = 'none';
    } else if (lang === "English") {
        document.getElementById("jpn").style.display = 'none';
        document.getElementById("en").style.display = 'block';
    } else if (lang === "全て表示") {
        document.getElementById("jpn").style.display = 'block';
        document.getElementById("en").style.display = 'block';
    }
}