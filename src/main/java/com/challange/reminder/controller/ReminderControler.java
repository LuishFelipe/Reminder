package com.challange.reminder.controller;

import com.challange.reminder.model.DTO.ReminderRequestDTO;
import com.challange.reminder.model.DTO.ReminderResponseDTO;
import com.challange.reminder.model.entity.Reminder;
import com.challange.reminder.model.service.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reminders")
public class ReminderControler {
    @Autowired
    private ReminderService reminderService;
    @GetMapping
    public List<ReminderResponseDTO> getAll(){

        List<ReminderResponseDTO> reminderList = reminderService.getAllReminders().stream().map(ReminderResponseDTO::new).toList();
        return reminderList;
    }

    @PostMapping
    public void createReminder(@RequestBody ReminderRequestDTO data){
        Reminder reminderData = new Reminder(data);
        reminderService.save(reminderData);
        return;
    }

    @DeleteMapping("/{id}")
    public void deleteReminder(@PathVariable("id") Long id){
        reminderService.delete(id);
        return;
    }
}
