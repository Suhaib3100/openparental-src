package androidx.compose.ui.text.android;

import android.text.Layout;
import kotlin.Metadata;

/* compiled from: LayoutCompat.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/text/Layout;", "", "offset", "", "upstream", "a", "(Landroid/text/Layout;IZ)I", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l {
    public static final int a(@fg.l Layout layout, @androidx.annotation.g0(from = 0) int i4, boolean z4) {
        if (i4 <= 0) {
            return 0;
        }
        if (i4 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i4);
        int lineStart = layout.getLineStart(lineForOffset);
        return (lineStart == i4 || layout.getLineEnd(lineForOffset) == i4) ? lineStart == i4 ? z4 ? lineForOffset - 1 : lineForOffset : z4 ? lineForOffset : lineForOffset + 1 : lineForOffset;
    }
}
