package org.minidns.dane;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* compiled from: ExpectingTrustManager.java */
/* loaded from: classes4.dex */
public class b implements X509TrustManager {

    /* renamed from: a, reason: collision with root package name */
    private CertificateException f87150a;

    /* renamed from: b, reason: collision with root package name */
    private final X509TrustManager f87151b;

    public b(X509TrustManager x509TrustManager) {
        this.f87151b = x509TrustManager == null ? c.b(null) : x509TrustManager;
    }

    public CertificateException a() {
        CertificateException certificateException = this.f87150a;
        this.f87150a = null;
        return certificateException;
    }

    public boolean b() {
        return this.f87150a != null;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        try {
            this.f87151b.checkClientTrusted(x509CertificateArr, str);
        } catch (CertificateException e4) {
            this.f87150a = e4;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        try {
            this.f87151b.checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e4) {
            this.f87150a = e4;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return this.f87151b.getAcceptedIssuers();
    }
}
