package androidx.compose.ui.layout;

import kotlin.Metadata;

/* compiled from: ContentScale.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\"\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a\"\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"Li0/n;", "srcSize", "dstSize", "", "f", "(JJ)F", "g", "h", "e", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(long j4, long j5) {
        return i0.n.m(j5) / i0.n.m(j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(long j4, long j5) {
        return Math.max(h(j4, j5), e(j4, j5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(long j4, long j5) {
        return Math.min(h(j4, j5), e(j4, j5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(long j4, long j5) {
        return i0.n.t(j5) / i0.n.t(j4);
    }
}
