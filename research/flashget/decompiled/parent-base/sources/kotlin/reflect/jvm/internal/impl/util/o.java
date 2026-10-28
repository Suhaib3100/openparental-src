package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l0;

/* compiled from: ArrayMap.kt */
/* loaded from: classes7.dex */
public final class o<T> extends c<T> {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final T f78610b;

    /* renamed from: c, reason: collision with root package name */
    private final int f78611c;

    /* compiled from: ArrayMap.kt */
    public static final class a implements Iterator<T>, md.a {

        /* renamed from: b, reason: collision with root package name */
        private boolean f78612b = true;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ o<T> f78613c;

        a(o<T> oVar) {
            this.f78613c = oVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f78612b;
        }

        @Override // java.util.Iterator
        @fg.l
        public T next() {
            if (!this.f78612b) {
                throw new NoSuchElementException();
            }
            this.f78612b = false;
            return this.f78613c.h();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("胕\u0001"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@fg.l T t4, int i4) {
        super(null);
        l0.p(t4, ProtectedSandApp.s("胖\u0001"));
        this.f78610b = t4;
        this.f78611c = i4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public int b() {
        return 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public void c(int i4, @fg.l T t4) {
        l0.p(t4, ProtectedSandApp.s("胖\u0001"));
        throw new IllegalStateException();
    }

    public final int f() {
        return this.f78611c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    @fg.m
    public T get(int i4) {
        if (i4 == this.f78611c) {
            return this.f78610b;
        }
        return null;
    }

    @fg.l
    public final T h() {
        return this.f78610b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c, java.lang.Iterable
    @fg.l
    public Iterator<T> iterator() {
        return new a(this);
    }
}
