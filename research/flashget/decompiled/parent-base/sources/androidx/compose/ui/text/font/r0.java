package androidx.compose.ui.text.font;

import kotlin.Metadata;

/* compiled from: FontFamily.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/font/r0;", "Landroidx/compose/ui/text/font/y;", "Landroidx/compose/ui/text/font/d1;", "typeface", "<init>", "(Landroidx/compose/ui/text/font/d1;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "j", "Landroidx/compose/ui/text/font/d1;", "m", "()Landroidx/compose/ui/text/font/d1;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r0 extends y {

    /* renamed from: k, reason: collision with root package name */
    public static final int f20864k = 0;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d1 typeface;

    public r0(@fg.l d1 d1Var) {
        super(true, null);
        this.typeface = d1Var;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof r0) && kotlin.jvm.internal.l0.g(this.typeface, ((r0) other).typeface);
    }

    public int hashCode() {
        return this.typeface.hashCode();
    }

    @fg.l
    /* renamed from: m, reason: from getter */
    public final d1 getTypeface() {
        return this.typeface;
    }

    @fg.l
    public String toString() {
        return "LoadedFontFamily(typeface=" + this.typeface + ')';
    }
}
