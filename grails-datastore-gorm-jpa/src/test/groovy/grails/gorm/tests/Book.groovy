package grails.gorm.tests

import grails.gorm.JpaEntity;

import java.io.Serializable;

@JpaEntity
class Book implements Serializable{
    String author
    String title
    Boolean published

    static mapping = {
      published index:true
      title index:true
      author index:true
    }
}