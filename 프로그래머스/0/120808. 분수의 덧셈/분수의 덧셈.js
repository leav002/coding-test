function solution(numer1, denom1, numer2, denom2) {
    let numer = numer1 * denom2 + numer2 * denom1;
    let denom = denom1 * denom2;
    
    let gcd = GCD(numer, denom);
    numer /= gcd;
    denom /= gcd;

    return [numer, denom];
}

let GCD = (num1, num2) => {
    while (num2 > 0) {
        let r = num1 % num2;
        num1 = num2;
        num2 = r;
    }
    return num1;
}
