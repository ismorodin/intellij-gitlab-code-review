package com.github.ismorodin.intellijgitlabcodereview.services

import com.intellij.openapi.project.Project
import com.github.ismorodin.intellijgitlabcodereview.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
