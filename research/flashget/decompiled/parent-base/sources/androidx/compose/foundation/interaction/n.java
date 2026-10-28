package androidx.compose.foundation.interaction;

import androidx.compose.foundation.interaction.m;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.r0;
import ld.p;

/* compiled from: PressInteraction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/interaction/i;", "Landroidx/compose/runtime/b5;", "", "a", "(Landroidx/compose/foundation/interaction/i;Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPressInteraction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PressInteraction.kt\nandroidx/compose/foundation/interaction/PressInteractionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,99:1\n25#2:100\n1116#3,6:101\n1116#3,6:107\n*S KotlinDebug\n*F\n+ 1 PressInteraction.kt\nandroidx/compose/foundation/interaction/PressInteractionKt\n*L\n85#1:100\n85#1:101,6\n86#1:107,6\n*E\n"})
/* loaded from: classes.dex */
public final class n {

    /* compiled from: PressInteraction.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1$1", f = "PressInteraction.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends o implements p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4710b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f4711c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<Boolean> f4712d;

        /* compiled from: PressInteraction.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/interaction/h;", "interaction", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/interaction/h;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.interaction.n$a$a, reason: collision with other inner class name */
        static final class C0086a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<m.b> f4713b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.k2<Boolean> f4714c;

            C0086a(List<m.b> list, androidx.compose.runtime.k2<Boolean> k2Var) {
                this.f4713b = list;
                this.f4714c = k2Var;
            }

            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(@fg.l h hVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
                if (hVar instanceof m.b) {
                    this.f4713b.add(hVar);
                } else if (hVar instanceof m.c) {
                    this.f4713b.remove(((m.c) hVar).getPress());
                } else if (hVar instanceof m.a) {
                    this.f4713b.remove(((m.a) hVar).getPress());
                }
                this.f4714c.setValue(Boolean.valueOf(!this.f4713b.isEmpty()));
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar, androidx.compose.runtime.k2<Boolean> k2Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f4711c = iVar;
            this.f4712d = k2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new a(this.f4711c, this.f4712d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f4710b;
            if (i4 == 0) {
                ArrayList a5 = b.a(obj);
                kotlinx.coroutines.flow.i<h> c5 = this.f4711c.c();
                C0086a c0086a = new C0086a(a5, this.f4712d);
                this.f4710b = 1;
                if (c5.a(c0086a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final b5<Boolean> a(@fg.l i iVar, @fg.m t tVar, int i4) {
        tVar.P(-1692965168);
        if (x.b0()) {
            x.r0(-1692965168, i4, -1, "androidx.compose.foundation.interaction.collectIsPressedAsState (PressInteraction.kt:83)");
        }
        tVar.P(-492369756);
        Object Q = tVar.Q();
        t.Companion companion = t.INSTANCE;
        if (Q == companion.a()) {
            Q = t4.g(Boolean.FALSE, null, 2, null);
            tVar.E(Q);
        }
        tVar.p0();
        androidx.compose.runtime.k2 k2Var = (androidx.compose.runtime.k2) Q;
        tVar.P(1523189838);
        boolean q02 = tVar.q0(iVar) | tVar.q0(k2Var);
        Object Q2 = tVar.Q();
        if (q02 || Q2 == companion.a()) {
            Q2 = new a(iVar, k2Var, null);
            tVar.E(Q2);
        }
        tVar.p0();
        androidx.compose.runtime.a1.h(iVar, (p) Q2, tVar, (i4 & 14) | 64);
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return k2Var;
    }
}
