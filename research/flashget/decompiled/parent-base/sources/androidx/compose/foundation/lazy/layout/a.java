package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.z0;

/* compiled from: AwaitFirstLayoutModifier.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/layout/a;", "Landroidx/compose/ui/layout/v0;", "<init>", "()V", "Lkotlin/k2;", "b", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/layout/u;", "coordinates", "W", "(Landroidx/compose/ui/layout/u;)V", "", "Z", "wasPositioned", "Lkotlin/coroutines/d;", "c", "Lkotlin/coroutines/d;", "continuation", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAwaitFirstLayoutModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AwaitFirstLayoutModifier.kt\nandroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
/* loaded from: classes.dex */
public final class a implements v0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f5912d = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean wasPositioned;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private kotlin.coroutines.d<? super k2> continuation;

    /* compiled from: AwaitFirstLayoutModifier.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", f = "AwaitFirstLayoutModifier.kt", i = {0, 0}, l = {35}, m = "waitForFirstLayout", n = {"this", "oldContinuation"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.a$a, reason: collision with other inner class name */
    static final class C0105a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f5915b;

        /* renamed from: c, reason: collision with root package name */
        Object f5916c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f5917d;

        /* renamed from: f, reason: collision with root package name */
        int f5919f;

        C0105a(kotlin.coroutines.d<? super C0105a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f5917d = obj;
            this.f5919f |= Integer.MIN_VALUE;
            return a.this.b(this);
        }
    }

    @Override // androidx.compose.ui.layout.v0
    public void W(@fg.l androidx.compose.ui.layout.u coordinates) {
        if (this.wasPositioned) {
            return;
        }
        this.wasPositioned = true;
        kotlin.coroutines.d<? super k2> dVar = this.continuation;
        if (dVar != null) {
            z0.Companion companion = z0.INSTANCE;
            dVar.resumeWith(k2.f75408a);
        }
        this.continuation = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@fg.l kotlin.coroutines.d<? super kotlin.k2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.lazy.layout.a.C0105a
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.lazy.layout.a$a r0 = (androidx.compose.foundation.lazy.layout.a.C0105a) r0
            int r1 = r0.f5919f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5919f = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.layout.a$a r0 = new androidx.compose.foundation.lazy.layout.a$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f5917d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f5919f
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r1 = r0.f5916c
            kotlin.coroutines.d r1 = (kotlin.coroutines.d) r1
            java.lang.Object r0 = r0.f5915b
            androidx.compose.foundation.lazy.layout.a r0 = (androidx.compose.foundation.lazy.layout.a) r0
            kotlin.a1.n(r5)
            goto L5e
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.a1.n(r5)
            boolean r5 = r4.wasPositioned
            if (r5 != 0) goto L67
            kotlin.coroutines.d<? super kotlin.k2> r5 = r4.continuation
            r0.f5915b = r4
            r0.f5916c = r5
            r0.f5919f = r3
            kotlin.coroutines.k r2 = new kotlin.coroutines.k
            kotlin.coroutines.d r3 = kotlin.coroutines.intrinsics.b.e(r0)
            r2.<init>(r3)
            r4.continuation = r2
            java.lang.Object r2 = r2.a()
            if (r2 != r1) goto L5a
            kotlin.coroutines.jvm.internal.h.c(r0)
        L5a:
            if (r2 != r1) goto L5d
            return r1
        L5d:
            r1 = r5
        L5e:
            if (r1 == 0) goto L67
            kotlin.z0$a r5 = kotlin.z0.INSTANCE
            kotlin.k2 r5 = kotlin.k2.f75408a
            r1.resumeWith(r5)
        L67:
            kotlin.k2 r5 = kotlin.k2.f75408a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.a.b(kotlin.coroutines.d):java.lang.Object");
    }
}
