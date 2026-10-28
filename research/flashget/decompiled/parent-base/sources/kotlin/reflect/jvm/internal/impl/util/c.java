package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import kotlin.jvm.internal.w;

/* compiled from: ArrayMap.kt */
/* loaded from: classes7.dex */
public abstract class c<T> implements Iterable<T>, md.a {
    public /* synthetic */ c(w wVar) {
        this();
    }

    public abstract int b();

    public abstract void c(int i4, @fg.l T t4);

    @fg.m
    public abstract T get(int i4);

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("肵\u0001"));
    }

    private c() {
    }
}
