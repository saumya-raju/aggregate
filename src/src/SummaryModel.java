
public class SummaryModel {

	private String summTraceId;
	private String chrgDt;
	private String invNum;
	private String invIca;
	private String activityIca;
	private String fromCntryCd;
	private String toCntryCd;
	private String geoCd;
	private String prdctId;
	private String eventSrcNam;
	private String billEventId;
	private Double tranAmt;
	public String getSummTraceId() {
		return summTraceId;
	}
	public void setSummTraceId(String summTraceId) {
		this.summTraceId = summTraceId;
	}
	public String getChrgDt() {
		return chrgDt;
	}
	public void setChrgDt(String chrgDt) {
		this.chrgDt = chrgDt;
	}
	public String getInvNum() {
		return invNum;
	}
	public void setInvNum(String invNum) {
		this.invNum = invNum;
	}
	public String getInvIca() {
		return invIca;
	}
	public void setInvIca(String invIca) {
		this.invIca = invIca;
	}
	public String getActivityIca() {
		return activityIca;
	}
	public void setActivityIca(String activityIca) {
		this.activityIca = activityIca;
	}
	public String getFromCntryCd() {
		return fromCntryCd;
	}
	public void setFromCntryCd(String fromCntryCd) {
		this.fromCntryCd = fromCntryCd;
	}
	public String getToCntryCd() {
		return toCntryCd;
	}
	public void setToCntryCd(String toCntryCd) {
		this.toCntryCd = toCntryCd;
	}
	public String getGeoCd() {
		return geoCd;
	}
	public void setGeoCd(String geoCd) {
		this.geoCd = geoCd;
	}
	public String getPrdctId() {
		return prdctId;
	}
	public void setPrdctId(String prdctId) {
		this.prdctId = prdctId;
	}
	public String getEventSrcNam() {
		return eventSrcNam;
	}
	public void setEventSrcNam(String eventSrcNam) {
		this.eventSrcNam = eventSrcNam;
	}
	public String getBillEventId() {
		return billEventId;
	}
	public void setBillEventId(String billEventId) {
		this.billEventId = billEventId;
	}
	public Double getTranAmt() {
		return tranAmt;
	}
	public void setTranAmt(Double tranAmt) {
		this.tranAmt = tranAmt;
	}

	@Override
	public String toString() {
		return hashCode()+"\t"+invNum+"\t"+activityIca+"\t"+prdctId+"\t"+summTraceId+"\t"+tranAmt;
	}
	
	@Override
	public int hashCode() {
		String hashFrom = activityIca+prdctId+summTraceId;
		return hashFrom.hashCode();
	}


}
