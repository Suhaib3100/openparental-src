package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a0;
import kotlin.collections.j0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.util.k;
import kotlin.reflect.jvm.internal.impl.util.r;
import kotlin.reflect.jvm.internal.impl.util.t;

/* compiled from: modifierChecks.kt */
/* loaded from: classes5.dex */
public final class p extends kotlin.reflect.jvm.internal.impl.util.b {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final p f26606a = new p();

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final List<h> f26607b;

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l<z, String> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f26608p = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String N(@d5.d z zVar) {
            Object v32;
            l0.p(zVar, ProtectedSandApp.s("觇"));
            List<j1> n5 = zVar.n();
            l0.o(n5, ProtectedSandApp.s("览"));
            v32 = j0.v3(n5);
            j1 j1Var = (j1) v32;
            boolean z5 = false;
            if (j1Var != null) {
                if (!kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.c(j1Var) && j1Var.s0() == null) {
                    z5 = true;
                }
            }
            p pVar = p.f26606a;
            if (z5) {
                return null;
            }
            return ProtectedSandApp.s("觉");
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.l<z, String> {

        /* renamed from: p, reason: collision with root package name */
        public static final b f26609p = new b();

        b() {
            super(1);
        }

        private static final boolean b(kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
            return (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && kotlin.reflect.jvm.internal.impl.builtins.h.a0((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar);
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String N(@d5.d z zVar) {
            boolean z5;
            l0.p(zVar, ProtectedSandApp.s("觊"));
            p pVar = p.f26606a;
            kotlin.reflect.jvm.internal.impl.descriptors.m b6 = zVar.b();
            l0.o(b6, ProtectedSandApp.s("觋"));
            boolean z6 = true;
            if (!b(b6)) {
                Collection<? extends z> g5 = zVar.g();
                l0.o(g5, ProtectedSandApp.s("觌"));
                if (!g5.isEmpty()) {
                    Iterator<T> it = g5.iterator();
                    while (it.hasNext()) {
                        kotlin.reflect.jvm.internal.impl.descriptors.m b7 = ((z) it.next()).b();
                        l0.o(b7, ProtectedSandApp.s("觍"));
                        if (b(b7)) {
                            z5 = true;
                            break;
                        }
                    }
                }
                z5 = false;
                if (!z5) {
                    z6 = false;
                }
            }
            if (z6) {
                return null;
            }
            return ProtectedSandApp.s("觎");
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.l<z, String> {

        /* renamed from: p, reason: collision with root package name */
        public static final c f26610p = new c();

        c() {
            super(1);
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String N(@d5.d z zVar) {
            boolean z5;
            l0.p(zVar, ProtectedSandApp.s("觏"));
            x0 m02 = zVar.m0();
            if (m02 == null) {
                m02 = zVar.t0();
            }
            p pVar = p.f26606a;
            boolean z6 = false;
            if (m02 != null) {
                h0 i5 = zVar.i();
                if (i5 != null) {
                    h0 type = m02.getType();
                    l0.o(type, ProtectedSandApp.s("觐"));
                    z5 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.p(i5, type);
                } else {
                    z5 = false;
                }
                if (z5 || pVar.d(zVar, m02)) {
                    z6 = true;
                }
            }
            if (z6) {
                return null;
            }
            return ProtectedSandApp.s("觑");
        }
    }

    static {
        List O;
        List<h> O2;
        kotlin.reflect.jvm.internal.impl.name.f fVar = q.f26621k;
        k.b bVar = k.b.f26598b;
        f[] fVarArr = {bVar, new t.a(1)};
        kotlin.reflect.jvm.internal.impl.name.f fVar2 = q.f26622l;
        f[] fVarArr2 = {bVar, new t.a(2)};
        kotlin.reflect.jvm.internal.impl.name.f fVar3 = q.f26612b;
        m mVar = m.f26600a;
        j jVar = j.f26594a;
        kotlin.reflect.jvm.internal.impl.name.f fVar4 = q.f26618h;
        t.d dVar = t.d.f26653b;
        r.a aVar = r.a.f26640d;
        kotlin.reflect.jvm.internal.impl.name.f fVar5 = q.f26620j;
        t.c cVar = t.c.f26652b;
        O = a0.O(q.f26634x, q.f26635y);
        O2 = a0.O(new h(fVar, fVarArr, (q3.l) null, 4, (w) null), new h(fVar2, fVarArr2, a.f26608p), new h(fVar3, new f[]{bVar, mVar, new t.a(2), jVar}, (q3.l) null, 4, (w) null), new h(q.f26613c, new f[]{bVar, mVar, new t.a(3), jVar}, (q3.l) null, 4, (w) null), new h(q.f26614d, new f[]{bVar, mVar, new t.b(2), jVar}, (q3.l) null, 4, (w) null), new h(q.f26619i, new f[]{bVar}, (q3.l) null, 4, (w) null), new h(fVar4, new f[]{bVar, dVar, mVar, aVar}, (q3.l) null, 4, (w) null), new h(fVar5, new f[]{bVar, cVar}, (q3.l) null, 4, (w) null), new h(q.f26623m, new f[]{bVar, cVar}, (q3.l) null, 4, (w) null), new h(q.f26624n, new f[]{bVar, cVar, aVar}, (q3.l) null, 4, (w) null), new h(q.I, new f[]{bVar, dVar, mVar}, (q3.l) null, 4, (w) null), new h(q.J, new f[]{bVar, dVar, mVar}, (q3.l) null, 4, (w) null), new h(q.f26615e, new f[]{k.a.f26597b}, b.f26609p), new h(q.f26617g, new f[]{bVar, r.b.f26642d, dVar, mVar}, (q3.l) null, 4, (w) null), new h(q.S, new f[]{bVar, dVar, mVar}, (q3.l) null, 4, (w) null), new h(q.R, new f[]{bVar, cVar}, (q3.l) null, 4, (w) null), new h(O, new f[]{bVar}, c.f26610p), new h(q.T, new f[]{bVar, r.c.f26644d, dVar, mVar}, (q3.l) null, 4, (w) null), new h(q.f26626p, new f[]{bVar, cVar}, (q3.l) null, 4, (w) null));
        f26607b = O2;
    }

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(z zVar, x0 x0Var) {
        kotlin.reflect.jvm.internal.impl.name.b k5;
        h0 i5;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h value = x0Var.getValue();
        l0.o(value, ProtectedSandApp.s("墛"));
        if (!(value instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e D = ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e) value).D();
        if (!D.U() || (k5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.k(D)) == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = y.b(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.p(D), k5);
        if (!(b6 instanceof e1)) {
            b6 = null;
        }
        e1 e1Var = (e1) b6;
        if (e1Var == null || (i5 = zVar.i()) == null) {
            return false;
        }
        return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.p(i5, e1Var.d0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.b
    @d5.d
    public List<h> b() {
        return f26607b;
    }
}
