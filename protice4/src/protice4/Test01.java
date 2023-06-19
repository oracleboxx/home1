package protice4;

interface Portion{
	abstract void Hpportion();
	abstract void Mpportion();
		
	
}
interface item{
	abstract void navori(int power , int critcalhit);
	abstract void Stormrazor(int power , int critcalhit);
	
}

class AD{
	int Power ;
	 int Max_Hp ;
	 int CriticalHit;
	 int TotalPower;
	 int TotalCriticalHit;
	AD(int Power , int Hp,int CriticalHit){
		this.TotalPower = Power;
		this.Max_Hp = Hp;
		this.TotalCriticalHit =CriticalHit;
	}
	
}
	class Ezreal extends AD implements Portion,item{
	
	
		public Ezreal(int Power , int Hp,int CriticalHit) {
		super(59,582,0);
		Max_Hp = Hp;
		System.out.println("기본 정보: 이즈리얼");
		System.out.println("공격력:"+Power);
		System.out.println("체력:"+Hp);
		System.out.println("치명타"+CriticalHit);
		System.out.println("==================");
		
		
		
		
		}
		public void navori(int Power , int CriticalHit) {
			TotalPower += Power;
			TotalCriticalHit += CriticalHit;
		}
	
		@Override
		public void Hpportion() {
			System.out.println("빨간 포션 2개");
		}
		@Override
		public void Mpportion() {
			System.out.println("마나 포션 1개");
		}
		public void pr() {
		
			System.out.println("업그레이드 이즈리얼  !!!!!!!!!");
			System.out.println("공격력:"+TotalPower);
			System.out.println("체력:"+Max_Hp);
			System.out.println("치명타:"+TotalCriticalHit);
		}
		@Override
		public void Stormrazor(int power, int critcalhit) {
		}
	}
	class Vain extends AD implements Portion{
		
		public Vain(int Power, int Hp,int CriticalHit) {
		super(61,623,0);	
		Max_Hp = Hp;
		System.out.println("기본 정보: 베인");
		System.out.println("공격력:"+Power);
		System.out.println("체력:"+Hp);
		System.out.println("치명타"+CriticalHit);
		System.out.println("==================");
		}
		public void Stormrazor(int Power , int CriticalHit) {
			TotalPower += Power;
			TotalCriticalHit += CriticalHit;
			
		}
	
		@Override
		public void Hpportion() {
			System.out.println("빨간 포션 1개");
		}
		@Override
		public void Mpportion() {
			System.out.println("마나 포션 1개");
		}
		public void pr() {
			
			System.out.println("베인의 정보 입니다 !!!!");
			System.out.println("공격력:"+TotalPower);
			System.out.println("체력:"+Max_Hp);
			System.out.println("치명타:"+TotalCriticalHit);
		}
	}
	

public class Test01 {

	public static void main(String[] args) {
		
		
		
		Vain v =new Vain(61,623,0);
		
		v.Stormrazor(40, 20);
		
		v.pr();
		v.Hpportion();
		v.Mpportion();
		System.out.println();
		Ezreal e =new Ezreal(59,582,0);
		
		e.navori(35, 25);
	
		e.pr();
		e.Hpportion();
		e.Mpportion();
	}

}
