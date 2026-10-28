package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.Spannable;
import android.text.SpannableString;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.ranges.IntRange;

/* compiled from: SpannableString.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b\u001a\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0001H\u0087\b\u001a%\u0010\n\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0086\n\u001a\u001d\u0010\r\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0086\n¨\u0006\u000e"}, d2 = {"", "Landroid/text/Spannable;", "d", "Lkotlin/m2;", "a", "", "start", "end", "", "span", "b", "Lkotlin/ranges/l;", "range", "c", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class y {
    @SuppressLint({"SyntheticAccessor"})
    public static final void a(@d5.d Spannable spannable) {
        l0.p(spannable, "<this>");
        Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
        l0.o(spans, "getSpans(start, end, T::class.java)");
        for (Object obj : spans) {
            spannable.removeSpan(obj);
        }
    }

    public static final void b(@d5.d Spannable spannable, int i5, int i6, @d5.d Object span) {
        l0.p(spannable, "<this>");
        l0.p(span, "span");
        spannable.setSpan(span, i5, i6, 17);
    }

    public static final void c(@d5.d Spannable spannable, @d5.d IntRange range, @d5.d Object span) {
        l0.p(spannable, "<this>");
        l0.p(range, "range");
        l0.p(span, "span");
        spannable.setSpan(span, range.f().intValue(), range.p().intValue(), 17);
    }

    @d5.d
    public static final Spannable d(@d5.d CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        l0.o(valueOf, "valueOf(this)");
        return valueOf;
    }
}
