class Prog22
{
 public static void main(String args[])
 {
  int num=1010;
  int dec_value=0;
  int base=1;
  int temp = num;
while(temp)
{
   int last_digit=temp%10;
   temp=temp/10;

   dec_value=dec_value+last_digit*base;
   base=base*2;
}
   System.out.println(dec_value);
 }
} 