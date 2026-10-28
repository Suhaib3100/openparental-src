package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.g3;
import androidx.compose.runtime.t3;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazySaveableStateHolder.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0005\u001a\u00020\u00022\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/runtime/saveable/f;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "a", "(Lld/q;Landroidx/compose/runtime/t;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolderKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,108:1\n74#2:109\n*S KotlinDebug\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolderKt\n*L\n43#1:109\n*E\n"})
/* loaded from: classes.dex */
public final class j0 {

    /* compiled from: LazySaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i0 f6074b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.runtime.saveable.f, androidx.compose.runtime.t, Integer, k2> f6075c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(i0 i0Var, ld.q<? super androidx.compose.runtime.saveable.f, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar) {
            super(2);
            this.f6074b = i0Var;
            this.f6075c = qVar;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1863926504, i4, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
            }
            this.f6074b.i(androidx.compose.runtime.saveable.h.a(tVar, 0));
            this.f6075c.R(this.f6074b, tVar, 8);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazySaveableStateHolder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.runtime.saveable.f, androidx.compose.runtime.t, Integer, k2> f6076b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6077c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.q<? super androidx.compose.runtime.saveable.f, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar, int i4) {
            super(2);
            this.f6076b = qVar;
            this.f6077c = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            j0.a(this.f6076b, tVar, g3.b(this.f6077c | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: LazySaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/i0;", "a", "()Landroidx/compose/foundation/lazy/layout/i0;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<i0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.saveable.i f6078b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.runtime.saveable.i iVar) {
            super(0);
            this.f6078b = iVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i0 invoke() {
            return new i0(this.f6078b, z0.z());
        }
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @androidx.compose.runtime.i
    public static final void a(@fg.l ld.q<? super androidx.compose.runtime.saveable.f, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(674185128);
        if ((i4 & 14) == 0) {
            i5 = (o4.S(qVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 11) == 2 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(674185128, i5, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)");
            }
            androidx.compose.runtime.saveable.i iVar = (androidx.compose.runtime.saveable.i) o4.x(androidx.compose.runtime.saveable.k.b());
            i0 i0Var = (i0) androidx.compose.runtime.saveable.d.d(new Object[]{iVar}, i0.INSTANCE.a(iVar), null, new c(iVar), o4, 72, 4);
            androidx.compose.runtime.f0.b(androidx.compose.runtime.saveable.k.b().e(i0Var), androidx.compose.runtime.internal.c.b(o4, 1863926504, true, new a(i0Var, qVar)), o4, 56);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new b(qVar, i4));
        }
    }
}
