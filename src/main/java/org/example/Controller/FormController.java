package org.example.Controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.Dto.Form;
import org.example.Service.FormService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/form")
@RequiredArgsConstructor
@Slf4j
public class FormController {

    final FormService service;

    @PostMapping("/save-form")
    public void saveForm(@RequestBody Form form){

        log.info(form.toString());
        service.formSave(form);

    }
}
