package androidx.compose.foundation.text;

import kotlin.Metadata;

/* compiled from: StringHelpers.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "", "startIndex", "b", "(Ljava/lang/CharSequence;I)I", "a", "index", "Landroidx/compose/ui/text/t0;", "c", "(Ljava/lang/CharSequence;I)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j0 {
    public static final int a(@fg.l CharSequence charSequence, int i4) {
        int length = charSequence.length();
        while (i4 < length) {
            if (charSequence.charAt(i4) == '\n') {
                return i4;
            }
            i4++;
        }
        return charSequence.length();
    }

    public static final int b(@fg.l CharSequence charSequence, int i4) {
        while (i4 > 0) {
            if (charSequence.charAt(i4 - 1) == '\n') {
                return i4;
            }
            i4--;
        }
        return 0;
    }

    public static final long c(@fg.l CharSequence charSequence, int i4) {
        return androidx.compose.ui.text.u0.b(b(charSequence, i4), a(charSequence, i4));
    }
}
