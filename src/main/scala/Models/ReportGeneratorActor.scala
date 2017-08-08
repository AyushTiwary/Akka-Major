package Models

import akka.actor.{Actor, ActorLogging}

import scala.concurrent.Future

class ReportGeneratorActor(billerRef: Future[Any]) extends Actor with ActorLogging {

  override def receive: PartialFunction[Any, Unit] = {
    case account : Account =>
      log.info("-------------------------***-----------------------------")
      log.info("Bills of " + account.accHolderName)
      log.info("List is: " + billerRef)
      log.info("-------------------------***-----------------------------")
  }

}
