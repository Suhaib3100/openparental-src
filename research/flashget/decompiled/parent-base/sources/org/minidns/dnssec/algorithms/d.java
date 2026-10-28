package org.minidns.dnssec.algorithms;

import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.InvalidKeySpecException;
import org.minidns.dnssec.DnssecValidationFailedException;
import org.minidns.record.s;

/* compiled from: EcgostSignatureVerifier.java */
/* loaded from: classes.dex */
class d extends f {

    /* renamed from: c, reason: collision with root package name */
    private static final int f87264c = 32;

    /* renamed from: d, reason: collision with root package name */
    private static final ECParameterSpec f87265d = new ECParameterSpec(new EllipticCurve(new ECFieldFp(new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD97", 16)), new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD94", 16), new BigInteger("A6", 16)), new ECPoint(BigInteger.ONE, new BigInteger("8D91E471E0989CDA27DF505A453F2B7635294F2DDF23E3B122ACC99C9E9F1E14", 16)), new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF6C611070995AD10045841B09B761B893", 16), 1);

    d() throws NoSuchAlgorithmException {
        super("ECGOST3410", "GOST3411withECGOST3410");
    }

    private static void e(byte[] bArr) {
        for (int i4 = 0; i4 < bArr.length / 2; i4++) {
            int length = (bArr.length - i4) - 1;
            byte b5 = bArr[i4];
            bArr[i4] = bArr[length];
            bArr[length] = b5;
        }
    }

    @Override // org.minidns.dnssec.algorithms.f
    protected PublicKey c(org.minidns.record.f fVar) throws DnssecValidationFailedException.DataMalformedException, DnssecValidationFailedException.DnssecInvalidKeySpecException {
        DataInputStream i4 = fVar.i();
        try {
            byte[] bArr = new byte[32];
            i4.readFully(bArr);
            e(bArr);
            BigInteger bigInteger = new BigInteger(1, bArr);
            byte[] bArr2 = new byte[32];
            i4.readFully(bArr2);
            e(bArr2);
            try {
                return b().generatePublic(new ECPublicKeySpec(new ECPoint(bigInteger, new BigInteger(1, bArr2)), f87265d));
            } catch (InvalidKeySpecException e4) {
                throw new DnssecValidationFailedException.DnssecInvalidKeySpecException(e4);
            }
        } catch (IOException e5) {
            throw new DnssecValidationFailedException.DataMalformedException(e5, fVar.h());
        }
    }

    @Override // org.minidns.dnssec.algorithms.f
    protected byte[] d(s sVar) {
        return sVar.h();
    }
}
