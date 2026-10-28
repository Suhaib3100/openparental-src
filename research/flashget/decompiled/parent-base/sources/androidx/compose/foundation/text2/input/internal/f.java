package androidx.compose.foundation.text2.input.internal;

import kotlin.Metadata;

/* compiled from: CodepointHelpers.jvm.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\t\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "", "index", "b", "(Ljava/lang/CharSequence;I)I", "c", "(Ljava/lang/CharSequence;)I", "codePoint", "a", "(I)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {
    public static final int a(int i4) {
        return Character.charCount(i4);
    }

    public static final int b(@fg.l CharSequence charSequence, int i4) {
        return Character.codePointAt(charSequence, i4);
    }

    public static final int c(@fg.l CharSequence charSequence) {
        return Character.codePointCount(charSequence, 0, charSequence.length());
    }
}
