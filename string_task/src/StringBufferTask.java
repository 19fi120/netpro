package string_task.src;

//import java.util.StringJoiner;  //StringJoinerを利用する際はこのコメントを外す

public class StringBufferTask {
	public static void main(String[] args) {
		//問題文：
		//以下に示す内容通りに表示しましょう。
		//表示する内容と例：
		//			関東には沢山の駅がありますが、特に大きい駅には、東京駅上野駅新宿駅池袋駅渋谷駅などがあります。
		//
		//必ずStringBufferかStringBuilderかString.joinかStringJoinerを使用すること。（StringJoinerはimportの必要あり）
		//ただし、冒頭と文末はStringBufferなどによる文字列連結に含めなくても構わない。（+による文字列連結で構わない）
		//
		//発展問題：
		//できる人は区切りを入れてみてください。
		//表示例：
		//			関東には沢山の駅がありますが、特に大きい駅には、東京駅や上野駅や新宿駅や池袋駅や渋谷駅などがあります。
		//			関東には沢山の駅がありますが、特に大きい駅には、東京駅,上野駅,新宿駅,池袋駅,渋谷駅などがあります。
		
		
		String theme = "関東には沢山の駅がありますが、特に大きい駅には、";//冒頭につなげる
		String[] words = {"東京駅","上野駅","新宿駅","池袋駅","渋谷駅"};//この配列の中身をStringBufferやjoinなどでつなげる
		String end = "などがあります。";//文末につなげる
	}
	
}
