package com.smalldogg.cdctest.service;

import com.smalldogg.cdctest.model.AdClick;
import org.springframework.stereotype.Service;

@Service
public class AdClickService {
    public void putAdClick(AdClick adClick) {
        System.out.println(adClick);
    }
}
