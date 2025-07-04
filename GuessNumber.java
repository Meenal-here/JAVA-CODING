#include<stdio.h>
struct first
{
   int id;
   char name[50];
   static int amount;
}
int main()
{
	int amm;
    struct first arr[10];
	printf("enter customer's details");
	int i;
	for(i=0;i<10;i++)
	{
		scanf("%d",&arr[i].id);
		scanf("%c",&arr[i].name);
		scanf("%d",&arr[i].amount);
	}
	int acc;
	printf("enter which account you want to manipulate");
	scanf("%d",&acc);
	for(i=0;i<10;i++)
	{
	  if(acc==arr[i])
	  {
		printf("what you want to do");
		int case;
		printf("enter 1. deposit money
					  2. withdraw money")
		scanf("%d",&case);
		line1:
		switch(case){
		case 1:
			{ printf("enter deposit amount");
			  scanf("%d",&amm);
			  arr[i].amount=arr[i].amount+amm;
			  break;
			}
		
		case 2:
			{ printf("enter withdraw amount");
			  scanf("%d",&amm);
			  arr[i].amount=arr[i].amount-amm;
			  break;
			}
		default:
		printf("enter valid choice");
		goto: line1;
		break;		
		}
	  }
	  
	}
	printf("updated accounts of customer are");
	for(i=0;i<10;i++){
	  printf("id of %d customer= %d\n",(i+1),arr[i].id);
	  printf("amonut=%d",arr[i].amonut);
	 }
	return 0;
}