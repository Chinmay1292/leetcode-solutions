class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        n = len(matrix)
        m = len(matrix[0])

        for i in range(n):
            for j in range(i+1,m):
                temp = matrix[i][j]
                matrix[i][j]=matrix[j][i]
                matrix[j][i]=temp

        for i in range(n):
            l=0
            r=n-1
            while(l<r):
                temp = matrix[i][l]
                matrix[i][l]=matrix[i][r]
                matrix[i][r]=temp
                l=l+1
                r=r-1
            