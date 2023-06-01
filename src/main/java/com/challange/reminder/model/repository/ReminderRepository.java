package com.challange.reminder.model.repository;

import com.challange.reminder.model.entity.Reminder;
import org.springframework.data.repository.CrudRepository;

public interface ReminderRepository extends CrudRepository<Reminder, Long> {

}