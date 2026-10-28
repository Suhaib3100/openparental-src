package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.x;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.reflect.jvm.internal.impl.storage.n;

/* compiled from: JvmBuiltIns.kt */
/* loaded from: classes5.dex */
public final class f extends kotlin.reflect.jvm.internal.impl.builtins.h {

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f23974l = {l1.u(new g1(l1.d(f.class), ProtectedSandApp.s("䕦"), ProtectedSandApp.s("䕧")))};

    /* renamed from: i, reason: collision with root package name */
    @d5.d
    private final a f23975i;

    /* renamed from: j, reason: collision with root package name */
    @d5.e
    private q3.a<b> f23976j;

    /* renamed from: k, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f23977k;

    /* compiled from: JvmBuiltIns.kt */
    public enum a {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    /* compiled from: JvmBuiltIns.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        private final h0 f23978a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f23979b;

        public b(@d5.d h0 h0Var, boolean z5) {
            l0.p(h0Var, ProtectedSandApp.s("䕥"));
            this.f23978a = h0Var;
            this.f23979b = z5;
        }

        @d5.d
        public final h0 a() {
            return this.f23978a;
        }

        public final boolean b() {
            return this.f23979b;
        }
    }

    /* compiled from: JvmBuiltIns.kt */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23980a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23980a = iArr;
        }
    }

    /* compiled from: JvmBuiltIns.kt */
    /* loaded from: classes6.dex */
    static final class d extends Lambda implements q3.a<i> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ n f23982q;

        /* compiled from: JvmBuiltIns.kt */
        static final class a extends Lambda implements q3.a<b> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ f f23983p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(0);
                this.f23983p = fVar;
            }

            @Override // q3.a
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b n() {
                q3.a aVar = this.f23983p.f23976j;
                if (aVar == null) {
                    throw new AssertionError(ProtectedSandApp.s("胡"));
                }
                b bVar = (b) aVar.n();
                this.f23983p.f23976j = null;
                return bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(n nVar) {
            super(0);
            this.f23982q = nVar;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i n() {
            x r5 = f.this.r();
            l0.o(r5, ProtectedSandApp.s("胢"));
            return new i(r5, this.f23982q, new a(f.this));
        }
    }

    /* compiled from: JvmBuiltIns.kt */
    /* loaded from: classes6.dex */
    static final class e extends Lambda implements q3.a<b> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ h0 f23984p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f23985q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(h0 h0Var, boolean z5) {
            super(0);
            this.f23984p = h0Var;
            this.f23985q = z5;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b n() {
            return new b(this.f23984p, this.f23985q);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@d5.d n nVar, @d5.d a aVar) {
        super(nVar);
        l0.p(nVar, ProtectedSandApp.s("䕨"));
        l0.p(aVar, ProtectedSandApp.s("䕩"));
        this.f23975i = aVar;
        this.f23977k = nVar.d(new d(nVar));
        int i5 = c.f23980a[aVar.ordinal()];
        if (i5 == 2) {
            f(false);
        } else {
            if (i5 != 3) {
                return;
            }
            f(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.builtins.h
    @d5.d
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public List<w3.b> v() {
        List<w3.b> A4;
        Iterable<w3.b> v5 = super.v();
        l0.o(v5, ProtectedSandApp.s("䕪"));
        n U = U();
        l0.o(U, ProtectedSandApp.s("䕫"));
        x r5 = r();
        l0.o(r5, ProtectedSandApp.s("䕬"));
        A4 = j0.A4(v5, new kotlin.reflect.jvm.internal.impl.builtins.jvm.e(U, r5, null, 4, null));
        return A4;
    }

    @d5.d
    public final i H0() {
        return (i) m.a(this.f23977k, this, f23974l[0]);
    }

    public final void I0(@d5.d h0 h0Var, boolean z5) {
        l0.p(h0Var, ProtectedSandApp.s("䕭"));
        J0(new e(h0Var, z5));
    }

    public final void J0(@d5.d q3.a<b> aVar) {
        l0.p(aVar, ProtectedSandApp.s("䕮"));
        this.f23976j = aVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.h
    @d5.d
    protected w3.c M() {
        return H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.h
    @d5.d
    protected w3.a g() {
        return H0();
    }
}
