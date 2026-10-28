package androidx.compose.foundation.text2.input;

import androidx.compose.ui.text.t0;
import androidx.compose.ui.text.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: TextFieldCharSequence.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010+\u001a\u00020\u00048\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010*R\"\u0010.\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010,\u001a\u0004\b(\u0010-R\u0014\u00100\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Landroidx/compose/foundation/text2/input/s;", "Landroidx/compose/foundation/text2/input/q;", "", "text", "Landroidx/compose/ui/text/t0;", "selection", "composition", "<init>", "(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/t0;Lkotlin/jvm/internal/w;)V", "", "index", "", "a", "(I)C", "startIndex", "endIndex", "subSequence", "(II)Ljava/lang/CharSequence;", "", "toString", "()Ljava/lang/String;", "other", "", "d", "(Ljava/lang/CharSequence;)Z", "", "destination", "destinationOffset", "sourceStartIndex", "sourceEndIndex", "Lkotlin/k2;", "f", "([CIII)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "Ljava/lang/CharSequence;", "c", "J", "()J", "selectionInChars", "Landroidx/compose/ui/text/t0;", "()Landroidx/compose/ui/text/t0;", "compositionInChars", "e", "length", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class s implements q {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final CharSequence text;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long selectionInChars;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final t0 compositionInChars;

    public /* synthetic */ s(CharSequence charSequence, long j4, t0 t0Var, kotlin.jvm.internal.w wVar) {
        this(charSequence, j4, t0Var);
    }

    public char a(int index) {
        return this.text.charAt(index);
    }

    @Override // androidx.compose.foundation.text2.input.q
    /* renamed from: b, reason: from getter */
    public long getSelectionInChars() {
        return this.selectionInChars;
    }

    @Override // androidx.compose.foundation.text2.input.q
    @fg.m
    /* renamed from: c, reason: from getter */
    public t0 getCompositionInChars() {
        return this.compositionInChars;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i4) {
        return this.text.charAt(i4);
    }

    @Override // androidx.compose.foundation.text2.input.q
    public boolean d(@fg.l CharSequence other) {
        return kotlin.text.v.w1(this.text, other);
    }

    public int e() {
        return this.text.length();
    }

    @Override // androidx.compose.foundation.text2.input.q
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || s.class != other.getClass()) {
            return false;
        }
        s sVar = (s) other;
        if (t0.g(this.selectionInChars, sVar.selectionInChars) && l0.g(this.compositionInChars, sVar.compositionInChars)) {
            return kotlin.text.v.w1(this.text, sVar.text);
        }
        return false;
    }

    public final void f(@fg.l char[] destination, int destinationOffset, int sourceStartIndex, int sourceEndIndex) {
        androidx.compose.foundation.text2.input.internal.l0.a(this.text, destination, destinationOffset, sourceStartIndex, sourceEndIndex);
    }

    @Override // androidx.compose.foundation.text2.input.q
    public int hashCode() {
        int o4 = (t0.o(this.selectionInChars) + (this.text.hashCode() * 31)) * 31;
        t0 t0Var = this.compositionInChars;
        return o4 + (t0Var != null ? Long.hashCode(t0Var.getPackedValue()) : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.text.length();
    }

    @Override // java.lang.CharSequence
    @fg.l
    public CharSequence subSequence(int startIndex, int endIndex) {
        return this.text.subSequence(startIndex, endIndex);
    }

    @Override // androidx.compose.foundation.text2.input.q, java.lang.CharSequence
    @fg.l
    public String toString() {
        return this.text.toString();
    }

    private s(CharSequence charSequence, long j4, t0 t0Var) {
        this.text = charSequence;
        this.selectionInChars = u0.c(j4, 0, charSequence.length());
        this.compositionInChars = t0Var != null ? t0.b(u0.c(t0Var.getPackedValue(), 0, charSequence.length())) : null;
    }
}
