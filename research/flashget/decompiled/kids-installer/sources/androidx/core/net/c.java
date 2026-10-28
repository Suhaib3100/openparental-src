package androidx.core.net;

import android.net.Uri;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.text.Typography;

/* compiled from: MailTo.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final String f4958b = "mailto:";

    /* renamed from: c, reason: collision with root package name */
    private static final String f4959c = "mailto";

    /* renamed from: d, reason: collision with root package name */
    private static final String f4960d = "to";

    /* renamed from: e, reason: collision with root package name */
    private static final String f4961e = "body";

    /* renamed from: f, reason: collision with root package name */
    private static final String f4962f = "cc";

    /* renamed from: g, reason: collision with root package name */
    private static final String f4963g = "bcc";

    /* renamed from: h, reason: collision with root package name */
    private static final String f4964h = "subject";

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, String> f4965a = new HashMap<>();

    private c() {
    }

    public static boolean g(@q0 Uri uri) {
        return uri != null && "mailto".equals(uri.getScheme());
    }

    public static boolean h(@q0 String str) {
        return str != null && str.startsWith("mailto:");
    }

    @o0
    public static c i(@o0 Uri uri) throws ParseException {
        return j(uri.toString());
    }

    @o0
    public static c j(@o0 String str) throws ParseException {
        String decode;
        String substring;
        str.getClass();
        if (!h(str)) {
            throw new ParseException("Not a mailto scheme");
        }
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1) {
            decode = Uri.decode(str.substring(7));
            substring = null;
        } else {
            decode = Uri.decode(str.substring(7, indexOf2));
            substring = str.substring(indexOf2 + 1);
        }
        c cVar = new c();
        if (substring != null) {
            for (String str2 : substring.split("&")) {
                String[] split = str2.split("=", 2);
                if (split.length != 0) {
                    cVar.f4965a.put(Uri.decode(split[0]).toLowerCase(Locale.ROOT), split.length > 1 ? Uri.decode(split[1]) : null);
                }
            }
        }
        String f6 = cVar.f();
        if (f6 != null) {
            decode = decode + ", " + f6;
        }
        cVar.f4965a.put("to", decode);
        return cVar;
    }

    @q0
    public String a() {
        return this.f4965a.get("bcc");
    }

    @q0
    public String b() {
        return this.f4965a.get("body");
    }

    @q0
    public String c() {
        return this.f4965a.get("cc");
    }

    @q0
    public Map<String, String> d() {
        return this.f4965a;
    }

    @q0
    public String e() {
        return this.f4965a.get("subject");
    }

    @q0
    public String f() {
        return this.f4965a.get("to");
    }

    @o0
    public String toString() {
        StringBuilder sb = new StringBuilder("mailto:?");
        for (Map.Entry<String, String> entry : this.f4965a.entrySet()) {
            sb.append(Uri.encode(entry.getKey()));
            sb.append('=');
            sb.append(Uri.encode(entry.getValue()));
            sb.append(Typography.f27128d);
        }
        return sb.toString();
    }
}
