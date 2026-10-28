package androidx.compose.foundation.text;

import androidx.compose.ui.text.e;
import kotlin.Metadata;

/* compiled from: InlineTextContent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/e$a;", "", "id", "alternateText", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/e$a;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "INLINE_CONTENT_TAG", "b", "REPLACEMENT_CHAR", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final String f8252a = "androidx.compose.foundation.text.inlineContent";

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final String f8253b = "�";

    public static final void a(@fg.l e.a aVar, @fg.l String str, @fg.l String str2) {
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("alternateText can't be an empty string.");
        }
        aVar.p("androidx.compose.foundation.text.inlineContent", str);
        aVar.l(str2);
        aVar.n();
    }

    public static /* synthetic */ void b(e.a aVar, String str, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = "�";
        }
        a(aVar, str, str2);
    }
}
