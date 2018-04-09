package algoritmos;

public class Fatorial {
	
	public int fat(int v) {
		if (v == 1) {
			return 1;
		} else {
			return v * fat(v-1);
		}
	}
	
	public long fib(long v) {
		if (v == 0 || v == 1) {
			return v;
		} else {
			return fib(v - 1) + fib(v - 2);
		}
			
	}

}
