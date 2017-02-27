package email_validator.email_validator;

public class EmailValidator {
	public int checkemail(String a)
	{
		int at=0, dot=0;
		for(int i=0;i<a.length();i++)
		{
			//rule1:the string has a single '@' character
			if(a.charAt(i)=='@')
			{
				at++;
			}
			//rule2:the string has at least one '.' character
			if(a.charAt(i)=='.')
			{
				dot++;
			}
		}
		int res=0;
		if(dot!=0)
		{
			res++;
		}
		if(at!=0)
		{
			res++;
		}
		return res;
	}
}
