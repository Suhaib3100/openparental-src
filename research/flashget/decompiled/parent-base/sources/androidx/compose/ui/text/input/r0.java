package androidx.compose.ui.text.input;

import kotlin.Metadata;

/* compiled from: VisualTransformation.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/input/r0;", "Landroidx/compose/ui/text/input/k1;", "", "mask", "<init>", "(C)V", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/input/i1;", "a", "(Landroidx/compose/ui/text/e;)Landroidx/compose/ui/text/input/i1;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "C", "()C", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r0 implements k1 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f21095c = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final char mask;

    public r0() {
        this((char) 0, 1, null);
    }

    @Override // androidx.compose.ui.text.input.k1
    @fg.l
    public i1 a(@fg.l androidx.compose.ui.text.e text) {
        return new i1(new androidx.compose.ui.text.e(kotlin.text.v.e2(String.valueOf(this.mask), text.getText().length()), null, null, 6, null), p0.INSTANCE.a());
    }

    /* renamed from: b, reason: from getter */
    public final char getMask() {
        return this.mask;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof r0) && this.mask == ((r0) other).mask;
    }

    public int hashCode() {
        return Character.hashCode(this.mask);
    }

    public r0(char c5) {
        this.mask = c5;
    }

    public /* synthetic */ r0(char c5, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? kotlin.text.m0.bullet : c5);
    }
}
