package com.smalldogg.cdctest.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AdClick {
    private int os;
    private int app;
    private String ip;
    private LocalDateTime click_time;
    private int device;
    private int channel;
    private LocalDateTime attributed_time;
    private int is_attributed;
}
