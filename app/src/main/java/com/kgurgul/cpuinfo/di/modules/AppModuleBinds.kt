package com.kgurgul.cpuinfo.di.modules

import com.kgurgul.cpuinfo.appinitializers.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModuleBinds {

    @Binds
    @IntoSet
    abstract fun provideNativeToolsInitializer(bind: NativeToolsInitializer): AppInitializer

    @Binds
    @IntoSet
    abstract fun provideRxInitializer(bind: RxInitializer): AppInitializer

    @Binds
    @IntoSet
    abstract fun provideTimberInitializer(bind: TimberInitializer): AppInitializer

    @Binds
    @IntoSet
    abstract fun provideThemeInitializer(bind: ThemeInitializer): AppInitializer

    @Binds
    @IntoSet
    abstract fun provideEpoxyInitializer(bind: EpoxyInitializer): AppInitializer
}