package com.example.demo.services;

import com.example.demo.models.Baby;
import com.example.demo.models.Feeding;
import com.example.demo.repositories.BabyRepository;
import com.example.demo.repositories.FeedingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class FeedingService {


    @Autowired
    private FeedingRepository feedingRepository;


    public List<Feeding> getAllFeeding() {
        return (List<Feeding>) feedingRepository.findAll();
    }
    public Feeding getFeedingById(Long feedingId) {
        return feedingRepository.findById(feedingId).get();
    }
    public void addFeeding(Feeding feeding) {
        feedingRepository.save(feeding);
    }
    public void removeFeeding(Feeding feeding) {
        feedingRepository.delete(feeding);
    }
    public void updateFeeding(Feeding feeding) {
        feedingRepository.save(feeding);
    }
    public static void getCurrentTime() {
        Date date = new Date();
        String stringDateFormat = "hh:mm:ss a";
        DateFormat dateFormat = new SimpleDateFormat(stringDateFormat);
        String formattedDate= dateFormat.format(date);
    }
    public static long getTimeDifference(Date date1, Date date2, TimeUnit timeUnit) {
        long differenceInMilliSec = date2.getTime() - date1.getTime();
        return timeUnit.convert(differenceInMilliSec,TimeUnit.MILLISECONDS);
    }


}
