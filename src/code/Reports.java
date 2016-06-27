package code;

import java.util.Vector;

public class Reports {
	public static void getNoviceList(int fcnt){
		String sql=" select top 15 * from Score where isNovice='yes' order by score desc";
		Vector<String> attr=new Vector<String>();
		attr.add("Username");
		attr.add("Score");
		
		ReportTemplate.getReport(attr, sql, "Novice 1st Round ShortList","#Techumen2k15#CodeFreak");
	}
	public static void getExpertList(int fcnt){
		String sql=" select top 30 * from Score where isNovice='no' order by score desc";
		Vector<String> attr=new Vector<String>();
		attr.add("Username");
		attr.add("Score");
		
		ReportTemplate.getReport(attr, sql, "Expert 1st Round ShortList","#Techumen2k15#CodeFreak");
	}
}
