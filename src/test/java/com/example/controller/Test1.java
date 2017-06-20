package com.example.controller;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/6/3 0003.
 */
public class Test1 {
    @Test
    public void main(String[] args){
        String[] strs ={"aa","bb","cc"};
        StringBuffer sb = new StringBuffer("(");
        for(String str:strs){
            sb.append("'"+str+"',");
        }
        sb.replace(sb.length()-1, sb.length(), ")");

        System.out.println(sb.toString());

        System.out.println(Arrays.toString("aa|".split("\\|")));
    }
}
