package androidx.compose.ui.layout;

import kotlin.Metadata;

/* compiled from: ContentScale.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/layout/j;", "Landroidx/compose/ui/layout/f;", "", "value", "<init>", "(F)V", "Li0/n;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/n1;", "a", "(JJ)J", "b", "()F", "c", "(F)Landroidx/compose/ui/layout/j;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "e", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class j implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final int f19017c = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float value;

    public j(float f4) {
        this.value = f4;
    }

    public static j d(j jVar, float f4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = jVar.value;
        }
        jVar.getClass();
        return new j(f4);
    }

    @Override // androidx.compose.ui.layout.f
    public long a(long srcSize, long dstSize) {
        float f4 = this.value;
        return o1.a(f4, f4);
    }

    /* renamed from: b, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    @fg.l
    public final j c(float value) {
        return new j(value);
    }

    public final float e() {
        return this.value;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof j) && Float.compare(this.value, ((j) other).value) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.value);
    }

    @fg.l
    public String toString() {
        return androidx.compose.animation.b.a(new StringBuilder("FixedScale(value="), this.value, ')');
    }
}
