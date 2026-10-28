package androidx.core.text;

import android.text.TextUtils;
import kotlin.Metadata;

/* compiled from: CharSequence.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "", "a", "(Ljava/lang/CharSequence;)Z", "", "b", "(Ljava/lang/CharSequence;)I", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {
    public static final boolean a(@fg.l CharSequence charSequence) {
        return TextUtils.isDigitsOnly(charSequence);
    }

    public static final int b(@fg.l CharSequence charSequence) {
        return TextUtils.getTrimmedLength(charSequence);
    }
}
