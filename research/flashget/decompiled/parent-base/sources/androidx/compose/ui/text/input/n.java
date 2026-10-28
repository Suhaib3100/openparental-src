package androidx.compose.ui.text.input;

import androidx.collection.q2;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: EditCommand.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/input/n;", "Landroidx/compose/ui/text/input/p;", "", "lengthBeforeCursor", "lengthAfterCursor", "<init>", "(II)V", "Landroidx/compose/ui/text/input/s;", "buffer", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/input/s;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "c", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nEditCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCommand.kt\nandroidx/compose/ui/text/input/DeleteSurroundingTextCommand\n+ 2 MathUtils.kt\nandroidx/compose/ui/text/input/MathUtilsKt\n*L\n1#1,564:1\n23#2,3:565\n32#2,4:568\n*S KotlinDebug\n*F\n+ 1 EditCommand.kt\nandroidx/compose/ui/text/input/DeleteSurroundingTextCommand\n*L\n268#1:565,3\n273#1:568,4\n*E\n"})
/* loaded from: classes.dex */
public final class n implements p {

    /* renamed from: c, reason: collision with root package name */
    public static final int f21072c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int lengthBeforeCursor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int lengthAfterCursor;

    public n(int i4, int i5) {
        this.lengthBeforeCursor = i4;
        this.lengthAfterCursor = i5;
        if (i4 < 0 || i5 < 0) {
            throw new IllegalArgumentException(q2.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i4, " and ", i5, " respectively.").toString());
        }
    }

    @Override // androidx.compose.ui.text.input.p
    public void a(@fg.l s buffer) {
        int selectionEnd = buffer.getSelectionEnd();
        int i4 = this.lengthAfterCursor;
        int i5 = selectionEnd + i4;
        if (((selectionEnd ^ i5) & (i4 ^ i5)) < 0) {
            i5 = buffer.i();
        }
        buffer.c(buffer.getSelectionEnd(), Math.min(i5, buffer.i()));
        int selectionStart = buffer.getSelectionStart();
        int i6 = this.lengthBeforeCursor;
        int i7 = selectionStart - i6;
        if (((selectionStart ^ i7) & (i6 ^ selectionStart)) < 0) {
            i7 = 0;
        }
        buffer.c(Math.max(0, i7), buffer.getSelectionStart());
    }

    /* renamed from: b, reason: from getter */
    public final int getLengthAfterCursor() {
        return this.lengthAfterCursor;
    }

    /* renamed from: c, reason: from getter */
    public final int getLengthBeforeCursor() {
        return this.lengthBeforeCursor;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof n)) {
            return false;
        }
        n nVar = (n) other;
        return this.lengthBeforeCursor == nVar.lengthBeforeCursor && this.lengthAfterCursor == nVar.lengthAfterCursor;
    }

    public int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.lengthBeforeCursor);
        sb.append(", lengthAfterCursor=");
        return androidx.view.e.a(sb, this.lengthAfterCursor, ')');
    }
}
