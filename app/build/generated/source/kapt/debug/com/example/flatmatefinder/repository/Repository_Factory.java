// Generated by Dagger (https://dagger.dev).
package com.example.flatmatefinder.repository;

import com.example.flatmatefinder.api.API;
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
public final class Repository_Factory implements Factory<Repository> {
  private final Provider<API> apiProvider;

  public Repository_Factory(Provider<API> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public Repository get() {
    return newInstance(apiProvider.get());
  }

  public static Repository_Factory create(Provider<API> apiProvider) {
    return new Repository_Factory(apiProvider);
  }

  public static Repository newInstance(API api) {
    return new Repository(api);
  }
}
