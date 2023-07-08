package Implimentations;
import java.util.*;
public class Snake_and_Ladder_Game                                                            //dis advantges are given below
{
	static Scanner sc=new Scanner(System.in);                                        //before same elements visible again
	static int top=-1, top1=-1, top2=-1, top3=-1, top4=-1;                           //if one element is in first place , the other elemnt is came to same as first place . then the first element is replacd by second elemnt
	static int snake1=16-1, snake2=26-1, snake3=34-1, snake4=43-1, snake5=50-1;      //visual space problem
	static int tail1=8-1,tail2=11-1, tail3=22-1, tail4=29-1, tail5=1-1;
	static int laddown1=6-1,laddown2=9-1,laddown3=15-1, laddown4=24-1,laddown5=11-1;
	static int ladup1=25-1, ladup2=30-1, ladup3=33-1, ladup4=43-1, ladup5=49-1;
	static int dies1=0, dies2=0, dies3=0, dies4=0;
	static int cube1=0, cube2=0, cube3=0, cube4=0;
	static char person1='A', person2='B', person3='C', person4='D';
	static char stack[]=new char[51];
	public static void main(String [] args)
	{
		int choice;
		do
		{
			System.out.println();
			System.out.println();
			System.out.println("Roll the Dies");
			System.out.println(" 1.Person A\n 2.Person B\n 3.Person C\n 4.Person D\n 5.Exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1: Person_1(stack);
			break;
			case 2: Person_2(stack);
			break;
			case 3: Person_3(stack);
			break;
			case 4: Person_4(stack);
			break;
			case 5: System.out.println("--------GAME OVER--------");
			        System.exit(0);
			break;
			default: System.out.println("Invalid Input......!!!");
			}
		}
		while(choice!=0);
	}
	public static void Person_1(char[] stack)
	{
		Dies1();
		Push1(stack);
		Display(stack);
	}
	public static void Person_2(char stack[])
	{
		Dies2();
		Push2(stack);
		Display(stack);
	}
	public static void Person_3(char stack[])
	{
		Dies3();
		Push3(stack);
		Display(stack);
	}
	public static void Person_4(char stack[])
	{
		Dies4();
		Push4(stack);
		Display(stack);
	}
	public static void Dies1()
	{
		int min=1;
		int max=6;
		cube1=(int)(Math.random()*(max-min+1)+min);
		System.out.println("Dies = "+ cube1);
		System.out.println();
	}
	public static void Dies2()
	{
		int min=1;
		int max=6;
		cube2=(int)(Math.random()*(max-min+1)+min);
		System.out.println("Dies = "+ cube2);
		System.out.println();
	}
	public static void Dies3()
	{
		int min=1;
		int max=6;
		cube3=(int)(Math.random()*(max-min+1)+min);
		System.out.println("Dies = "+ cube3);
		System.out.println();
	}
	public static void Dies4()
	{
		int min=1;
		int max=6;
		cube4=(int)(Math.random()*(max-min+1)+min);
		System.out.println("Dies = "+ cube4);
		System.out.println();
	}
	public static void Push1(char stack[]) 
	{
		dies1=dies1+cube1;
		if(top1>=stack.length-1)
		{
			System.out.println("The Stack is in Over Flow");
			System.out.println("There is no space in the stack to insert the Data");
			System.out.println();
		}
		else
		{
			while(top1<dies1-1)
			{
				top1++;
			}
			stack[top1]=person1;
			//////
			if(top1==snake1)
			{
				while(top1>=tail1)
				{
					top1--;
				}
				stack[top1]=person1;
			}
			else if(top1==snake2)
			{
				while(top1>=tail2)
				{
					top1--;
				}
				stack[top1]=person1;
			}
			else if(top1==snake3)
			{
				while(top1>=tail3)
				{
					top1--;
				}
				stack[top1]=person1;
			}
			else if(top1==snake4)
			{
				while(top1>=tail4)
				{
					top1--;
				}
				stack[top1]=person1;
			}
			else if(top1==snake5)
			{
				while(top1>=tail5)
				{
					top1--;
				}
				stack[top1]=person1;
			}
		//////
					if(top1==laddown1)
					{
						while(top1<=ladup1)
						{
							top1++;
						}
						stack[top1]=person1;
					}
					else if(top1==laddown2)
					{
						while(top1<=ladup2)
						{
							top1++;
						}
						stack[top1]=person1;
					}
					else if(top1==laddown3)
					{
						while(top1<=ladup3)
						{
							top1++;
						}
						stack[top1]=person1;
					}
					else if(top1==laddown4)
					{
						while(top1<=ladup4)
						{
							top1++;
						}
						stack[top1]=person1;
					}
					else if(top1==laddown5)
					{
						while(top1<=ladup5)
						{
							top1++;
						}
						stack[top1]=person1;
					}
		}
	}
	public static void Push2(char stack[]) 
	{
		dies2=dies2+cube2;
		if(top2>=stack.length-1)
		{
			System.out.println("The Stack is in Over Flow");
			System.out.println("There is no space in the stack to insert the Data");
			System.out.println();
		}
		else
		{
			while(top2<dies2-1)
			{
				top2++;
			}
			stack[top2]=person2;
			if(top2==snake1)
			{
				while(top2>=tail1)
				{
					top2--;
				}
				stack[top2]=person2;
			}
			else if(top2==snake2)
			{
				while(top2>=tail2)
				{
					top2--;
				}
				stack[top2]=person2;
			}
			else if(top2==snake3)
			{
				while(top2>=tail3)
				{
					top2--;
				}
				stack[top2]=person2;
			}
			else if(top2==snake4)
			{
				while(top2>=tail4)
				{
					top2--;
				}
				stack[top2]=person2;
			}
			else if(top2==snake5)
			{
				while(top2>=tail5)
				{
					top2--;
				}
				stack[top2]=person2;
			}
		//////
			if(top2==laddown1)
			{
				while(top2<=ladup1)
				{
					top2++;
				}
				stack[top2]=person2;
			}
			else if(top2==laddown2)
			{
				while(top2<=ladup2)
				{
					top2++;
				}
				stack[top2]=person2;
			}
			else if(top2==laddown3)
			{
				while(top2<=ladup3)
				{
					top2++;
				}
				stack[top2]=person2;
			}
			else if(top2==laddown4)
			{
				while(top2<=ladup4)
				{
					top2++;
				}
				stack[top2]=person2;
			}
			else if(top2==laddown5)
			{
				while(top2<=ladup5)
				{
					top2++;
				}
				stack[top2]=person2;
			}
		}
	}
	public static void Push3(char stack[]) 
	{
		dies3=dies3+cube3;
		if(top3>=stack.length-1)
		{
			System.out.println("The Stack is in Over Flow");
			System.out.println("There is no space in the stack to insert the Data");
			System.out.println();
		}
		else
		{
			while(top3<dies3-1)
			{
				top3++;
			}
			stack[top3]=person3;
		}
		if(top3==snake1)
		{
			while(top3>=tail1)
			{
				top3--;
			}
			stack[top3]=person3;
		}
		else if(top3==snake2)
		{
			while(top3>=tail2)
			{
				top3--;
			}
			stack[top3]=person3;
		}
		else if(top3==snake3)
		{
			while(top3>=tail3)
			{
				top3--;
			}
			stack[top3]=person3;
		}
		else if(top3==snake4)
		{
			while(top3>=tail4)
			{
				top3--;
			}
			stack[top3]=person3;
		}
		else if(top3==snake5)
		{
			while(top3>=tail5)
			{
				top3--;
			}
			stack[top3]=person3;
		}
	//////
		if(top3==laddown1)
		{
			while(top3<=ladup1)
			{
				top3++;
			}
			stack[top3]=person3;
		}
		else if(top3==laddown2)
		{
			while(top3<=ladup2)
			{
				top3++;
			}
			stack[top3]=person3;
		}
		else if(top3==laddown3)
		{
			while(top3<=ladup3)
			{
				top3++;
			}
			stack[top3]=person3;
		}
		else if(top3==laddown4)
		{
			while(top3<=ladup4)
			{
				top3++;
			}
			stack[top3]=person3;
		}
		else if(top3==laddown5)
		{
			while(top3<=ladup5)
			{
				top3++;
			}
			stack[top3]=person3;
		}
	}
	public static void Push4(char stack[]) 
	{
		dies4=dies4+cube4;
		if(top4>=stack.length-1)
		{
			System.out.println("The Stack is in Over Flow");
			System.out.println("There is no space in the stack to insert the Data");
			System.out.println();
		}
		else
		{
			while(top4<dies4-1)
			{
				top4++;
			}
			stack[top4]=person4;
			if(top4==snake1)
			{
				while(top4>=tail1)
				{
					top4--;
				}
				stack[top4]=person4;
			}
			else if(top4==snake2)
			{
				while(top4>=tail2)
				{
					top4--;
				}
				stack[top4]=person4;
			}
			else if(top4==snake3)
			{
				while(top4>=tail3)
				{
					top4--;
				}
				stack[top4]=person4;
			}
			else if(top4==snake4)
			{
				while(top4>=tail4)
				{
					top4--;
				}
				stack[top4]=person4;
			}
			else if(top4==snake5)
			{
				while(top4>=tail5)
				{
					top4--;
				}
				stack[top4]=person4;
			}
		//////
			if(top4==laddown1)
			{
				while(top4<=ladup1)
				{
					top4++;
				}
				stack[top4]=person4;
			}
			else if(top4==laddown2)
			{
				while(top4<=ladup2)
				{
					top4++;
				}
				stack[top4]=person4;
			}
			else if(top4==laddown3)
			{
				while(top4<=ladup3)
				{
					top4++;
				}
				stack[top4]=person4;
			}
			else if(top4==laddown4)
			{
				while(top4<=ladup4)
				{
					top4++;
				}
				stack[top4]=person4;
			}
			else if(top4==laddown5)
			{
				while(top4<=ladup5)
				{
					top4++;
				}
				stack[top4]=person4;
			}
		}
	}
	public static void Display(char stack[])
	{
			for(int i=0; i<10;i++)
			{
				System.out.print(" "+stack[i]+" ");
			}
			for(int i=10; i<51;i++)
			{
				System.out.print(stack[i]+" ");
			}
			System.out.println();
			for(int j=1; j<10;j++)
			{
				System.out.print("0"+j+" ");
			}
			for(int j=10; j<51;j++)
			{
				System.out.print(j+" ");
			}
	}
}
