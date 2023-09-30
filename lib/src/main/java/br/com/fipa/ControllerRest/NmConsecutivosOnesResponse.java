package br.com.fipa.ControllerRest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.fiap.numeroConsecutivos.MaxConsecutiveOnesRequest;
import br.com.fiap.numeroConsecutivos.MaxConsecutiveOnesResponse;

public class NmConsecutivosOnesResponse {
	
	@PostMapping("/max-consecutive-ones")
	public MaxConsecutiveOnesResponse findMaxConsecutiveOnes(@RequestBody MaxConsecutiveOnesRequest request) {
	    int[] nums = request.getNums();
	    int maxConsecutiveOnes = 0;
	    int currentConsecutiveOnes = 0;

	    for (int num : nums) {
	        if (num == 1) {
	            currentConsecutiveOnes++;
	            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveOnes);
	        } else {
	            currentConsecutiveOnes = 0;
	        }
	    }

	    MaxConsecutiveOnesResponse response = new MaxConsecutiveOnesResponse();
	    response.setMaxConsecutiveOnes(maxConsecutiveOnes);
	    return response;
	}

}
