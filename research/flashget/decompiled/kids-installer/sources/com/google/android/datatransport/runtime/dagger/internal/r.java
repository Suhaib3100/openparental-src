package com.google.android.datatransport.runtime.dagger.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: SetBuilder.java */
/* loaded from: classes2.dex */
public final class r<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f12482b = ProtectedSandApp.s("य");

    /* renamed from: a, reason: collision with root package name */
    private final List<T> f12483a;

    private r(int i5) {
        this.f12483a = new ArrayList(i5);
    }

    public static <T> r<T> d(int i5) {
        return new r<>(i5);
    }

    public r<T> a(T t5) {
        this.f12483a.add(p.c(t5, ProtectedSandApp.s("भ")));
        return this;
    }

    public r<T> b(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            p.c(it.next(), ProtectedSandApp.s("म"));
        }
        this.f12483a.addAll(collection);
        return this;
    }

    public Set<T> c() {
        int size = this.f12483a.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableSet(new HashSet(this.f12483a)) : Collections.singleton(this.f12483a.get(0)) : Collections.emptySet();
    }
}
