
import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;


public class Hive1 extends UDF {
// Strip class has two evaluate() methods
	

	private Text result=new Text();

//First method strips leading and trailing white spaces from the input.
	public Text evaluate(Text str)
		{
			if(str == null)
				{
					return null;
					}
			result.set(StringUtils.strip(str.toString()));
		return result;
		}



//This method can strip set of supplied characters from the ends of the string
	public Text evaluate(Text str, String stripchars)
	{
		if(str == null)
			{
				return null;
			}
		result.set(StringUtils.strip(str.toString(), stripchars));
	return result;
	}
}