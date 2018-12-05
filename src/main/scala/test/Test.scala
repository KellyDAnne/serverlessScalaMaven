package test

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler

class Test extends RequestHandler[Int, String] {
  def handleRequest(myCount:Int, context:Context): String = {
    print("Reussi")
    print(String.valueOf(myCount))
    "Done"
  }
}
