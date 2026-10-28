package o8;

import java.lang.Throwable;

/* compiled from: Function.java */
/* loaded from: classes5.dex */
public interface a<TInput, TResult, TException extends Throwable> {
    TResult apply(TInput tinput) throws Throwable;
}
