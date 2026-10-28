package androidx.compose.foundation.text2.input.internal;

import android.text.TextUtils;
import kotlin.Metadata;

/* compiled from: ToCharArray.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\r\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "", "destination", "", "destinationOffset", "startIndex", "endIndex", "Lkotlin/k2;", "a", "(Ljava/lang/CharSequence;[CIII)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l0 {
    public static final void a(@fg.l CharSequence charSequence, @fg.l char[] cArr, int i4, int i5, int i6) {
        if (charSequence instanceof androidx.compose.foundation.text2.input.q) {
            androidx.compose.foundation.text2.input.r.h((androidx.compose.foundation.text2.input.q) charSequence, cArr, i4, i5, i6);
        } else {
            TextUtils.getChars(charSequence, i5, i6, cArr, i4);
        }
    }
}
