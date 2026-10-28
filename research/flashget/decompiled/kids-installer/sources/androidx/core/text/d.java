package androidx.core.text;

import android.text.Html;
import android.text.Spanned;
import androidx.core.text.c;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Html.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0086\b\u001a\u0017\u0010\n\u001a\u00020\u0000*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0086\b¨\u0006\u000b"}, d2 = {"", "", "flags", "Landroid/text/Html$ImageGetter;", "imageGetter", "Landroid/text/Html$TagHandler;", "tagHandler", "Landroid/text/Spanned;", "a", "option", "c", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class d {
    @d5.d
    public static final Spanned a(@d5.d String str, int i5, @d5.e Html.ImageGetter imageGetter, @d5.e Html.TagHandler tagHandler) {
        l0.p(str, "<this>");
        Spanned b6 = c.a.b(str, i5, imageGetter, tagHandler);
        l0.o(b6, "fromHtml(this, flags, imageGetter, tagHandler)");
        return b6;
    }

    public static Spanned b(String str, int i5, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 0;
        }
        if ((i6 & 2) != 0) {
            imageGetter = null;
        }
        if ((i6 & 4) != 0) {
            tagHandler = null;
        }
        l0.p(str, "<this>");
        Spanned b6 = c.a.b(str, i5, imageGetter, tagHandler);
        l0.o(b6, "fromHtml(this, flags, imageGetter, tagHandler)");
        return b6;
    }

    @d5.d
    public static final String c(@d5.d Spanned spanned, int i5) {
        l0.p(spanned, "<this>");
        String c6 = c.a.c(spanned, i5);
        l0.o(c6, "toHtml(this, option)");
        return c6;
    }

    public static String d(Spanned spanned, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 0;
        }
        l0.p(spanned, "<this>");
        String c6 = c.a.c(spanned, i5);
        l0.o(c6, "toHtml(this, option)");
        return c6;
    }
}
