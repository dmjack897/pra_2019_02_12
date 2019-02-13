# pra_2019_02_12<br>
<h1>txtファイルの内容を読み込む方法</h1>
<h1>try/catchを活用してエラー処理</h1>
txtファイルの内容を読み込む方法やtry/catchを活用してエラー処理を勉強しました。<br><br>
txtファイルの内容を読み込む時はFile file = new File(ファイル名);を使用<br><Br>
エラー処理は<br><br>
try{<br>
    内容作成<br>
    }<br>
catch{<Br>
  try部分でエラーが発生するとcatchの部分が実行される<br>
  }<br>
