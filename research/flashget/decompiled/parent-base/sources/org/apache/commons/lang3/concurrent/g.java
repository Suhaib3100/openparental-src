package org.apache.commons.lang3.concurrent;

/* compiled from: CircuitBreaker.java */
/* loaded from: classes6.dex */
public interface g<T> {
    boolean a();

    boolean b(T t4);

    void close();

    boolean isClosed();

    boolean isOpen();

    void open();
}
