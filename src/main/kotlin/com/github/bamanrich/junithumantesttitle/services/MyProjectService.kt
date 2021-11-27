package com.github.bamanrich.junithumantesttitle.services

import com.intellij.openapi.project.Project
import com.github.bamanrich.junithumantesttitle.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
