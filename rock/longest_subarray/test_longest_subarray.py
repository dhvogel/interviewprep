import pytest
from longest_subarray import LongestSubarray

def test_basic_case():
    ls = LongestSubarray([1, 2, 3, 2, 4, 5])
    assert ls.findLongestSubarray() == 4

def test_all_unique():
    ls = LongestSubarray([1, 2, 3, 4])
    assert ls.findLongestSubarray() == 4

def test_all_duplicates():
    ls = LongestSubarray([1, 1, 1, 1])
    assert ls.findLongestSubarray() == 1

def test_empty_array():
    ls = LongestSubarray([])
    assert ls.findLongestSubarray() == 0
