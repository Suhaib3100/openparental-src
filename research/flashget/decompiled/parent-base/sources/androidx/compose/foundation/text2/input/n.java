package androidx.compose.foundation.text2.input;

import kotlin.Metadata;

/* compiled from: CodepointTransformation.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/text2/input/n;", "Landroidx/compose/foundation/text2/input/c;", "<init>", "()V", "", "codepointIndex", "codepoint", "a", "(II)I", "", "toString", "()Ljava/lang/String;", "c", "I", "LINE_FEED", "d", "CARRIAGE_RETURN", "e", "WHITESPACE", "f", "ZERO_WIDTH_SPACE", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n implements c {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final n f9041b = new n();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final int LINE_FEED = 10;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final int CARRIAGE_RETURN = 13;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final int WHITESPACE = 32;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final int ZERO_WIDTH_SPACE = 65279;

    /* renamed from: g, reason: collision with root package name */
    public static final int f9046g = 0;

    private n() {
    }

    @Override // androidx.compose.foundation.text2.input.c
    public int a(int codepointIndex, int codepoint) {
        if (codepoint == 10) {
            return 32;
        }
        return codepoint == 13 ? ZERO_WIDTH_SPACE : codepoint;
    }

    @fg.l
    public String toString() {
        return "SingleLineCodepointTransformation";
    }
}
