package com.Calculator.Service;

import com.Calculator.model.CalcDTO;

public class CalcService {

	public CalcDTO getResult(CalcDTO dto) {

		String ope = dto.getOperator();
		//オペレーターの中にCが入っていれば０を返す
		if (ope.equals("C")) {
			//dto.setResult("0");
			dto.setFirstNum("");
			dto.setSecondNum("");
			dto.setOperator("");
			dto.setFlag(false);
			dto.setResult("0");
		    return dto;
		}
		
		
		double fn = Double.parseDouble(dto.getFirstNum());
		//Integer fn = Integer.parseInt(firstNum);
		double sn = Double.parseDouble(dto.getSecondNum());
		//Integer sn = Integer.parseInt(secondNum);
		double ans = 0;
		//Integer ans = Integer.parseInt(anser);
		//String 
		//Integer E = Integer.parseInt(e);
		

		//⑤記号イコールが入力されたら代入された一つ目の値と二つ目の数字を掛け合わせる
		if (ope.equals("+")) {
			ans = fn + sn;
		} else if (ope.equals("-")) {
			ans = fn - sn;
		} else if (ope.equals("*")) {
			ans = fn * sn;
		} else if (ope.equals("/")) {
			if (sn == 0) {
				dto.setResult("Erorr");
				return dto;
			} else {
				ans = fn / sn;
			}
		
		}
		
		
		
		if (ans % 1 <= 0 ) {
			//計算結果が整数の場合、キャスト
			//dto.setResult(String.format("%.0f",ans));
			dto.setResult(String.valueOf((int)ans));
		} else {
			//小数点を含む場合elseに入る
			dto.setResult(String.valueOf(ans));
		}
		

		return dto;

	}

}
