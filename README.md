# Read Google Sheet from Scala using Service Account

You will need a Service Account key from Google.

Modify `src/main/scala/is/hail/Example.scala` replacing these three parts:
1. On line 16, replace `"/path/to/key.json"` with the file path to your Service Account key file.
2. On line 23, replace `"spreadsheet id"` with the spreadsheet id. If you have a Google Sheet open in your web browser, you can get the spreadsheet id from the URL. `https://docs.google.com/spreadsheets/d/SPREADSHEET_ID_WILL_BE_HERE/edit`
3. On line 23, replace "sheet name" with the name of the sheet (the first sheet is usually called "Sheet1").

Finally, you can execute this command to run the code. It should print the cells of the spreadsheet you specified in Example.scala.

```
./gradlew run
```

Alternatively, you can use IntelliJ to "Run" the Example.scala file.
