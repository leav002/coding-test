function solution(s) {
    var answer = '';
    let narr = s.split(" ");
    let mi = Math.min(...narr);
    let ma = Math.max(...narr);
    answer= mi + " " + ma;
    return answer;
}