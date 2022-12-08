package com.reward.rewardsprogram.controller;

import com.reward.rewardsprogram.controller.model.Transaction;
import com.reward.rewardsprogram.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rewards")
public class RewardController {

    @Autowired
    private RewardService rewardService;

    @PostMapping("/calculation")
    public ResponseEntity<Transaction> calculateRewards(@RequestBody Transaction transaction){
        Transaction Response = rewardService.calculateRewards(transaction);
        return new ResponseEntity<>(Response, HttpStatus.OK);
    }
}
