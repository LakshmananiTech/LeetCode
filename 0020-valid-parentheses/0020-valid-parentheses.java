class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 != 0)
        return false;
        Stack stack = new Stack();
        for(char k : s.toCharArray())
        {   System.out.println(k);
            if(k == '(' || k == '[' || k == '{')
                stack.push(k);
            else
            {   try{
                char c = (Character) stack.pop();
            
                
                if((c == '(' && k == ')')|| (c == '[' && k== ']') || (c == '{' && k == '}'))
                  continue;
                else
                  return false;
                }catch(Exception e){return false;}
            }
        }
    if(stack.size() != 0)
    return false;
    return true;
    }
}