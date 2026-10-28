package u4;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
import kotlin.collections.EmptyList;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.text.e0;
import kotlin.text.h0;
import org.apache.commons.io.k;

/* compiled from: OkHostnameVerifier.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0002J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016¨\u0006\u001b"}, d2 = {"Lu4/d;", "Ljavax/net/ssl/HostnameVerifier;", "", "ipAddress", "Ljava/security/cert/X509Certificate;", "certificate", "", "f", "hostname", "e", "pattern", "d", "", "type", "", "b", "host", "Ljavax/net/ssl/SSLSession;", "session", "verify", "c", "a", "I", "ALT_DNS_NAME", "ALT_IPA_NAME", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class d implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final int ALT_DNS_NAME = 2;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final int ALT_IPA_NAME = 7;

    /* renamed from: c, reason: collision with root package name */
    public static final d f33738c = new d();

    private d() {
    }

    private final List<String> b(X509Certificate certificate, int type) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return EmptyList.f23167o;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && !(!l0.g(list.get(0), Integer.valueOf(type))) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return EmptyList.f23167o;
        }
    }

    private final boolean d(String hostname, String pattern) {
        boolean s22;
        boolean J1;
        boolean s23;
        boolean J12;
        boolean J13;
        boolean J14;
        boolean T2;
        boolean s24;
        int o32;
        boolean J15;
        int C3;
        if (!(hostname == null || hostname.length() == 0)) {
            String s5 = ProtectedSandApp.s("槤");
            s22 = e0.s2(hostname, s5, false, 2, null);
            if (!s22) {
                String s6 = ProtectedSandApp.s("槥");
                J1 = e0.J1(hostname, s6, false, 2, null);
                if (!J1) {
                    if (!(pattern == null || pattern.length() == 0)) {
                        s23 = e0.s2(pattern, s5, false, 2, null);
                        if (!s23) {
                            J12 = e0.J1(pattern, s6, false, 2, null);
                            if (!J12) {
                                J13 = e0.J1(hostname, s5, false, 2, null);
                                if (!J13) {
                                    hostname = androidx.concurrent.futures.b.a(hostname, s5);
                                }
                                String str = hostname;
                                J14 = e0.J1(pattern, s5, false, 2, null);
                                if (!J14) {
                                    pattern = androidx.concurrent.futures.b.a(pattern, s5);
                                }
                                Locale locale = Locale.US;
                                l0.o(locale, ProtectedSandApp.s("槦"));
                                if (pattern == null) {
                                    throw new NullPointerException(ProtectedSandApp.s("槫"));
                                }
                                String lowerCase = pattern.toLowerCase(locale);
                                l0.o(lowerCase, ProtectedSandApp.s("槧"));
                                T2 = h0.T2(lowerCase, ProtectedSandApp.s("槨"), false, 2, null);
                                if (!T2) {
                                    return l0.g(str, lowerCase);
                                }
                                String s7 = ProtectedSandApp.s("槩");
                                s24 = e0.s2(lowerCase, s7, false, 2, null);
                                if (s24) {
                                    o32 = h0.o3(lowerCase, '*', 1, false, 4, null);
                                    if (o32 != -1 || str.length() < lowerCase.length() || l0.g(s7, lowerCase)) {
                                        return false;
                                    }
                                    String substring = lowerCase.substring(1);
                                    l0.o(substring, ProtectedSandApp.s("槪"));
                                    J15 = e0.J1(str, substring, false, 2, null);
                                    if (!J15) {
                                        return false;
                                    }
                                    int length = str.length() - substring.length();
                                    if (length > 0) {
                                        C3 = h0.C3(str, k.f32026a, length - 1, false, 4, null);
                                        if (C3 != -1) {
                                            return false;
                                        }
                                    }
                                    return true;
                                }
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean e(String hostname, X509Certificate certificate) {
        Locale locale = Locale.US;
        l0.o(locale, ProtectedSandApp.s("槬"));
        if (hostname == null) {
            throw new NullPointerException(ProtectedSandApp.s("槮"));
        }
        String lowerCase = hostname.toLowerCase(locale);
        l0.o(lowerCase, ProtectedSandApp.s("槭"));
        List<String> b6 = b(certificate, 2);
        if ((b6 instanceof Collection) && b6.isEmpty()) {
            return false;
        }
        Iterator<T> it = b6.iterator();
        while (it.hasNext()) {
            if (f33738c.d(lowerCase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean f(String ipAddress, X509Certificate certificate) {
        String e6 = okhttp3.internal.a.e(ipAddress);
        List<String> b6 = b(certificate, 7);
        if ((b6 instanceof Collection) && b6.isEmpty()) {
            return false;
        }
        Iterator<T> it = b6.iterator();
        while (it.hasNext()) {
            if (l0.g(e6, okhttp3.internal.a.e((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    @d5.d
    public final List<String> a(@d5.d X509Certificate certificate) {
        List<String> D4;
        l0.p(certificate, ProtectedSandApp.s("槯"));
        D4 = j0.D4(b(certificate, 7), b(certificate, 2));
        return D4;
    }

    public final boolean c(@d5.d String host, @d5.d X509Certificate certificate) {
        l0.p(host, ProtectedSandApp.s("槰"));
        l0.p(certificate, ProtectedSandApp.s("槱"));
        return okhttp3.internal.d.h(host) ? f(host, certificate) : e(host, certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@d5.d String host, @d5.d SSLSession session) {
        l0.p(host, ProtectedSandApp.s("槲"));
        l0.p(session, ProtectedSandApp.s("槳"));
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            if (certificate != null) {
                return c(host, (X509Certificate) certificate);
            }
            throw new NullPointerException(ProtectedSandApp.s("槴"));
        } catch (SSLException unused) {
            return false;
        }
    }
}
