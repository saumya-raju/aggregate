public class RowDTO {

	String activityIca ;
	String prdtId ;
	String summ_trace_id ;
	Double tranAmt = 0.0;
	
	public String getActivityIca() {
		return activityIca;
	}
	public void setActivityIca(String activityIca) {
		this.activityIca = activityIca;
	}
	public String getPrdtId() {
		return prdtId;
	}
	public void setPrdtId(String prdtId) {
		this.prdtId = prdtId;
	}
	public String getSumm_trace_id() {
		return summ_trace_id;
	}
	public void setSumm_trace_id(String summ_trace_id) {
		this.summ_trace_id = summ_trace_id;
	}
	public Double getTranAmt() {
		return tranAmt;
	}
	public void setTranAmt(Double tranAmt) {
		this.tranAmt = tranAmt;
	}
	@Override
	public String toString() {
		return "RowDTO [activityIca=" + activityIca + ", prdtId=" + prdtId + ", summ_trace_id=" + summ_trace_id
				+ ", tranAmt=" + tranAmt + "]";
	}
	
	@Override
	public int hashCode() {
		String hashFrom = getActivityIca()+getPrdtId();
		return super.hashCode();
	}
}
