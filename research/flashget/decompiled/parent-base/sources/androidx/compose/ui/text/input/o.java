package androidx.compose.ui.text.input;

import androidx.collection.q2;
import kotlin.Metadata;

/* compiled from: EditCommand.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/input/o;", "Landroidx/compose/ui/text/input/p;", "", "lengthBeforeCursor", "lengthAfterCursor", "<init>", "(II)V", "Landroidx/compose/ui/text/input/s;", "buffer", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/input/s;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "c", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o implements p {

    /* renamed from: c, reason: collision with root package name */
    public static final int f21075c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int lengthBeforeCursor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int lengthAfterCursor;

    public o(int i4, int i5) {
        this.lengthBeforeCursor = i4;
        this.lengthAfterCursor = i5;
        if (i4 < 0 || i5 < 0) {
            throw new IllegalArgumentException(q2.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i4, " and ", i5, " respectively.").toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033 A[LOOP:0: B:2:0x0005->B:10:0x0033, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[EDGE_INSN: B:11:0x0036->B:12:0x0036 BREAK  A[LOOP:0: B:2:0x0005->B:10:0x0033], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[LOOP:1: B:13:0x0039->B:21:0x0071, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[EDGE_INSN: B:22:0x0074->B:23:0x0074 BREAK  A[LOOP:1: B:13:0x0039->B:21:0x0071], SYNTHETIC] */
    @Override // androidx.compose.ui.text.input.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(@fg.l androidx.compose.ui.text.input.s r8) {
        /*
            r7 = this;
            int r0 = r7.lengthBeforeCursor
            r1 = 0
            r2 = r1
            r3 = r2
        L5:
            if (r2 >= r0) goto L36
            int r4 = r3 + 1
            int r5 = r8.getSelectionStart()
            if (r5 <= r4) goto L2c
            int r5 = r8.getSelectionStart()
            int r5 = r5 - r4
            int r5 = r5 + (-1)
            char r5 = r8.d(r5)
            int r6 = r8.getSelectionStart()
            int r6 = r6 - r4
            char r6 = r8.d(r6)
            boolean r5 = androidx.compose.ui.text.input.q.a(r5, r6)
            if (r5 == 0) goto L2c
            int r3 = r3 + 2
            goto L2d
        L2c:
            r3 = r4
        L2d:
            int r4 = r8.getSelectionStart()
            if (r3 == r4) goto L36
            int r2 = r2 + 1
            goto L5
        L36:
            int r0 = r7.lengthAfterCursor
            r2 = r1
        L39:
            if (r1 >= r0) goto L74
            int r4 = r2 + 1
            int r5 = r8.getSelectionEnd()
            int r5 = r5 + r4
            int r6 = r8.i()
            if (r5 >= r6) goto L65
            int r5 = r8.getSelectionEnd()
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            char r5 = r8.d(r5)
            int r6 = r8.getSelectionEnd()
            int r6 = r6 + r4
            char r6 = r8.d(r6)
            boolean r5 = androidx.compose.ui.text.input.q.a(r5, r6)
            if (r5 == 0) goto L65
            int r2 = r2 + 2
            goto L66
        L65:
            r2 = r4
        L66:
            int r4 = r8.getSelectionEnd()
            int r4 = r4 + r2
            int r5 = r8.i()
            if (r4 == r5) goto L74
            int r1 = r1 + 1
            goto L39
        L74:
            int r0 = r8.getSelectionEnd()
            int r1 = r8.getSelectionEnd()
            int r1 = r1 + r2
            r8.c(r0, r1)
            int r0 = r8.getSelectionStart()
            int r0 = r0 - r3
            int r1 = r8.getSelectionStart()
            r8.c(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.o.a(androidx.compose.ui.text.input.s):void");
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
        if (!(other instanceof o)) {
            return false;
        }
        o oVar = (o) other;
        return this.lengthBeforeCursor == oVar.lengthBeforeCursor && this.lengthAfterCursor == oVar.lengthAfterCursor;
    }

    public int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.lengthBeforeCursor);
        sb.append(", lengthAfterCursor=");
        return androidx.view.e.a(sb, this.lengthAfterCursor, ')');
    }
}
