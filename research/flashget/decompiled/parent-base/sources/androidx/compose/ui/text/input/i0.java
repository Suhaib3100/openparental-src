package androidx.compose.ui.text.input;

import kotlin.Metadata;

/* compiled from: EditCommand.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/input/i0;", "Landroidx/compose/ui/text/input/p;", "", "amount", "<init>", "(I)V", "Landroidx/compose/ui/text/input/s;", "buffer", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/input/s;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i0 implements p {

    /* renamed from: b, reason: collision with root package name */
    public static final int f21040b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int amount;

    public i0(int i4) {
        this.amount = i4;
    }

    @Override // androidx.compose.ui.text.input.p
    public void a(@fg.l s buffer) {
        if (buffer.h() == -1) {
            int selectionStart = buffer.getSelectionStart();
            buffer.r(selectionStart, selectionStart);
        }
        int selectionStart2 = buffer.getSelectionStart();
        String sVar = buffer.toString();
        int i4 = this.amount;
        int i5 = 0;
        if (i4 <= 0) {
            int i6 = -i4;
            while (i5 < i6) {
                int b5 = androidx.compose.ui.text.n.b(sVar, selectionStart2);
                if (b5 == -1) {
                    break;
                }
                i5++;
                selectionStart2 = b5;
            }
        } else {
            while (i5 < i4) {
                int a5 = androidx.compose.ui.text.n.a(sVar, selectionStart2);
                if (a5 == -1) {
                    break;
                }
                i5++;
                selectionStart2 = a5;
            }
        }
        buffer.r(selectionStart2, selectionStart2);
    }

    /* renamed from: b, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof i0) && this.amount == ((i0) other).amount;
    }

    public int hashCode() {
        return this.amount;
    }

    @fg.l
    public String toString() {
        return androidx.view.e.a(new StringBuilder("MoveCursorCommand(amount="), this.amount, ')');
    }
}
