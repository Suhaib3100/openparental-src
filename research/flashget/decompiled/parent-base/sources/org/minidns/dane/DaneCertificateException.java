package org.minidns.dane;

import java.security.cert.CertificateException;
import java.util.Collections;
import java.util.List;
import org.minidns.record.x;

/* loaded from: classes4.dex */
public abstract class DaneCertificateException extends CertificateException {

    /* renamed from: b, reason: collision with root package name */
    private static final long f87138b = 1;

    public static class CertificateMismatch extends DaneCertificateException {

        /* renamed from: e, reason: collision with root package name */
        private static final long f87139e = 1;

        /* renamed from: c, reason: collision with root package name */
        public final x f87140c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f87141d;

        public CertificateMismatch(x xVar, byte[] bArr) {
            super("The TLSA RR does not match the certificate");
            this.f87140c = xVar;
            this.f87141d = bArr;
        }
    }

    public static class MultipleCertificateMismatchExceptions extends DaneCertificateException {

        /* renamed from: d, reason: collision with root package name */
        private static final long f87142d = 1;

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ boolean f87143e = false;

        /* renamed from: c, reason: collision with root package name */
        public final List<CertificateMismatch> f87144c;

        public MultipleCertificateMismatchExceptions(List<CertificateMismatch> list) {
            super("There where multiple CertificateMismatch exceptions because none of the TLSA RR does match the certificate");
            this.f87144c = Collections.unmodifiableList(list);
        }
    }

    protected DaneCertificateException() {
    }

    protected DaneCertificateException(String str) {
        super(str);
    }
}
