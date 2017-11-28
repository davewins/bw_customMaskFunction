package maskcustomfunction;

import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;

@XPathFunctionGroup(category = "Masking Function", prefix = "mask", namespace = "http://www.tibco.com", helpText = "Custom Function to mask characters in a string")
public class MaskingFunction {

	@XPathFunction(helpText = "Function to Mask the characters in the provided string", parameters = {
			@XPathFunctionParameter(name = "stringToMask", optional = false, optionalValue = ""),
			@XPathFunctionParameter(name = "maskingCharacter", optional = true, optionalValue = "*"),
			@XPathFunctionParameter(name = "charactersToMask", optional = true, optionalValue = "-1"),
			@XPathFunctionParameter(name = "debugMode", optional = true, optionalValue = "0")})
	public String mask(String stringToMask, String maskingCharacter,
			int charactersToMask, boolean debugMode) {
		
			String replacedStr = "";
			if (debugMode) System.out.println("Original String: " + stringToMask);
			if (maskingCharacter.length() == 0) maskingCharacter="*";
			if (charactersToMask > 0)
			{
				if (charactersToMask < stringToMask.length())
				{
					replacedStr = stringToMask.substring(0, charactersToMask).replaceAll(".", maskingCharacter);
					if (debugMode) System.out.println("Replaced: " + replacedStr);
					String strToLeave = stringToMask.substring(charactersToMask,stringToMask.length());
					if (debugMode) System.out.println("strToLeave: " + strToLeave);
					replacedStr = replacedStr + strToLeave;			
				} else
				{
					 //String is less than the amount to leave alone, so just mask the lot
					replacedStr = stringToMask.replaceAll(".", maskingCharacter);
				}
	
			} else //Mask everything
			{
				replacedStr = stringToMask.replaceAll(".", maskingCharacter);
			}
		if (debugMode) System.out.println("result is " + replacedStr);
		return replacedStr;
	}
}
