package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd.n;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.b;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* compiled from: JvmProtoBufUtil.kt */
@r1({"SMAP\nJvmProtoBufUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmProtoBufUtil.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmProtoBufUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1549#2:142\n1620#2,3:143\n1549#2:146\n1620#2,3:147\n1549#2:150\n1620#2,3:151\n1#3:154\n*S KotlinDebug\n*F\n+ 1 JvmProtoBufUtil.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmProtoBufUtil\n*L\n79#1:142\n79#1:143,3\n81#1:146\n81#1:147,3\n103#1:150\n103#1:151,3\n*E\n"})
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final i f77559a = new i();

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final kotlin.reflect.jvm.internal.impl.protobuf.f f77560b;

    static {
        kotlin.reflect.jvm.internal.impl.protobuf.f d5 = kotlin.reflect.jvm.internal.impl.protobuf.f.d();
        kotlin.reflect.jvm.internal.impl.metadata.jvm.a.a(d5);
        l0.o(d5, ProtectedSandApp.s("痆\u0001"));
        f77560b = d5;
    }

    private i() {
    }

    public static /* synthetic */ d.a d(i iVar, a.n nVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, boolean z4, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            z4 = true;
        }
        return iVar.c(nVar, cVar, gVar, z4);
    }

    @n
    public static final boolean f(@l a.n nVar) {
        l0.p(nVar, ProtectedSandApp.s("症\u0001"));
        b.C1156b a5 = c.f77537a.a();
        Object r4 = nVar.r(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f77451e);
        l0.o(r4, ProtectedSandApp.s("痈\u0001"));
        Boolean d5 = a5.d(((Number) r4).intValue());
        l0.o(d5, ProtectedSandApp.s("痉\u0001"));
        return d5.booleanValue();
    }

    private final String g(a.q qVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        if (qVar.m0()) {
            return b.b(cVar.b(qVar.X()));
        }
        return null;
    }

    @l
    @n
    public static final q0<f, a.c> h(@l byte[] bArr, @l String[] strArr) {
        l0.p(bArr, ProtectedSandApp.s("痊\u0001"));
        l0.p(strArr, ProtectedSandApp.s("痋\u0001"));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new q0<>(f77559a.k(byteArrayInputStream, strArr), a.c.y1(byteArrayInputStream, f77560b));
    }

    @l
    @n
    public static final q0<f, a.c> i(@l String[] strArr, @l String[] strArr2) {
        l0.p(strArr, ProtectedSandApp.s("痌\u0001"));
        l0.p(strArr2, ProtectedSandApp.s("痋\u0001"));
        byte[] e4 = a.e(strArr);
        l0.o(e4, ProtectedSandApp.s("痍\u0001"));
        return h(e4, strArr2);
    }

    @l
    @n
    public static final q0<f, a.i> j(@l String[] strArr, @l String[] strArr2) {
        l0.p(strArr, ProtectedSandApp.s("痌\u0001"));
        l0.p(strArr2, ProtectedSandApp.s("痋\u0001"));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.e(strArr));
        return new q0<>(f77559a.k(byteArrayInputStream, strArr2), a.i.G0(byteArrayInputStream, f77560b));
    }

    private final f k(InputStream inputStream, String[] strArr) {
        a.e F = a.e.F(inputStream, f77560b);
        l0.o(F, ProtectedSandApp.s("痎\u0001"));
        return new f(F, strArr);
    }

    @l
    @n
    public static final q0<f, a.l> l(@l byte[] bArr, @l String[] strArr) {
        l0.p(bArr, ProtectedSandApp.s("痊\u0001"));
        l0.p(strArr, ProtectedSandApp.s("痋\u0001"));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new q0<>(f77559a.k(byteArrayInputStream, strArr), a.l.e0(byteArrayInputStream, f77560b));
    }

    @l
    @n
    public static final q0<f, a.l> m(@l String[] strArr, @l String[] strArr2) {
        l0.p(strArr, ProtectedSandApp.s("痌\u0001"));
        l0.p(strArr2, ProtectedSandApp.s("痋\u0001"));
        byte[] e4 = a.e(strArr);
        l0.o(e4, ProtectedSandApp.s("痍\u0001"));
        return l(e4, strArr2);
    }

    @l
    public final kotlin.reflect.jvm.internal.impl.protobuf.f a() {
        return f77560b;
    }

    @m
    public final d.b b(@l a.d dVar, @l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @l kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar) {
        String m32;
        l0.p(dVar, ProtectedSandApp.s("症\u0001"));
        l0.p(cVar, ProtectedSandApp.s("痏\u0001"));
        l0.p(gVar, ProtectedSandApp.s("痐\u0001"));
        h.g<a.d, a.c> gVar2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f77447a;
        l0.o(gVar2, ProtectedSandApp.s("痑\u0001"));
        a.c cVar2 = (a.c) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(dVar, gVar2);
        String s4 = (cVar2 == null || !cVar2.A()) ? ProtectedSandApp.s("痒\u0001") : cVar.getString(cVar2.x());
        if (cVar2 == null || !cVar2.y()) {
            List<a.u> N = dVar.N();
            l0.o(N, ProtectedSandApp.s("痓\u0001"));
            List<a.u> list = N;
            ArrayList arrayList = new ArrayList(w.b0(list, 10));
            for (a.u uVar : list) {
                i iVar = f77559a;
                l0.m(uVar);
                String g4 = iVar.g(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.q(uVar, gVar), cVar);
                if (g4 == null) {
                    return null;
                }
                arrayList.add(g4);
            }
            m32 = w.m3(arrayList, "", ProtectedSandApp.s("痔\u0001"), ProtectedSandApp.s("痕\u0001"), 0, null, null, 56, null);
        } else {
            m32 = cVar.getString(cVar2.v());
        }
        return new d.b(s4, m32);
    }

    @m
    public final d.a c(@l a.n nVar, @l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @l kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, boolean z4) {
        String g4;
        l0.p(nVar, ProtectedSandApp.s("症\u0001"));
        l0.p(cVar, ProtectedSandApp.s("痏\u0001"));
        l0.p(gVar, ProtectedSandApp.s("痐\u0001"));
        h.g<a.n, a.d> gVar2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f77450d;
        l0.o(gVar2, ProtectedSandApp.s("痖\u0001"));
        a.d dVar = (a.d) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(nVar, gVar2);
        if (dVar == null) {
            return null;
        }
        a.b C = dVar.H() ? dVar.C() : null;
        if (C == null && z4) {
            return null;
        }
        int d02 = (C == null || !C.A()) ? nVar.d0() : C.x();
        if (C == null || !C.y()) {
            g4 = g(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.n(nVar, gVar), cVar);
            if (g4 == null) {
                return null;
            }
        } else {
            g4 = cVar.getString(C.v());
        }
        return new d.a(cVar.getString(d02), g4);
    }

    @m
    public final d.b e(@l a.i iVar, @l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @l kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar) {
        String a5;
        l0.p(iVar, ProtectedSandApp.s("症\u0001"));
        l0.p(cVar, ProtectedSandApp.s("痏\u0001"));
        l0.p(gVar, ProtectedSandApp.s("痐\u0001"));
        h.g<a.i, a.c> gVar2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f77448b;
        l0.o(gVar2, ProtectedSandApp.s("痗\u0001"));
        a.c cVar2 = (a.c) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(iVar, gVar2);
        int e02 = (cVar2 == null || !cVar2.A()) ? iVar.e0() : cVar2.x();
        if (cVar2 == null || !cVar2.y()) {
            List P = w.P(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.k(iVar, gVar));
            List<a.u> q02 = iVar.q0();
            l0.o(q02, ProtectedSandApp.s("痓\u0001"));
            List<a.u> list = q02;
            ArrayList arrayList = new ArrayList(w.b0(list, 10));
            for (a.u uVar : list) {
                l0.m(uVar);
                arrayList.add(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.q(uVar, gVar));
            }
            List D4 = w.D4(P, arrayList);
            ArrayList arrayList2 = new ArrayList(w.b0(D4, 10));
            Iterator it = D4.iterator();
            while (it.hasNext()) {
                String g4 = f77559a.g((a.q) it.next(), cVar);
                if (g4 == null) {
                    return null;
                }
                arrayList2.add(g4);
            }
            String g5 = g(kotlin.reflect.jvm.internal.impl.metadata.deserialization.f.m(iVar, gVar), cVar);
            if (g5 == null) {
                return null;
            }
            a5 = android.support.v4.media.c.a(new StringBuilder(), w.m3(arrayList2, "", ProtectedSandApp.s("痔\u0001"), ProtectedSandApp.s("痘\u0001"), 0, null, null, 56, null), g5);
        } else {
            a5 = cVar.getString(cVar2.v());
        }
        return new d.b(cVar.getString(e02), a5);
    }
}
