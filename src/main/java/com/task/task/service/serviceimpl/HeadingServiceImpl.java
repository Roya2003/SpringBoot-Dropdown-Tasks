package com.task.task.service.serviceimpl;

import com.task.task.entity.HeadingEntity;
import com.task.task.repository.HeadingRepo;
import com.task.task.service.HeadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeadingServiceImpl implements HeadingService {

    @Autowired
    private HeadingRepo headingRepo;

    @Override
    public List<HeadingEntity> findAll() {
        return headingRepo.findAll();
    }

    @Override
    public HeadingEntity save(HeadingEntity headingEntity) {
        return headingRepo.save(headingEntity);
    }

    @Override
    public HeadingEntity update(HeadingEntity headingEntity) {
        return headingRepo.save(headingEntity);
    }

    @Override
    public void delete(Long id) {
        headingRepo.deleteById(id);

    }
}
