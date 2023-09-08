package com.practice.problems;


import java.util.Scanner;

class MIISolution {
    public int numberOfMatches(int n) {
        int matches_played = 0;
        while(n!=1){
            if(n%2==0){
                n = n/2;
                matches_played += n;
            }
            else{
                n = (n-1)/2;
                n += 1;
                matches_played += n - 1;
            }
        }
        return matches_played;
    }
}

public class MatchesInTournament {
    public static void main(String[] args){

        MIISolution kumaravel = new MIISolution();

        System.out.println("print number of matches");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = kumaravel.numberOfMatches(n);

        System.out.println(result);

    }
}