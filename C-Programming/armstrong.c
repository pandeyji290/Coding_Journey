#include<stdio.h>
int main(){
    int n,rem,sum=0,temp;
    temp=n;
    printf("enter the number");
    scanf("%d",&n);
        while(n!=0)
        {
            
           rem=n%10;
           sum=sum+rem*rem*rem;
           n=n/10;
        }
        if(temp==n){
            printf("armstrong");
        }
        else{
            printf("not armstrong");
        }
    return 0;
}    
    