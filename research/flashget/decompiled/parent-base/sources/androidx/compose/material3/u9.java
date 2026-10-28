package androidx.compose.material3;

import java.util.Arrays;
import java.util.Locale;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class u9 {
    public static String a(Object[] objArr, int i4, Locale locale, String str, String str2) {
        String format = String.format(locale, str, Arrays.copyOf(objArr, i4));
        kotlin.jvm.internal.l0.o(format, str2);
        return format;
    }
}
