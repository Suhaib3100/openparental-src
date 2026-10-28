package org.minidns.dnssec.algorithms;

import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import org.minidns.dnssec.DnssecValidationFailedException;
import org.minidns.record.s;

/* compiled from: JavaSecSignatureVerifier.java */
/* loaded from: classes.dex */
public abstract class f implements org.minidns.dnssec.e {

    /* renamed from: a, reason: collision with root package name */
    private final KeyFactory f87267a;

    /* renamed from: b, reason: collision with root package name */
    private final String f87268b;

    public f(String str, String str2) throws NoSuchAlgorithmException {
        this.f87267a = KeyFactory.getInstance(str);
        this.f87268b = str2;
        Signature.getInstance(str2);
    }

    @Override // org.minidns.dnssec.e
    public boolean a(byte[] bArr, s sVar, org.minidns.record.f fVar) throws DnssecValidationFailedException {
        try {
            PublicKey c5 = c(fVar);
            Signature signature = Signature.getInstance(this.f87268b);
            signature.initVerify(c5);
            signature.update(bArr);
            return signature.verify(d(sVar));
        } catch (ArithmeticException e4) {
            e = e4;
            throw new DnssecValidationFailedException("Validating signature failed", e);
        } catch (InvalidKeyException e5) {
            e = e5;
            throw new DnssecValidationFailedException("Validating signature failed", e);
        } catch (NoSuchAlgorithmException e6) {
            throw new AssertionError(e6);
        } catch (SignatureException e7) {
            e = e7;
            throw new DnssecValidationFailedException("Validating signature failed", e);
        }
    }

    public KeyFactory b() {
        return this.f87267a;
    }

    protected abstract PublicKey c(org.minidns.record.f fVar) throws DnssecValidationFailedException.DataMalformedException, DnssecValidationFailedException.DnssecInvalidKeySpecException;

    protected abstract byte[] d(s sVar) throws DnssecValidationFailedException.DataMalformedException;
}
