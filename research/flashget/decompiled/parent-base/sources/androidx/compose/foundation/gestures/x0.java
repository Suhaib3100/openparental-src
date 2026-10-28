package androidx.compose.foundation.gestures;

import androidx.compose.runtime.b5;
import androidx.compose.runtime.o4;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: ScrollableState.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "", "consumeScrollDelta", "Landroidx/compose/foundation/gestures/w0;", "a", "(Lld/l;)Landroidx/compose/foundation/gestures/w0;", "b", "(Lld/l;Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/gestures/w0;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nScrollableState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableState.kt\nandroidx/compose/foundation/gestures/ScrollableStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,195:1\n25#2:196\n1116#3,6:197\n*S KotlinDebug\n*F\n+ 1 ScrollableState.kt\nandroidx/compose/foundation/gestures/ScrollableStateKt\n*L\n146#1:196\n146#1:197,6\n*E\n"})
/* loaded from: classes.dex */
public final class x0 {

    /* compiled from: ScrollableState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<Float, Float> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b5<ld.l<Float, Float>> f4531b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(b5<? extends ld.l<? super Float, Float>> b5Var) {
            super(1);
            this.f4531b = b5Var;
        }

        @fg.l
        public final Float a(float f4) {
            return this.f4531b.getValue().invoke(Float.valueOf(f4));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Float invoke(Float f4) {
            return a(f4.floatValue());
        }
    }

    @fg.l
    public static final w0 a(@fg.l ld.l<? super Float, Float> lVar) {
        return new q(lVar);
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final w0 b(@fg.l ld.l<? super Float, Float> lVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-180460798);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-180460798, i4, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:143)");
        }
        b5 u4 = o4.u(lVar, tVar, i4 & 14);
        tVar.P(-492369756);
        Object Q = tVar.Q();
        if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
            q qVar = new q(new a(u4));
            tVar.E(qVar);
            Q = qVar;
        }
        tVar.p0();
        w0 w0Var = (w0) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return w0Var;
    }
}
