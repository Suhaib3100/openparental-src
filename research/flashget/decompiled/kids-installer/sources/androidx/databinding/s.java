package androidx.databinding;

import androidx.annotation.o0;
import androidx.core.util.p;
import androidx.databinding.i;
import androidx.databinding.y;

/* compiled from: ListChangeRegistry.java */
/* loaded from: classes3.dex */
public class s extends i<y.a, y, b> {

    /* renamed from: v, reason: collision with root package name */
    private static final int f6915v = 0;

    /* renamed from: w, reason: collision with root package name */
    private static final int f6916w = 1;

    /* renamed from: x, reason: collision with root package name */
    private static final int f6917x = 2;

    /* renamed from: y, reason: collision with root package name */
    private static final int f6918y = 3;

    /* renamed from: z, reason: collision with root package name */
    private static final int f6919z = 4;

    /* renamed from: u, reason: collision with root package name */
    private static final p.c<b> f6914u = new p.c<>(10);
    private static final i.a<y.a, y, b> A = new a();

    /* compiled from: ListChangeRegistry.java */
    class a extends i.a<y.a, y, b> {
        a() {
        }

        @Override // androidx.databinding.i.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(y.a aVar, y yVar, int i5, b bVar) {
            if (i5 == 1) {
                aVar.f(yVar, bVar.f6920a, bVar.f6921b);
                return;
            }
            if (i5 == 2) {
                aVar.g(yVar, bVar.f6920a, bVar.f6921b);
                return;
            }
            if (i5 == 3) {
                aVar.h(yVar, bVar.f6920a, bVar.f6922c, bVar.f6921b);
            } else if (i5 != 4) {
                aVar.a(yVar);
            } else {
                aVar.i(yVar, bVar.f6920a, bVar.f6921b);
            }
        }
    }

    /* compiled from: ListChangeRegistry.java */
    /* loaded from: classes.dex */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f6920a;

        /* renamed from: b, reason: collision with root package name */
        public int f6921b;

        /* renamed from: c, reason: collision with root package name */
        public int f6922c;

        b() {
        }
    }

    public s() {
        super(A);
    }

    private static b s(int i5, int i6, int i7) {
        b b6 = f6914u.b();
        if (b6 == null) {
            b6 = new b();
        }
        b6.f6920a = i5;
        b6.f6922c = i6;
        b6.f6921b = i7;
        return b6;
    }

    @Override // androidx.databinding.i
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public synchronized void j(@o0 y yVar, int i5, b bVar) {
        super.j(yVar, i5, bVar);
        if (bVar != null) {
            f6914u.a(bVar);
        }
    }

    public void v(@o0 y yVar) {
        j(yVar, 0, null);
    }

    public void w(@o0 y yVar, int i5, int i6) {
        j(yVar, 1, s(i5, 0, i6));
    }

    public void x(@o0 y yVar, int i5, int i6) {
        j(yVar, 2, s(i5, 0, i6));
    }

    public void y(@o0 y yVar, int i5, int i6, int i7) {
        j(yVar, 3, s(i5, i6, i7));
    }

    public void z(@o0 y yVar, int i5, int i6) {
        j(yVar, 4, s(i5, 0, i6));
    }
}
