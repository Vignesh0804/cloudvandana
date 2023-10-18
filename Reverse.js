function rev(str) {
    let str1=str.split("").reverse().join("");
    let str2=str1.split(" ").reverse().join(" ");
    console.log(str2);
}

var str=(prompt("Enter String to reverse :  "));
rev(str);

