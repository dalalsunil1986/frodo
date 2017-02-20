package com.fernandocejas.frodo.internal.observable;

import com.fernandocejas.frodo.internal.messenger.ObservableMessageManager;
import com.fernandocejas.frodo.joinpoint.FrodoProceedingJoinPoint;
import rx.Observable;

@SuppressWarnings("unchecked") class LogNothingObservable extends LoggableObservable {

  LogNothingObservable(FrodoProceedingJoinPoint joinPoint,
                       ObservableMessageManager messageManager, ObservableInfo observableInfo) {
    super(joinPoint, messageManager, observableInfo);
  }

  @Override <T> Observable<T> get(T type) throws Throwable {
    return ((Observable<T>) joinPoint.proceed());
  }
}
