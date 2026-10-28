package androidx.compose.ui.text;

import androidx.compose.ui.text.style.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TextStyle.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\"\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/v0;", "start", "stop", "", "fraction", "c", "(Landroidx/compose/ui/text/v0;Landroidx/compose/ui/text/v0;F)Landroidx/compose/ui/text/v0;", "style", "Landroidx/compose/ui/unit/w;", "direction", "d", "(Landroidx/compose/ui/text/v0;Landroidx/compose/ui/unit/w;)Landroidx/compose/ui/text/v0;", "layoutDirection", "Landroidx/compose/ui/text/style/l;", "textDirection", "e", "(Landroidx/compose/ui/unit/w;I)I", "Landroidx/compose/ui/text/d0;", "platformSpanStyle", "Landroidx/compose/ui/text/c0;", "platformParagraphStyle", "Landroidx/compose/ui/text/f0;", "b", "(Landroidx/compose/ui/text/d0;Landroidx/compose/ui/text/c0;)Landroidx/compose/ui/text/f0;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w0 {

    /* compiled from: TextStyle.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21429a;

        static {
            int[] iArr = new int[androidx.compose.ui.unit.w.values().length];
            try {
                iArr[androidx.compose.ui.unit.w.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.unit.w.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21429a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 b(d0 d0Var, c0 c0Var) {
        if (d0Var == null && c0Var == null) {
            return null;
        }
        return new f0(d0Var, c0Var);
    }

    @fg.l
    public static final v0 c(@fg.l v0 v0Var, @fg.l v0 v0Var2, float f4) {
        return new v0(j0.c(v0Var.o0(), v0Var2.o0(), f4), z.b(v0Var.n0(), v0Var2.n0(), f4));
    }

    @fg.l
    public static final v0 d(@fg.l v0 v0Var, @fg.l androidx.compose.ui.unit.w wVar) {
        return new v0(j0.h(v0Var.getSpanStyle()), z.e(v0Var.getParagraphStyle(), wVar), v0Var.getPlatformStyle());
    }

    public static final int e(@fg.l androidx.compose.ui.unit.w wVar, int i4) {
        l.Companion companion = androidx.compose.ui.text.style.l.INSTANCE;
        companion.getClass();
        if (androidx.compose.ui.text.style.l.j(i4, androidx.compose.ui.text.style.l.f21371e)) {
            int i5 = a.f21429a[wVar.ordinal()];
            if (i5 == 1) {
                companion.getClass();
                return androidx.compose.ui.text.style.l.f21372f;
            }
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            companion.getClass();
            return androidx.compose.ui.text.style.l.f21373g;
        }
        companion.getClass();
        if (!androidx.compose.ui.text.style.l.j(i4, androidx.compose.ui.text.style.l.f21374h)) {
            return i4;
        }
        int i6 = a.f21429a[wVar.ordinal()];
        if (i6 == 1) {
            companion.getClass();
            return androidx.compose.ui.text.style.l.f21369c;
        }
        if (i6 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        companion.getClass();
        return androidx.compose.ui.text.style.l.f21370d;
    }
}
