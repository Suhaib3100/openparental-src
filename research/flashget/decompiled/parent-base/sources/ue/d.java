package ue;

import androidx.compose.runtime.changelist.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.text.v;

/* compiled from: OkHostnameVerifier.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ#\u0010\u000e\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\nJ\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u001d¨\u0006 "}, d2 = {"Lue/d;", "Ljavax/net/ssl/HostnameVerifier;", "<init>", "()V", "", "ipAddress", "Ljava/security/cert/X509Certificate;", "certificate", "", "f", "(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z", "hostname", "e", "pattern", "d", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "type", "", "b", "(Ljava/security/cert/X509Certificate;I)Ljava/util/List;", "host", "Ljavax/net/ssl/SSLSession;", "session", "verify", "(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", "c", "a", "(Ljava/security/cert/X509Certificate;)Ljava/util/List;", "I", "ALT_DNS_NAME", "ALT_IPA_NAME", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class d implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final int ALT_DNS_NAME = 2;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final int ALT_IPA_NAME = 7;

    /* renamed from: c, reason: collision with root package name */
    public static final d f92771c = new d();

    private d() {
    }

    private final List<String> b(X509Certificate certificate, int type) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return j0.f74919b;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && l0.g(list.get(0), Integer.valueOf(type)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return j0.f74919b;
        }
    }

    private final boolean d(String hostname, String pattern) {
        if (hostname != null && hostname.length() != 0) {
            String s4 = ProtectedSandApp.s("₂");
            if (!v.s2(hostname, s4, false, 2, null)) {
                String s5 = ProtectedSandApp.s("₃");
                if (!v.J1(hostname, s5, false, 2, null) && pattern != null && pattern.length() != 0 && !v.s2(pattern, s4, false, 2, null) && !v.J1(pattern, s5, false, 2, null)) {
                    if (!v.J1(hostname, s4, false, 2, null)) {
                        hostname = j.a(hostname, s4);
                    }
                    String str = hostname;
                    if (!v.J1(pattern, s4, false, 2, null)) {
                        pattern = j.a(pattern, s4);
                    }
                    Locale locale = Locale.US;
                    l0.o(locale, ProtectedSandApp.s("₄"));
                    if (pattern == null) {
                        throw new NullPointerException(ProtectedSandApp.s("₉"));
                    }
                    String lowerCase = pattern.toLowerCase(locale);
                    l0.o(lowerCase, ProtectedSandApp.s("₅"));
                    if (!v.T2(lowerCase, ProtectedSandApp.s("₆"), false, 2, null)) {
                        return l0.g(str, lowerCase);
                    }
                    String s6 = ProtectedSandApp.s("₇");
                    if (!v.s2(lowerCase, s6, false, 2, null) || v.o3(lowerCase, '*', 1, false, 4, null) != -1 || str.length() < lowerCase.length() || l0.g(s6, lowerCase)) {
                        return false;
                    }
                    String substring = lowerCase.substring(1);
                    l0.o(substring, ProtectedSandApp.s("₈"));
                    if (!v.J1(str, substring, false, 2, null)) {
                        return false;
                    }
                    int length = str.length() - substring.length();
                    return length <= 0 || v.C3(str, '.', length + (-1), false, 4, null) == -1;
                }
            }
        }
        return false;
    }

    private final boolean e(String hostname, X509Certificate certificate) {
        Locale locale = Locale.US;
        l0.o(locale, ProtectedSandApp.s("₄"));
        if (hostname == null) {
            throw new NullPointerException(ProtectedSandApp.s("₉"));
        }
        String lowerCase = hostname.toLowerCase(locale);
        l0.o(lowerCase, ProtectedSandApp.s("₅"));
        List<String> b5 = b(certificate, 2);
        if ((b5 instanceof Collection) && b5.isEmpty()) {
            return false;
        }
        Iterator<T> it = b5.iterator();
        while (it.hasNext()) {
            if (f92771c.d(lowerCase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean f(String ipAddress, X509Certificate certificate) {
        String e4 = okhttp3.internal.a.e(ipAddress);
        List<String> b5 = b(certificate, 7);
        if ((b5 instanceof Collection) && b5.isEmpty()) {
            return false;
        }
        Iterator<T> it = b5.iterator();
        while (it.hasNext()) {
            if (l0.g(e4, okhttp3.internal.a.e((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    @l
    public final List<String> a(@l X509Certificate certificate) {
        l0.p(certificate, ProtectedSandApp.s("₊"));
        return w.D4(b(certificate, 7), b(certificate, 2));
    }

    public final boolean c(@l String host, @l X509Certificate certificate) {
        l0.p(host, ProtectedSandApp.s("₋"));
        l0.p(certificate, ProtectedSandApp.s("₊"));
        return okhttp3.internal.d.h(host) ? f(host, certificate) : e(host, certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@l String host, @l SSLSession session) {
        l0.p(host, ProtectedSandApp.s("₋"));
        l0.p(session, ProtectedSandApp.s("₌"));
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            if (certificate != null) {
                return c(host, (X509Certificate) certificate);
            }
            throw new NullPointerException(ProtectedSandApp.s("₍"));
        } catch (SSLException unused) {
            return false;
        }
    }
}
