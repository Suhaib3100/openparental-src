package org.minidns.dnssec.algorithms;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import org.minidns.dnssec.DnssecValidationFailedException;
import org.minidns.record.s;

/* compiled from: DsaSignatureVerifier.java */
/* loaded from: classes.dex */
class b extends f {

    /* renamed from: c, reason: collision with root package name */
    private static final int f87259c = 20;

    b(String str) throws NoSuchAlgorithmException {
        super("DSA", str);
    }

    @Override // org.minidns.dnssec.algorithms.f
    protected PublicKey c(org.minidns.record.f fVar) throws DnssecValidationFailedException.DataMalformedException, DnssecValidationFailedException.DnssecInvalidKeySpecException {
        DataInputStream i4 = fVar.i();
        try {
            int readUnsignedByte = i4.readUnsignedByte();
            byte[] bArr = new byte[20];
            i4.readFully(bArr);
            BigInteger bigInteger = new BigInteger(1, bArr);
            int i5 = (readUnsignedByte * 8) + 64;
            byte[] bArr2 = new byte[i5];
            i4.readFully(bArr2);
            BigInteger bigInteger2 = new BigInteger(1, bArr2);
            byte[] bArr3 = new byte[i5];
            i4.readFully(bArr3);
            BigInteger bigInteger3 = new BigInteger(1, bArr3);
            byte[] bArr4 = new byte[i5];
            i4.readFully(bArr4);
            try {
                return b().generatePublic(new DSAPublicKeySpec(new BigInteger(1, bArr4), bigInteger2, bigInteger, bigInteger3));
            } catch (InvalidKeySpecException e4) {
                throw new DnssecValidationFailedException.DnssecInvalidKeySpecException(e4);
            }
        } catch (IOException e5) {
            throw new DnssecValidationFailedException.DataMalformedException(e5, fVar.h());
        }
    }

    @Override // org.minidns.dnssec.algorithms.f
    protected byte[] d(s sVar) throws DnssecValidationFailedException.DataMalformedException {
        int i4;
        int i5;
        int i6;
        int i7;
        DataInputStream i10 = sVar.i();
        try {
            i10.readByte();
            byte[] bArr = new byte[20];
            i10.readFully(bArr);
            byte b5 = bArr[0];
            if (b5 == 0) {
                i5 = 0;
                while (i5 < 20 && bArr[i5] == 0) {
                    i5++;
                }
                i4 = 20 - i5;
            } else if (b5 < 0) {
                i5 = 0;
                i4 = 21;
            } else {
                i4 = 20;
                i5 = 0;
            }
            byte[] bArr2 = new byte[20];
            i10.readFully(bArr2);
            byte b6 = bArr2[0];
            if (b6 == 0) {
                i7 = 0;
                while (i7 < 20 && bArr2[i7] == 0) {
                    i7++;
                }
                i6 = 20 - i7;
            } else {
                i6 = b6 >= 0 ? 20 : 21;
                i7 = 0;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(48);
            dataOutputStream.writeByte(i4 + i6 + 4);
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(i4);
            if (i4 > 20) {
                dataOutputStream.writeByte(0);
            }
            dataOutputStream.write(bArr, i5, 20 - i5);
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(i6);
            if (i6 > 20) {
                dataOutputStream.writeByte(0);
            }
            dataOutputStream.write(bArr2, i7, 20 - i7);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e4) {
            throw new DnssecValidationFailedException.DataMalformedException(e4, sVar.h());
        }
    }
}
