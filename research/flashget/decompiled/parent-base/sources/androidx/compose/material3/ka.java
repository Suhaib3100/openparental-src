package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: TabRow.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00028Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/ka;", "", "Landroidx/compose/ui/unit/h;", "left", "width", "contentWidth", "<init>", "(FFFLkotlin/jvm/internal/w;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "b", "()F", "d", "c", "right", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabPosition\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1223:1\n51#2:1224\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabPosition\n*L\n971#1:1224\n*E\n"})
/* loaded from: classes.dex */
public final class ka {

    /* renamed from: d, reason: collision with root package name */
    public static final int f12106d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float left;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float width;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float contentWidth;

    public /* synthetic */ ka(float f4, float f5, float f6, kotlin.jvm.internal.w wVar) {
        this(f4, f5, f6);
    }

    /* renamed from: a, reason: from getter */
    public final float getContentWidth() {
        return this.contentWidth;
    }

    /* renamed from: b, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    public final float c() {
        return androidx.compose.ui.unit.h.g(this.left + this.width);
    }

    /* renamed from: d, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ka)) {
            return false;
        }
        ka kaVar = (ka) other;
        return androidx.compose.ui.unit.h.l(this.left, kaVar.left) && androidx.compose.ui.unit.h.l(this.width, kaVar.width) && androidx.compose.ui.unit.h.l(this.contentWidth, kaVar.contentWidth);
    }

    public int hashCode() {
        return Float.hashCode(this.contentWidth) + androidx.compose.animation.l0.a(this.width, androidx.compose.ui.unit.h.n(this.left) * 31, 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        sb.append((Object) androidx.compose.ui.unit.h.s(this.left));
        sb.append(", right=");
        sb.append((Object) androidx.compose.ui.unit.h.s(c()));
        sb.append(", width=");
        androidx.compose.foundation.b0.a(this.width, sb, ", contentWidth=");
        sb.append((Object) androidx.compose.ui.unit.h.s(this.contentWidth));
        sb.append(')');
        return sb.toString();
    }

    private ka(float f4, float f5, float f6) {
        this.left = f4;
        this.width = f5;
        this.contentWidth = f6;
    }
}
