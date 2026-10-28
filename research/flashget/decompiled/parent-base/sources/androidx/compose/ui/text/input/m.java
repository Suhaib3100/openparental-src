package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.l1;

/* compiled from: EditCommand.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/input/m;", "Landroidx/compose/ui/text/input/p;", "<init>", "()V", "Landroidx/compose/ui/text/input/s;", "buffer", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/input/s;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final int f21071a = 0;

    @Override // androidx.compose.ui.text.input.p
    public void a(@fg.l s buffer) {
        buffer.o(0, buffer.i(), "");
    }

    public boolean equals(@fg.m Object other) {
        return other instanceof m;
    }

    public int hashCode() {
        return l1.d(m.class).hashCode();
    }

    @fg.l
    public String toString() {
        return "DeleteAllCommand()";
    }
}
