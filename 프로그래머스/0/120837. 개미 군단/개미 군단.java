class Solution {
    public int solution(int hp) {
        int gen = 0;
        int roy = 0;
        int nor = 0;
        
        while(hp > 0) {
            if(hp >= 5) {
                gen += hp / 5;
                hp = hp % 5;
            } else if(hp >= 3) {
                roy += hp / 3;
                hp = hp % 3;
            } else {
                nor += hp;
                hp = 0;
            }
        }
        return gen + roy + nor; 
    }
}
