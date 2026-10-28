package androidx.compose.ui.text.style;

import kotlin.Metadata;

/* compiled from: LineBreak.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u000b\u001a'\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"", "i1", "i2", "i3", "e", "(III)I", "mask", "f", "(I)I", "g", "h", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g {
    public static final int b(int i4) {
        return i4 & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(int i4, int i5, int i6) {
        return i4 | (i5 << 8) | (i6 << 16);
    }

    private static final int f(int i4) {
        return i4 & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(int i4) {
        return (i4 >> 8) & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(int i4) {
        return (i4 >> 16) & 255;
    }
}
