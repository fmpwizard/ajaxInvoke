package com.fmpwizard.ajaxInvoke.snippet

import net.liftweb.http.{S, SHtml}
import net.liftweb.http.js.JsCmds
import net.liftweb.util.Helpers._
class ajaxInvoke{
  def render = {
    "#button [onclick]" #> SHtml.ajaxInvoke{ () =>
      JsCmds.Alert("Got it!")
    } &
    "#button2 [onclick]" #> (SHtml.ajaxInvoke{ () =>
      JsCmds.Alert("Got it!")
    }._2.cmd.toJsCmd + "return false;")
  }
}
