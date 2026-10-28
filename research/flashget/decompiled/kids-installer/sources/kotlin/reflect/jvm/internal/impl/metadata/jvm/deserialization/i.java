package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a0;
import kotlin.collections.b0;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.b;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import p3.n;

/* compiled from: JvmProtoBufUtil.kt */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final i f25577a = new i();

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.protobuf.f f25578b;

    static {
        kotlin.reflect.jvm.internal.impl.protobuf.f d6 = kotlin.reflect.jvm.internal.impl.protobuf.f.d();
        kotlin.reflect.jvm.internal.impl.metadata.jvm.a.a(d6);
        l0.o(d6, ProtectedSandApp.s("丑"));
        f25578b = d6;
    }

    private i() {
    }

    public static /* synthetic */ d.a d(i iVar, a.n nVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, boolean z5, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            z5 = true;
        }
        return iVar.c(nVar, cVar, gVar, z5);
    }

    @n
    public static final boolean f(@d5.d a.n nVar) {
        l0.p(nVar, ProtectedSandApp.s("丒"));
        b.C0351b a6 = c.f25556a.a();
        Object r5 = nVar.r(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f25473e);
        l0.o(r5, ProtectedSandApp.s("专"));
        Boolean d6 = a6.d(((Number) r5).intValue());
        l0.o(d6, ProtectedSandApp.s("且"));
        return d6.booleanValue();
    }

    private final String g(a.q qVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        if (qVar.m0()) {
            return b.b(cVar.a(qVar.W()));
        }
        return null;
    }

    @d5.d
    @n
    public static final Pair<f, a.c> h(@d5.d byte[] bArr, @d5.d String[] strArr) {
        l0.p(bArr, ProtectedSandApp.s("丕"));
        l0.p(strArr, ProtectedSandApp.s("世"));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair<>(f25577a.k(byteArrayInputStream, strArr), a.c.x1(byteArrayInputStream, f25578b));
    }

    @d5.d
    @n
    public static final Pair<f, a.c> i(@d5.d String[] strArr, @d5.d String[] strArr2) {
        l0.p(strArr, ProtectedSandApp.s("丗"));
        l0.p(strArr2, ProtectedSandApp.s("丘"));
        byte[] e6 = a.e(strArr);
        l0.o(e6, ProtectedSandApp.s("丙"));
        return h(e6, strArr2);
    }

    @d5.d
    @n
    public static final Pair<f, a.i> j(@d5.d String[] strArr, @d5.d String[] strArr2) {
        l0.p(strArr, ProtectedSandApp.s("业"));
        l0.p(strArr2, ProtectedSandApp.s("丛"));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.e(strArr));
        return new Pair<>(f25577a.k(byteArrayInputStream, strArr2), a.i.F0(byteArrayInputStream, f25578b));
    }

    private final f k(InputStream inputStream, String[] strArr) {
        a.e E = a.e.E(inputStream, f25578b);
        l0.o(E, ProtectedSandApp.s("东"));
        return new f(E, strArr);
    }

    @d5.d
    @n
    public static final Pair<f, a.l> l(@d5.d byte[] bArr, @d5.d String[] strArr) {
        l0.p(bArr, ProtectedSandApp.s("丝"));
        l0.p(strArr, ProtectedSandApp.s("丞"));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair<>(f25577a.k(byteArrayInputStream, strArr), a.l.e0(byteArrayInputStream, f25578b));
    }

    @d5.d
    @n
    public static final Pair<f, a.l> m(@d5.d String[] strArr, @d5.d String[] strArr2) {
        l0.p(strArr, ProtectedSandApp.s("丟"));
        l0.p(strArr2, ProtectedSandApp.s("丠"));
        byte[] e6 = a.e(strArr);
        l0.o(e6, ProtectedSandApp.s("両"));
        return l(e6, strArr2);
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.protobuf.f a() {
        return f25578b;
    }

    @d5.e
    public final d.b b(@d5.d a.d dVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar) {
        int b02;
        String m32;
        l0.p(dVar, ProtectedSandApp.s("丢"));
        l0.p(cVar, ProtectedSandApp.s("丣"));
        l0.p(gVar, ProtectedSandApp.s("两"));
        h.g<a.d, a.c> gVar2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f25469a;
        l0.o(gVar2, ProtectedSandApp.s("严"));
        a.c cVar2 = (a.c) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(dVar, gVar2);
        String s5 = (cVar2 == null || !cVar2.A()) ? ProtectedSandApp.s("並") : cVar.getString(cVar2.w());
        if (cVar2 == null || !cVar2.y()) {
            List<a.u> M = dVar.M();
            l0.o(M, ProtectedSandApp.s("丧"));
            b02 = b0.b0(M, 10);
            ArrayList arrayList = new ArrayList(b02);
            for (a.u uVar : M) {
                i iVar = f25577a;
                l0.o(uVar, ProtectedSandApp.s("丨"));
                String g5 = iVar.g(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.q(uVar, gVar), cVar);
                if (g5 == null) {
                    return null;
                }
                arrayList.add(g5);
            }
            m32 = j0.m3(arrayList, "", ProtectedSandApp.s("丩"), ProtectedSandApp.s("个"), 0, null, null, 56, null);
        } else {
            m32 = cVar.getString(cVar2.v());
        }
        return new d.b(s5, m32);
    }

    @d5.e
    public final d.a c(@d5.d a.n nVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, boolean z5) {
        String g5;
        l0.p(nVar, ProtectedSandApp.s("丫"));
        l0.p(cVar, ProtectedSandApp.s("丬"));
        l0.p(gVar, ProtectedSandApp.s("中"));
        h.g<a.n, a.d> gVar2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f25472d;
        l0.o(gVar2, ProtectedSandApp.s("丮"));
        a.d dVar = (a.d) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(nVar, gVar2);
        if (dVar == null) {
            return null;
        }
        a.b B = dVar.G() ? dVar.B() : null;
        if (B == null && z5) {
            return null;
        }
        int d02 = (B == null || !B.A()) ? nVar.d0() : B.w();
        if (B == null || !B.y()) {
            g5 = g(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.n(nVar, gVar), cVar);
            if (g5 == null) {
                return null;
            }
        } else {
            g5 = cVar.getString(B.v());
        }
        return new d.a(cVar.getString(d02), g5);
    }

    @d5.e
    public final d.b e(@d5.d a.i iVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar) {
        List P;
        int b02;
        List D4;
        int b03;
        String m32;
        String a6;
        l0.p(iVar, ProtectedSandApp.s("丯"));
        l0.p(cVar, ProtectedSandApp.s("丰"));
        l0.p(gVar, ProtectedSandApp.s("丱"));
        h.g<a.i, a.c> gVar2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f25470b;
        l0.o(gVar2, ProtectedSandApp.s("串"));
        a.c cVar2 = (a.c) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(iVar, gVar2);
        int e02 = (cVar2 == null || !cVar2.A()) ? iVar.e0() : cVar2.w();
        if (cVar2 == null || !cVar2.y()) {
            P = a0.P(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.k(iVar, gVar));
            List<a.u> q02 = iVar.q0();
            l0.o(q02, ProtectedSandApp.s("丳"));
            b02 = b0.b0(q02, 10);
            ArrayList arrayList = new ArrayList(b02);
            for (a.u uVar : q02) {
                l0.o(uVar, ProtectedSandApp.s("临"));
                arrayList.add(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.q(uVar, gVar));
            }
            D4 = j0.D4(P, arrayList);
            b03 = b0.b0(D4, 10);
            ArrayList arrayList2 = new ArrayList(b03);
            Iterator it = D4.iterator();
            while (it.hasNext()) {
                String g5 = f25577a.g((a.q) it.next(), cVar);
                if (g5 == null) {
                    return null;
                }
                arrayList2.add(g5);
            }
            String g6 = g(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.m(iVar, gVar), cVar);
            if (g6 == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            m32 = j0.m3(arrayList2, "", ProtectedSandApp.s("丵"), ProtectedSandApp.s("丶"), 0, null, null, 56, null);
            a6 = androidx.concurrent.futures.a.a(sb, m32, g6);
        } else {
            a6 = cVar.getString(cVar2.v());
        }
        return new d.b(cVar.getString(e02), a6);
    }
}
