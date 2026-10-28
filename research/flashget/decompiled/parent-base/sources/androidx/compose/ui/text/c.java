package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.android.g1;
import androidx.compose.ui.text.style.e;
import androidx.compose.ui.text.style.f;
import androidx.compose.ui.text.style.j;
import kotlin.Metadata;

/* compiled from: AndroidParagraph.android.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0004\u001a\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0004\u001a\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0004\u001a\u001b\u0010\u0013\u001a\u00020\u0002*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/text/style/j;", "align", "", "l", "(I)I", "Landroidx/compose/ui/text/style/e;", "hyphens", "n", "Landroidx/compose/ui/text/style/f$b;", "breakStrategy", "m", "Landroidx/compose/ui/text/style/f$c;", "lineBreakStrictness", "o", "Landroidx/compose/ui/text/style/f$d;", "lineBreakWordStyle", "p", "Landroidx/compose/ui/text/android/g1;", "maxHeight", "j", "(Landroidx/compose/ui/text/android/g1;I)I", "Landroidx/compose/ui/text/v0;", "textStyle", "", "ellipsis", "k", "(Landroidx/compose/ui/text/v0;Z)Z", "", "i", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        androidx.compose.ui.text.platform.extensions.d.u(spannableString, new s0.c(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(g1 g1Var, int i4) {
        int lineCount = g1Var.getLineCount();
        for (int i5 = 0; i5 < lineCount; i5++) {
            if (g1Var.p(i5) > i4) {
                return i5;
            }
        }
        return g1Var.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(v0 v0Var, boolean z4) {
        if (!z4 || androidx.compose.ui.unit.z.j(v0Var.E(), androidx.compose.ui.unit.a0.m(0))) {
            return false;
        }
        long E = v0Var.E();
        androidx.compose.ui.unit.z.INSTANCE.getClass();
        if (androidx.compose.ui.unit.z.j(E, androidx.compose.ui.unit.z.f21534d)) {
            return false;
        }
        int R = v0Var.R();
        j.Companion companion = androidx.compose.ui.text.style.j.INSTANCE;
        companion.getClass();
        if (androidx.compose.ui.text.style.j.k(R, androidx.compose.ui.text.style.j.f21360i)) {
            return false;
        }
        int R2 = v0Var.R();
        companion.getClass();
        if (androidx.compose.ui.text.style.j.k(R2, androidx.compose.ui.text.style.j.f21358g)) {
            return false;
        }
        int R3 = v0Var.R();
        companion.getClass();
        return !androidx.compose.ui.text.style.j.k(R3, androidx.compose.ui.text.style.j.f21357f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(int i4) {
        j.Companion companion = androidx.compose.ui.text.style.j.INSTANCE;
        companion.getClass();
        if (androidx.compose.ui.text.style.j.k(i4, androidx.compose.ui.text.style.j.f21354c)) {
            return 3;
        }
        companion.getClass();
        if (androidx.compose.ui.text.style.j.k(i4, androidx.compose.ui.text.style.j.f21355d)) {
            return 4;
        }
        companion.getClass();
        if (androidx.compose.ui.text.style.j.k(i4, androidx.compose.ui.text.style.j.f21356e)) {
            return 2;
        }
        companion.getClass();
        if (!androidx.compose.ui.text.style.j.k(i4, androidx.compose.ui.text.style.j.f21358g)) {
            companion.getClass();
            if (androidx.compose.ui.text.style.j.k(i4, androidx.compose.ui.text.style.j.f21359h)) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(int i4) {
        f.b.Companion companion = f.b.INSTANCE;
        companion.getClass();
        if (f.b.h(i4, f.b.f21317c)) {
            return 0;
        }
        companion.getClass();
        if (f.b.h(i4, f.b.f21318d)) {
            return 1;
        }
        companion.getClass();
        return f.b.h(i4, f.b.f21319e) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(int i4) {
        e.Companion companion = androidx.compose.ui.text.style.e.INSTANCE;
        companion.getClass();
        if (androidx.compose.ui.text.style.e.g(i4, androidx.compose.ui.text.style.e.f21307d)) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        companion.getClass();
        androidx.compose.ui.text.style.e.g(i4, androidx.compose.ui.text.style.e.f21306c);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(int i4) {
        f.c.Companion companion = f.c.INSTANCE;
        companion.getClass();
        if (f.c.i(i4, f.c.f21323c)) {
            return 0;
        }
        companion.getClass();
        if (f.c.i(i4, f.c.f21324d)) {
            return 1;
        }
        companion.getClass();
        if (f.c.i(i4, f.c.f21325e)) {
            return 2;
        }
        companion.getClass();
        return f.c.i(i4, f.c.f21326f) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(int i4) {
        f.d.Companion companion = f.d.INSTANCE;
        companion.getClass();
        if (f.d.g(i4, f.d.f21330c)) {
            return 0;
        }
        companion.getClass();
        return f.d.g(i4, f.d.f21331d) ? 1 : 0;
    }
}
