package androidx.collection;

import kotlin.Metadata;

/* compiled from: FloatSet.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0010\u001a\u00020\u00002\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011\u001a\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018\u001a%\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u001b\u001a\u00020\u00122\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010!\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010 \"\u001a\u0010%\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/collection/z;", "a", "()Landroidx/collection/z;", "b", "", "element1", "c", "(F)Landroidx/collection/z;", "element2", "d", "(FF)Landroidx/collection/z;", "element3", "e", "(FFF)Landroidx/collection/z;", "", "elements", "f", "([F)Landroidx/collection/z;", "Landroidx/collection/r1;", "i", "()Landroidx/collection/r1;", "j", "(F)Landroidx/collection/r1;", "k", "(FF)Landroidx/collection/r1;", "l", "(FFF)Landroidx/collection/r1;", "m", "([F)Landroidx/collection/r1;", "", "h", "(F)I", "Landroidx/collection/r1;", "EmptyFloatSet", "[F", "g", "()[F", "EmptyFloatArray", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nFloatSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatSet.kt\nandroidx/collection/FloatSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,853:1\n1#2:854\n*E\n"})
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final r1 f2165a = new r1(0);

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final float[] f2166b = new float[0];

    @fg.l
    public static final z a() {
        return f2165a;
    }

    @fg.l
    public static final z b() {
        return f2165a;
    }

    @fg.l
    public static final z c(float f4) {
        return j(f4);
    }

    @fg.l
    public static final z d(float f4, float f5) {
        return k(f4, f5);
    }

    @fg.l
    public static final z e(float f4, float f5, float f6) {
        return l(f4, f5, f6);
    }

    @fg.l
    public static final z f(@fg.l float... elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        r1 r1Var = new r1(elements.length);
        r1Var.V(elements);
        return r1Var;
    }

    @fg.l
    public static final float[] g() {
        return f2166b;
    }

    public static final int h(float f4) {
        int hashCode = Float.hashCode(f4) * x2.f2466j;
        return hashCode ^ (hashCode << 16);
    }

    @fg.l
    public static final r1 i() {
        return new r1(0, 1, null);
    }

    @fg.l
    public static final r1 j(float f4) {
        r1 r1Var = new r1(1);
        r1Var.T(f4);
        return r1Var;
    }

    @fg.l
    public static final r1 k(float f4, float f5) {
        r1 r1Var = new r1(2);
        r1Var.T(f4);
        r1Var.T(f5);
        return r1Var;
    }

    @fg.l
    public static final r1 l(float f4, float f5, float f6) {
        r1 r1Var = new r1(3);
        r1Var.T(f4);
        r1Var.T(f5);
        r1Var.T(f6);
        return r1Var;
    }

    @fg.l
    public static final r1 m(@fg.l float... elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        r1 r1Var = new r1(elements.length);
        r1Var.V(elements);
        return r1Var;
    }
}
