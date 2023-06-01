package com.challange.reminder.model.service;

import com.challange.reminder.model.entity.Reminder;
import com.challange.reminder.model.repository.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReminderService {

    @Autowired
    private ReminderRepository reminderRepository;
    public List<Reminder> getAllReminders(){
        Iterable<Reminder> allReminderIterable = this.reminderRepository.findAll();
        return Streamable.of(allReminderIterable).toList();
    }

    public void save(Reminder reminder){
        reminderRepository.save(reminder);
        return;
    }

    public void delete(Long id){
        reminderRepository.deleteById(id);
        return;
    }
}
