package Model;

public class ReserVO {

	
		private String user_id;
		private int  fac_id;
		private String	fac_name;
		private String  Reserdate;
		private String	usedate ;
		private String  usetime;
		private String	 fee ;
		
		
		public ReserVO(String user_id, int fac_id, String fac_name,String  Reserdate, String usedate, String usetime, String fee) {
			super();
			this.user_id = user_id;
			this.fac_id = fac_id;
			this.fac_name = fac_name;
			this.Reserdate=Reserdate;
			this.usedate = usedate;
			this.usetime = usetime;
			this.fee = fee;
		}


		public String getUser_id() {
			return user_id;
		}


		public void setUser_id(String user_id) {
			this.user_id = user_id;
		}


		public int getFac_id() {
			return fac_id;
		}


		public void setFac_id(int fac_id) {
			this.fac_id = fac_id;
		}


		public String getFac_name() {
			return fac_name;
		}


		public void setFac_name(String fac_name) {
			this.fac_name = fac_name;
		}


		public String getUsedate() {
			return usedate;
		}


		public void setUsedate(String usedate) {
			this.usedate = usedate;
		}


		public String getUsetime() {
			return usetime;
		}


		public void setUsetime(String usetime) {
			this.usetime = usetime;
		}


		public String getFee() {
			return fee;
		}


		public void setFee(String fee) {
			this.fee = fee;
		}


		public String getReserdate() {
			return Reserdate;
		}


		public void setReserdate(String reserdate) {
			Reserdate = reserdate;
		}

	
	
	
	
	
	
	
	
	
	
	
}
