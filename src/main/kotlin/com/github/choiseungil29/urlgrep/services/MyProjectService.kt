package com.github.choiseungil29.urlgrep.services

import com.intellij.openapi.project.Project
import com.github.choiseungil29.urlgrep.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
