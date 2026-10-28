package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: AnimationVectors.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0090\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0090\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR*\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0005R\u001a\u0010$\u001a\u00020\u000b8\u0010X\u0090D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001d\u0010\u001b¨\u0006%"}, d2 = {"Landroidx/compose/animation/core/o;", "Landroidx/compose/animation/core/s;", "", "initVal", "<init>", "(F)V", "Lkotlin/k2;", "d", "()V", "g", "()Landroidx/compose/animation/core/o;", "", "index", "a", "(I)F", "value", "e", "(IF)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "<set-?>", "b", "F", "f", "()F", "h", "c", "I", "size", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o extends s {

    /* renamed from: d, reason: collision with root package name */
    public static final int f2851d = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int size;

    public o(float f4) {
        super(null);
        this.value = f4;
        this.size = 1;
    }

    @Override // androidx.compose.animation.core.s
    public float a(int index) {
        if (index == 0) {
            return this.value;
        }
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.s
    /* renamed from: b, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // androidx.compose.animation.core.s
    public void d() {
        this.value = 0.0f;
    }

    @Override // androidx.compose.animation.core.s
    public void e(int index, float value) {
        if (index == 0) {
            this.value = value;
        }
    }

    public boolean equals(@fg.m Object other) {
        return (other instanceof o) && ((o) other).value == this.value;
    }

    /* renamed from: f, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    @Override // androidx.compose.animation.core.s
    @fg.l
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public o c() {
        return new o(0.0f);
    }

    public final void h(float f4) {
        this.value = f4;
    }

    public int hashCode() {
        return Float.hashCode(this.value);
    }

    @fg.l
    public String toString() {
        return "AnimationVector1D: value = " + this.value;
    }
}
