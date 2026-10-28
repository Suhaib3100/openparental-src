package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import kotlin.jvm.internal.w;

/* compiled from: ArrayMap.kt */
/* loaded from: classes5.dex */
public abstract class c<T> implements Iterable<T>, r3.a {
    public /* synthetic */ c(w wVar) {
        this();
    }

    public abstract int b();

    public abstract void f(int i5, @d5.d T t5);

    @d5.e
    public abstract T get(int i5);

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("塽"));
    }

    private c() {
    }
}
