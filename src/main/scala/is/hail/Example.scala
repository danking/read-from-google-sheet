package is.hail

import com.google.auth.oauth2.ServiceAccountCredentials
import com.google.api.client.auth.oauth2.Credential
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport
import com.google.api.client.json.gson.GsonFactory
import com.google.api.services.sheets.v4.Sheets
import collection.JavaConverters._

import java.io.FileInputStream

object Example {
  val httpTransport = GoogleNetHttpTransport.newTrustedTransport()
  val gsonFactory = GsonFactory.getDefaultInstance()
  val credentials = ServiceAccountCredentials.fromStream(new FileInputStream("/path/to/key.json"))
  val sheetsService = new Sheets.Builder(httpTransport, gsonFactory, new HttpCredentialsAdapter(credentials))
    .setApplicationName("Hail!")
    .build()
  def main(args: Array[String]) {
    val theData = service.spreadsheets().values()
      .get("spreadsheet id", "sheet name")
      .execute()
      .getValues()
      .asScala
  }
}
