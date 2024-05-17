package org.example.Service.Impl;

import lombok.RequiredArgsConstructor;
import org.example.Dto.Form;
import org.example.Entity.FormEntity;
import org.example.Repository.FormRepository;
import org.example.Service.FormService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class FormServiceImpl implements FormService {

   final FormRepository repository;
   final ModelMapper mapper;

    @Override
    public void formSave(Form form) {

        repository.save(mapper.map(form, FormEntity.class));
    }
}
