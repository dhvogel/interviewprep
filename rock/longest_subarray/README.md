Write a function that takes a list of integers and returns the length of the longest contiguous subarray that contains only unique elements.

Function signature:

def longest_unique_subarray(nums: list[int]) -> int:
    pass


Example:

nums = [1, 2, 3, 2, 4, 5]
longest_unique_subarray(nums)  # Output: 4
# Explanation: The longest subarray with all unique elements is [3, 2, 4, 5]


Constraints:

1 <= len(nums) <= 10^5

0 <= nums[i] <= 10^9