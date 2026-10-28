package org.apache.http.pool;

/* loaded from: classes3.dex */
public interface ConnPoolControl<T> {
    int getDefaultMaxPerRoute();

    int getMaxPerRoute(T t4);

    int getMaxTotal();

    PoolStats getStats(T t4);

    PoolStats getTotalStats();

    void setDefaultMaxPerRoute(int i4);

    void setMaxPerRoute(T t4, int i4);

    void setMaxTotal(int i4);
}
