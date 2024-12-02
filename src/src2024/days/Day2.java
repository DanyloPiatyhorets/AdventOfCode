package adventofcode.src2024.days;

import adventofcode.src2024.util.containers.*;
import adventofcode.src2024.util.readers.*;


import java.util.List;

public class Day2 implements Day {
    Container2 container = new Reader2().read("src/src2024/inputSource/day2.txt");
    List<List<Integer>> list = container.getList();
    @Override
    public long firstPuzzle() {
        long result = 0;
        List<Integer> level;
        for(int i = 0; i < list.size(); i++){
            level = list.get(i);
            int trend = level.get(level.size() -1) - level.get(0);
            boolean safe = true;

            if(trend == 0){
                continue;
            }
            for(int j = 1; j < level.size(); j++){
                safe = safe && isValid(level, j, trend);
            }
            if(safe) result++;
        }
        return result;
    }

    @Override
    public long secondPuzzle() {
        long result = 0;
        List<Integer> level;
        for(int i = 0; i < list.size(); i++){
            level = list.get(i);
            int trend = level.get(level.size()-1) - level.get(0);
            boolean safe = true;
            if(trend == 0){
                continue;
            }
            boolean foundBadNumber = false;
            for(int j = 1; j < level.size(); j++){
                safe = safe && isValid(level, j, trend);
                if(!safe && !foundBadNumber){
                    if(j == level.size()-1){
                        safe = true;
                    } else{
                        foundBadNumber = true;
                        level.remove(j);
                        safe = isValid(level, j, trend);
                    }
                }
            }
            if(safe) result++;
        }
        return result;
    }

    private static boolean isValid(List<Integer> level, int j, int trend){
        boolean safe = true;
        int dif = level.get(j) - level.get(j-1);
        if(dif == 0) safe = false;
        if(trend > 0){
            if(!(dif > 0 && dif <= 3)){
                safe = false;
            }
        }
        if(trend < 0){
            if(!(dif < 0 && dif >= -3)){
                safe = false;
            }
        }
        return safe;
    }
}
