package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.fragment.app.f0;
import com.bumptech.glide.gifdecoder.a;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.UByte;

/* compiled from: StandardGifDecoder.java */
/* loaded from: classes3.dex */
public class f implements a {
    private static final String A = ProtectedSandApp.s("ᱠ");
    private static final int B = 4096;
    private static final int C = -1;
    private static final int D = -1;
    private static final int E = 4;
    private static final int F = 255;

    @l
    private static final int G = 0;

    /* renamed from: f, reason: collision with root package name */
    @l
    private int[] f10870f;

    /* renamed from: g, reason: collision with root package name */
    @l
    private final int[] f10871g;

    /* renamed from: h, reason: collision with root package name */
    private final a.InterfaceC0133a f10872h;

    /* renamed from: i, reason: collision with root package name */
    private ByteBuffer f10873i;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f10874j;

    /* renamed from: k, reason: collision with root package name */
    private d f10875k;

    /* renamed from: l, reason: collision with root package name */
    private short[] f10876l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f10877m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f10878n;

    /* renamed from: o, reason: collision with root package name */
    private byte[] f10879o;

    /* renamed from: p, reason: collision with root package name */
    @l
    private int[] f10880p;

    /* renamed from: q, reason: collision with root package name */
    private int f10881q;

    /* renamed from: r, reason: collision with root package name */
    private c f10882r;

    /* renamed from: s, reason: collision with root package name */
    private Bitmap f10883s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f10884t;

    /* renamed from: u, reason: collision with root package name */
    private int f10885u;

    /* renamed from: v, reason: collision with root package name */
    private int f10886v;

    /* renamed from: w, reason: collision with root package name */
    private int f10887w;

    /* renamed from: x, reason: collision with root package name */
    private int f10888x;

    /* renamed from: y, reason: collision with root package name */
    @q0
    private Boolean f10889y;

    /* renamed from: z, reason: collision with root package name */
    @o0
    private Bitmap.Config f10890z;

    public f(@o0 a.InterfaceC0133a interfaceC0133a, c cVar, ByteBuffer byteBuffer) {
        this(interfaceC0133a, cVar, byteBuffer, 1);
    }

