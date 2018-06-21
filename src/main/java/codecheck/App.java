package codecheck;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			// 引数の精査
			// 非数字または小数または負数
			Pattern p = Pattern.compile("[^0-9]");
			Matcher m = p.matcher(args[i]);
			if (m.find()) {
				System.out.println("invalid");
				continue;
			}
			int input = Integer.parseInt(args[i]);
			// 1000より上
			if (input < 0 || 1000 < input) {
				System.out.println("invalid");
				continue;
			}

			// 3がつく
			if (args[i].contains("3")) {
				// 3の倍数
				if (input % 3 == 0) {
					System.out.println("dumb");
				} else {
					System.out.println("stupid");
				}
			} else if (input % 3 == 0) {
				System.out.println("idiot");
			} else {
				System.out.println("smart");
			}
		}
	}
}
