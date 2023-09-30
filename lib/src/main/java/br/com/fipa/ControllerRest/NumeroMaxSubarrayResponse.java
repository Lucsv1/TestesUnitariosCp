package br.com.fipa.ControllerRest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.fiap.numerosUnicaVez.MaxSubarrayResponse;
import br.com.fiap.numerosUnicaVez.MaxSubarrayResquest;

public class NumeroMaxSubarrayResponse {
	
	@PostMapping("/max-subarray")
	public MaxSubarrayResponse maxSubArraySum(@RequestBody MaxSubarrayResquest request) {
	    int[] nums = request.getArray();
	    int maxSum = nums[0];
	    int currentSum = nums[0];

	    for (int i = 1; i < nums.length; i++) {
	        currentSum = Math.max(nums[i], currentSum + nums[i]);
	        maxSum = Math.max(maxSum, currentSum);
	    }

	    MaxSubarrayResponse response = new MaxSubarrayResponse();
	    response.setMaxSum(maxSum);
	    return response;
	}

}
