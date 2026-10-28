package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;

/* compiled from: LazyScopeAdapter.kt */
/* loaded from: classes6.dex */
public final class g extends kotlin.reflect.jvm.internal.impl.resolve.scopes.a {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i<h> f26012b;

    /* compiled from: LazyScopeAdapter.kt */
    static final class a extends Lambda implements q3.a<h> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.a<h> f26013p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(q3.a<? extends h> aVar) {
            super(0);
            this.f26013p = aVar;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h n() {
            h n5 = this.f26013p.n();
            return n5 instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.a ? ((kotlin.reflect.jvm.internal.impl.resolve.scopes.a) n5).i() : n5;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @p3.j
    public g(@d5.d q3.a<? extends h> aVar) {
        this(null, aVar, 1, 0 == true ? 1 : 0);
        l0.p(aVar, ProtectedSandApp.s("蛓"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a
    @d5.d
    protected h j() {
        return this.f26012b.n();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ g(kotlin.reflect.jvm.internal.impl.storage.n r1, q3.a r2, int r3, kotlin.jvm.internal.w r4) {
        /*
            r0 = this;
            r3 = r3 & 1
            if (r3 == 0) goto Lf
            kotlin.reflect.jvm.internal.impl.storage.n r1 = kotlin.reflect.jvm.internal.impl.storage.f.f26300e
            java.lang.String r3 = "蛒"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)
            kotlin.jvm.internal.l0.o(r1, r3)
        Lf:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.scopes.g.<init>(kotlin.reflect.jvm.internal.impl.storage.n, q3.a, int, kotlin.jvm.internal.w):void");
    }

    @p3.j
    public g(@d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d q3.a<? extends h> aVar) {
        l0.p(nVar, ProtectedSandApp.s("蛐"));
        l0.p(aVar, ProtectedSandApp.s("蛑"));
        this.f26012b = nVar.d(new a(aVar));
    }
}
