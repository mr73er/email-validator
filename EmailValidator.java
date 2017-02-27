package email_validator.email_validator;

public class EmailValidator {
	public int checkemail(String a)
	{
		int at=0, dot=0,att=0,d=0;
		for(int i=0;i<a.length();i++)
		{
			//rule1:the string has a single '@' character
			if(a.charAt(i)=='@')
			{
				at++;
				att=i;
			}
			//rule2:the string has at least one '.' character
			if(a.charAt(i)=='.')
			{
				dot++;
				d=i;
			}
			
		}
		int res=0;
		//rule1
		if(at!=0)
		{
			res++;
		}
		//rule2
		if(dot!=0)
		{
			res++;
		}
		//extra rule1 which means there should be one '.' after '@'
		if(d>att)
		{
			res++;
		}
		//extra rule2 which means the first character can not be '@'
		if(a.charAt(0)!='@')
		{
			res++;
		}
		return res;
	}
}
