package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.storage.f;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.types.f0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.k0;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.n1;
import kotlin.reflect.jvm.internal.impl.types.o1;
import kotlin.reflect.jvm.internal.impl.types.r;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: CapturedTypeConstructor.kt */
@r1({"SMAP\nCapturedTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CapturedTypeConstructor.kt\norg/jetbrains/kotlin/resolve/calls/inference/CapturedTypeConstructorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,153:1\n1549#2:154\n1620#2,3:155\n37#3,2:158\n*S KotlinDebug\n*F\n+ 1 CapturedTypeConstructor.kt\norg/jetbrains/kotlin/resolve/calls/inference/CapturedTypeConstructorKt\n*L\n125#1:154\n125#1:155,3\n127#1:158,2\n*E\n"})
/* loaded from: classes7.dex */
public final class d {

    /* compiled from: CapturedTypeConstructor.kt */
    static final class a extends n0 implements ld.a<h0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l1 f77870b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l1 l1Var) {
            super(0);
            this.f77870b = l1Var;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            h0 type = this.f77870b.getType();
            l0.o(type, ProtectedSandApp.s("碇\u0001"));
            return type;
        }
    }

    /* compiled from: CapturedTypeConstructor.kt */
    public static final class b extends r {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f77871d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o1 o1Var, boolean z4) {
            super(o1Var);
            this.f77871d = z4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.r, kotlin.reflect.jvm.internal.impl.types.o1
        public boolean b() {
            return this.f77871d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.r, kotlin.reflect.jvm.internal.impl.types.o1
        @m
        public l1 e(@l h0 h0Var) {
            l0.p(h0Var, ProtectedSandApp.s("碍\u0001"));
            l1 e4 = super.e(h0Var);
            if (e4 == null) {
                return null;
            }
            h c5 = h0Var.O0().c();
            return d.b(e4, c5 instanceof f1 ? (f1) c5 : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l1 b(l1 l1Var, f1 f1Var) {
        if (f1Var == null || l1Var.c() == x1.INVARIANT) {
            return l1Var;
        }
        if (f1Var.o() != l1Var.c()) {
            return new n1(c(l1Var));
        }
        if (!l1Var.b()) {
            return new n1(l1Var.getType());
        }
        n nVar = f.f78308e;
        l0.o(nVar, ProtectedSandApp.s("碎\u0001"));
        return new n1(new k0(nVar, new a(l1Var)));
    }

    @l
    public static final h0 c(@l l1 l1Var) {
        l0.p(l1Var, ProtectedSandApp.s("碏\u0001"));
        return new kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a(l1Var, null, false, null, 14, null);
    }

    public static final boolean d(@l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("碐\u0001"));
        return h0Var.O0() instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b;
    }

    @l
    public static final o1 e(@l o1 o1Var, boolean z4) {
        l0.p(o1Var, ProtectedSandApp.s("碐\u0001"));
        if (!(o1Var instanceof f0)) {
            return new b(o1Var, z4);
        }
        f0 f0Var = (f0) o1Var;
        f1[] j4 = f0Var.j();
        List<q0> uA = kotlin.collections.l.uA(f0Var.i(), f0Var.j());
        ArrayList arrayList = new ArrayList(w.b0(uA, 10));
        for (q0 q0Var : uA) {
            arrayList.add(b((l1) q0Var.e(), (f1) q0Var.f()));
        }
        return new f0(j4, (l1[]) arrayList.toArray(new l1[0]), z4);
    }

    public static /* synthetic */ o1 f(o1 o1Var, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        return e(o1Var, z4);
    }
}
