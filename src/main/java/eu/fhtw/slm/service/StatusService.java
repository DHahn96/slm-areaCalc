package eu.fhtw.slm.service;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

@Service
public class StatusService {

    @Nullable
    private double messageCircleArea = 0.00;
    private double messageSquareArea = 0.00;

    @Nullable
    public double getMessageCircle() {
        return messageCircleArea;
    }

    public double getMessageSquare() {
        return messageSquareArea;
    }

    public void setMessagecircleVal(@Nullable double message) {
        this.messageCircleArea = message*3.1415;
    }

    public void setMessageSquareVal(@Nullable double message) {
        this.messageSquareArea = message*message;
    }
}
