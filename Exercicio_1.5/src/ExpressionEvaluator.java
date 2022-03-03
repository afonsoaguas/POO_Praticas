import java.util.Stack;

public class ExpressionEvaluator {

	public static void main(String[] args) {
		Stack <Integer> val = new Stack <>();
		Stack <Character> op = new Stack<>();
		for (int i=0; i<args.length; i++) {
			if (stringToInteger(args[i]) >= 0 && stringToInteger(args[i]) <= 9) {
				val.push(stringToInteger(args[i]));
			}else if (args[i].charAt(0) == '+' || args[i].charAt(0) == '-' || args[i].charAt(0) == 'x' || args[i].charAt(0) == '/') {
				op.push(args[i].charAt(0));
			}else if (args[i].charAt(0) == ')') {
				int a = val.pop();
				int b = val.pop();
				char c = op.pop();
				switch (c) {
				case '+':
					val.push(a+b);
					break;
				case '-':
					val.push(a-b);
					break;
				case 'x':
					val.push(a*b);
					break;
				case '/':
					val.push(a/b);
					break;
				}
			}
		}
		int ans = val.pop();
		System.out.println(ans);
	}
	
	public static int stringToInteger(String str) {
		int val = 0;
		int power = 1;
		for (int i=str.length()-1; i>=0; i--) {
			int digit = str.charAt(i) - '0'; //Conversão de char para int
			val += digit * power;
			power *= 10;
		}
		return val;
	}

}
