package com.example;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
@AllArgsConstructor
public class MyTelegramBot extends TelegramLongPollingBot {
    @Value("${telegram.bot.token}")
    private String token;
    @Override
    public void onUpdateReceived(Update update) {

    }
    @Override
    public String getBotToken() {
        return token;
    }
    @Override
    public String getBotUsername() {
        return "yukingniOl_bot";
    }
}
