console.log("===============Hello, JavaScript========")
function foo() {
    var num = 0;
    return function() {
        return num++
    }
}
const bar = foo();
console.log("num="+bar());
console.log("num="+bar());
