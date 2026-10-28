package okhttp3.internal.http;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.m2;

/* compiled from: dates.kt */
@Metadata(d1 = {"\u0000+\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0007\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0001H\u0000\"\u0014\u0010\u0006\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0002\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\b\"\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"", "Ljava/util/Date;", "a", "b", "", "J", "MAX_DATE", "okhttp3/internal/http/c$a", "Lokhttp3/internal/http/c$a;", "STANDARD_DATE_FORMAT", "", "c", "[Ljava/lang/String;", "BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS", "Ljava/text/DateFormat;", "d", "[Ljava/text/DateFormat;", "BROWSER_COMPATIBLE_DATE_FORMATS", "okhttp"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final long f30944a = 253402300799999L;

    /* renamed from: b, reason: collision with root package name */
    private static final a f30945b = new a();

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f30946c;

    /* renamed from: d, reason: collision with root package name */
    private static final DateFormat[] f30947d;

    /* compiled from: dates.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, d2 = {"okhttp3/internal/http/c$a", "Ljava/lang/ThreadLocal;", "Ljava/text/DateFormat;", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a extends ThreadLocal<DateFormat> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ProtectedSandApp.s("拭"), Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(okhttp3.internal.d.f30934f);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {ProtectedSandApp.s("拮"), ProtectedSandApp.s("拯"), ProtectedSandApp.s("拰"), ProtectedSandApp.s("拱"), ProtectedSandApp.s("拲"), ProtectedSandApp.s("拳"), ProtectedSandApp.s("拴"), ProtectedSandApp.s("拵"), ProtectedSandApp.s("拶"), ProtectedSandApp.s("拷"), ProtectedSandApp.s("拸"), ProtectedSandApp.s("拹"), ProtectedSandApp.s("拺"), ProtectedSandApp.s("拻"), ProtectedSandApp.s("拼")};
        f30946c = strArr;
        f30947d = new DateFormat[strArr.length];
    }

    @d5.e
    public static final Date a(@d5.d String str) {
        l0.p(str, ProtectedSandApp.s("拽"));
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = f30945b.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f30946c;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i5 = 0; i5 < length; i5++) {
                DateFormat[] dateFormatArr = f30947d;
                DateFormat dateFormat = dateFormatArr[i5];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f30946c[i5], Locale.US);
                    dateFormat.setTimeZone(okhttp3.internal.d.f30934f);
                    dateFormatArr[i5] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            m2 m2Var = m2.f23662a;
            return null;
        }
    }

    @d5.d
    public static final String b(@d5.d Date date) {
        l0.p(date, ProtectedSandApp.s("拾"));
        String format = f30945b.get().format(date);
        l0.o(format, ProtectedSandApp.s("拿"));
        return format;
    }
}
