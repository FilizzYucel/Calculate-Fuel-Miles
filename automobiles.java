package lab4task;

public class automobiles {

		private  int miles, gallons ;
		private  float amountOfFuel;
		
		automobiles(int miles, int gallons,float amountOfFuel){
			
			this.miles = miles;
			this.gallons = gallons;
			this.amountOfFuel= amountOfFuel;
			
			
		}

		public  float getAmountOfFuel() {
			return this.amountOfFuel;
		}

		public  void setAmountOfFuel(float amountOfFuel) {
			this.amountOfFuel = getMiles()/getGallons();
		}

		public  float getTotal() {
			return (float) ((double)getMiles()/(double)getGallons()) ;
		}

		
		public  double getLiter() {
			return this.getGallons()*4.5;
		}

	

		public  int getMiles() {
			return this.miles;
		}

		public  void setMiles(int miles) {
			this.miles += miles;
		}

		public int getGallons() {
			return this.gallons;
		}

		public  void setGallons(int gallons) {
			this.gallons += gallons;
		}

	
		
		
			
		}
		
		
		
	