    private Bitmap A(b bVar, b bVar2) {
        int i5;
        int i6;
        Bitmap bitmap;
        int[] iArr = this.f10880p;
        int i7 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f10883s;
            if (bitmap2 != null) {
                this.f10872h.c(bitmap2);
            }
            this.f10883s = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f10826g == 3 && this.f10883s == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i6 = bVar2.f10826g) > 0) {
            if (i6 == 2) {
                if (!bVar.f10825f) {
                    c cVar = this.f10882r;
                    int i8 = cVar.f10844l;
                    if (bVar.f10830k == null || cVar.f10842j != bVar.f10827h) {
                        i7 = i8;
                    }
                }
                int i9 = bVar2.f10823d;
                int i10 = this.f10886v;
                int i11 = i9 / i10;
                int i12 = bVar2.f10821b / i10;
                int i13 = bVar2.f10822c / i10;
                int i14 = bVar2.f10820a / i10;
                int i15 = this.f10888x;
                int i16 = (i12 * i15) + i14;
                int i17 = (i11 * i15) + i16;
                while (i16 < i17) {
                    int i18 = i16 + i13;
                    for (int i19 = i16; i19 < i18; i19++) {
                        iArr[i19] = i7;
                    }
                    i16 += this.f10888x;
                }
            } else if (i6 == 3 && (bitmap = this.f10883s) != null) {
                int i20 = this.f10888x;
                bitmap.getPixels(iArr, 0, i20, 0, 0, i20, this.f10887w);
            }
        }
        v(bVar);
        if (bVar.f10824e || this.f10886v != 1) {
            t(bVar);
        } else {
            u(bVar);
        }
        if (this.f10884t && ((i5 = bVar.f10826g) == 0 || i5 == 1)) {
            if (this.f10883s == null) {
                this.f10883s = x();
            }
            Bitmap bitmap3 = this.f10883s;
            int i21 = this.f10888x;
            bitmap3.setPixels(iArr, 0, i21, 0, 0, i21, this.f10887w);
        }
        Bitmap x5 = x();
        int i22 = this.f10888x;
        x5.setPixels(iArr, 0, i22, 0, 0, i22, this.f10887w);
        return x5;
    }

    @l
    private int s(int i5, int i6, int i7) {
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = i5; i13 < this.f10886v + i5; i13++) {
            byte[] bArr = this.f10879o;
            if (i13 >= bArr.length || i13 >= i6) {
                break;
            }
            int i14 = this.f10870f[bArr[i13] & UByte.f27220r];
            if (i14 != 0) {
                i8 += (i14 >> 24) & 255;
                i9 += (i14 >> 16) & 255;
                i10 += (i14 >> 8) & 255;
                i11 += i14 & 255;
                i12++;
            }
        }
        int i15 = i5 + i7;
        for (int i16 = i15; i16 < this.f10886v + i15; i16++) {
            byte[] bArr2 = this.f10879o;
            if (i16 >= bArr2.length || i16 >= i6) {
                break;
            }
            int i17 = this.f10870f[bArr2[i16] & UByte.f27220r];
            if (i17 != 0) {
                i8 += (i17 >> 24) & 255;
                i9 += (i17 >> 16) & 255;
                i10 += (i17 >> 8) & 255;
                i11 += i17 & 255;
                i12++;
            }
        }
        if (i12 == 0) {
            return 0;
        }
        return ((i8 / i12) << 24) | ((i9 / i12) << 16) | ((i10 / i12) << 8) | (i11 / i12);
    }

    private void t(b bVar) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f10880p;
        int i10 = bVar.f10823d;
        int i11 = this.f10886v;
        int i12 = i10 / i11;
        int i13 = bVar.f10821b / i11;
        int i14 = bVar.f10822c / i11;
        int i15 = bVar.f10820a / i11;
        boolean z5 = this.f10881q == 0;
        int i16 = this.f10888x;
        int i17 = this.f10887w;
        byte[] bArr = this.f10879o;
        int[] iArr2 = this.f10870f;
        Boolean bool = this.f10889y;
        int i18 = 8;
        int i19 = 0;
        int i20 = 0;
        int i21 = 1;
        while (i20 < i12) {
            Boolean bool2 = bool;
            if (bVar.f10824e) {
                if (i19 >= i12) {
                    int i22 = i21 + 1;
                    i5 = i12;
                    if (i22 == 2) {
                        i19 = 4;
                    } else if (i22 == 3) {
                        i18 = 4;
                        i21 = i22;
                        i19 = 2;
                    } else if (i22 == 4) {
                        i21 = i22;
                        i19 = 1;
                        i18 = 2;
                    }
                    i21 = i22;
                } else {
                    i5 = i12;
                }
                i6 = i19 + i18;
            } else {
                i5 = i12;
                i6 = i19;
                i19 = i20;
            }
            int i23 = i19 + i13;
            boolean z6 = i11 == 1;
            if (i23 < i17) {
                int i24 = i23 * i16;
                int i25 = i24 + i15;
                int i26 = i25 + i14;
                int i27 = i24 + i16;
                if (i27 < i26) {
                    i26 = i27;
                }
                i7 = i6;
                int i28 = i20 * i11 * bVar.f10822c;
                if (z6) {
                    int i29 = i25;
                    while (i29 < i26) {
                        int i30 = i13;
                        int i31 = iArr2[bArr[i28] & UByte.f27220r];
                        if (i31 != 0) {
                            iArr[i29] = i31;
                        } else if (z5 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i28 += i11;
                        i29++;
                        i13 = i30;
                    }
                } else {
                    i9 = i13;
                    int i32 = ((i26 - i25) * i11) + i28;
                    int i33 = i25;
                    while (true) {
                        i8 = i14;
                        if (i33 < i26) {
                            int s5 = s(i28, i32, bVar.f10822c);
                            if (s5 != 0) {
                                iArr[i33] = s5;
                            } else if (z5 && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i28 += i11;
                            i33++;
                            i14 = i8;
                        }
                    }
                    bool = bool2;
                    i20++;
                    i13 = i9;
                    i12 = i5;
                    i14 = i8;
                    i19 = i7;
                }
            } else {
                i7 = i6;
            }
            i9 = i13;
            i8 = i14;
            bool = bool2;
            i20++;
            i13 = i9;
            i12 = i5;
            i14 = i8;
            i19 = i7;
        }
        Boolean bool3 = bool;
        if (this.f10889y == null) {
            this.f10889y = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    private void u(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f10880p;
        int i5 = bVar2.f10823d;
        int i6 = bVar2.f10821b;
        int i7 = bVar2.f10822c;
        int i8 = bVar2.f10820a;
        boolean z5 = this.f10881q == 0;
        int i9 = this.f10888x;
        byte[] bArr = this.f10879o;
        int[] iArr2 = this.f10870f;
        int i10 = 0;
        byte b6 = -1;
        while (i10 < i5) {
            int i11 = (i10 + i6) * i9;
            int i12 = i11 + i8;
            int i13 = i12 + i7;
            int i14 = i11 + i9;
            if (i14 < i13) {
                i13 = i14;
            }
            int i15 = bVar2.f10822c * i10;
            int i16 = i12;
            while (i16 < i13) {
                byte b7 = bArr[i15];
                int i17 = i5;
                int i18 = b7 & UByte.f27220r;
                if (i18 != b6) {
                    int i19 = iArr2[i18];
                    if (i19 != 0) {
                        iArr[i16] = i19;
                    } else {
                        b6 = b7;
                    }
                }
                i15++;
                i16++;
                i5 = i17;
            }
            i10++;
            bVar2 = bVar;
        }
        Boolean bool = this.f10889y;
        this.f10889y = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f10889y == null && z5 && b6 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    private void v(b bVar) {
        int i5;
        int i6;
        short s5;
        f fVar = this;
        if (bVar != null) {
            fVar.f10873i.position(bVar.f10829j);
        }
        if (bVar == null) {
            c cVar = fVar.f10882r;
            i5 = cVar.f10838f;
            i6 = cVar.f10839g;
        } else {
            i5 = bVar.f10822c;
            i6 = bVar.f10823d;
        }
        int i7 = i5 * i6;
        byte[] bArr = fVar.f10879o;
        if (bArr == null || bArr.length < i7) {
            fVar.f10879o = fVar.f10872h.e(i7);
        }
        byte[] bArr2 = fVar.f10879o;
        if (fVar.f10876l == null) {
            fVar.f10876l = new short[4096];
        }
        short[] sArr = fVar.f10876l;
        if (fVar.f10877m == null) {
            fVar.f10877m = new byte[4096];
        }
        byte[] bArr3 = fVar.f10877m;
        if (fVar.f10878n == null) {
            fVar.f10878n = new byte[f0.I];
        }
        byte[] bArr4 = fVar.f10878n;
        int z5 = z();
        int i8 = 1 << z5;
        int i9 = i8 + 1;
        int i10 = i8 + 2;
        int i11 = z5 + 1;
        int i12 = (1 << i11) - 1;
        int i13 = 0;
        for (int i14 = 0; i14 < i8; i14++) {
            sArr[i14] = 0;
            bArr3[i14] = (byte) i14;
        }
        byte[] bArr5 = fVar.f10874j;
        int i15 = i11;
        int i16 = i10;
        int i17 = i12;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = -1;
        while (true) {
            if (i13 >= i7) {
                break;
            }
            if (i18 == 0) {
                i18 = y();
                if (i18 <= 0) {
                    fVar.f10885u = 3;
                    break;
                }
                i19 = 0;
            }
            i21 += (bArr5[i19] & UByte.f27220r) << i20;
            i19++;
            i18--;
            int i26 = i20 + 8;
            int i27 = i16;
            int i28 = i15;
            int i29 = i25;
            int i30 = i11;
            int i31 = i23;
            while (true) {
                if (i26 < i28) {
                    i25 = i29;
                    i16 = i27;
                    i20 = i26;
                    fVar = this;
                    i23 = i31;
                    i11 = i30;
                    i15 = i28;
                    break;
                }
                int i32 = i10;
                int i33 = i21 & i17;
                i21 >>= i28;
                i26 -= i28;
                if (i33 == i8) {
                    i17 = i12;
                    i28 = i30;
                    i27 = i32;
                    i10 = i27;
                    i29 = -1;
                } else {
                    if (i33 == i9) {
                        i20 = i26;
                        i23 = i31;
                        i16 = i27;
                        i11 = i30;
                        i10 = i32;
                        i25 = i29;
                        i15 = i28;
                        fVar = this;
                        break;
                    }
                    if (i29 == -1) {
                        bArr2[i22] = bArr3[i33];
                        i22++;
                        i13++;
                        i29 = i33;
                        i31 = i29;
                        i10 = i32;
                        i26 = i26;
                    } else {
                        if (i33 >= i27) {
                            bArr4[i24] = (byte) i31;
                            i24++;
                            s5 = i29;
                        } else {
                            s5 = i33;
                        }
                        while (s5 >= i8) {
                            bArr4[i24] = bArr3[s5];
                            i24++;
                            s5 = sArr[s5];
                        }
                        i31 = bArr3[s5] & UByte.f27220r;
                        byte b6 = (byte) i31;
                        bArr2[i22] = b6;
                        while (true) {
                            i22++;
                            i13++;
                            if (i24 <= 0) {
                                break;
                            }
                            i24--;
                            bArr2[i22] = bArr4[i24];
                        }
                        byte[] bArr6 = bArr4;
                        if (i27 < 4096) {
                            sArr[i27] = (short) i29;
                            bArr3[i27] = b6;
                            i27++;
                            if ((i27 & i17) == 0 && i27 < 4096) {
                                i28++;
                                i17 += i27;
                            }
                        }
                        i29 = i33;
                        i10 = i32;
                        i26 = i26;
                        bArr4 = bArr6;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i22, i7, (byte) 0);
    }

    @o0
    private d w() {
        if (this.f10875k == null) {
            this.f10875k = new d();
        }
        return this.f10875k;
    }

    private Bitmap x() {
        Boolean bool = this.f10889y;
        Bitmap a6 = this.f10872h.a(this.f10888x, this.f10887w, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f10890z);
        a6.setHasAlpha(true);
        return a6;
    }

    private int y() {
        int z5 = z();
        if (z5 <= 0) {
            return z5;
        }
        ByteBuffer byteBuffer = this.f10873i;
        byteBuffer.get(this.f10874j, 0, Math.min(z5, byteBuffer.remaining()));
        return z5;
    }

    private int z() {
        return this.f10873i.get() & UByte.f27220r;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int a() {
        return this.f10882r.f10838f;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int b(@q0 InputStream inputStream, int i5) {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i5 > 0 ? i5 + 4096 : 16384);
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream.read(bArr, 0, 16384);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException unused) {
            }
        } else {
            this.f10885u = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        }
        return this.f10885u;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    @q0
    public synchronized Bitmap c() {
        if (this.f10882r.f10835c <= 0 || this.f10881q < 0) {
            if (Log.isLoggable(A, 3)) {
                int i5 = this.f10882r.f10835c;
            }
            this.f10885u = 1;
        }
        int i6 = this.f10885u;
        if (i6 != 1 && i6 != 2) {
            this.f10885u = 0;
            if (this.f10874j == null) {
                this.f10874j = this.f10872h.e(255);
            }
            b bVar = this.f10882r.f10837e.get(this.f10881q);
            int i7 = this.f10881q - 1;
            b bVar2 = i7 >= 0 ? this.f10882r.f10837e.get(i7) : null;
            int[] iArr = bVar.f10830k;
            if (iArr == null) {
                iArr = this.f10882r.f10833a;
            }
            this.f10870f = iArr;
            if (iArr == null) {
                Log.isLoggable(A, 3);
                this.f10885u = 1;
                return null;
            }
            if (bVar.f10825f) {
                System.arraycopy(iArr, 0, this.f10871g, 0, iArr.length);
                int[] iArr2 = this.f10871g;
                this.f10870f = iArr2;
                iArr2[bVar.f10827h] = 0;
                if (bVar.f10826g == 2 && this.f10881q == 0) {
                    this.f10889y = Boolean.TRUE;
                }
            }
            return A(bVar, bVar2);
        }
        Log.isLoggable(A, 3);
        return null;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void clear() {
        this.f10882r = null;
        byte[] bArr = this.f10879o;
        if (bArr != null) {
            this.f10872h.d(bArr);
        }
        int[] iArr = this.f10880p;
        if (iArr != null) {
            this.f10872h.f(iArr);
        }
        Bitmap bitmap = this.f10883s;
        if (bitmap != null) {
            this.f10872h.c(bitmap);
        }
        this.f10883s = null;
        this.f10873i = null;
        this.f10889y = null;
        byte[] bArr2 = this.f10874j;
        if (bArr2 != null) {
            this.f10872h.d(bArr2);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int d() {
        return this.f10882r.f10839g;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void e() {
        this.f10881q = (this.f10881q + 1) % this.f10882r.f10835c;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public synchronized void f(@o0 c cVar, @o0 byte[] bArr) {
        l(cVar, ByteBuffer.wrap(bArr));
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int g() {
        return this.f10882r.f10835c;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    @o0
    public ByteBuffer getData() {
        return this.f10873i;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int getStatus() {
        return this.f10885u;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int h() {
        int i5;
        if (this.f10882r.f10835c <= 0 || (i5 = this.f10881q) < 0) {
            return 0;
        }
        return j(i5);
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void i(@o0 Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f10890z = config;
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ᱡ") + config + ProtectedSandApp.s("ᱢ") + Bitmap.Config.ARGB_8888 + ProtectedSandApp.s("ᱣ") + Bitmap.Config.RGB_565);
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int j(int i5) {
        if (i5 >= 0) {
            c cVar = this.f10882r;
            if (i5 < cVar.f10835c) {
                return cVar.f10837e.get(i5).f10828i;
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void k() {
        this.f10881q = -1;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public synchronized void l(@o0 c cVar, @o0 ByteBuffer byteBuffer) {
        n(cVar, byteBuffer, 1);
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int m() {
        return this.f10881q;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public synchronized void n(@o0 c cVar, @o0 ByteBuffer byteBuffer, int i5) {
        String s5 = ProtectedSandApp.s("ᱤ");
        synchronized (this) {
            if (i5 <= 0) {
                throw new IllegalArgumentException(s5 + i5);
            }
            int highestOneBit = Integer.highestOneBit(i5);
            this.f10885u = 0;
            this.f10882r = cVar;
            this.f10881q = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f10873i = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f10873i.order(ByteOrder.LITTLE_ENDIAN);
            this.f10884t = false;
            Iterator<b> it = cVar.f10837e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f10826g == 3) {
                    this.f10884t = true;
                    break;
                }
            }
            this.f10886v = highestOneBit;
            int i6 = cVar.f10838f;
            this.f10888x = i6 / highestOneBit;
            int i7 = cVar.f10839g;
            this.f10887w = i7 / highestOneBit;
            this.f10879o = this.f10872h.e(i6 * i7);
            this.f10880p = this.f10872h.b(this.f10888x * this.f10887w);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int o() {
        return this.f10882r.f10845m;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int p() {
        return (this.f10880p.length * 4) + this.f10873i.limit() + this.f10879o.length;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int q() {
        int i5 = this.f10882r.f10845m;
        if (i5 == -1) {
            return 1;
        }
        if (i5 == 0) {
            return 0;
        }
        return i5 + 1;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    @Deprecated
    public int r() {
        int i5 = this.f10882r.f10845m;
        if (i5 == -1) {
            return 1;
        }
        return i5;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public synchronized int read(@q0 byte[] bArr) {
        c d6 = w().r(bArr).d();
        this.f10882r = d6;
        if (bArr != null) {
            f(d6, bArr);
        }
        return this.f10885u;
    }

    public f(@o0 a.InterfaceC0133a interfaceC0133a, c cVar, ByteBuffer byteBuffer, int i5) {
        this(interfaceC0133a);
        n(cVar, byteBuffer, i5);
    }

    public f(@o0 a.InterfaceC0133a interfaceC0133a) {
        this.f10871g = new int[256];
        this.f10890z = Bitmap.Config.ARGB_8888;
        this.f10872h = interfaceC0133a;
        this.f10882r = new c();
    }
}
