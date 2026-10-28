package androidx.compose.material3.carousel;

import androidx.compose.animation.d1;
import androidx.compose.animation.l0;
import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import kotlin.Metadata;

/* compiled from: Keyline.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJV\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b#\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b$\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b&\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b'\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010%\u001a\u0004\b(\u0010\u0012R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b)\u0010\u000e¨\u0006*"}, d2 = {"Landroidx/compose/material3/carousel/c;", "", "", "size", "offset", "unadjustedOffset", "", "isFocal", "isAnchor", "isPivot", "cutoff", "<init>", "(FFFZZZF)V", "a", "()F", "b", "c", "d", "()Z", "e", "f", "g", "h", "(FFFZZZF)Landroidx/compose/material3/carousel/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "F", "l", "k", "m", "Z", "o", "n", "p", "j", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class c {

    /* renamed from: h, reason: collision with root package name */
    public static final int f10303h = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float size;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float offset;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float unadjustedOffset;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isFocal;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isAnchor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isPivot;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float cutoff;

    public c(float f4, float f5, float f6, boolean z4, boolean z5, boolean z6, float f7) {
        this.size = f4;
        this.offset = f5;
        this.unadjustedOffset = f6;
        this.isFocal = z4;
        this.isAnchor = z5;
        this.isPivot = z6;
        this.cutoff = f7;
    }

    public static c i(c cVar, float f4, float f5, float f6, boolean z4, boolean z5, boolean z6, float f7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = cVar.size;
        }
        if ((i4 & 2) != 0) {
            f5 = cVar.offset;
        }
        float f10 = f5;
        if ((i4 & 4) != 0) {
            f6 = cVar.unadjustedOffset;
        }
        float f11 = f6;
        if ((i4 & 8) != 0) {
            z4 = cVar.isFocal;
        }
        boolean z7 = z4;
        if ((i4 & 16) != 0) {
            z5 = cVar.isAnchor;
        }
        boolean z10 = z5;
        if ((i4 & 32) != 0) {
            z6 = cVar.isPivot;
        }
        boolean z11 = z6;
        if ((i4 & 64) != 0) {
            f7 = cVar.cutoff;
        }
        cVar.getClass();
        return new c(f4, f10, f11, z7, z10, z11, f7);
    }

    /* renamed from: a, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    /* renamed from: b, reason: from getter */
    public final float getOffset() {
        return this.offset;
    }

    /* renamed from: c, reason: from getter */
    public final float getUnadjustedOffset() {
        return this.unadjustedOffset;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsFocal() {
        return this.isFocal;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsAnchor() {
        return this.isAnchor;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return Float.compare(this.size, cVar.size) == 0 && Float.compare(this.offset, cVar.offset) == 0 && Float.compare(this.unadjustedOffset, cVar.unadjustedOffset) == 0 && this.isFocal == cVar.isFocal && this.isAnchor == cVar.isAnchor && this.isPivot == cVar.isPivot && Float.compare(this.cutoff, cVar.cutoff) == 0;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsPivot() {
        return this.isPivot;
    }

    /* renamed from: g, reason: from getter */
    public final float getCutoff() {
        return this.cutoff;
    }

    @l
    public final c h(float size, float offset, float unadjustedOffset, boolean isFocal, boolean isAnchor, boolean isPivot, float cutoff) {
        return new c(size, offset, unadjustedOffset, isFocal, isAnchor, isPivot, cutoff);
    }

    public int hashCode() {
        return Float.hashCode(this.cutoff) + d1.a(this.isPivot, d1.a(this.isAnchor, d1.a(this.isFocal, l0.a(this.unadjustedOffset, l0.a(this.offset, Float.hashCode(this.size) * 31, 31), 31), 31), 31), 31);
    }

    public final float j() {
        return this.cutoff;
    }

    public final float k() {
        return this.offset;
    }

    public final float l() {
        return this.size;
    }

    public final float m() {
        return this.unadjustedOffset;
    }

    public final boolean n() {
        return this.isAnchor;
    }

    public final boolean o() {
        return this.isFocal;
    }

    public final boolean p() {
        return this.isPivot;
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder("Keyline(size=");
        sb.append(this.size);
        sb.append(", offset=");
        sb.append(this.offset);
        sb.append(", unadjustedOffset=");
        sb.append(this.unadjustedOffset);
        sb.append(", isFocal=");
        sb.append(this.isFocal);
        sb.append(", isAnchor=");
        sb.append(this.isAnchor);
        sb.append(", isPivot=");
        sb.append(this.isPivot);
        sb.append(", cutoff=");
        return androidx.compose.animation.b.a(sb, this.cutoff, ')');
    }
}
