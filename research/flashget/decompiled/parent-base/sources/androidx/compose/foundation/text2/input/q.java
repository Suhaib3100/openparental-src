package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.z0;
import androidx.compose.ui.text.t0;
import kotlin.Metadata;

/* compiled from: TextFieldCharSequence.kt */
@z0
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\tH¦\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u000f8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000f8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0001\u0001\u0016ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text2/input/q;", "", "other", "", "d", "(Ljava/lang/CharSequence;)Z", "", "toString", "()Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/text/t0;", "b", "()J", "selectionInChars", "c", "()Landroidx/compose/ui/text/t0;", "compositionInChars", "Landroidx/compose/foundation/text2/input/s;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface q extends CharSequence {
    long b();

    @fg.m
    t0 c();

    boolean d(@fg.l CharSequence other);

    boolean equals(@fg.m Object other);

    int hashCode();

    @Override // java.lang.CharSequence
    @fg.l
    String toString();
}
