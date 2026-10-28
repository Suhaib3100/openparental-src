package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: Tooltip.kt */
@androidx.compose.runtime.x4
@f5
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\bJ'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0018\u0010\b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/o2;", "", "Landroidx/compose/ui/unit/h;", "caretHeight", "caretWidth", "<init>", "(FFLkotlin/jvm/internal/w;)V", "a", "()F", "b", "c", "(FF)Landroidx/compose/material3/o2;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "e", "f", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class o2 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f12916c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float caretHeight;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float caretWidth;

    public /* synthetic */ o2(float f4, float f5, kotlin.jvm.internal.w wVar) {
        this(f4, f5);
    }

    public static o2 d(o2 o2Var, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = o2Var.caretHeight;
        }
        if ((i4 & 2) != 0) {
            f5 = o2Var.caretWidth;
        }
        o2Var.getClass();
        return new o2(f4, f5);
    }

    /* renamed from: a, reason: from getter */
    public final float getCaretHeight() {
        return this.caretHeight;
    }

    /* renamed from: b, reason: from getter */
    public final float getCaretWidth() {
        return this.caretWidth;
    }

    @fg.l
    public final o2 c(float caretHeight, float caretWidth) {
        return new o2(caretHeight, caretWidth);
    }

    public final float e() {
        return this.caretHeight;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) other;
        return androidx.compose.ui.unit.h.l(this.caretHeight, o2Var.caretHeight) && androidx.compose.ui.unit.h.l(this.caretWidth, o2Var.caretWidth);
    }

    public final float f() {
        return this.caretWidth;
    }

    public int hashCode() {
        return Float.hashCode(this.caretWidth) + (androidx.compose.ui.unit.h.n(this.caretHeight) * 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("CaretProperties(caretHeight=");
        androidx.compose.foundation.b0.a(this.caretHeight, sb, ", caretWidth=");
        sb.append((Object) androidx.compose.ui.unit.h.s(this.caretWidth));
        sb.append(')');
        return sb.toString();
    }

    private o2(float f4, float f5) {
        this.caretHeight = f4;
        this.caretWidth = f5;
    }
}
