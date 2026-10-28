package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: CompositionLocal.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\b\u0010\t\u001a>\u0010\u0010\u001a\u00020\r2\u001a\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n\"\u0006\u0012\u0002\b\u00030\u000b2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\u0003¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a.\u0010\u0013\u001a\u00020\r2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\u0003¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a*\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\r0\u0003¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"T", "Landroidx/compose/runtime/m4;", "policy", "Lkotlin/Function0;", "defaultFactory", "Landroidx/compose/runtime/a3;", "d", "(Landroidx/compose/runtime/m4;Lld/a;)Landroidx/compose/runtime/a3;", "f", "(Lld/a;)Landroidx/compose/runtime/a3;", "", "Landroidx/compose/runtime/b3;", "values", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "c", "([Landroidx/compose/runtime/b3;Lld/p;Landroidx/compose/runtime/t;I)V", "value", "b", "(Landroidx/compose/runtime/b3;Lld/p;Landroidx/compose/runtime/t;I)V", "Landroidx/compose/runtime/e0;", "context", "a", "(Landroidx/compose/runtime/e0;Lld/p;Landroidx/compose/runtime/t;I)V", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nCompositionLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocalKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,273:1\n125#2:274\n152#2,3:275\n37#3,2:278\n*S KotlinDebug\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocalKt\n*L\n268#1:274\n268#1:275,3\n269#1:278,2\n*E\n"})
/* loaded from: classes.dex */
public final class f0 {

    /* compiled from: CompositionLocal.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b3<?>[] f16382b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<t, Integer, kotlin.k2> f16383c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f16384d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(b3<?>[] b3VarArr, ld.p<? super t, ? super Integer, kotlin.k2> pVar, int i4) {
            super(2);
            this.f16382b = b3VarArr;
            this.f16383c = pVar;
            this.f16384d = i4;
        }

        public final void a(@fg.m t tVar, int i4) {
            b3<?>[] b3VarArr = this.f16382b;
            f0.c((b3[]) Arrays.copyOf(b3VarArr, b3VarArr.length), this.f16383c, tVar, g3.b(this.f16384d | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: CompositionLocal.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b3<?> f16385b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<t, Integer, kotlin.k2> f16386c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f16387d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(b3<?> b3Var, ld.p<? super t, ? super Integer, kotlin.k2> pVar, int i4) {
            super(2);
            this.f16385b = b3Var;
            this.f16386c = pVar;
            this.f16387d = i4;
        }

        public final void a(@fg.m t tVar, int i4) {
            f0.b(this.f16385b, this.f16386c, tVar, g3.b(this.f16387d | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: CompositionLocal.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e0 f16388b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<t, Integer, kotlin.k2> f16389c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f16390d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(e0 e0Var, ld.p<? super t, ? super Integer, kotlin.k2> pVar, int i4) {
            super(2);
            this.f16388b = e0Var;
            this.f16389c = pVar;
            this.f16390d = i4;
        }

        public final void a(@fg.m t tVar, int i4) {
            f0.a(this.f16388b, this.f16389c, tVar, g3.b(this.f16390d | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    @j(scheme = "[0[0]]")
    @i
    public static final void a(@fg.l e0 e0Var, @fg.l ld.p<? super t, ? super Integer, kotlin.k2> pVar, @fg.m t tVar, int i4) {
        t o4 = tVar.o(1853897736);
        int i5 = (i4 & 14) == 0 ? (o4.q0(e0Var) ? 4 : 2) | i4 : i4;
        if ((i4 & 112) == 0) {
            i5 |= o4.S(pVar) ? 32 : 16;
        }
        if ((i5 & 91) == 18 && o4.p()) {
            o4.d0();
        } else {
            if (x.b0()) {
                x.r0(1853897736, i5, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:264)");
            }
            t2 compositionLocals = e0Var.getCompositionLocals();
            ArrayList arrayList = new ArrayList(compositionLocals.size());
            for (Map.Entry<d0<Object>, b5<? extends Object>> entry : compositionLocals.entrySet()) {
                d0<Object> key = entry.getKey();
                kotlin.jvm.internal.l0.n(key, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
                arrayList.add(((a3) key).e(entry.getValue().getValue()));
            }
            b3[] b3VarArr = (b3[]) arrayList.toArray(new b3[0]);
            c((b3[]) Arrays.copyOf(b3VarArr, b3VarArr.length), pVar, o4, (i5 & 112) | 8);
            if (x.b0()) {
                x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new c(e0Var, pVar, i4));
        }
    }

    @j(scheme = "[0[0]]")
    @i
    public static final void b(@fg.l b3<?> b3Var, @fg.l ld.p<? super t, ? super Integer, kotlin.k2> pVar, @fg.m t tVar, int i4) {
        t o4 = tVar.o(-1350970552);
        if (x.b0()) {
            x.r0(-1350970552, i4, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:245)");
        }
        o4.Y(b3Var);
        pVar.invoke(o4, Integer.valueOf((i4 >> 3) & 14));
        o4.G();
        if (x.b0()) {
            x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new b(b3Var, pVar, i4));
        }
    }

    @j(scheme = "[0[0]]")
    @i
    public static final void c(@fg.l b3<?>[] b3VarArr, @fg.l ld.p<? super t, ? super Integer, kotlin.k2> pVar, @fg.m t tVar, int i4) {
        t o4 = tVar.o(-1390796515);
        if (x.b0()) {
            x.r0(-1390796515, i4, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:225)");
        }
        o4.s0(b3VarArr);
        pVar.invoke(o4, Integer.valueOf((i4 >> 3) & 14));
        o4.h0();
        if (x.b0()) {
            x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new a(b3VarArr, pVar, i4));
        }
    }

    @fg.l
    public static final <T> a3<T> d(@fg.l m4<T> m4Var, @fg.l ld.a<? extends T> aVar) {
        return new z0(m4Var, aVar);
    }

    public static a3 e(m4 m4Var, ld.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            m4Var = s4.c();
        }
        return new z0(m4Var, aVar);
    }

    @fg.l
    public static final <T> a3<T> f(@fg.l ld.a<? extends T> aVar) {
        return new c5(aVar, null);
    }
}
