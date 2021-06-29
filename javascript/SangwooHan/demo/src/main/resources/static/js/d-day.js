//오늘 날자 정보
var now = new Date();
// 처음 만난 날자 정보
var firstDay = new Date("2008-10-23");
//오늘날자 정보를 컴퓨터가 계산하는 숫자 정보로 교환 (정확하겐 ms 단위로 바꿈)
var toNow = now.getTime();
// 처음 만난 날자를 컴퓨터가 계산하는 숫자 정보로 변환
var toFirst = firstDay.getTime();
//오늘날자 - 첫만남
var passedTime = toNow - toFirst;
// 다시 날짜로 변환
var passedDay = Math.round(passedTime / (24* 60 * 60 * 1000));
//Math.round는 반올림.
document.querySelector('#accent').innerText = passedDay + "일";


calcDate(100);
calcDate(200);
calcDate(365);
calcDate(500);

function calcDate (days) {
   var future = toFirst + days * (24* 60 * 60 * 1000);
   var someday = new Date(future);

   var year = someday.getFullYear();
   var month = someday.getMonth() +1;
   var date = someday.getDate();

    document.querySelector("#date" + days).innerText =
    year + "년" + month + "월" + date + "일";
}
