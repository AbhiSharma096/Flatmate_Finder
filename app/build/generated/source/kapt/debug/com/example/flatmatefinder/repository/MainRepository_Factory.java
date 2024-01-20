// Generated by Dagger (https://dagger.dev).
package com.example.flatmatefinder.repository;

import com.example.flatmatefinder.api.MainAPI;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class MainRepository_Factory implements Factory<MainRepository> {
  private final Provider<MainAPI> mainAPIProvider;

  public MainRepository_Factory(Provider<MainAPI> mainAPIProvider) {
    this.mainAPIProvider = mainAPIProvider;
  }

  @Override
  public MainRepository get() {
    return newInstance(mainAPIProvider.get());
  }

  public static MainRepository_Factory create(Provider<MainAPI> mainAPIProvider) {
    return new MainRepository_Factory(mainAPIProvider);
  }

  public static MainRepository newInstance(MainAPI mainAPI) {
    return new MainRepository(mainAPI);
  }
}