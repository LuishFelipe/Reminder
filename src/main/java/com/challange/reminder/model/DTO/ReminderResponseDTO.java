package com.challange.reminder.model.DTO;

import com.challange.reminder.model.entity.Reminder;

import java.time.LocalDate;

public record ReminderResponseDTO (Long id, String nameReminder, LocalDate dataReminder){
    public ReminderResponseDTO(Reminder reminder){
        this(reminder.getId(), reminder.getNameReminder(), reminder.getDataReminder());
    }
}
