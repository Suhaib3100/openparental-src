package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.collections.t;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
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
/* loaded from: classes5.dex */
public final class d {

    /* compiled from: CapturedTypeConstructor.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.a<h0> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ l1 f25893p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l1 l1Var) {
            super(0);
            this.f25893p = l1Var;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 n() {
            h0 type = this.f25893p.getType();
            l0.o(type, ProtectedSandApp.s("虔"));
            return type;
        }
    }

    /* compiled from: CapturedTypeConstructor.kt */
    /* loaded from: classes6.dex */
    public static final class b extends r {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f25894d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o1 o1Var, boolean z5) {
            super(o1Var);
            this.f25894d = z5;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.r, kotlin.reflect.jvm.internal.impl.types.o1
        public boolean b() {
            return this.f25894d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.r, kotlin.reflect.jvm.internal.impl.types.o1
        @e
        public l1 e(@d5.d h0 h0Var) {
            l0.p(h0Var, ProtectedSandApp.s("處"));
            l1 e6 = super.e(h0Var);
            if (e6 == null) {
                return null;
            }
            h b6 = h0Var.U0().b();
            return d.b(e6, b6 instanceof f1 ? (f1) b6 : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l1 b(l1 l1Var, f1 f1Var) {
        if (f1Var == null || l1Var.b() == x1.INVARIANT) {
            return l1Var;
        }
        if (f1Var.z() != l1Var.b()) {
            return new n1(c(l1Var));
        }
        if (!l1Var.c()) {
            return new n1(l1Var.getType());
        }
        n nVar = f.f26300e;
        l0.o(nVar, ProtectedSandApp.s("兮"));
        return new n1(new k0(nVar, new a(l1Var)));
    }

    @d5.d
    public static final h0 c(@d5.d l1 l1Var) {
        l0.p(l1Var, ProtectedSandApp.s("兯"));
        return new kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a(l1Var, null, false, null, 14, null);
    }

    public static final boolean d(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("兰"));
        return h0Var.U0() instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b;
    }

    @d5.d
    public static final o1 e(@d5.d o1 o1Var, boolean z5) {
        List<Pair> tA;
        int b02;
        l0.p(o1Var, ProtectedSandApp.s("共"));
        if (!(o1Var instanceof f0)) {
            return new b(o1Var, z5);
        }
        f0 f0Var = (f0) o1Var;
        f1[] j5 = f0Var.j();
        tA = t.tA(f0Var.i(), f0Var.j());
        b02 = b0.b0(tA, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (Pair pair : tA) {
            arrayList.add(b((l1) pair.e(), (f1) pair.f()));
        }
        return new f0(j5, (l1[]) arrayList.toArray(new l1[0]), z5);
    }

    public static /* synthetic */ o1 f(o1 o1Var, boolean z5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z5 = true;
        }
        return e(o1Var, z5);
    }
}
