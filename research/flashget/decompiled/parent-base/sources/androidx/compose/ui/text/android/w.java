package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.StaticLayout;
import kotlin.Metadata;

/* compiled from: StaticLayoutFactory.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/android/w;", "Landroidx/compose/ui/text/android/k0;", "<init>", "()V", "Landroidx/compose/ui/text/android/m0;", "params", "Landroid/text/StaticLayout;", "a", "(Landroidx/compose/ui/text/android/m0;)Landroid/text/StaticLayout;", "layout", "", "useFallbackLineSpacing", "b", "(Landroid/text/StaticLayout;Z)Z", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(23)
/* loaded from: classes.dex */
final class w implements k0 {
    @Override // androidx.compose.ui.text.android.k0
    @fg.l
    @androidx.annotation.u
    public StaticLayout a(@fg.l m0 params) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(params.getText(), params.getStart(), params.getEnd(), params.getPaint(), params.getWidth());
        obtain.setTextDirection(params.getTextDir());
        obtain.setAlignment(params.getAlignment());
        obtain.setMaxLines(params.getMaxLines());
        obtain.setEllipsize(params.getEllipsize());
        obtain.setEllipsizedWidth(params.getEllipsizedWidth());
        obtain.setLineSpacing(params.getLineSpacingExtra(), params.getLineSpacingMultiplier());
        obtain.setIncludePad(params.getIncludePadding());
        obtain.setBreakStrategy(params.getBreakStrategy());
        obtain.setHyphenationFrequency(params.getHyphenationFrequency());
        obtain.setIndents(params.getLeftIndents(), params.getRightIndents());
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            y.a(obtain, params.getJustificationMode());
        }
        if (i4 >= 28) {
            a0.a(obtain, params.getUseFallbackLineSpacing());
        }
        if (i4 >= 33) {
            h0.b(obtain, params.getLineBreakStyle(), params.getLineBreakWordStyle());
        }
        return obtain.build();
    }

    @Override // androidx.compose.ui.text.android.k0
    public boolean b(@fg.l StaticLayout layout, boolean useFallbackLineSpacing) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            return h0.a(layout);
        }
        if (i4 >= 28) {
            return useFallbackLineSpacing;
        }
        return false;
    }
}
