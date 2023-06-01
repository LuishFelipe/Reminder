package com.challange.reminder.model.DTO;

import java.time.LocalDate;
import java.util.Date;

public record ReminderRequestDTO(String nameReminder, LocalDate dataReminder) {

}
