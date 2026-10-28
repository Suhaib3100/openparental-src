package androidx.compose.ui.text;

import androidx.compose.runtime.m1;
import kotlin.Metadata;

/* compiled from: TextMeasurer.kt */
@m1
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/h;", "", "Landroidx/compose/ui/text/m0;", "textLayoutInput", "<init>", "(Landroidx/compose/ui/text/m0;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/text/m0;", "()Landroidx/compose/ui/text/m0;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final int f20899b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m0 textLayoutInput;

    public h(@fg.l m0 m0Var) {
        this.textLayoutInput = m0Var;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final m0 getTextLayoutInput() {
        return this.textLayoutInput;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof h)) {
            return false;
        }
        m0 m0Var = this.textLayoutInput;
        h hVar = (h) other;
        return kotlin.jvm.internal.l0.g(m0Var.getText(), hVar.textLayoutInput.getText()) && m0Var.getStyle().a0(hVar.textLayoutInput.getStyle()) && kotlin.jvm.internal.l0.g(m0Var.i(), hVar.textLayoutInput.i()) && m0Var.getMaxLines() == hVar.textLayoutInput.getMaxLines() && m0Var.getSoftWrap() == hVar.textLayoutInput.getSoftWrap() && androidx.compose.ui.text.style.t.g(m0Var.getOverflow(), hVar.textLayoutInput.getOverflow()) && kotlin.jvm.internal.l0.g(m0Var.getDensity(), hVar.textLayoutInput.getDensity()) && m0Var.getLayoutDirection() == hVar.textLayoutInput.getLayoutDirection() && m0Var.getFontFamilyResolver() == hVar.textLayoutInput.getFontFamilyResolver() && androidx.compose.ui.unit.b.p(m0Var.getConstraints()) == androidx.compose.ui.unit.b.p(hVar.textLayoutInput.getConstraints()) && androidx.compose.ui.unit.b.o(m0Var.getConstraints()) == androidx.compose.ui.unit.b.o(hVar.textLayoutInput.getConstraints());
    }

    public int hashCode() {
        m0 m0Var = this.textLayoutInput;
        return Integer.hashCode(androidx.compose.ui.unit.b.o(m0Var.getConstraints())) + ((Integer.hashCode(androidx.compose.ui.unit.b.p(m0Var.getConstraints())) + ((m0Var.getFontFamilyResolver().hashCode() + ((m0Var.getLayoutDirection().hashCode() + ((m0Var.getDensity().hashCode() + ((androidx.compose.ui.text.style.t.h(m0Var.getOverflow()) + ((Boolean.hashCode(m0Var.getSoftWrap()) + ((m0Var.getMaxLines() + ((m0Var.i().hashCode() + ((m0Var.getStyle().b0() + (m0Var.getText().hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
