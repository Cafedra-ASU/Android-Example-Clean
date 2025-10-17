package com.onixx.androidexampleclean.di


import com.onixx.androidexampleclean.domain.usecases.exampleItem.GetExamplesUseCase
import org.koin.dsl.module

val domainModule = module {

    /**
     * создание экземпляра юзкейса
     *
     * factory - каждый раз при инжекте будет создаваться новый экземпляр класса. Каждый раз новое,
     * чтобы не было софтлоков, когда из одного места вызвалась тяжелая операция и застопорила работу
     *
     * get() в аргументе - найдёт среди модулей Koin метод, возвращающий нужный
     * тип и подставит его в аргумент
     */
    factory<GetExamplesUseCase> { GetExamplesUseCase(get()) }

}