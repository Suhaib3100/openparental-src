package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.z0;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.b3;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.v0;
import androidx.compose.runtime.w0;
import androidx.compose.ui.layout.g1;
import androidx.compose.ui.layout.h1;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyLayoutPinnableItem.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\n\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "key", "", "index", "Landroidx/compose/foundation/lazy/layout/c0;", "pinnedItemList", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "a", "(Ljava/lang/Object;ILandroidx/compose/foundation/lazy/layout/c0;Lld/p;Landroidx/compose/runtime/t;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,174:1\n50#2:175\n49#2:176\n1116#3,6:177\n1116#3,6:184\n74#4:183\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt\n*L\n54#1:175\n54#1:176\n54#1:177,6\n57#1:184,6\n56#1:183\n*E\n"})
/* loaded from: classes.dex */
public final class b0 {

    /* compiled from: LazyLayoutPinnableItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,174:1\n64#2,5:175\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1\n*L\n57#1:175,5\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<w0, v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f5927b;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1\n*L\n1#1,497:1\n57#2:498\n*E\n"})
        /* renamed from: androidx.compose.foundation.lazy.layout.b0$a$a, reason: collision with other inner class name */
        public static final class C0106a implements v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a0 f5928a;

            public C0106a(a0 a0Var) {
                this.f5928a = a0Var;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f5928a.f();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a0 a0Var) {
            super(1);
            this.f5927b = a0Var;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v0 invoke(@fg.l w0 w0Var) {
            return new C0106a(this.f5927b);
        }
    }

    /* compiled from: LazyLayoutPinnableItem.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f5929b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5930c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c0 f5931d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, k2> f5932e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f5933f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Object obj, int i4, c0 c0Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, int i5) {
            super(2);
            this.f5929b = obj;
            this.f5930c = i4;
            this.f5931d = c0Var;
            this.f5932e = pVar;
            this.f5933f = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            b0.a(this.f5929b, this.f5930c, this.f5931d, this.f5932e, tVar, g3.b(this.f5933f | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    @z0
    @androidx.compose.runtime.i
    public static final void a(@fg.m Object obj, int i4, @fg.l c0 c0Var, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i5) {
        androidx.compose.runtime.t o4 = tVar.o(-2079116560);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-2079116560, i5, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:52)");
        }
        o4.P(511388516);
        boolean q02 = o4.q0(obj) | o4.q0(c0Var);
        Object Q = o4.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new a0(obj, c0Var);
            o4.E(Q);
        }
        o4.p0();
        a0 a0Var = (a0) Q;
        a0Var.g(i4);
        a0Var.i((g1) o4.x(h1.a()));
        o4.P(1161125085);
        boolean q03 = o4.q0(a0Var);
        Object Q2 = o4.Q();
        if (q03 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
            Q2 = new a(a0Var);
            o4.E(Q2);
        }
        o4.p0();
        a1.c(a0Var, (ld.l) Q2, o4, 0);
        androidx.compose.runtime.f0.b(h1.a().e(a0Var), pVar, o4, b3.f15974d | ((i5 >> 6) & 112));
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new b(obj, i4, c0Var, pVar, i5));
        }
    }
}
