package iTest;

import com.example.focaap.task;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class taskTest {

    public taskTest(){

    }

    @BeforeAll
    public void ss(){

    }
    @AfterAll
    public void ss2(){

    }


    @Test
    public void twoSum() {
        System.out.println("add");
        int[] nums = {4,54};
        int target = 58;
        task takss = new task();
        takss.twoSum(nums,target);
        assertEquals(nums[takss.twoSum(nums,target)[0]] + nums[takss.twoSum(nums,target)[1]],target);

    }
}