package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: AnimationVectors.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u0011*\u00028\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u0011*\u00028\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u0017\"\b\b\u0000\u0010\u0012*\u00020\u0011*\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"", "v1", "Landroidx/compose/animation/core/o;", "a", "(F)Landroidx/compose/animation/core/o;", "v2", "Landroidx/compose/animation/core/p;", "b", "(FF)Landroidx/compose/animation/core/p;", "v3", "Landroidx/compose/animation/core/q;", "c", "(FFF)Landroidx/compose/animation/core/q;", "v4", "Landroidx/compose/animation/core/r;", "d", "(FFFF)Landroidx/compose/animation/core/r;", "Landroidx/compose/animation/core/s;", "T", "g", "(Landroidx/compose/animation/core/s;)Landroidx/compose/animation/core/s;", "e", "source", "Lkotlin/k2;", "f", "(Landroidx/compose/animation/core/s;Landroidx/compose/animation/core/s;)V", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t {
    @fg.l
    public static final o a(float f4) {
        return new o(f4);
    }

    @fg.l
    public static final p b(float f4, float f5) {
        return new p(f4, f5);
    }

    @fg.l
    public static final q c(float f4, float f5, float f6) {
        return new q(f4, f5, f6);
    }

    @fg.l
    public static final r d(float f4, float f5, float f6, float f7) {
        return new r(f4, f5, f6, f7);
    }

    @fg.l
    public static final <T extends s> T e(@fg.l T t4) {
        T t5 = (T) g(t4);
        int size = t5.getSize();
        for (int i4 = 0; i4 < size; i4++) {
            t5.e(i4, t4.a(i4));
        }
        return t5;
    }

    public static final <T extends s> void f(@fg.l T t4, @fg.l T t5) {
        int size = t4.getSize();
        for (int i4 = 0; i4 < size; i4++) {
            t4.e(i4, t5.a(i4));
        }
    }

    @fg.l
    public static final <T extends s> T g(@fg.l T t4) {
        T t5 = (T) t4.c();
        kotlin.jvm.internal.l0.n(t5, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return t5;
    }
}
