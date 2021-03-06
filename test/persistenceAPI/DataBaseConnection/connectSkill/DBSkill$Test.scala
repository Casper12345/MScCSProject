package persistenceAPI.DataBaseConnection.connectSkill

import persistenceAPI.DataBaseConnection.DBMain
import org.scalatest.FunSuite

/**
  * Created by Casper on 10/07/2017.
  */
class DBSkill$Test extends FunSuite {

  // Skill tests

  val db = DBSkill


  test("addSkill") {

    db.addSkill("C++")

    val skill = db.getSkillByID(1).get

    assert(skill.name == "C++")

  }

  test("getSkillByID") {

    val skill = db.getSkillByID(1).get

    assert(skill.skillID == 1)

    assert(skill.name == "C++")

  }

  // getAllSkills Test

  test("getAllSkill") {

    val skills = db.getAllSkills()

    assert(skills.head.name == "C++")

  }

  test("deleteSkill") {

    db.deleteSkill(17)

    val skill = db.getSkillByID(17)

    assert(skill.isEmpty)

  }

}
