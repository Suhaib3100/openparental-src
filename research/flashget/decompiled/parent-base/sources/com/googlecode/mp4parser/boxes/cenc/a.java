package com.googlecode.mp4parser.boxes.cenc;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.authoring.f;
import com.googlecode.mp4parser.authoring.g;
import com.googlecode.mp4parser.util.c;
import com.googlecode.mp4parser.util.n;
import com.mp4parser.iso23001.part7.a;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractList;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* compiled from: CencDecryptingSampleList.java */
/* loaded from: classes6.dex */
public class a extends AbstractList<f> {

    /* renamed from: b, reason: collision with root package name */
    List<com.mp4parser.iso23001.part7.a> f63880b;

    /* renamed from: c, reason: collision with root package name */
    n<Integer, SecretKey> f63881c;

    /* renamed from: d, reason: collision with root package name */
    List<f> f63882d;

    /* renamed from: e, reason: collision with root package name */
    String f63883e;

    public a(SecretKey secretKey, List<f> list, List<com.mp4parser.iso23001.part7.a> list2) {
        this(new n(0, secretKey), list, list2, ProtectedSandApp.s("ሕ\u0001"));
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get(int i4) {
        if (this.f63881c.get(Integer.valueOf(i4)) == null) {
            return this.f63882d.get(i4);
        }
        f fVar = this.f63882d.get(i4);
        ByteBuffer a5 = fVar.a();
        a5.rewind();
        ByteBuffer allocate = ByteBuffer.allocate(a5.limit());
        com.mp4parser.iso23001.part7.a aVar = this.f63880b.get(i4);
        Cipher c5 = c(this.f63881c.get(Integer.valueOf(i4)), aVar.f70084a);
        try {
            a.k[] kVarArr = aVar.f70085b;
            if (kVarArr == null || kVarArr.length <= 0) {
                int limit = a5.limit();
                byte[] bArr = new byte[limit];
                a5.get(bArr);
                if (ProtectedSandApp.s("ሗ\u0001").equals(this.f63883e)) {
                    int i5 = (limit / 16) * 16;
                    allocate.put(c5.doFinal(bArr, 0, i5));
                    allocate.put(bArr, i5, limit - i5);
                } else if (ProtectedSandApp.s("ሕ\u0001").equals(this.f63883e)) {
                    allocate.put(c5.doFinal(bArr));
                }
            } else {
                for (a.k kVar : kVarArr) {
                    int clear = kVar.clear();
                    int a6 = c.a(kVar.a());
                    byte[] bArr2 = new byte[clear];
                    a5.get(bArr2);
                    allocate.put(bArr2);
                    if (a6 > 0) {
                        byte[] bArr3 = new byte[a6];
                        a5.get(bArr3);
                        allocate.put(c5.update(bArr3));
                    }
                }
                if (a5.remaining() > 0) {
                    System.err.println(ProtectedSandApp.s("ሖ\u0001") + fVar.getSize());
                }
                allocate.put(c5.doFinal());
            }
            a5.rewind();
            allocate.rewind();
            return new g(allocate);
        } catch (BadPaddingException e4) {
            throw new RuntimeException(e4);
        } catch (IllegalBlockSizeException e5) {
            throw new RuntimeException(e5);
        }
    }

    Cipher c(SecretKey secretKey, byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        try {
            if (ProtectedSandApp.s("ሕ\u0001").equals(this.f63883e)) {
                Cipher cipher = Cipher.getInstance(ProtectedSandApp.s("መ\u0001"));
                cipher.init(2, secretKey, new IvParameterSpec(bArr2));
                return cipher;
            }
            if (!ProtectedSandApp.s("ሗ\u0001").equals(this.f63883e)) {
                throw new RuntimeException(ProtectedSandApp.s("ሚ\u0001"));
            }
            Cipher cipher2 = Cipher.getInstance(ProtectedSandApp.s("ሙ\u0001"));
            cipher2.init(2, secretKey, new IvParameterSpec(bArr2));
            return cipher2;
        } catch (InvalidAlgorithmParameterException e4) {
            throw new RuntimeException(e4);
        } catch (InvalidKeyException e5) {
            throw new RuntimeException(e5);
        } catch (NoSuchAlgorithmException e6) {
            throw new RuntimeException(e6);
        } catch (NoSuchPaddingException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f63882d.size();
    }

    public a(n<Integer, SecretKey> nVar, List<f> list, List<com.mp4parser.iso23001.part7.a> list2, String str) {
        new n();
        this.f63880b = list2;
        this.f63881c = nVar;
        this.f63882d = list;
        this.f63883e = str;
    }
}
