int smallestIndex(int* nums, int numsSize)
 {
   int i,s,n;
  
  for(i=0;i<numsSize;i++)
  { s=0;
    n=nums[i];
    while(n)
    {s=s+(n%10);
     n=n/10;
    }
    if(s==i)
    {return i;
    break;
    }
  }
 return -1;   
}