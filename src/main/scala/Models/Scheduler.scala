package Models

import akka.actor.{Actor, ActorRef, ActorSystem}

import scala.concurrent.duration._

class Scheduler(dbRef: ActorRef, system: ActorSystem) extends Actor{

  override def receive: PartialFunction[Any, Unit] = {

    case account: Any =>
      import system.dispatcher
      val cancellable =
        system.scheduler.schedule(
          300 second,
          300 second,
          dbRef,
          account)

  }
}
