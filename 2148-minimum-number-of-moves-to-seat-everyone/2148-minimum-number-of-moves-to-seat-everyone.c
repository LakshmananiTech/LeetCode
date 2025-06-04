int minMovesToSeat(int* seats, int seatsSize, int* students, int studentsSize) {
    int i,j,c;
   for(i=0;i<seatsSize;i++) 
   for(j=i+1;j<seatsSize;j++)
   if(seats[i]>seats[j])
   {
    c=seats[i];
    seats[i]=seats[j];
    seats[j]=c;
   }
   for(i=0;i<studentsSize;i++) 
   for(j=i+1;j<studentsSize;j++)
   if(students[i]>students[j])
   {
    c=students[i];
    students[i]=students[j];
    students[j]=c;
   }
   c=0;
   for(i=0;i<seatsSize;i++)
   c=c+abs(seats[i]-students[i]);
   return c;
}