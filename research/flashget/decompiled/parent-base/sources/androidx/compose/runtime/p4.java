package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: DerivedState.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a*\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0082\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a0\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0082\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a,\u0010\u001a\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0018\u001a\u00020\u00102\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0080\b¢\u0006\u0004\b\u001a\u0010\u001b\"\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\" \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001e¨\u0006!"}, d2 = {"T", "Lkotlin/Function1;", "Landroidx/compose/runtime/internal/n;", "block", "g", "(Lld/l;)Ljava/lang/Object;", "Lkotlin/Function0;", "calculation", "Landroidx/compose/runtime/b5;", "d", "(Lld/a;)Landroidx/compose/runtime/b5;", "Landroidx/compose/runtime/m4;", "policy", "c", "(Landroidx/compose/runtime/m4;Lld/a;)Landroidx/compose/runtime/b5;", "Landroidx/compose/runtime/collection/g;", "Landroidx/compose/runtime/s0;", "b", "()Landroidx/compose/runtime/collection/g;", "R", "Landroidx/compose/runtime/r0;", "derivedState", "e", "(Landroidx/compose/runtime/r0;Lld/a;)Ljava/lang/Object;", "observer", "Lkotlin/k2;", "f", "(Landroidx/compose/runtime/s0;Lld/a;)V", "Landroidx/compose/runtime/u4;", "a", "Landroidx/compose/runtime/u4;", "calculationBlockNestedLevel", "derivedStateObservers", "runtime_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
@kotlin.jvm.internal.r1({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,396:1\n1188#2:397\n460#3,11:398\n460#3,11:409\n48#3:420\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n*L\n363#1:397\n369#1:398,11\n373#1:409,11\n393#1:420\n*E\n"})
/* loaded from: classes.dex */
final /* synthetic */ class p4 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final u4<androidx.compose.runtime.internal.n> f16878a = new u4<>();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final u4<androidx.compose.runtime.collection.g<s0>> f16879b = new u4<>();

    @fg.l
    public static final androidx.compose.runtime.collection.g<s0> b() {
        u4<androidx.compose.runtime.collection.g<s0>> u4Var = f16879b;
        androidx.compose.runtime.collection.g<s0> a5 = u4Var.a();
        if (a5 != null) {
            return a5;
        }
        androidx.compose.runtime.collection.g<s0> gVar = new androidx.compose.runtime.collection.g<>(new s0[0], 0);
        u4Var.b(gVar);
        return gVar;
    }

    @androidx.compose.runtime.snapshots.j0
    @fg.l
    public static final <T> b5<T> c(@fg.l m4<T> m4Var, @fg.l ld.a<? extends T> aVar) {
        return new q0(aVar, m4Var);
    }

    @androidx.compose.runtime.snapshots.j0
    @fg.l
    public static final <T> b5<T> d(@fg.l ld.a<? extends T> aVar) {
        return new q0(aVar, null);
    }

    private static final <R> R e(r0<?> r0Var, ld.a<? extends R> aVar) {
        androidx.compose.runtime.collection.g<s0> b5 = b();
        int size = b5.getSize();
        int i4 = 0;
        if (size > 0) {
            s0[] L = b5.L();
            int i5 = 0;
            do {
                L[i5].b(r0Var);
                i5++;
            } while (i5 < size);
        }
        try {
            R invoke = aVar.invoke();
            int size2 = b5.getSize();
            if (size2 > 0) {
                s0[] L2 = b5.L();
                do {
                    L2[i4].a(r0Var);
                    i4++;
                } while (i4 < size2);
            }
            return invoke;
        } catch (Throwable th) {
            int size3 = b5.getSize();
            if (size3 > 0) {
                s0[] L3 = b5.L();
                do {
                    L3[i4].a(r0Var);
                    i4++;
                } while (i4 < size3);
            }
            throw th;
        }
    }

    public static final <R> void f(@fg.l s0 s0Var, @fg.l ld.a<? extends R> aVar) {
        androidx.compose.runtime.collection.g<s0> b5 = b();
        try {
            b5.b(s0Var);
            aVar.invoke();
        } finally {
            b5.n0(b5.getSize() - 1);
        }
    }

    private static final <T> T g(ld.l<? super androidx.compose.runtime.internal.n, ? extends T> lVar) {
        u4<androidx.compose.runtime.internal.n> u4Var = f16878a;
        androidx.compose.runtime.internal.n a5 = u4Var.a();
        if (a5 == null) {
            a5 = new androidx.compose.runtime.internal.n(0);
            u4Var.b(a5);
        }
        return lVar.invoke(a5);
    }
}
