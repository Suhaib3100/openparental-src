package okhttp3.internal.http;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: dates.kt */
@Metadata(d1 = {"\u0000+\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\t\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0002\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n\"\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"", "Ljava/util/Date;", "a", "(Ljava/lang/String;)Ljava/util/Date;", "b", "(Ljava/util/Date;)Ljava/lang/String;", "", "J", "MAX_DATE", "okhttp3/internal/http/c$a", "Lokhttp3/internal/http/c$a;", "STANDARD_DATE_FORMAT", "", "c", "[Ljava/lang/String;", "BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS", "Ljava/text/DateFormat;", "d", "[Ljava/text/DateFormat;", "BROWSER_COMPATIBLE_DATE_FORMATS", "okhttp"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final long f84471a = 253402300799999L;

    /* renamed from: b, reason: collision with root package name */
    private static final a f84472b = new a();

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f84473c;

    /* renamed from: d, reason: collision with root package name */
    private static final DateFormat[] f84474d;

    /* compiled from: dates.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"okhttp3/internal/http/c$a", "Ljava/lang/ThreadLocal;", "Ljava/text/DateFormat;", "a", "()Ljava/text/DateFormat;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a extends ThreadLocal<DateFormat> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ProtectedSandApp.s("\u001e"), Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(okhttp3.internal.d.f84461f);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {ProtectedSandApp.s("!"), ProtectedSandApp.s("\""), ProtectedSandApp.s("#"), ProtectedSandApp.s("$"), ProtectedSandApp.s("%"), ProtectedSandApp.s("&"), ProtectedSandApp.s("'"), ProtectedSandApp.s("("), ProtectedSandApp.s(")"), ProtectedSandApp.s("*"), ProtectedSandApp.s("+"), ProtectedSandApp.s(","), ProtectedSandApp.s("-"), ProtectedSandApp.s("\u001f"), ProtectedSandApp.s(" ")};
        f84473c = strArr;
        f84474d = new DateFormat[strArr.length];
    }

    @m
    public static final Date a(@l String str) {
        l0.p(str, ProtectedSandApp.s("."));
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = f84472b.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f84473c;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i4 = 0; i4 < length; i4++) {
                    DateFormat[] dateFormatArr = f84474d;
                    DateFormat dateFormat = dateFormatArr[i4];
                    if (dateFormat == null) {
                        dateFormat = new SimpleDateFormat(f84473c[i4], Locale.US);
                        dateFormat.setTimeZone(okhttp3.internal.d.f84461f);
                        dateFormatArr[i4] = dateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date parse2 = dateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return parse2;
                    }
                }
                k2 k2Var = k2.f75408a;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @l
    public static final String b(@l Date date) {
        l0.p(date, ProtectedSandApp.s("/"));
        String format = f84472b.get().format(date);
        l0.o(format, ProtectedSandApp.s("0"));
        return format;
    }
}
