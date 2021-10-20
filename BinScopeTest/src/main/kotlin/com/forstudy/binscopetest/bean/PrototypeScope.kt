package com.forstudy.binscopetest.bean

import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

@Component
@Scope(value = "prototype")
class PrototypeScope {

    @PostConstruct
    fun init() {
        println("PrototypeBean created : $this")
    }

    @PreDestroy
    fun close() {
        println("Prototype Bean Destroyed : $this")
    }
}