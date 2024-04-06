package com.task.task.service;

import com.task.task.entity.HeadingEntity;

import java.util.List;

public interface HeadingService {

    List<HeadingEntity>findAll();

    HeadingEntity save(HeadingEntity headingEntity);

    HeadingEntity update(HeadingEntity headingEntity);

    void delete(Long id);


}
