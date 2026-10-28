package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import java.util.Map;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes5.dex */
public abstract class i1 extends o1 {

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    public static final a f26482c = new a(null);

    /* compiled from: TypeSubstitution.kt */
    public static final class a {

        /* compiled from: TypeSubstitution.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.i1$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0391a extends i1 {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map<h1, l1> f26483d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f26484e;

            /* JADX WARN: Multi-variable type inference failed */
            C0391a(Map<h1, ? extends l1> map, boolean z5) {
                this.f26483d = map;
                this.f26484e = z5;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.o1
            public boolean a() {
                return this.f26484e;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.o1
            public boolean f() {
                return this.f26483d.isEmpty();
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.i1
            @d5.e
            public l1 k(@d5.d h1 h1Var) {
                kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("襓"));
                return this.f26483d.get(h1Var);
            }
        }

        private a() {
        }

        public static /* synthetic */ i1 e(a aVar, Map map, boolean z5, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                z5 = false;
            }
            return aVar.d(map, z5);
        }

        @d5.d
        @p3.n
        public final o1 a(@d5.d h0 h0Var) {
            kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("块"));
            return b(h0Var.U0(), h0Var.S0());
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
        
            if (r2.v0() == true) goto L8;
         */
        @d5.d
        @p3.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.reflect.jvm.internal.impl.types.o1 b(@d5.d kotlin.reflect.jvm.internal.impl.types.h1 r6, @d5.d java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.l1> r7) {
            /*
                r5 = this;
                java.lang.String r0 = "坘"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.p(r6, r0)
                java.lang.String r0 = "坙"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.p(r7, r0)
                java.util.List r0 = r6.r()
                java.lang.String r1 = "坚"
                java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
                kotlin.jvm.internal.l0.o(r0, r1)
                java.lang.Object r2 = kotlin.collections.y.v3(r0)
                kotlin.reflect.jvm.internal.impl.descriptors.f1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.f1) r2
                r3 = 0
                if (r2 == 0) goto L30
                boolean r2 = r2.v0()
                r4 = 1
                if (r2 != r4) goto L30
                goto L31
            L30:
                r4 = r3
            L31:
                if (r4 == 0) goto L6c
                java.util.List r6 = r6.r()
                kotlin.jvm.internal.l0.o(r6, r1)
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = kotlin.collections.y.b0(r6, r1)
                r0.<init>(r1)
                java.util.Iterator r6 = r6.iterator()
            L49:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L5d
                java.lang.Object r1 = r6.next()
                kotlin.reflect.jvm.internal.impl.descriptors.f1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.f1) r1
                kotlin.reflect.jvm.internal.impl.types.h1 r1 = r1.m()
                r0.add(r1)
                goto L49
            L5d:
                java.util.List r6 = kotlin.collections.y.i6(r0, r7)
                java.util.Map r6 = kotlin.collections.c1.B0(r6)
                r7 = 2
                r0 = 0
                kotlin.reflect.jvm.internal.impl.types.i1 r6 = e(r5, r6, r3, r7, r0)
                return r6
            L6c:
                kotlin.reflect.jvm.internal.impl.types.f0 r6 = new kotlin.reflect.jvm.internal.impl.types.f0
                r6.<init>(r0, r7)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.i1.a.b(kotlin.reflect.jvm.internal.impl.types.h1, java.util.List):kotlin.reflect.jvm.internal.impl.types.o1");
        }

        @d5.d
        @p3.j
        @p3.n
        public final i1 c(@d5.d Map<h1, ? extends l1> map) {
            kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("坛"));
            return e(this, map, false, 2, null);
        }

        @d5.d
        @p3.j
        @p3.n
        public final i1 d(@d5.d Map<h1, ? extends l1> map, boolean z5) {
            kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("坜"));
            return new C0391a(map, z5);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    @d5.d
    @p3.n
    public static final o1 i(@d5.d h1 h1Var, @d5.d List<? extends l1> list) {
        return f26482c.b(h1Var, list);
    }

    @d5.d
    @p3.j
    @p3.n
    public static final i1 j(@d5.d Map<h1, ? extends l1> map) {
        return f26482c.c(map);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o1
    @d5.e
    public l1 e(@d5.d h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("坝"));
        return k(h0Var.U0());
    }

    @d5.e
    public abstract l1 k(@d5.d h1 h1Var);
}
