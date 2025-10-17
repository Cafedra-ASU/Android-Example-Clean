package com.onixx.androidexampleclean.di

import com.onixx.androidexampleclean.data.repositoryImpl.ExampleItemsRepositoryImpl
import com.onixx.androidexampleclean.domain.repository.ExampleItemsRepository
import org.koin.dsl.module


val dataModule = module {

    /**
     * везде, где нужно будет вставить реализацию интерфейса, мы вставим реализацию, указанную здесь
     *
     * single - создасться один экземпляр и будет инжектится при необходимости
     */
    single<ExampleItemsRepository> { ExampleItemsRepositoryImpl() }

}