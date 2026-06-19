function solution(s){
    var answer = true;
    let stack = [];
    
    for(let i =0; i < s.length; i ++) {
        if (s[i] === "(") {
            stack.push("(");
        }
        else {
            if(stack.length === 0) {
                return false;
            } else {
                stack.pop();
            }
        }

    }
            if(stack.length === 0) {
            return true;
        }
        else if(stack.length !== 0){
            return false;
        }

    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    console.log('Hello Javascript')

    return answer;
}