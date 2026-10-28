package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: AnimationVectors.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0090\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0002H\u0090\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R*\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010 \u001a\u0004\b(\u0010\"\"\u0004\b)\u0010$R\u001a\u0010+\u001a\u00020\r8\u0010X\u0090D¢\u0006\f\n\u0004\b\u0012\u0010*\u001a\u0004\b\u001f\u0010\u001d¨\u0006,"}, d2 = {"Landroidx/compose/animation/core/q;", "Landroidx/compose/animation/core/s;", "", "v1", "v2", "v3", "<init>", "(FFF)V", "Lkotlin/k2;", "d", "()V", "i", "()Landroidx/compose/animation/core/q;", "", "index", "a", "(I)F", "value", "e", "(IF)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "<set-?>", "b", "F", "f", "()F", "j", "(F)V", "c", "g", "k", "h", "l", "I", "size", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q extends s {

    /* renamed from: f, reason: collision with root package name */
    public static final int f2859f = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float v1;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float v2;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float v3;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int size;

    public q(float f4, float f5, float f6) {
        super(null);
        this.v1 = f4;
        this.v2 = f5;
        this.v3 = f6;
        this.size = 3;
    }

    @Override // androidx.compose.animation.core.s
    public float a(int index) {
        if (index == 0) {
            return this.v1;
        }
        if (index == 1) {
            return this.v2;
        }
        if (index != 2) {
            return 0.0f;
        }
        return this.v3;
    }

    @Override // androidx.compose.animation.core.s
    /* renamed from: b, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // androidx.compose.animation.core.s
    public void d() {
        this.v1 = 0.0f;
        this.v2 = 0.0f;
        this.v3 = 0.0f;
    }

    @Override // androidx.compose.animation.core.s
    public void e(int index, float value) {
        if (index == 0) {
            this.v1 = value;
        } else if (index == 1) {
            this.v2 = value;
        } else {
            if (index != 2) {
                return;
            }
            this.v3 = value;
        }
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof q) {
            q qVar = (q) other;
            if (qVar.v1 == this.v1 && qVar.v2 == this.v2 && qVar.v3 == this.v3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f, reason: from getter */
    public final float getV1() {
        return this.v1;
    }

    /* renamed from: g, reason: from getter */
    public final float getV2() {
        return this.v2;
    }

    /* renamed from: h, reason: from getter */
    public final float getV3() {
        return this.v3;
    }

    public int hashCode() {
        return Float.hashCode(this.v3) + androidx.compose.animation.l0.a(this.v2, Float.hashCode(this.v1) * 31, 31);
    }

    @Override // androidx.compose.animation.core.s
    @fg.l
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public q c() {
        return new q(0.0f, 0.0f, 0.0f);
    }

    public final void j(float f4) {
        this.v1 = f4;
    }

    public final void k(float f4) {
        this.v2 = f4;
    }

    public final void l(float f4) {
        this.v3 = f4;
    }

    @fg.l
    public String toString() {
        return "AnimationVector3D: v1 = " + this.v1 + ", v2 = " + this.v2 + ", v3 = " + this.v3;
    }
}
