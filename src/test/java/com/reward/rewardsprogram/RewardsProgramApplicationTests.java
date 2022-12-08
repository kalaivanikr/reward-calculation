package com.reward.rewardsprogram;

import com.reward.rewardsprogram.controller.model.Transaction;
import com.reward.rewardsprogram.service.RewardService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RewardsProgramApplicationTests {

	@Autowired
	private RewardService rewardService;
	@Test
	void contextLoads() {
	}

	@Test
	public void testBelow100Amount(){
		Transaction transaction = new Transaction();
		transaction.setTransactionAmount(120);
		Transaction response = rewardService.calculateRewards(transaction);
		Assertions.assertEquals(90, response.getRewards());
	}
}
