package com.reward.rewardsprogram.service;

import com.reward.rewardsprogram.controller.model.Transaction;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RewardServiceTest {

    private RewardService rewardService;
    @BeforeEach
    void setUp() {
        rewardService = new RewardService();
    }

    @Test
    public void testBelow100Amount(){
        Transaction transaction = new Transaction();
        transaction.setTransactionAmount(120);
        Transaction response = rewardService.calculateRewards(transaction);
        Assertions.assertEquals(90, response.getRewards());
    }
    @AfterEach
    void tearDown() {
        rewardService = null;

    }
}