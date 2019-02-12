# pra_2019_02_12<br>
txtファイルの内容を読み込む方法やtry/catchを活用してエラー処理を勉強しました。<br>
txtファイルの内容を読み込む時はFile file = new File(ファイル名);を使用<br>
エラー処理は<br>
try{<br>
    内容作成<br>
    }<br>
catch{<Br>
  try部分でエラーが発生するとcatchの部分が実行される<br>
  }<br>
