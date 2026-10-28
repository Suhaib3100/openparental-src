package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l0;

/* compiled from: ArrayMap.kt */
/* loaded from: classes7.dex */
public final class i extends c {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final i f78601b = new i(null);

    /* compiled from: ArrayMap.kt */
    public static final class a implements Iterator, md.a {
        a() {
        }

        @fg.l
        public Void b() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("胅\u0001"));
        }
    }

    private i() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public int b() {
        return 0;
    }

    @fg.m
    public Void f(int i4) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public Object get(int i4) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void c(int i4, @fg.l Void r22) {
        l0.p(r22, ProtectedSandApp.s("胆\u0001"));
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c, java.lang.Iterable
    @fg.l
    public Iterator iterator() {
        return new a();
    }
}
