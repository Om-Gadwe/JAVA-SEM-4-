#include <stdio.h>
int main() {
    int n;
    printf("Enter matrix dimension in form (nxn) form: ");
    scanf("%d", &n);
    int top = 0;
    int bottom = n-1;
    int right = n-1;
    int left = 0;
    int arr[n][n];
    int num = 1;
    while (top <= bottom && left <= right){
        for (int i=left ; i<= right ; i++ ){
            arr[top][i] = num;
            num = num + 1;
        }
        top++;
        for (int i=top ; i<= bottom ; i++ ){
            arr[i][bottom] = num;
            num = num + 1;
        }
        right--;
        for (int i=right ; i>= left ; i-- ){
            arr[bottom][i] = num;
            num = num + 1;
        }
        bottom--;
        for (int i=bottom ; i>= top ; i-- ){
            arr[i][left] = num;
            num = num + 1;
        }
        left--;
    }
    return 0;
}