package com.codegym.service.impl;

import com.codegym.service.ITranslateService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class TranslateServiceImpl implements ITranslateService {
    public String translateToEnglish(String keyword) {
        Map<String, String> keywordMap = new HashMap<>();
        keywordMap.put("hello", "Xin chào");
        keywordMap.put("goodbye", "Bái bai");
        String result;
        result = keywordMap.get(keyword.toLowerCase());
        if (result == null) {
            return "Can not find your word";
        }
        return result;
    }
}
