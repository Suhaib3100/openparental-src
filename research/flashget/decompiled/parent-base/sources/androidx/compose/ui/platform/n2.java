package androidx.compose.ui.platform;

import androidx.annotation.c1;
import kotlin.Metadata;

/* compiled from: PlatformTextInputModifierNode.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a=\u0010\b\u001a\u00020\u0004*\u00020\u00002'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0086@¢\u0006\u0004\b\b\u0010\t\"(\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/m2;", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/q2;", "Lkotlin/coroutines/d;", "", "", "Lkotlin/u;", "block", "a", "(Landroidx/compose/ui/platform/m2;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/runtime/a3;", "Landroidx/compose/ui/platform/p2;", "Landroidx/compose/runtime/a3;", "b", "()Landroidx/compose/runtime/a3;", "c", "()V", "LocalPlatformTextInputMethodOverride", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nPlatformTextInputModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputModifierNode.kt\nandroidx/compose/ui/platform/PlatformTextInputModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    private static final androidx.compose.runtime.a3<p2> f20019a = androidx.compose.runtime.f0.f(a.f20020b);

    /* compiled from: PlatformTextInputModifierNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/p2;", "a", "()Landroidx/compose/ui/platform/p2;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<p2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f20020b = new a(0);

        a() {
            super(0);
        }

        @fg.m
        public final p2 a() {
            return null;
        }

        @Override // ld.a
        public p2 invoke() {
            return null;
        }
    }

    /* compiled from: PlatformTextInputModifierNode.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", i = {}, l = {101}, m = "establishTextInputSession", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f20021b;

        /* renamed from: c, reason: collision with root package name */
        int f20022c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f20021b = obj;
            this.f20022c |= Integer.MIN_VALUE;
            return n2.a(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@fg.l androidx.compose.ui.platform.m2 r4, @fg.l ld.p<? super androidx.compose.ui.platform.q2, ? super kotlin.coroutines.d<?>, ? extends java.lang.Object> r5, @fg.l kotlin.coroutines.d<?> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.ui.platform.n2.b
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.n2$b r0 = (androidx.compose.ui.platform.n2.b) r0
            int r1 = r0.f20022c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20022c = r1
            goto L18
        L13:
            androidx.compose.ui.platform.n2$b r0 = new androidx.compose.ui.platform.n2$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f20021b
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f20022c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            kotlin.a1.n(r6)
            goto L5b
        L2f:
            kotlin.a1.n(r6)
            androidx.compose.ui.q$d r6 = r4.getNode()
            boolean r6 = r6.getIsAttached()
            if (r6 == 0) goto L61
            androidx.compose.ui.node.h0 r6 = androidx.compose.ui.node.k.p(r4)
            androidx.compose.runtime.g0 r6 = r6.getCompositionLocalMap()
            androidx.compose.runtime.a3<androidx.compose.ui.platform.p2> r2 = androidx.compose.ui.platform.n2.f20019a
            java.lang.Object r6 = r6.b(r2)
            androidx.compose.ui.platform.p2 r6 = (androidx.compose.ui.platform.p2) r6
            if (r6 != 0) goto L52
            androidx.compose.ui.node.p1 r6 = androidx.compose.ui.node.k.q(r4)
        L52:
            r0.f20022c = r3
            java.lang.Object r4 = r6.h(r5, r0)
            if (r4 != r1) goto L5b
            return r1
        L5b:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        L61:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "establishTextInputSession called from an unattached node"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.n2.a(androidx.compose.ui.platform.m2, ld.p, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    @androidx.compose.ui.l
    public static final androidx.compose.runtime.a3<p2> b() {
        return f20019a;
    }

    @androidx.compose.ui.l
    public static /* synthetic */ void c() {
    }
}
