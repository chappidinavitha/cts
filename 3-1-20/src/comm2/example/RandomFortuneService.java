package comm2.example;

public class RandomFortuneService {
	public class RandomFortuneSeervice {
		private String fortune[]= {
				"DemoFortune-1","DemoFortune-2",
				"DemoFortune-3","DemoFortune-4","DemoFortune-5"

		};

		public String getDailyFortune()
		{


			return fortune[(int)Math.random()];
		}

	}

}
