// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package excelimporter.proxies;

public enum ImportActions
{
	SynchronizeObjects(new String[][] { new String[] { "en_US", "Synchronize objects" }, new String[] { "nl_NL", "Synchroniseer objecten" }, new String[] { "en_GB", "Synchronize objects" }, new String[] { "en_ZA", "Synchronize objects" } }),
	SynchronizeOnlyExisting(new String[][] { new String[] { "en_US", "Synchronize only existing objects, ignore others" }, new String[] { "nl_NL", "Synchroniseer alleen bestaande objecten, negeer de rest" }, new String[] { "en_GB", "Synchronize only existing objects, ignore others" }, new String[] { "en_ZA", "Synchronize only existing objects, ignore others" } }),
	CreateObjects(new String[][] { new String[] { "en_US", "Create an object for each row" }, new String[] { "nl_NL", "Creeër een object voor iedere rij" }, new String[] { "en_GB", "Create an object for each row" }, new String[] { "en_ZA", "Create an object for each row" } }),
	OnlyCreateNewObjects(new String[][] { new String[] { "en_US", "Only create not existing object" }, new String[] { "nl_NL", "Creeër alleen niet bestaande objecten" }, new String[] { "en_GB", "Only create not existing object" }, new String[] { "en_ZA", "Only create not existing object" } });

	private java.util.Map<String,String> captions;

	private ImportActions(String[][] captionStrings)
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
