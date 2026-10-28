package com.annimon.stream;

import com.annimon.stream.function.a1;
import com.annimon.stream.function.q;

/* compiled from: Collector.java */
/* loaded from: classes3.dex */
public interface a<T, A, R> {
    com.annimon.stream.function.a<A, T> accumulator();

    q<A, R> finisher();

    a1<A> supplier();
}
