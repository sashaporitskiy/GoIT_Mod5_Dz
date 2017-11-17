package Offline7;

import com.alibaba.fastjson.JSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String content = new Scanner(new File("D:/Курс GO_IT/GoIT_Mod5_Dz/text1.txt")).useDelimiter("\\Z").next();

       ClassA c1 = JSON.parseObject(content,ClassA.class);
        System.out.println(c1);
    }
}
