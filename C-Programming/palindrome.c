#include<stdio.h>
int main(){
int n,rem,rev=0,temp;
    temp=n;
    printf("enter the number");
    scanf("%d",&n);
        while(n!=0)
        {
            
           rem=n%10;
           rev=rev*10+rem;
           n=n/10;
        }
        if(temp==n){
            printf("Palindrome");
        }
        else{
            printf("not palindrome");
        }
    return 0;
}    
    