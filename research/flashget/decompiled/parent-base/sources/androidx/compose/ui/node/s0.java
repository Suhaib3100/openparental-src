package androidx.compose.ui.node;

import androidx.collection.q2;
import kotlin.Metadata;

/* compiled from: LookaheadDelegate.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"", "width", "height", "Lkotlin/k2;", "a", "(II)V", "I", "MaxLayoutDimension", "b", "MaxLayoutMask", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f19491a = 16777215;

    /* renamed from: b, reason: collision with root package name */
    private static final int f19492b = -16777216;

    public static final void a(int i4, int i5) {
        if ((i4 & (-16777216)) != 0 || ((-16777216) & i5) != 0) {
            throw new IllegalStateException(q2.a("Size(", i4, " x ", i5, ") is out of range. Each dimension must be between 0 and 16777215.").toString());
        }
    }
}
