class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        n = len(matrix)
        if n==0:
            return False
        m = len(matrix[0])
        l=0
        r=n*m-1
        while(l<=r):
            mid = l+(r-l)//2
            x=mid//m
            y=mid%m
            if matrix[x][y]==target:
                return True
            elif matrix[x][y]>target:
                r=mid-1
            else:
                l=mid+1
        return False