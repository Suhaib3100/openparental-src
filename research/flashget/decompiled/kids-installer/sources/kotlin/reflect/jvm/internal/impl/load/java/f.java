package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.load.java.i0;

/* compiled from: specialBuiltinMembers.kt */
/* loaded from: classes5.dex */
public final class f extends i0 {

    /* renamed from: n, reason: collision with root package name */
    @d5.d
    public static final f f24568n = new f();

    /* compiled from: specialBuiltinMembers.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f24569p = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("葛"));
            return Boolean.valueOf(f.f24568n.j(bVar));
        }
    }

    /* compiled from: specialBuiltinMembers.kt */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final b f24570p = new b();

        b() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("葜"));
            return Boolean.valueOf((bVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.z) && f.f24568n.j(bVar));
        }
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        boolean W1;
        i0.f24581a.getClass();
        W1 = kotlin.collections.j0.W1(i0.f24588h, kotlin.reflect.jvm.internal.impl.load.kotlin.w.d(bVar));
        return W1;
    }

    @d5.e
    @p3.n
    public static final kotlin.reflect.jvm.internal.impl.descriptors.z k(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.z zVar) {
        l0.p(zVar, ProtectedSandApp.s("䧤"));
        f fVar = f24568n;
        kotlin.reflect.jvm.internal.impl.name.f name = zVar.getName();
        l0.o(name, ProtectedSandApp.s("䧥"));
        if (fVar.l(name)) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.z) kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(zVar, false, a.f24569p, 1, null);
        }
        return null;
    }

    @d5.e
    @p3.n
    public static final i0.b m(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.b f6;
        String d6;
        l0.p(bVar, ProtectedSandApp.s("䧦"));
        i0.a aVar = i0.f24581a;
        aVar.getClass();
        if (!i0.f24587g.contains(bVar.getName()) || (f6 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(bVar, false, b.f24570p, 1, null)) == null || (d6 = kotlin.reflect.jvm.internal.impl.load.kotlin.w.d(f6)) == null) {
            return null;
        }
        return aVar.l(d6);
    }

    public final boolean l(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("䧧"));
        i0.f24581a.getClass();
        return i0.f24587g.contains(fVar);
    }
}
