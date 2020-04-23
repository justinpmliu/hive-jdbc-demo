package com.example.hivedemo.mapper.hive;

import com.example.hivedemo.model.Sample;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SampleMapper {
    List<Sample> findAll();
}
