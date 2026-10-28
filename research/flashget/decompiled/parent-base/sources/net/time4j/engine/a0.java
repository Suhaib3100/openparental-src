package net.time4j.engine;

/* compiled from: ElementRule.java */
/* loaded from: classes7.dex */
public interface a0<T, V> {
    q<?> getChildAtCeiling(T t4);

    q<?> getChildAtFloor(T t4);

    V getMaximum(T t4);

    V getMinimum(T t4);

    V getValue(T t4);

    boolean isValid(T t4, V v4);

    T withValue(T t4, V v4, boolean z4);
}
