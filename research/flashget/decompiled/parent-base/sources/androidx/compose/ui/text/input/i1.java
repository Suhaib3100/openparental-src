package androidx.compose.ui.text.input;

import kotlin.Metadata;

/* compiled from: VisualTransformation.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/input/i1;", "", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/input/p0;", "offsetMapping", "<init>", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/input/p0;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/text/e;", "b", "()Landroidx/compose/ui/text/e;", "Landroidx/compose/ui/text/input/p0;", "()Landroidx/compose/ui/text/input/p0;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f21042c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.e text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final p0 offsetMapping;

    public i1(@fg.l androidx.compose.ui.text.e eVar, @fg.l p0 p0Var) {
        this.text = eVar;
        this.offsetMapping = p0Var;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final p0 getOffsetMapping() {
        return this.offsetMapping;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final androidx.compose.ui.text.e getText() {
        return this.text;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) other;
        return kotlin.jvm.internal.l0.g(this.text, i1Var.text) && kotlin.jvm.internal.l0.g(this.offsetMapping, i1Var.offsetMapping);
    }

    public int hashCode() {
        return this.offsetMapping.hashCode() + (this.text.hashCode() * 31);
    }

    @fg.l
    public String toString() {
        return "TransformedText(text=" + ((Object) this.text) + ", offsetMapping=" + this.offsetMapping + ')';
    }
}
