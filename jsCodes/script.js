console.log('js works');
// // alert("I am an alert box!");
// let x = 3;
// if(x < 0){
//   alert("negative");
// }else{
//   alert("positive");
// }

// //confirm
// c = confirm("do you wanna continue");
// if(c){
//   alert("welcome");
// }else{
//   alert("thank you");
// }

// -----prompt
// p = prompt("enter your name","spidy");
// if(p == "spidy"){
//   alert("welcome spidy");
// }else{
//   alert("welcome new user");
// }


var a = 10;
console.log(typeof(a));
console.log(a);
a = 'hi';
console.log(a);
console.log(typeof(a));
const data ='hello';
console.log(typeof(data));
// data = 10;

//let vs var diff
// for (let i = 1; i < 6; i++) {
// //
//   }
// console.log("value of i "+i);

// for (var j = 1; j < 6; j++) {
//     //
//       }
//     console.log("value of j "+j);

// --------------ARRAYS

let flavours =['choc','strawberry','vannilla','pista'];
console.log(flavours[2]);//vanilla
console.log(flavours[3]);//pista
flavours[5] ='butterscotch';
console.log(flavours);
console.log(flavours[5]);//butterscotch
flavours[5] ='black current';
console.log(flavours[5]);//blackcurrent

//diff between == and ===

console.log(2 == "2");  //true value 
console.log(2 === "2"); //false value, type

for (let ice = 0; ice < flavours.length; ice++) {
console.log(flavours[ice]);
  }

function addition(n){
    console.log("addition function");
    return n+n;
}

var output = addition(5);
console.log("output of adition is:" +output);

function buttonFunction(){
  // alert("button is clicked");
 var result =  document.getElementById("id_1").value;
 document.getElementById("id_2").value= result;
}
