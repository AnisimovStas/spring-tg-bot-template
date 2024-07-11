package feral.telegram.todo_chat_bot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity(name = "adsTable")
@Data
@RequiredArgsConstructor
public class Ads {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String text;
}
