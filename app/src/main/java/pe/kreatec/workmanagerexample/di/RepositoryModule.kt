package pe.kreatec.workmanagerexample.di

import dagger.Module
import dagger.Provides
import pe.kreatec.workmanagerexample.repository.UserRepository
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideUserRepository() : UserRepository = UserRepository()

}