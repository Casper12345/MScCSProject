package model.matchingLogic.attributeFactory

import persistenceAPI.DataBaseConnection.objects.{JobDescriptionCompetency, JobDescriptionSkill}

/**
  * Sorting algorithm for attributes.
  */
object AttributesSorting {

  def sortAttributes(attributes: List[Attribute]): (List[JobDescriptionSkill], List[JobDescriptionCompetency]) = {

    var listOfSkills: List[JobDescriptionSkill] = Nil
    var listOfCompetencies: List[JobDescriptionCompetency] = Nil

    for (i <- attributes) {
      if (i.attributeType == "skill") {
        listOfSkills = listOfSkills :+ JobDescriptionSkill(i.ID, i.name, i.rating)
      }

      if (i.attributeType == "competency") {
        listOfCompetencies = listOfCompetencies :+ JobDescriptionCompetency(i.ID, i.name, i.rating)
      }
    }

    (listOfSkills, listOfCompetencies)
  }

}
