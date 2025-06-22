package com.minhee.portfolio.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType

@Entity
class HttpInterface : BaseEntity(){
    @Id  //이 필드가 pk임을알수있음
    //mysql이 알아서 pk를 만들어줄거임
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "http_interface_id")
    val id: Long? = null

}