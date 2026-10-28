package androidx.compose.ui.text.font;

import kotlin.Metadata;

/* compiled from: AndroidFontResolveInterceptor.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/font/h;", "Landroidx/compose/ui/text/font/v0;", "", "fontWeightAdjustment", "<init>", "(I)V", "e", "()I", "Landroidx/compose/ui/text/font/o0;", "fontWeight", "a", "(Landroidx/compose/ui/text/font/o0;)Landroidx/compose/ui/text/font/o0;", "f", "(I)Landroidx/compose/ui/text/font/h;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class h implements v0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f20740c = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int fontWeightAdjustment;

    public h(int i4) {
        this.fontWeightAdjustment = i4;
    }

    /* renamed from: e, reason: from getter */
    private final int getFontWeightAdjustment() {
        return this.fontWeightAdjustment;
    }

    public static h g(h hVar, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = hVar.fontWeightAdjustment;
        }
        hVar.getClass();
        return new h(i4);
    }

    @Override // androidx.compose.ui.text.font.v0
    @fg.l
    public o0 a(@fg.l o0 fontWeight) {
        int i4 = this.fontWeightAdjustment;
        return (i4 == 0 || i4 == Integer.MAX_VALUE) ? fontWeight : new o0(kotlin.ranges.s.I(fontWeight.u() + this.fontWeightAdjustment, 1, 1000));
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof h) && this.fontWeightAdjustment == ((h) other).fontWeightAdjustment;
    }

    @fg.l
    public final h f(int fontWeightAdjustment) {
        return new h(fontWeightAdjustment);
    }

    public int hashCode() {
        return Integer.hashCode(this.fontWeightAdjustment);
    }

    @fg.l
    public String toString() {
        return androidx.view.e.a(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.fontWeightAdjustment, ')');
    }
}
