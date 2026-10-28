package androidx.content.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: StructuralMessageInfo.java */
/* loaded from: classes3.dex */
final class y3 implements g2 {

    /* renamed from: a, reason: collision with root package name */
    private final e3 f29060a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f29061b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f29062c;

    /* renamed from: d, reason: collision with root package name */
    private final x0[] f29063d;

    /* renamed from: e, reason: collision with root package name */
    private final i2 f29064e;

    y3(e3 e3Var, boolean z4, int[] iArr, x0[] x0VarArr, Object obj) {
        this.f29060a = e3Var;
        this.f29061b = z4;
        this.f29062c = iArr;
        this.f29063d = x0VarArr;
        this.f29064e = (i2) p1.e(obj, "defaultInstance");
    }

    public static a e() {
        return new a();
    }

    public static a f(int i4) {
        return new a(i4);
    }

    @Override // androidx.content.preferences.protobuf.g2
    public boolean a() {
        return this.f29061b;
    }

    @Override // androidx.content.preferences.protobuf.g2
    public i2 b() {
        return this.f29064e;
    }

    public int[] c() {
        return this.f29062c;
    }

    public x0[] d() {
        return this.f29063d;
    }

    @Override // androidx.content.preferences.protobuf.g2
    public e3 g() {
        return this.f29060a;
    }

    /* compiled from: StructuralMessageInfo.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<x0> f29065a;

        /* renamed from: b, reason: collision with root package name */
        private e3 f29066b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f29067c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f29068d;

        /* renamed from: e, reason: collision with root package name */
        private int[] f29069e;

        /* renamed from: f, reason: collision with root package name */
        private Object f29070f;

        public a() {
            this.f29069e = null;
            this.f29065a = new ArrayList();
        }

        public y3 a() {
            if (this.f29067c) {
                throw new IllegalStateException("Builder can only build once");
            }
            if (this.f29066b == null) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.f29067c = true;
            Collections.sort(this.f29065a);
            return new y3(this.f29066b, this.f29068d, this.f29069e, (x0[]) this.f29065a.toArray(new x0[0]), this.f29070f);
        }

        public void b(int[] iArr) {
            this.f29069e = iArr;
        }

        public void c(Object obj) {
            this.f29070f = obj;
        }

        public void d(x0 x0Var) {
            if (this.f29067c) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.f29065a.add(x0Var);
        }

        public void e(boolean z4) {
            this.f29068d = z4;
        }

        public void f(e3 e3Var) {
            this.f29066b = (e3) p1.e(e3Var, "syntax");
        }

        public a(int i4) {
            this.f29069e = null;
            this.f29065a = new ArrayList(i4);
        }
    }
}
