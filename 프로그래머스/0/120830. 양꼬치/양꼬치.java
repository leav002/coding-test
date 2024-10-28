class Solution {
    public int solution(int n, int k) {
        int yang = 12000;
        int yangc = n;
        int drink = 2000;

        int freeDrinks = n / 10;
        int drinkc = k - freeDrinks;
        
        return yang * yangc + drink * drinkc;
    }
}
