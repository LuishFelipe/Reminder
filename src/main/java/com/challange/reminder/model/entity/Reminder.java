package com.challange.reminder.model.entity;

import com.challange.reminder.model.DTO.ReminderRequestDTO;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Table(name = "reminder")
@Entity(name = "reminder")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "REMINDERS_SEQ", sequenceName = "REMINDERS_SEQ", allocationSize = 1)
public class Reminder {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REMINDERS_SEQ")
    private Long id;

    @Column(name = "nameReminder")
    private String nameReminder;

    @Column(name = "dateReminder")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataReminder;

    public Reminder(ReminderRequestDTO data){
        this.nameReminder = data.nameReminder();
        this.dataReminder = data.dataReminder();
    }
}

