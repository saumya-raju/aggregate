import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SearchFromUI {

	static List<SummaryModel> summaryModels = new ArrayList<SummaryModel>();
	static List<String> map = new ArrayList<String>();
	static List<String> classVariables = new ArrayList<String>();

	public static void main(String string[]) {

		buildAggregate(summaryModels);
		System.out.println("=========================================================================================================");


	}

	public static Map<String, SummaryModel> buildAggregate(List<SummaryModel> summaryModels){
		Map<String, SummaryModel> aggregate = new HashMap<String, SummaryModel>();

		Field[] declaredFields = SummaryModel.class.getDeclaredFields();
		for (Field fields : declaredFields) {
			classVariables.add(fields.getName());
		}
		System.out.println("=========================================================================================================");

		for (SummaryModel summaryModel : summaryModels) {

			SummaryModel summary = aggregate.get(summaryModel.hashCode()+"");

			if(summary == null) {
				aggregate.put(summaryModel.hashCode()+"", summaryModel);
			}else {
				summary.setTranAmt(summary.getTranAmt()+summaryModel.getTranAmt());
			}

			//dynamic by class loader
			//for (String aggColumn : map) {}

			//normal if else case case
			if(summary != null) {
				if(!map.contains("invNum")) {
					summary.setInvIca("");
				}
				if(!map.contains("activityIca")) {
					summary.setActivityIca("");
				}
				if(!map.contains("prdctId")) {
					summary.setPrdctId("");
				}
				if(!map.contains("summTraceId")) {
					summary.setSummTraceId("");
				}
			}
		}

		for (Entry<String, SummaryModel>  summaryModelset : aggregate.entrySet()) {
			System.out.println(summaryModelset.getValue());
		}

		return aggregate;
	}

	static{
		map.add("invNum");
		map.add("activityIca");
		map.add("prdctId");
		map.add("summTraceId");
		map.add("tranAmt");
	}



	static{

		String inv_num = "1981000000000000";
		for (int activityIca = 1; activityIca <= 1; activityIca ++) {
			String activity_Ica = (11429 + activityIca)+"";
			for (int summtraceid = 0; summtraceid < 3; summtraceid++) {
				String summ_trace_id = "ASO1 6PPZU73K X45"+summtraceid;
				for (int tranAmt = 0; tranAmt < 3; tranAmt++) {
					Double tran_Amt = (50.69 + (1*tranAmt) + Math.random());
					SummaryModel summaryModel = new SummaryModel();
					summaryModel.setInvNum(inv_num);
					summaryModel.setActivityIca(activity_Ica);
					summaryModel.setPrdctId("product"+summtraceid);
					summaryModel.setSummTraceId(summ_trace_id);
					summaryModel.setTranAmt(tran_Amt);
					summaryModels.add(summaryModel);
				}
			}
		}
		System.out.println("hashcode\t   invNum \t            activityIca \t prdctId \t  summTraceId \t  tranAmt");
		for (SummaryModel summaryModel : summaryModels) {
			System.out.println(summaryModel);
		}
		System.out.println("=========================================================================================================");
	}

}
