package service.auth.providers

import play.api._
import play.api.mvc._
import service.auth._

object Trello extends OAuthProvider {

  override val name = "trello"
  override val namespace = "tr"

}

