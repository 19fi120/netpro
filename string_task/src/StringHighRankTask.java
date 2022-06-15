package string_task.src;

import java.io.*;   //データストリームやファイルに関するパッケージ
import java.net.*;  // URL, URLConnection クラスの属するパッケージ

public class StringHighRankTask {
	public static void main(String[] args) {
		try {
			//※最初のプログラムはおまじないです。
			
			URL url = new URL("http://www.mlab.im.dendai.ac.jp/wiki/index.php");//URLをここに指定する。
			URLConnection connection = url.openConnection();// URLクラスのインスタンス(url)から、接続にいくURLConnectionオブジェクトを取得
			//指定されたURLと接続してウェブページの情報を取得するためのインスタンス(connection)を生成する
			connection.connect();// 接続する
			InputStream inputStream = connection.getInputStream();// サーバからやってくるデータをInputStreamとして取得
			//通信で情報を取得する。データストリームによる通信を行う（情報全てをまとめて取得するのではなく少しずつ取得する方式）このまま読むと1byteずつ読み込むため文字コードではない。（charでキャストすれば読めなくはない）
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");// 次に inputStream を読み込む InputStreamReader のインスタンス inputStreamReader を生成
			//ストリーム型通信での読み込みを行う際に、InputStreamReaderというクラスで読み込む。文字コードを指定するため、文字で読み込める。ただし、このままでは1~2文字ずつ読み込むことになる。
			BufferedReader reader = new BufferedReader(inputStreamReader);// さらに inputStreamReader をラップする BufferedReader のインスタンス reader を生成
			//1~2文字ずつではなく1行ずつ読み込むようにする。1~2文字ずつ読むよりもわかりやすくなる。ラップとは、元のクラスに更に機能を追加すること。
			
			/*
			 
			 現在while文で1行ずつlineの中にHTML文（Webページを構成するマークアップ言語）を格納しています。
			 
			 問題1.StringBufferで全て文字列連結し、htmlという名前で作ったStringインスタンスの中に入れてください。
			 問題2.htmlを全て小文字にしてください。
			 		ヒント：toLowerCaseを使用する
			 ここから上級問題：
			 問題3.htmlの文字列の中の<title>タグの中身を抽出して表示してください。（<p></p>は表示しない）
			 		ヒント：Stringで"<title>"と"</title>"を格納する
			 		       indexOfで<title>と</title>のがはじめから数えて何番目に来るかを格納する
			               substringで文字を抽出する際に、<title>の番号は<title>の文字の長さを足した上で抽出する（<title>を消すため）
			               <title></title>の文字列の長さはlengthメソッドで取得できる
			 問題4.htmlの文字列の中の<p>タグの中身を全て抽出して表示してください。
			 		ヒント：javaの正規表現のfindメソッドを使用する
			 		       Stringで"<p>"と"</p>"を格納する
			 		       正規表現パターンは「<p>(.*?)</p>」にするとよい　　←<p>と</p>の文字列はStringのインスタンスを生成しているはずなので、+で連結すると良い
			 		       (?は直前の文字が0個か1個のときにtrueを返します。これをつけると後ろに</p>が大量にあっても一番手前の</p>と一致してくれます。)
			 		       最後にsubstringで<p>と</p>を削除する。(<p>の長さと</p>の長さはlengthメソッドで取得)
			 		       
			 問題2の理由：文字列抽出の際HTMLは大文字と小文字を両方使用できるため、検索に引っかかるようにStringインスタンスのhtmlをtoLowerCaseで全て小文字にする操作を行いました。
			 
			 */
			
			//これ以降からプログラムを書き始める
			
			
			
			
			String line;
			while ((line = reader.readLine()) != null) { //読み込まれた文字は1行ずつStringインスタンス(line)に格納される。格納するものがなくなるとwhileループから抜ける
				//line = reader.readLine()でWebのHTMLの次の1行を格納する。このlineを「!= null」でnullでないことを判定する。（nullならwhileを抜ける）
				System.out.println(line);     //読み込まれたHTMLの1行を表示する この1行は課題提出の際に削除して構わない
			}
			
			
			
			
			//この部分までプログラムを書く
			
			reader.close();//readerを使用した後に終了する処理を行うためのもの。
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}

