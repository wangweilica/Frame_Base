package contest;

import java.io.File;
import java.util.Hashtable;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.zkhy.contest.web.util.MatrixToImageWriter;

public class Test {
	/**
	 * @param args
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		String text = "http://www.ablanxue.com";
		int width = 300;
		int height = 300;
		// 二维码的图片格式
		String format = "png";
		@SuppressWarnings("rawtypes")
		Hashtable hints = new Hashtable();
		// 内容所使用编码
		hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
		BitMatrix bitMatrix = new MultiFormatWriter().encode(text,
				BarcodeFormat.QR_CODE, width, height, hints);
		// 生成二维码
		File outputFile = new File("d:" + File.separator + "new.png");
		MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile);
	}
}