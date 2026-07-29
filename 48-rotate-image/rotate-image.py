class Solution:
    def rotate(self, g: List[List[int]]) -> None:
        g[:] = zip(*g[::-1])