package androidx.core.text;

import android.text.Spanned;
import android.text.SpannedString;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: SpannedString.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b\u001a<\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0003*\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "Landroid/text/Spanned;", "c", "", "T", "", "start", "end", "", "a", "(Landroid/text/Spanned;II)[Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class z {
    public static final <T> T[] a(Spanned spanned, int i5, int i6) {
        l0.p(spanned, "<this>");
        l0.P();
        T[] tArr = (T[]) spanned.getSpans(i5, i6, Object.class);
        l0.o(tArr, "getSpans(start, end, T::class.java)");
        return tArr;
    }

    public static Object[] b(Spanned spanned, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = spanned.length();
        }
        l0.p(spanned, "<this>");
        l0.P();
        Object[] spans = spanned.getSpans(i5, i6, Object.class);
        l0.o(spans, "getSpans(start, end, T::class.java)");
        return spans;
    }

    @d5.d
    public static final Spanned c(@d5.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        SpannedString valueOf = SpannedString.valueOf(charSequence);
        l0.o(valueOf, "valueOf(this)");
        return valueOf;
    }
}
