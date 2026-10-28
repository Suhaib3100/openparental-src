package org.minidns.dnssec.algorithms;

import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import org.minidns.dnssec.DnssecValidationFailedException;
import org.minidns.record.s;

/* compiled from: RsaSignatureVerifier.java */
/* loaded from: classes.dex */
class g extends f {
    g(String str) throws NoSuchAlgorithmException {
        super("RSA", str);
    }

    @Override // org.minidns.dnssec.algorithms.f
    protected PublicKey c(org.minidns.record.f fVar) throws DnssecValidationFailedException.DataMalformedException, DnssecValidationFailedException.DnssecInvalidKeySpecException {
        int i4;
        DataInputStream i5 = fVar.i();
        try {
            int readUnsignedByte = i5.readUnsignedByte();
            if (readUnsignedByte == 0) {
                readUnsignedByte = i5.readUnsignedShort();
                i4 = 3;
            } else {
                i4 = 1;
            }
            byte[] bArr = new byte[readUnsignedByte];
            i5.readFully(bArr);
            int i6 = i4 + readUnsignedByte;
            BigInteger bigInteger = new BigInteger(1, bArr);
            byte[] bArr2 = new byte[fVar.l() - i6];
            i5.readFully(bArr2);
            try {
                return b().generatePublic(new RSAPublicKeySpec(new BigInteger(1, bArr2), bigInteger));
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
