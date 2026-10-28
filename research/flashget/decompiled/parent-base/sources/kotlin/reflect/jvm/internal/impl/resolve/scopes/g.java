package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;

/* compiled from: LazyScopeAdapter.kt */
/* loaded from: classes7.dex */
public final class g extends kotlin.reflect.jvm.internal.impl.resolve.scopes.a {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i<h> f77996b;

    /* compiled from: LazyScopeAdapter.kt */
    static final class a extends n0 implements ld.a<h> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<h> f77997b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.a<? extends h> aVar) {
            super(0);
            this.f77997b = aVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            h invoke = this.f77997b.invoke();
            return invoke instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.a ? ((kotlin.reflect.jvm.internal.impl.resolve.scopes.a) invoke).i() : invoke;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @kd.j
    public g(@fg.l ld.a<? extends h> aVar) {
        this(null, aVar, 1, 0 == true ? 1 : 0);
        l0.p(aVar, ProtectedSandApp.s("窚\u0001"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a
    @fg.l
    protected h j() {
        return this.f77996b.invoke();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ g(kotlin.reflect.jvm.internal.impl.storage.n r1, ld.a r2, int r3, kotlin.jvm.internal.w r4) {
        /*
            r0 = this;
            r3 = r3 & 1
            if (r3 == 0) goto Lf
            kotlin.reflect.jvm.internal.impl.storage.n r1 = kotlin.reflect.jvm.internal.impl.storage.f.f78308e
            java.lang.String r3 = "窛\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            kotlin.jvm.internal.l0.o(r1, r3)
        Lf:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.scopes.g.<init>(kotlin.reflect.jvm.internal.impl.storage.n, ld.a, int, kotlin.jvm.internal.w):void");
    }

    @kd.j
    public g(@fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l ld.a<? extends h> aVar) {
        l0.p(nVar, ProtectedSandApp.s("窙\u0001"));
        l0.p(aVar, ProtectedSandApp.s("窚\u0001"));
        this.f77996b = nVar.h(new a(aVar));
    }
}
