package org.minidns.dnssec;

import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import org.minidns.record.h;
import org.minidns.record.u;

/* loaded from: classes5.dex */
public class DnssecValidationFailedException extends IOException {

    /* renamed from: b, reason: collision with root package name */
    private static final long f87247b = 5413184667629832742L;

    public static class AuthorityDoesNotContainSoa extends DnssecValidationFailedException {

        /* renamed from: d, reason: collision with root package name */
        private static final long f87248d = 1;

        /* renamed from: c, reason: collision with root package name */
        private final org.minidns.dnsmessage.a f87249c;

        public AuthorityDoesNotContainSoa(org.minidns.dnsmessage.a aVar) {
            super("Autority does not contain SOA");
            this.f87249c = aVar;
        }

        public org.minidns.dnsmessage.a a() {
            return this.f87249c;
        }
    }

    public static class DnssecInvalidKeySpecException extends DnssecValidationFailedException {

        /* renamed from: c, reason: collision with root package name */
        private static final long f87252c = 1;

        public DnssecInvalidKeySpecException(String str, InvalidKeySpecException invalidKeySpecException, byte[] bArr) {
            super(str, invalidKeySpecException);
        }

        public DnssecInvalidKeySpecException(InvalidKeySpecException invalidKeySpecException) {
            super("Invalid key spec", invalidKeySpecException);
        }
    }

    public DnssecValidationFailedException(org.minidns.dnsmessage.b bVar, String str) {
        super("Validation of request to " + bVar + " failed: " + str);
    }

    public static class DataMalformedException extends DnssecValidationFailedException {

        /* renamed from: d, reason: collision with root package name */
        private static final long f87250d = 1;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f87251c;

        public DataMalformedException(IOException iOException, byte[] bArr) {
            super("Malformed data", iOException);
            this.f87251c = bArr;
        }

        public byte[] a() {
            return this.f87251c;
        }

        public DataMalformedException(String str, IOException iOException, byte[] bArr) {
            super(str, iOException);
            this.f87251c = bArr;
        }
    }

    public DnssecValidationFailedException(String str) {
        super(str);
    }

    public DnssecValidationFailedException(String str, Throwable th) {
        super(str, th);
    }

    public DnssecValidationFailedException(u<? extends h> uVar, String str) {
        super("Validation of record " + uVar + " failed: " + str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DnssecValidationFailedException(java.util.List<org.minidns.record.u<? extends org.minidns.record.h>> r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Validation of "
            r0.<init>(r1)
            int r1 = r3.size()
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            r1 = 0
            java.lang.Object r1 = r3.get(r1)
            org.minidns.record.u r1 = (org.minidns.record.u) r1
            org.minidns.record.u$c r1 = r1.f87494b
            r0.append(r1)
            java.lang.String r1 = " record"
            r0.append(r1)
            int r3 = r3.size()
            r1 = 1
            if (r3 <= r1) goto L2e
            java.lang.String r3 = "s"
            goto L30
        L2e:
            java.lang.String r3 = ""
        L30:
            java.lang.String r1 = " failed: "
            java.lang.String r3 = androidx.fragment.app.k0.a(r0, r3, r1, r4)
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.minidns.dnssec.DnssecValidationFailedException.<init>(java.util.List, java.lang.String):void");
    }
}
