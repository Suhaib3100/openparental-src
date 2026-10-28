package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: AndroidStringDelegate.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/platform/k;", "Landroidx/compose/ui/text/e0;", "<init>", "()V", "", "string", "Lu0/g;", "locale", "c", "(Ljava/lang/String;Lu0/g;)Ljava/lang/String;", "b", "a", "d", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidStringDelegate.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidStringDelegate.android.kt\nandroidx/compose/ui/text/platform/AndroidStringDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
/* loaded from: classes.dex */
public final class k implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f21263a = 0;

    @Override // androidx.compose.ui.text.e0
    @fg.l
    public String a(@fg.l String string, @fg.l u0.g locale) {
        String valueOf;
        if (string.length() <= 0) {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = string.charAt(0);
        if (Character.isLowerCase(charAt)) {
            l0.n(locale, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
            valueOf = kotlin.text.c.v(charAt, ((u0.a) locale).getJavaLocale());
        } else {
            valueOf = String.valueOf(charAt);
        }
        sb.append((Object) valueOf);
        String substring = string.substring(1);
        l0.o(substring, "this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        return sb.toString();
    }

    @Override // androidx.compose.ui.text.e0
    @fg.l
    public String b(@fg.l String string, @fg.l u0.g locale) {
        l0.n(locale, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
        String lowerCase = string.toLowerCase(((u0.a) locale).getJavaLocale());
        l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @Override // androidx.compose.ui.text.e0
    @fg.l
    public String c(@fg.l String string, @fg.l u0.g locale) {
        l0.n(locale, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
        String upperCase = string.toUpperCase(((u0.a) locale).getJavaLocale());
        l0.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @Override // androidx.compose.ui.text.e0
    @fg.l
    public String d(@fg.l String string, @fg.l u0.g locale) {
        if (string.length() <= 0) {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = string.charAt(0);
        l0.n(locale, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
        sb.append((Object) kotlin.text.c.t(charAt, ((u0.a) locale).getJavaLocale()));
        String substring = string.substring(1);
        l0.o(substring, "this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        return sb.toString();
    }
}
