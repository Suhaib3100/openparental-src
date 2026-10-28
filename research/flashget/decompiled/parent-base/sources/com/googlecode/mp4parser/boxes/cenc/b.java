package com.googlecode.mp4parser.boxes.cenc;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.authoring.f;
import com.googlecode.mp4parser.util.c;
import com.googlecode.mp4parser.util.n;
import com.mp4parser.iso23001.part7.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
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
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;

/* compiled from: CencEncryptingSampleList.java */
/* loaded from: classes6.dex */
public class b extends AbstractList<f> {

    /* renamed from: b, reason: collision with root package name */
    private final String f63884b;

    /* renamed from: c, reason: collision with root package name */
    Cipher f63885c;

    /* renamed from: d, reason: collision with root package name */
    List<com.mp4parser.iso23001.part7.a> f63886d;

    /* renamed from: e, reason: collision with root package name */
    n<Integer, SecretKey> f63887e;

    /* renamed from: f, reason: collision with root package name */
    List<f> f63888f;

    /* compiled from: CencEncryptingSampleList.java */
    /* renamed from: com.googlecode.mp4parser.boxes.cenc.b$b, reason: collision with other inner class name */
    private class C0968b implements f {

        /* renamed from: f, reason: collision with root package name */
        static final /* synthetic */ boolean f63889f = false;

        /* renamed from: a, reason: collision with root package name */
        private final f f63890a;

        /* renamed from: b, reason: collision with root package name */
        private final com.mp4parser.iso23001.part7.a f63891b;

        /* renamed from: c, reason: collision with root package name */
        private final Cipher f63892c;

        /* renamed from: d, reason: collision with root package name */
        private final SecretKey f63893d;

        /* synthetic */ C0968b(b bVar, f fVar, com.mp4parser.iso23001.part7.a aVar, Cipher cipher, SecretKey secretKey, C0968b c0968b) {
            this(fVar, aVar, cipher, secretKey);
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public ByteBuffer a() {
            ByteBuffer byteBuffer = (ByteBuffer) this.f63890a.a().rewind();
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.limit());
            com.mp4parser.iso23001.part7.a aVar = this.f63891b;
            b.this.f(aVar.f70084a, this.f63893d);
            try {
                a.k[] kVarArr = aVar.f70085b;
                if (kVarArr != null) {
                    for (a.k kVar : kVarArr) {
                        byte[] bArr = new byte[kVar.clear()];
                        byteBuffer.get(bArr);
                        allocate.put(bArr);
                        if (kVar.a() > 0) {
                            byte[] bArr2 = new byte[c.a(kVar.a())];
                            byteBuffer.get(bArr2);
                            allocate.put(this.f63892c.update(bArr2));
                        }
                    }
                } else {
                    int limit = byteBuffer.limit();
                    byte[] bArr3 = new byte[limit];
                    byteBuffer.get(bArr3);
                    if (ProtectedSandApp.s("ማ\u0001").equals(b.this.f63884b)) {
                        int i4 = (limit / 16) * 16;
                        allocate.put(this.f63892c.doFinal(bArr3, 0, i4));
                        allocate.put(bArr3, i4, limit - i4);
                    } else if (ProtectedSandApp.s("ሜ\u0001").equals(b.this.f63884b)) {
                        allocate.put(this.f63892c.doFinal(bArr3));
                    }
                }
                byteBuffer.rewind();
                allocate.rewind();
                return allocate;
            } catch (BadPaddingException e4) {
                throw new RuntimeException(e4);
            } catch (IllegalBlockSizeException e5) {
                throw new RuntimeException(e5);
            }
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public void b(WritableByteChannel writableByteChannel) throws IOException {
            ByteBuffer byteBuffer = (ByteBuffer) this.f63890a.a().rewind();
            b.this.f(this.f63891b.f70084a, this.f63893d);
            try {
                a.k[] kVarArr = this.f63891b.f70085b;
                if (kVarArr == null || kVarArr.length <= 0) {
                    int limit = byteBuffer.limit();
                    byte[] bArr = new byte[limit];
                    byteBuffer.get(bArr);
                    if (ProtectedSandApp.s("ማ\u0001").equals(b.this.f63884b)) {
                        int i4 = (limit / 16) * 16;
                        writableByteChannel.write(ByteBuffer.wrap(this.f63892c.doFinal(bArr, 0, i4)));
                        writableByteChannel.write(ByteBuffer.wrap(bArr, i4, limit - i4));
                    } else if (ProtectedSandApp.s("ሜ\u0001").equals(b.this.f63884b)) {
                        writableByteChannel.write(ByteBuffer.wrap(this.f63892c.doFinal(bArr)));
                    }
                } else {
                    byte[] bArr2 = new byte[byteBuffer.limit()];
                    byteBuffer.get(bArr2);
                    int i5 = 0;
                    for (a.k kVar : this.f63891b.f70085b) {
                        int clear = i5 + kVar.clear();
                        if (kVar.a() > 0) {
                            this.f63892c.update(bArr2, clear, c.a(kVar.a()), bArr2, clear);
                            i5 = (int) (clear + kVar.a());
                        } else {
                            i5 = clear;
                        }
                    }
                    writableByteChannel.write(ByteBuffer.wrap(bArr2));
                }
                byteBuffer.rewind();
            } catch (BadPaddingException e4) {
                throw new RuntimeException(e4);
            } catch (IllegalBlockSizeException e5) {
                throw new RuntimeException(e5);
            } catch (ShortBufferException e6) {
                throw new RuntimeException(e6);
            }
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public long getSize() {
            return this.f63890a.getSize();
        }

        private C0968b(f fVar, com.mp4parser.iso23001.part7.a aVar, Cipher cipher, SecretKey secretKey) {
            this.f63890a = fVar;
            this.f63891b = aVar;
            this.f63892c = cipher;
            this.f63893d = secretKey;
        }
    }

    public b(SecretKey secretKey, List<f> list, List<com.mp4parser.iso23001.part7.a> list2) {
        this(new n(0, secretKey), list, list2, ProtectedSandApp.s("ም\u0001"));
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public f get(int i4) {
        f fVar = this.f63888f.get(i4);
        return this.f63887e.get(Integer.valueOf(i4)) != null ? new C0968b(this, fVar, this.f63886d.get(i4), this.f63885c, this.f63887e.get(Integer.valueOf(i4)), null) : fVar;
    }

    protected void f(byte[] bArr, SecretKey secretKey) {
        try {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f63885c.init(1, secretKey, new IvParameterSpec(bArr2));
        } catch (InvalidAlgorithmParameterException e4) {
            throw new RuntimeException(e4);
        } catch (InvalidKeyException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f63888f.size();
    }

    public b(n<Integer, SecretKey> nVar, List<f> list, List<com.mp4parser.iso23001.part7.a> list2, String str) {
        new n();
        this.f63886d = list2;
        this.f63887e = nVar;
        this.f63884b = str;
        this.f63888f = list;
        try {
            if (ProtectedSandApp.s("ም\u0001").equals(str)) {
                this.f63885c = Cipher.getInstance(ProtectedSandApp.s("ሞ\u0001"));
            } else {
                if (!ProtectedSandApp.s("ሟ\u0001").equals(str)) {
                    throw new RuntimeException(ProtectedSandApp.s("ሡ\u0001"));
                }
                this.f63885c = Cipher.getInstance(ProtectedSandApp.s("ሠ\u0001"));
            }
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException(e4);
        } catch (NoSuchPaddingException e5) {
            throw new RuntimeException(e5);
        }
    }
}
