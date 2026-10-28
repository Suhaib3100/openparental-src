package androidx.compose.ui.text.input;

import kotlin.Metadata;

/* compiled from: EditCommand.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/input/b;", "Landroidx/compose/ui/text/input/p;", "Landroidx/compose/ui/text/e;", "annotatedString", "", "newCursorPosition", "<init>", "(Landroidx/compose/ui/text/e;I)V", "", "text", "(Ljava/lang/String;I)V", "Landroidx/compose/ui/text/input/s;", "buffer", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/input/s;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/e;", "b", "()Landroidx/compose/ui/text/e;", "I", "c", "d", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b implements p {

    /* renamed from: c, reason: collision with root package name */
    public static final int f20982c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.e annotatedString;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int newCursorPosition;

    public b(@fg.l androidx.compose.ui.text.e eVar, int i4) {
        this.annotatedString = eVar;
        this.newCursorPosition = i4;
    }

    @Override // androidx.compose.ui.text.input.p
    public void a(@fg.l s buffer) {
        if (buffer.m()) {
            buffer.o(buffer.getCompositionStart(), buffer.getCompositionEnd(), this.annotatedString.getText());
        } else {
            buffer.o(buffer.getSelectionStart(), buffer.getSelectionEnd(), this.annotatedString.getText());
        }
        int h4 = buffer.h();
        int i4 = this.newCursorPosition;
        int I = kotlin.ranges.s.I(i4 > 0 ? (h4 + i4) - 1 : (h4 + i4) - this.annotatedString.getText().length(), 0, buffer.i());
        buffer.r(I, I);
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final androidx.compose.ui.text.e getAnnotatedString() {
        return this.annotatedString;
    }

    /* renamed from: c, reason: from getter */
    public final int getNewCursorPosition() {
        return this.newCursorPosition;
    }

    @fg.l
    public final String d() {
        return this.annotatedString.getText();
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return kotlin.jvm.internal.l0.g(this.annotatedString.getText(), bVar.annotatedString.getText()) && this.newCursorPosition == bVar.newCursorPosition;
    }

    public int hashCode() {
        return (this.annotatedString.getText().hashCode() * 31) + this.newCursorPosition;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.annotatedString.getText());
        sb.append("', newCursorPosition=");
        return androidx.view.e.a(sb, this.newCursorPosition, ')');
    }

    public b(@fg.l String str, int i4) {
        this(new androidx.compose.ui.text.e(str, null, null, 6, null), i4);
    }
}
