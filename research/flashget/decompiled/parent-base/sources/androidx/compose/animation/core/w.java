package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: ComplexDouble.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a3\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0006\u001a\u0017\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\b\u001a\u001c\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0080\n¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\u0003\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0080\n¢\u0006\u0004\b\u0003\u0010\u000b\u001a\u001c\u0010\f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0080\n¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"", "a", "b", "c", "Lkotlin/q0;", "Landroidx/compose/animation/core/v;", "(DDD)Lkotlin/q0;", "num", "(D)Landroidx/compose/animation/core/v;", "other", "d", "(DLandroidx/compose/animation/core/v;)Landroidx/compose/animation/core/v;", "e", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nComplexDouble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n+ 2 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,113:1\n103#1:114\n107#1:120\n103#1:124\n103#1:135\n35#2,2:115\n54#2,3:117\n66#2,3:121\n35#2,2:125\n54#2,3:127\n35#2,2:130\n66#2,3:132\n35#2,2:136\n54#2,3:138\n*S KotlinDebug\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n*L\n88#1:114\n89#1:120\n89#1:124\n107#1:135\n88#1:115,2\n88#1:117,3\n89#1:121,3\n89#1:125,2\n89#1:127,3\n103#1:130,2\n107#1:132,3\n107#1:136,2\n111#1:138,3\n*E\n"})
/* loaded from: classes.dex */
public final class w {
    @fg.l
    public static final kotlin.q0<v, v> a(double d5, double d6, double d7) {
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        double d15;
        double d16;
        double d17;
        double d18 = (d6 * d6) - ((4.0d * d5) * d7);
        double d19 = 1.0d / (d5 * 2.0d);
        double d20 = -d6;
        v b5 = b(d18);
        d10 = b5._real;
        b5._real = d10 + d20;
        d11 = b5._real;
        b5._real = d11 * d19;
        d12 = b5._imaginary;
        b5._imaginary = d12 * d19;
        v b6 = b(d18);
        d13 = b6._real;
        double d21 = -1;
        b6._real = d13 * d21;
        d14 = b6._imaginary;
        b6._imaginary = d14 * d21;
        d15 = b6._real;
        b6._real = d15 + d20;
        d16 = b6._real;
        b6._real = d16 * d19;
        d17 = b6._imaginary;
        b6._imaginary = d17 * d19;
        return new kotlin.q0<>(b5, b6);
    }

    @fg.l
    public static final v b(double d5) {
        return d5 < com.google.firebase.remoteconfig.p.f60679p ? new v(com.google.firebase.remoteconfig.p.f60679p, Math.sqrt(Math.abs(d5))) : new v(Math.sqrt(d5), com.google.firebase.remoteconfig.p.f60679p);
    }

    @fg.l
    public static final v c(double d5, @fg.l v vVar) {
        double d6;
        double d7;
        double d10;
        d6 = vVar._real;
        double d11 = -1;
        vVar._real = d6 * d11;
        d7 = vVar._imaginary;
        vVar._imaginary = d7 * d11;
        d10 = vVar._real;
        vVar._real = d10 + d5;
        return vVar;
    }

    @fg.l
    public static final v d(double d5, @fg.l v vVar) {
        double d6;
        d6 = vVar._real;
        vVar._real = d6 + d5;
        return vVar;
    }

    @fg.l
    public static final v e(double d5, @fg.l v vVar) {
        double d6;
        double d7;
        d6 = vVar._real;
        vVar._real = d6 * d5;
        d7 = vVar._imaginary;
        vVar._imaginary = d7 * d5;
        return vVar;
    }
}
