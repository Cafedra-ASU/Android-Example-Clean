package com.onixx.androidexampleclean.di

import com.onixx.androidexampleclean.presentation.screens.main.MainScreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {

    /**
     * основной смысл такого создания ВМ - модульность сборки.
     * В приложении помимо юзкейсов всегда используется множество дополнительных сущностей. Сервисы, контекст, работа с буфером обмена, локальная хранилка для кешированных данных и т.д.
     * Гораздо проще один раз обьявить их в модуле и автоматизировать их подключение в разные ВМ, чем каждый раз тянуть их вручную
     */

    viewModel<MainScreenViewModel> { MainScreenViewModel(get()) }

}