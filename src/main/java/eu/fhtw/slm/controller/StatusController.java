package eu.fhtw.slm.controller;

import eu.fhtw.slm.service.StatusService;
import org.springframework.web.bind.annotation.*;

@RestController
public class StatusController {

    private final StatusService statusService;

    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("circleArea")
    public double getMessageCircle() {
        return statusService.getMessageCircle();
    }

    @GetMapping("squareArea")
    public double getSquareCircle() {
        return statusService.getMessageSquare();
    }

    @PutMapping("circleVal")
    public void setMessagecircleVal(@RequestParam double circleVal) {
        statusService.setMessageInch(circleVal);
    }

    @PutMapping("squareVal")
    public void setMessageSquareVal(@RequestParam double squareVal) {
        statusService.setMessageInch(squareVal);
    }
}
