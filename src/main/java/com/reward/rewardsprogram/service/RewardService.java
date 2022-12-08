package com.reward.rewardsprogram.service;

import com.reward.rewardsprogram.controller.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class RewardService {

    public Transaction calculateRewards(Transaction transaction){
        if(Objects.nonNull(transaction)){
            int totalRewards = 0;
            double transactionAmount = transaction.getTransactionAmount();
            // Below if condition checks the transaction amount exist in between 50 and 100.
            // if it is existed in 50-100, considering reward point is 1.
            if(transactionAmount >= 50){
                if(transactionAmount<=100){
                    totalRewards = Double.valueOf(transactionAmount - 50).intValue();
                }
                // Below if condition checks the transaction amount is more than 100.
                // for each dolor above 100 we are adding two reward points.
                if(transactionAmount > 100){
                    totalRewards+= ((transactionAmount - 100) * 2);
                    totalRewards+=50;
                }

            }
        transaction.setRewards(totalRewards);
        }
        return  transaction;
    }
}
