package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateRandomList {
    public static List<String> getRandomElement(List<String> list, int totalItems)
    {
        Random rand = new Random();
        List<String> userList = list;
        List<String> newList = new ArrayList<>();

        for (int i = 0; i < totalItems; i++) {
            int randomIndex = rand.nextInt(userList.size());
            newList.add(userList.get(randomIndex));
            userList.remove(randomIndex);
        }

        return newList;
    }
}
