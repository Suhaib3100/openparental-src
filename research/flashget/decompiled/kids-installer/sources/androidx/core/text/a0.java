package androidx.core.text;

import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: String.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0086\b¨\u0006\u0002"}, d2 = {"", "a", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class a0 {
    @d5.d
    public static final String a(@d5.d String str) {
        l0.p(str, "<this>");
        String htmlEncode = TextUtils.htmlEncode(str);
        l0.o(htmlEncode, "htmlEncode(this)");
        return htmlEncode;
    }
}
