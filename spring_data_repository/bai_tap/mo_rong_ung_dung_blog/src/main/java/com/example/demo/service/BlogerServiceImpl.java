package com.example.demo.service;

import com.example.demo.entity.Bloger;
import com.example.demo.repository.BlogerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogerServiceImpl implements BlogerService {
    private BlogerRepository blogerRepository;

    @Autowired
    public BlogerServiceImpl(BlogerRepository blogerRepository) {
        this.blogerRepository = blogerRepository;
    }


    @Override
    public void create(Bloger bloger) {
        blogerRepository.save(bloger);

    }

    @Override
    public void update(Bloger bloger) {
        blogerRepository.save(bloger);

    }

    @Override
    public void delete(int id) {
        blogerRepository.deleteById(id);
    }


    @Override
    public List<Bloger> findAll() {
        return blogerRepository.findAll();
    }

    @Override
    public Bloger findById(int id) {
        return blogerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Bloger> getAllFiles() {
        return blogerRepository.findAll();
    }

    @Override
    public void saveAllFilesList(List<Bloger> fileList) {
        for (Bloger bloger : fileList)
            blogerRepository.save(bloger);
    }

}

