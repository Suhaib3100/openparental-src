package kotlin.reflect.jvm.internal.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.w;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.load.java.a0;
import kotlin.reflect.jvm.internal.impl.load.java.b0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.t;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.c;

/* compiled from: SpecialJvmAnnotations.kt */
@r1({"SMAP\nSpecialJvmAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialJvmAnnotations.kt\norg/jetbrains/kotlin/SpecialJvmAnnotations\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1620#2,3:43\n*S KotlinDebug\n*F\n+ 1 SpecialJvmAnnotations.kt\norg/jetbrains/kotlin/SpecialJvmAnnotations\n*L\n22#1:43,3\n*E\n"})
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final a f75657a = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final Set<b> f75658b;

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final b f75659c;

    /* compiled from: SpecialJvmAnnotations.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.a$a, reason: collision with other inner class name */
    public static final class C1071a implements t.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1.a f75660a;

        C1071a(k1.a aVar) {
            this.f75660a = aVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.c
        public void a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t.c
        @m
        public t.a c(@l b bVar, @l a1 a1Var) {
            l0.p(bVar, ProtectedSandApp.s("杰\u0001"));
            l0.p(a1Var, ProtectedSandApp.s("東\u0001"));
            if (!l0.g(bVar, a0.f76320a.a())) {
                return null;
            }
            this.f75660a.f75322b = true;
            return null;
        }
    }

    static {
        List O = w.O(b0.f76325a, b0.f76336l, b0.f76337m, b0.f76328d, b0.f76330f, b0.f76333i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = O.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(b.m((c) it.next()));
        }
        f75658b = linkedHashSet;
        b m4 = b.m(b0.f76334j);
        l0.o(m4, ProtectedSandApp.s("杲\u0001"));
        f75659c = m4;
    }

    private a() {
    }

    @l
    public final b a() {
        return f75659c;
    }

    @l
    public final Set<b> b() {
        return f75658b;
    }

    public final boolean c(@l t tVar) {
        l0.p(tVar, ProtectedSandApp.s("杳\u0001"));
        k1.a aVar = new k1.a();
        tVar.p(new C1071a(aVar), null);
        return aVar.f75322b;
    }
}
