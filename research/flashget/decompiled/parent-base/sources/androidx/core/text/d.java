package androidx.core.text;

import android.text.Html;
import android.text.Spanned;
import kotlin.Metadata;

/* compiled from: Html.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a6\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a\u001e\u0010\u000b\u001a\u00020\u0000*\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "", "flags", "Landroid/text/Html$ImageGetter;", "imageGetter", "Landroid/text/Html$TagHandler;", "tagHandler", "Landroid/text/Spanned;", "a", "(Ljava/lang/String;ILandroid/text/Html$ImageGetter;Landroid/text/Html$TagHandler;)Landroid/text/Spanned;", "option", "c", "(Landroid/text/Spanned;I)Ljava/lang/String;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {
    @fg.l
    public static final Spanned a(@fg.l String str, int i4, @fg.m Html.ImageGetter imageGetter, @fg.m Html.TagHandler tagHandler) {
        return Html.fromHtml(str, i4, imageGetter, tagHandler);
    }

    public static Spanned b(String str, int i4, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        if ((i5 & 2) != 0) {
            imageGetter = null;
        }
        if ((i5 & 4) != 0) {
            tagHandler = null;
        }
        return Html.fromHtml(str, i4, imageGetter, tagHandler);
    }

    @fg.l
    public static final String c(@fg.l Spanned spanned, int i4) {
        return Html.toHtml(spanned, i4);
    }

    public static String d(Spanned spanned, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        return Html.toHtml(spanned, i4);
    }
}
