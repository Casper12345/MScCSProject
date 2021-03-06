package persistenceAPI.DataBaseConnection.connectUser

import org.scalatest.FunSuite

/**
  * Created by Casper on 04/08/2017.
  */
class DBUserRecievedMessageTest extends FunSuite {

  test("addUserRecievedMessage") {

    val db = DBUserRecievedMessage

    db.addUserRecievedMessage(1, 1)

    assert(db.getAllUserReceivedMessageByID(3).head.senderUserID == 1)
  }


  test("getAllUserSentMessageByID") {

    val db = DBUserRecievedMessage

    assert(db.getAllUserReceivedMessageByID(3).head.senderUserID == 1)
  }

  test("countUnreadMessagesByUserID") {

    val db = DBUserRecievedMessage

    assert(db.countUnreadMessagesByUserID(3) == 4)

  }


}


