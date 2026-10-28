package kotlin.reflect.jvm.internal.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import d5.e;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.load.java.a0;
import kotlin.reflect.jvm.internal.impl.load.java.b0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.r;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.c;

/* compiled from: SpecialJvmAnnotations.kt */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final a f23881a = new a();

    /* renamed from: b, reason: collision with root package name */
    @d
    private static final Set<b> f23882b;

    /* renamed from: c, reason: collision with root package name */
    @d
    private static final b f23883c;

    /* compiled from: SpecialJvmAnnotations.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.a$a, reason: collision with other inner class name */
    public static final class C0267a implements r.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1.a f23884a;

        C0267a(k1.a aVar) {
            this.f23884a = aVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.c
        public void a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r.c
        @e
        public r.a b(@d b bVar, @d a1 a1Var) {
            l0.p(bVar, ProtectedSandApp.s("䏱"));
            l0.p(a1Var, ProtectedSandApp.s("䏲"));
            if (!l0.g(bVar, a0.f24470a.a())) {
                return null;
            }
            this.f23884a.f23565o = true;
            return null;
        }
    }

    static {
        List O;
        O = kotlin.collections.a0.O(b0.f24475a, b0.f24485k, b0.f24486l, b0.f24478d, b0.f24480f, b0.f24483i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = O.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(b.m((c) it.next()));
        }
        f23882b = linkedHashSet;
        b m5 = b.m(b0.f24484j);
        l0.o(m5, ProtectedSandApp.s("䏳"));
        f23883c = m5;
    }

    private a() {
    }

    @d
    public final b a() {
        return f23883c;
    }

    @d
    public final Set<b> b() {
        return f23882b;
    }

    public final boolean c(@d r rVar) {
        l0.p(rVar, ProtectedSandApp.s("䏴"));
        k1.a aVar = new k1.a();
        rVar.b(new C0267a(aVar), null);
        return aVar.f23565o;
    }
}
