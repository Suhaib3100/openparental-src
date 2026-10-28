package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.text2.input.u;
import androidx.compose.runtime.o4;
import androidx.compose.ui.text.input.z0;
import androidx.compose.ui.text.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* compiled from: TextFieldState.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a&\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0010*\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a8\u0010\u001b\u001a\u00020\u001a*\u00020\u00022\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0016H\u0087@¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/input/z0;", "initialValue", "Landroidx/compose/foundation/text2/input/u;", "a", "(Landroidx/compose/ui/text/input/z0;)Landroidx/compose/foundation/text2/input/u;", "Lkotlinx/coroutines/flow/i;", "Landroidx/compose/foundation/text2/input/q;", "g", "(Landroidx/compose/foundation/text2/input/u;)Lkotlinx/coroutines/flow/i;", "", "initialText", "Landroidx/compose/ui/text/t0;", "initialSelectionInChars", "d", "(Ljava/lang/String;JLandroidx/compose/runtime/t;II)Landroidx/compose/foundation/text2/input/u;", "text", "Lkotlin/k2;", "e", "(Landroidx/compose/foundation/text2/input/u;Ljava/lang/String;)V", "f", "b", "(Landroidx/compose/foundation/text2/input/u;)V", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "block", "", "c", "(Landroidx/compose/foundation/text2/input/u;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n*L\n1#1,569:1\n1116#2,6:570\n123#3,4:576\n123#3,4:580\n123#3,4:584\n*S KotlinDebug\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldStateKt\n*L\n472#1:570,6\n495#1:576,4\n520#1:580,4\n543#1:584,4\n*E\n"})
/* loaded from: classes.dex */
public final class v {

    /* compiled from: TextFieldState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.TextFieldStateKt", f = "TextFieldState.kt", i = {}, l = {566}, m = "forEachTextValue", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9072b;

        /* renamed from: c, reason: collision with root package name */
        int f9073c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f9072b = obj;
            this.f9073c |= Integer.MIN_VALUE;
            return v.c(null, null, this);
        }
    }

    /* compiled from: TextFieldState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text2/input/u;", "a", "()Landroidx/compose/foundation/text2/input/u;"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.a<u> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f9074b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f9075c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, long j4) {
            super(0);
            this.f9074b = str;
            this.f9075c = j4;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u invoke() {
            return new u(this.f9074b, this.f9075c, (kotlin.jvm.internal.w) null);
        }
    }

    /* compiled from: TextFieldState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text2/input/q;", "a", "()Landroidx/compose/foundation/text2/input/q;"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.a<q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f9076b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(u uVar) {
            super(0);
            this.f9076b = uVar;
        }

        @fg.l
        public final q a() {
            return this.f9076b.m();
        }

        @Override // ld.a
        public q invoke() {
            return this.f9076b.m();
        }
    }

    @fg.l
    public static final u a(@fg.l z0 z0Var) {
        return new u(z0Var.i(), z0Var.getSelection(), (kotlin.jvm.internal.w) null);
    }

    @androidx.compose.foundation.z0
    public static final void b(@fg.l u uVar) {
        o w4 = uVar.w(uVar.m());
        p.a(w4, 0, w4.j());
        p.f(w4);
        uVar.e(w4);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @androidx.compose.foundation.z0
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@fg.l androidx.compose.foundation.text2.input.u r4, @fg.l ld.p<? super androidx.compose.foundation.text2.input.q, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends java.lang.Object> r5, @fg.l kotlin.coroutines.d<?> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.text2.input.v.a
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.text2.input.v$a r0 = (androidx.compose.foundation.text2.input.v.a) r0
            int r1 = r0.f9073c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9073c = r1
            goto L18
        L13:
            androidx.compose.foundation.text2.input.v$a r0 = new androidx.compose.foundation.text2.input.v$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f9072b
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f9073c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            kotlin.a1.n(r6)
            goto L3f
        L2f:
            kotlin.a1.n(r6)
            kotlinx.coroutines.flow.i r4 = g(r4)
            r0.f9073c = r3
            java.lang.Object r4 = kotlinx.coroutines.flow.k.A(r4, r5, r0)
            if (r4 != r1) goto L3f
            return r1
        L3f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "textAsFlow expected not to complete without exception"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.v.c(androidx.compose.foundation.text2.input.u, ld.p, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.l
    @androidx.compose.foundation.z0
    @androidx.compose.runtime.i
    public static final u d(@fg.m String str, long j4, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-855595317);
        if ((i5 & 1) != 0) {
            str = "";
        }
        if ((i5 & 2) != 0) {
            int length = str.length();
            j4 = u0.b(length, length);
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-855595317, i4, -1, "androidx.compose.foundation.text2.input.rememberTextFieldState (TextFieldState.kt:471)");
        }
        Object[] objArr = new Object[0];
        u.b bVar = u.b.f9069a;
        tVar.P(968820051);
        boolean q02 = tVar.q0(str) | tVar.g(j4);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new b(str, j4);
            tVar.E(Q);
        }
        tVar.p0();
        u uVar = (u) androidx.compose.runtime.saveable.d.d(objArr, bVar, null, (ld.a) Q, tVar, 56, 4);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return uVar;
    }

    @androidx.compose.foundation.z0
    public static final void e(@fg.l u uVar, @fg.l String str) {
        o w4 = uVar.w(uVar.m());
        w4.s(0, w4.j(), str);
        p.f(w4);
        uVar.e(w4);
    }

    @androidx.compose.foundation.z0
    public static final void f(@fg.l u uVar, @fg.l String str) {
        o w4 = uVar.w(uVar.m());
        w4.s(0, w4.j(), str);
        p.g(w4);
        uVar.e(w4);
    }

    @fg.l
    @androidx.compose.foundation.z0
    public static final kotlinx.coroutines.flow.i<q> g(@fg.l u uVar) {
        return o4.w(new c(uVar));
    }
}
