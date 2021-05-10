import java.util.*;


class Stack
{
	int arr[];
	int top;
	int capacity;

	Stack()
	{
		top=-1;
		capacity=5;
		arr = new int[capacity];
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public boolean isFull()
	{
		return top==capacity-1;
	}
	public void push(int data)
	{
		if(top==capacity-1)
		{
			System.out.println("Stack is full");
		}
		arr[++top]=data;
	}
}

public class StackUsingArray
{
	public static void main(String args[])
	{

	}
}