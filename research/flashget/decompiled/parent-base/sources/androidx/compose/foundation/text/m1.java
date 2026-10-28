package androidx.compose.foundation.text;

import kotlin.Metadata;

/* compiled from: ValidatingOffsetMapping.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/text/m1;", "Landroidx/compose/ui/text/input/p0;", "delegate", "", "originalLength", "transformedLength", "<init>", "(Landroidx/compose/ui/text/input/p0;II)V", "offset", "b", "(I)I", "a", "Landroidx/compose/ui/text/input/p0;", "c", "I", "d", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class m1 implements androidx.compose.ui.text.input.p0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.input.p0 delegate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int originalLength;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int transformedLength;

    public m1(@fg.l androidx.compose.ui.text.input.p0 p0Var, int i4, int i5) {
        this.delegate = p0Var;
        this.originalLength = i4;
        this.transformedLength = i5;
    }

    @Override // androidx.compose.ui.text.input.p0
    public int a(int offset) {
        int a5 = this.delegate.a(offset);
        if (offset < 0 || offset > this.transformedLength || (a5 >= 0 && a5 <= this.originalLength)) {
            return a5;
        }
        throw new IllegalStateException(androidx.view.e.a(androidx.collection.n1.a("OffsetMapping.transformedToOriginal returned invalid mapping: ", offset, " -> ", a5, " is not in range of original text [0, "), this.originalLength, ']').toString());
    }

    @Override // androidx.compose.ui.text.input.p0
    public int b(int offset) {
        int b5 = this.delegate.b(offset);
        if (offset < 0 || offset > this.originalLength || (b5 >= 0 && b5 <= this.transformedLength)) {
            return b5;
        }
        throw new IllegalStateException(androidx.view.e.a(androidx.collection.n1.a("OffsetMapping.originalToTransformed returned invalid mapping: ", offset, " -> ", b5, " is not in range of transformed text [0, "), this.transformedLength, ']').toString());
    }
}
