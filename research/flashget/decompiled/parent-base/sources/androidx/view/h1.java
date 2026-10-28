package androidx.view;

import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: ViewModel.java */
/* loaded from: classes3.dex */
public abstract class h1 {

    @q0
    private final Map<String, Object> mBagOfTags;
    private volatile boolean mCleared;

    @q0
    private final Set<Closeable> mCloseables;

    public h1() {
        this.mBagOfTags = new HashMap();
        this.mCloseables = new LinkedHashSet();
        this.mCleared = false;
    }

    private static void closeWithRuntimeException(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    public void addCloseable(@o0 Closeable closeable) {
        Set<Closeable> set = this.mCloseables;
        if (set != null) {
            synchronized (set) {
                this.mCloseables.add(closeable);
            }
        }
    }

    @l0
    final void clear() {
        this.mCleared = true;
        Map<String, Object> map = this.mBagOfTags;
        if (map != null) {
            synchronized (map) {
                try {
                    Iterator<Object> it = this.mBagOfTags.values().iterator();
                    while (it.hasNext()) {
                        closeWithRuntimeException(it.next());
                    }
                } finally {
                }
            }
        }
        Set<Closeable> set = this.mCloseables;
        if (set != null) {
            synchronized (set) {
                try {
                    Iterator<Closeable> it2 = this.mCloseables.iterator();
                    while (it2.hasNext()) {
                        closeWithRuntimeException(it2.next());
                    }
                } finally {
                }
            }
        }
        onCleared();
    }

    <T> T getTag(String str) {
        T t4;
        Map<String, Object> map = this.mBagOfTags;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t4 = (T) this.mBagOfTags.get(str);
        }
        return t4;
    }

    protected void onCleared() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    <T> T setTagIfAbsent(String str, T t4) {
        Object obj;
        synchronized (this.mBagOfTags) {
            try {
                obj = this.mBagOfTags.get(str);
                if (obj == 0) {
                    this.mBagOfTags.put(str, t4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != 0) {
            t4 = obj;
        }
        if (this.mCleared) {
            closeWithRuntimeException(t4);
        }
        return t4;
    }

    public h1(@o0 Closeable... closeableArr) {
        this.mBagOfTags = new HashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.mCloseables = linkedHashSet;
        this.mCleared = false;
        linkedHashSet.addAll(Arrays.asList(closeableArr));
    }
}
