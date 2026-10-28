package androidx.databinding;

import java.util.Map;

/* compiled from: ObservableMap.java */
/* loaded from: classes.dex */
public interface z<K, V> extends Map<K, V> {

    /* compiled from: ObservableMap.java */
    public static abstract class a<T extends z<K, V>, K, V> {
        public abstract void a(T sender, K key);
    }

    void a(a<? extends z<K, V>, K, V> callback);

    void b(a<? extends z<K, V>, K, V> callback);
}
