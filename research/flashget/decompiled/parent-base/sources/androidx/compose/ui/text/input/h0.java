package androidx.compose.ui.text.input;

import kotlin.Metadata;

/* compiled from: MathUtils.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a*\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"", "right", "Lkotlin/Function0;", "defaultValue", "a", "(IILld/a;)I", "b", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h0 {
    public static final int a(int i4, int i5, @fg.l ld.a<Integer> aVar) {
        int i6 = i4 + i5;
        return ((i4 ^ i6) & (i5 ^ i6)) < 0 ? aVar.invoke().intValue() : i6;
    }

    public static final int b(int i4, int i5, @fg.l ld.a<Integer> aVar) {
        int i6 = i4 - i5;
        return ((i4 ^ i6) & (i5 ^ i4)) < 0 ? aVar.invoke().intValue() : i6;
    }
}
