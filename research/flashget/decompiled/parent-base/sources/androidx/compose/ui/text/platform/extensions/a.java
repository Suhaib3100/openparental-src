package androidx.compose.ui.text.platform.extensions;

import fg.l;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import u0.g;

/* compiled from: LocaleExtensions.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu0/e;", "Ljava/util/Locale;", "a", "(Lu0/e;)Ljava/util/Locale;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {
    @l
    public static final Locale a(@l u0.e eVar) {
        g platformLocale = eVar.getPlatformLocale();
        l0.n(platformLocale, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
        return ((u0.a) platformLocale).getJavaLocale();
    }
}
