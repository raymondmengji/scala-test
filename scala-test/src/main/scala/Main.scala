import notification.{SMS, showNotification}

object Main extends App {
  val someSMS = SMS("123456", "test")
  println(showNotification(someSMS))
}