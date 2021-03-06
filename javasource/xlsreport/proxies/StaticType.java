// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package xlsreport.proxies;

public enum StaticType
{
	StaticText(new String[][] { new String[] { "en_US", "Static Text" }, new String[] { "nl_NL", "Statische tekst" } }),
	ObjectMember(new String[][] { new String[] { "en_US", "Object data" }, new String[] { "nl_NL", "Object data" } }),
	Aggregate(new String[][] { new String[] { "en_US", "Aggregate function" }, new String[] { "nl_NL", "Aggregeer functie" } });

	private java.util.Map<String,String> captions;

	private StaticType(String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<String,String>();
		for (String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public String getCaption(String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public String getCaption()
	{
		return captions.get("en_US");
	}
}
