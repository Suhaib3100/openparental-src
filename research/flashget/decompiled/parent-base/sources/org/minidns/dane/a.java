package org.minidns.dane;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.minidns.dane.DaneCertificateException;
import org.minidns.dnssec.d;
import org.minidns.record.h;
import org.minidns.record.u;
import org.minidns.record.x;

/* compiled from: DaneVerifier.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f87145b = Logger.getLogger(a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final org.minidns.dnssec.b f87146a;

    /* compiled from: DaneVerifier.java */
    /* renamed from: org.minidns.dane.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1351a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f87147a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f87148b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f87149c;

        static {
            int[] iArr = new int[x.b.values().length];
            f87149c = iArr;
            try {
                iArr[x.b.noHash.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87149c[x.b.sha256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f87149c[x.b.sha512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[x.c.values().length];
            f87148b = iArr2;
            try {
                iArr2[x.c.fullCertificate.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f87148b[x.c.subjectPublicKeyInfo.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[x.a.values().length];
            f87147a = iArr3;
            try {
                iArr3[x.a.serviceCertificateConstraint.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f87147a[x.a.domainIssuedCertificate.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f87147a[x.a.caConstraint.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f87147a[x.a.trustAnchorAssertion.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public a() {
        this(new org.minidns.dnssec.b());
    }

    private static boolean a(X509Certificate x509Certificate, x xVar, String str) throws CertificateException {
        byte[] encoded;
        x.a aVar = xVar.f87519e;
        if (aVar == null) {
            f87145b.warning("TLSA certificate usage byte " + ((int) xVar.f87518d) + " is not supported while verifying " + str);
            return false;
        }
        int i4 = C1351a.f87147a[aVar.ordinal()];
        if (i4 != 1 && i4 != 2) {
            f87145b.warning("TLSA certificate usage " + xVar.f87519e + " (" + ((int) xVar.f87518d) + ") not supported while verifying " + str);
            return false;
        }
        x.c cVar = xVar.f87521g;
        if (cVar == null) {
            f87145b.warning("TLSA selector byte " + ((int) xVar.f87520f) + " is not supported while verifying " + str);
            return false;
        }
        int i5 = C1351a.f87148b[cVar.ordinal()];
        if (i5 == 1) {
            encoded = x509Certificate.getEncoded();
        } else {
            if (i5 != 2) {
                f87145b.warning("TLSA selector " + xVar.f87521g + " (" + ((int) xVar.f87520f) + ") not supported while verifying " + str);
                return false;
            }
            encoded = x509Certificate.getPublicKey().getEncoded();
        }
        x.b bVar = xVar.f87523i;
        if (bVar == null) {
            f87145b.warning("TLSA matching type byte " + ((int) xVar.f87522h) + " is not supported while verifying " + str);
            return false;
        }
        int i6 = C1351a.f87149c[bVar.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                try {
                    encoded = MessageDigest.getInstance("SHA-256").digest(encoded);
                } catch (NoSuchAlgorithmException e4) {
                    throw new CertificateException("Verification using TLSA failed: could not SHA-256 for matching", e4);
                }
            } else {
                if (i6 != 3) {
                    f87145b.warning("TLSA matching type " + xVar.f87523i + " not supported while verifying " + str);
                    return false;
                }
                try {
                    encoded = MessageDigest.getInstance("SHA-512").digest(encoded);
                } catch (NoSuchAlgorithmException e5) {
                    throw new CertificateException("Verification using TLSA failed: could not SHA-512 for matching", e5);
                }
            }
        }
        if (xVar.k(encoded)) {
            return xVar.f87519e == x.a.domainIssuedCertificate;
        }
        throw new DaneCertificateException.CertificateMismatch(xVar, encoded);
    }

    private static X509Certificate[] b(Certificate[] certificateArr) {
        ArrayList arrayList = new ArrayList();
        for (Certificate certificate : certificateArr) {
            if (certificate instanceof X509Certificate) {
                arrayList.add((X509Certificate) certificate);
            }
        }
        return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
    }

    public HttpsURLConnection c(HttpsURLConnection httpsURLConnection) throws IOException, CertificateException {
        return d(httpsURLConnection, null);
    }

    public HttpsURLConnection d(HttpsURLConnection httpsURLConnection, X509TrustManager x509TrustManager) throws IOException, CertificateException {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            b bVar = new b(x509TrustManager);
            sSLContext.init(null, new TrustManager[]{bVar}, null);
            httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            httpsURLConnection.connect();
            if (!g(b(httpsURLConnection.getServerCertificates()), httpsURLConnection.getURL().getHost(), httpsURLConnection.getURL().getPort() < 0 ? httpsURLConnection.getURL().getDefaultPort() : httpsURLConnection.getURL().getPort()) && bVar.b()) {
                throw new IOException("Peer verification failed using PKIX", bVar.a());
            }
            return httpsURLConnection;
        } catch (KeyManagementException e4) {
            e = e4;
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e5) {
            e = e5;
            throw new RuntimeException(e);
        }
    }

    public boolean e(SSLSession sSLSession) throws CertificateException {
        try {
            return g(b(sSLSession.getPeerCertificates()), sSLSession.getPeerHost(), sSLSession.getPeerPort());
        } catch (SSLPeerUnverifiedException e4) {
            throw new CertificateException("Peer not verified", e4);
        }
    }

    public boolean f(SSLSocket sSLSocket) throws CertificateException {
        if (sSLSocket.isConnected()) {
            return e(sSLSocket.getSession());
        }
        throw new IllegalStateException("Socket not yet connected.");
    }

    public boolean g(X509Certificate[] x509CertificateArr, String str, int i4) throws CertificateException {
        org.minidns.dnsname.a h4 = org.minidns.dnsname.a.h("_" + i4 + "._tcp." + str);
        try {
            org.minidns.dnssec.c T = this.f87146a.T(h4, u.c.TLSA);
            org.minidns.dnsmessage.a aVar = T.f87279b.f87242c;
            if (!T.c()) {
                Iterator<d> it = T.b().iterator();
                String str2 = "Got TLSA response from DNS server, but was not signed properly. Reasons:";
                while (it.hasNext()) {
                    str2 = str2 + " " + it.next();
                }
                f87145b.info(str2);
                return false;
            }
            LinkedList linkedList = new LinkedList();
            boolean z4 = false;
            for (u<? extends h> uVar : aVar.f87177l) {
                if (uVar.f87494b == u.c.TLSA && uVar.f87493a.equals(h4)) {
                    try {
                        z4 |= a(x509CertificateArr[0], (x) uVar.f87498f, str);
                    } catch (DaneCertificateException.CertificateMismatch e4) {
                        linkedList.add(e4);
                    }
                    if (z4) {
                        break;
                    }
                }
            }
            if (z4 || linkedList.isEmpty()) {
                return z4;
            }
            throw new DaneCertificateException.MultipleCertificateMismatchExceptions(linkedList);
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }

    public a(org.minidns.dnssec.b bVar) {
        this.f87146a = bVar;
    }
}
