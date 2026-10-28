package android.content.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: StructuralMessageInfo.java */
/* loaded from: classes3.dex */
final class v3 implements f2 {

    /* renamed from: a, reason: collision with root package name */
    private final b3 f7539a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f7540b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f7541c;

    /* renamed from: d, reason: collision with root package name */
    private final x0[] f7542d;

    /* renamed from: e, reason: collision with root package name */
    private final h2 f7543e;

    v3(b3 b3Var, boolean z5, int[] iArr, x0[] x0VarArr, Object obj) {
        this.f7539a = b3Var;
        this.f7540b = z5;
        this.f7541c = iArr;
        this.f7542d = x0VarArr;
        this.f7543e = (h2) o1.e(obj, "defaultInstance");
    }

    public static a f() {
        return new a();
    }

    public static a g(int i5) {
        return new a(i5);
    }

    @Override // android.content.preferences.protobuf.f2
    public boolean a() {
        return this.f7540b;
    }

    @Override // android.content.preferences.protobuf.f2
    public h2 b() {
        return this.f7543e;
    }

    public int[] c() {
        return this.f7541c;
    }

    public x0[] d() {
        return this.f7542d;
    }

    @Override // android.content.preferences.protobuf.f2
    public b3 e() {
        return this.f7539a;
    }

    /* compiled from: StructuralMessageInfo.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<x0> f7544a;

        /* renamed from: b, reason: collision with root package name */
        private b3 f7545b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f7546c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f7547d;

        /* renamed from: e, reason: collision with root package name */
        private int[] f7548e;

        /* renamed from: f, reason: collision with root package name */
        private Object f7549f;

        public a() {
            this.f7548e = null;
            this.f7544a = new ArrayList();
        }

        public v3 a() {
            if (this.f7546c) {
                throw new IllegalStateException("Builder can only build once");
            }
            if (this.f7545b == null) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.f7546c = true;
            Collections.sort(this.f7544a);
            return new v3(this.f7545b, this.f7547d, this.f7548e, (x0[]) this.f7544a.toArray(new x0[0]), this.f7549f);
        }

        public void b(int[] iArr) {
            this.f7548e = iArr;
        }

        public void c(Object obj) {
            this.f7549f = obj;
        }

        public void d(x0 x0Var) {
            if (this.f7546c) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.f7544a.add(x0Var);
        }

        public void e(boolean z5) {
            this.f7547d = z5;
        }

        public void f(b3 b3Var) {
            this.f7545b = (b3) o1.e(b3Var, "syntax");
        }

        public a(int i5) {
            this.f7548e = null;
            this.f7544a = new ArrayList(i5);
        }
    }
}
