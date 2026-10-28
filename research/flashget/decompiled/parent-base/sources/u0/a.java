package u0;

import androidx.compose.runtime.internal.u;
import fg.l;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: AndroidLocaleDelegate.android.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u0011\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0012"}, d2 = {"Lu0/a;", "Lu0/g;", "Ljava/util/Locale;", "javaLocale", "<init>", "(Ljava/util/Locale;)V", "", "c", "()Ljava/lang/String;", "a", "Ljava/util/Locale;", "d", "()Ljava/util/Locale;", "language", "b", "script", "getRegion", "region", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: b, reason: collision with root package name */
    public static final int f92720b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final Locale javaLocale;

    public a(@l Locale locale) {
        this.javaLocale = locale;
    }

    @Override // u0.g
    @l
    public String a() {
        return this.javaLocale.getLanguage();
    }

    @Override // u0.g
    @l
    public String b() {
        return this.javaLocale.getScript();
    }

    @Override // u0.g
    @l
    public String c() {
        return this.javaLocale.toLanguageTag();
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Locale getJavaLocale() {
        return this.javaLocale;
    }

    @Override // u0.g
    @l
    public String getRegion() {
        return this.javaLocale.getCountry();
    }
}
