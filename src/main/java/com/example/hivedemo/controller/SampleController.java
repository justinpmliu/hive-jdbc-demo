package com.example.hivedemo.controller;

import com.example.hivedemo.mapper.SampleMapper;
import com.example.hivedemo.model.Sample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sample")
public class SampleController {
    @Autowired
    private SampleMapper sampleMapper;

    @GetMapping
    public List<Sample> getAll() {
        return sampleMapper.findAll();
    }
}
