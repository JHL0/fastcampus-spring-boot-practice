package com.fastcampus.springbootpractice.logic;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Sort <T extends Comparable<T>>{
    List<T> sort(List<T> list);
}
