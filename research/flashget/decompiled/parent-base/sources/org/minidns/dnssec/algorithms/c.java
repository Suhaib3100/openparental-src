package org.minidns.dnssec.algorithms;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
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

/* compiled from: EcdsaSignatureVerifier.java */
/* loaded from: classes.dex */
abstract class c extends f {

    /* renamed from: c, reason: collision with root package name */
    private final ECParameterSpec f87260c;

    /* renamed from: d, reason: collision with root package name */
    private final int f87261d;

    /* compiled from: EcdsaSignatureVerifier.java */
    public static class a extends c {

        /* renamed from: e, reason: collision with root package name */
        private static BigInteger[] f87262e = {new BigInteger("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF", 16), new BigInteger("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC", 16), new BigInteger("5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B", 16), new BigInteger("6B17D1F2E12C4247F8BCE6E563A440F277037D812DEB33A0F4A13945D898C296", 16), new BigInteger("4FE342E2FE1A7F9B8EE7EB4A7C0F9E162BCE33576B315ECECBB6406837BF51F5", 16), new BigInteger("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551", 16)};

        a() throws NoSuchAlgorithmException {
            super(f87262e, 32, "SHA256withECDSA");
        }
    }

    /* compiled from: EcdsaSignatureVerifier.java */
    public static class b extends c {

        /* renamed from: e, reason: collision with root package name */
        private static BigInteger[] f87263e = {new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF", 16), new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC", 16), new BigInteger("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF", 16), new BigInteger("AA87CA22BE8B05378EB1C71EF320AD746E1D3B628BA79B9859F741E082542A385502F25DBF55296C3A545E3872760AB7", 16), new BigInteger("3617DE4A96262C6F5D9E98BF9292DC29F8F41DBD289A147CE9DA3113B5F0B8C00A60B1CE1D7E819D7A431D7C90EA0E5F", 16), new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973", 16)};

        b() throws NoSuchAlgorithmException {
            super(f87263e, 48, "SHA384withECDSA");
        }
    }

    c(BigInteger[] bigIntegerArr, int i4, String str) throws NoSuchAlgorithmException {
        this(new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigIntegerArr[0]), bigIntegerArr[1], bigIntegerArr[2]), new ECPoint(bigIntegerArr[3], bigIntegerArr[4]), bigIntegerArr[5], 1), i4, str);
    }

    @Override // org.minidns.dnssec.algorithms.f
    protected PublicKey c(org.minidns.record.f fVar) throws DnssecValidationFailedException.DataMalformedException, DnssecValidationFailedException.DnssecInvalidKeySpecException {
        DataInputStream i4 = fVar.i();
        try {
            byte[] bArr = new byte[this.f87261d];
            i4.readFully(bArr);
            BigInteger bigInteger = new BigInteger(1, bArr);
            byte[] bArr2 = new byte[this.f87261d];
            i4.readFully(bArr2);
            try {
                return b().generatePublic(new ECPublicKeySpec(new ECPoint(bigInteger, new BigInteger(1, bArr2)), this.f87260c));
            } catch (InvalidKeySpecException e4) {
                throw new DnssecValidationFailedException.DnssecInvalidKeySpecException(e4);
            }
        } catch (IOException e5) {
            throw new DnssecValidationFailedException.DataMalformedException(e5, fVar.h());
        }
    }

    @Override // org.minidns.dnssec.algorithms.f
    protected byte[] d(s sVar) throws DnssecValidationFailedException.DataMalformedException {
        DataInputStream i4 = sVar.i();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            byte[] bArr = new byte[this.f87261d];
            i4.readFully(bArr);
            int i5 = bArr[0] < 0 ? this.f87261d + 1 : this.f87261d;
            byte[] bArr2 = new byte[this.f87261d];
            i4.readFully(bArr2);
            int i6 = bArr2[0] < 0 ? this.f87261d + 1 : this.f87261d;
            dataOutputStream.writeByte(48);
            dataOutputStream.writeByte(i5 + i6 + 4);
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(i5);
            if (i5 > this.f87261d) {
                dataOutputStream.writeByte(0);
            }
            dataOutputStream.write(bArr);
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(i6);
            if (i6 > this.f87261d) {
                dataOutputStream.writeByte(0);
            }
            dataOutputStream.write(bArr2);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e4) {
            throw new DnssecValidationFailedException.DataMalformedException(e4, sVar.h());
        }
    }

    c(ECParameterSpec eCParameterSpec, int i4, String str) throws NoSuchAlgorithmException {
        super("EC", str);
        this.f87261d = i4;
        this.f87260c = eCParameterSpec;
    }
}
