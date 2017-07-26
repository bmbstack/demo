import Foundation

print("===========Hello, Swift==========")
func foo() -> (() -> Int) {
    var num:Int = 0
    return { () -> Int in
        num += 1
        return num
    }
}
let bar = foo()
print("num=\(bar())")
print("num=\(bar())")
