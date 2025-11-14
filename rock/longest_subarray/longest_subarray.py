

class LongestSubarray:

    def __init__(self, array:list[int]):
        self.array = array

    def findLongestSubarray(self):
        left = 0
        longestLength = 0
        unique_dict = {}  # stores last index of each element

        for right, value in enumerate(self.array):
            if value in unique_dict and unique_dict[value] >= left:
                left = unique_dict[value] + 1
            unique_dict[value] = right
            longestLength = max(longestLength, right - left + 1)

        return longestLength

    
if __name__ == "__main__":
    ls = LongestSubarray([1, 2, 3, 2, 4, 5])
    print("Longest subarray: " + str(ls.findLongestSubarray()))