package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.graphics.y;
import androidx.fragment.app.l0;
import com.bumptech.glide.gifdecoder.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: StandardGifDecoder.java */
/* loaded from: classes3.dex */
public class f implements a {
    private static final String A = ProtectedSandApp.s("࠻");
    private static final int B = 4096;
    private static final int C = -1;
    private static final int D = -1;
    private static final int E = 4;
    private static final int F = 255;

    @l
    private static final int G = 0;

    /* renamed from: f, reason: collision with root package name */
    @l
    private int[] f42969f;

    /* renamed from: g, reason: collision with root package name */
    @l
    private final int[] f42970g;

    /* renamed from: h, reason: collision with root package name */
    private final a.InterfaceC0732a f42971h;

    /* renamed from: i, reason: collision with root package name */
    private ByteBuffer f42972i;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f42973j;

    /* renamed from: k, reason: collision with root package name */
    private d f42974k;

    /* renamed from: l, reason: collision with root package name */
    private short[] f42975l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f42976m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f42977n;

    /* renamed from: o, reason: collision with root package name */
    private byte[] f42978o;

    /* renamed from: p, reason: collision with root package name */
    @l
    private int[] f42979p;

    /* renamed from: q, reason: collision with root package name */
    private int f42980q;

    /* renamed from: r, reason: collision with root package name */
    private c f42981r;

    /* renamed from: s, reason: collision with root package name */
    private Bitmap f42982s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f42983t;

    /* renamed from: u, reason: collision with root package name */
    private int f42984u;

    /* renamed from: v, reason: collision with root package name */
    private int f42985v;

    /* renamed from: w, reason: collision with root package name */
    private int f42986w;

    /* renamed from: x, reason: collision with root package name */
    private int f42987x;

    /* renamed from: y, reason: collision with root package name */
    @q0
    private Boolean f42988y;

    /* renamed from: z, reason: collision with root package name */
    @o0
    private Bitmap.Config f42989z;

    public f(@o0 a.InterfaceC0732a interfaceC0732a, c cVar, ByteBuffer byteBuffer) {
        this(interfaceC0732a, cVar, byteBuffer, 1);
    }

    @l
    private int q(int i4, int i5, int i6) {
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = i4; i14 < this.f42985v + i4; i14++) {
            byte[] bArr = this.f42978o;
            if (i14 >= bArr.length || i14 >= i5) {
                break;
            }
            int i15 = this.f42969f[bArr[i14] & 255];
            if (i15 != 0) {
                i7 += (i15 >> 24) & 255;
                i10 += (i15 >> 16) & 255;
                i11 += (i15 >> 8) & 255;
                i12 += i15 & 255;
                i13++;
            }
        }
        int i16 = i4 + i6;
        for (int i17 = i16; i17 < this.f42985v + i16; i17++) {
            byte[] bArr2 = this.f42978o;
            if (i17 >= bArr2.length || i17 >= i5) {
                break;
            }
            int i18 = this.f42969f[bArr2[i17] & 255];
            if (i18 != 0) {
                i7 += (i18 >> 24) & 255;
                i10 += (i18 >> 16) & 255;
                i11 += (i18 >> 8) & 255;
                i12 += i18 & 255;
                i13++;
            }
        }
        if (i13 == 0) {
            return 0;
        }
        return ((i7 / i13) << 24) | ((i10 / i13) << 16) | ((i11 / i13) << 8) | (i12 / i13);
    }

    private void r(b bVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr = this.f42979p;
        int i10 = bVar.f42922d;
        int i11 = this.f42985v;
        int i12 = i10 / i11;
        int i13 = bVar.f42920b / i11;
        int i14 = bVar.f42921c / i11;
        int i15 = bVar.f42919a / i11;
        boolean z4 = this.f42980q == 0;
        int i16 = this.f42987x;
        int i17 = this.f42986w;
        byte[] bArr = this.f42978o;
        int[] iArr2 = this.f42969f;
        Boolean bool = this.f42988y;
        int i18 = 8;
        int i19 = 0;
        int i20 = 0;
        int i21 = 1;
        while (i20 < i12) {
            Boolean bool2 = bool;
            if (bVar.f42923e) {
                if (i19 >= i12) {
                    int i22 = i21 + 1;
                    i4 = i12;
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
                    i4 = i12;
                }
                i5 = i19 + i18;
            } else {
                i4 = i12;
                i5 = i19;
                i19 = i20;
            }
            int i23 = i19 + i13;
            boolean z5 = i11 == 1;
            if (i23 < i17) {
                int i24 = i23 * i16;
                int i25 = i24 + i15;
                i6 = i5;
                int i26 = i25 + i14;
                int i27 = i24 + i16;
                if (i27 < i26) {
                    i26 = i27;
                }
                i7 = i13;
                int i28 = i20 * i11 * bVar.f42921c;
                if (z5) {
                    while (i25 < i26) {
                        int i29 = iArr2[bArr[i28] & 255];
                        if (i29 != 0) {
                            iArr[i25] = i29;
                        } else if (z4 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i28 += i11;
                        i25++;
                    }
                } else {
                    int a5 = y.a(i26, i25, i11, i28);
                    while (i25 < i26) {
                        int i30 = i26;
                        int q4 = q(i28, a5, bVar.f42921c);
                        if (q4 != 0) {
                            iArr[i25] = q4;
                        } else if (z4 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i28 += i11;
                        i25++;
                        i26 = i30;
                    }
                }
            } else {
                i6 = i5;
                i7 = i13;
            }
            bool = bool2;
            i20++;
            i12 = i4;
            i19 = i6;
            i13 = i7;
        }
        Boolean bool3 = bool;
        if (this.f42988y == null) {
            this.f42988y = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    private void s(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f42979p;
        int i4 = bVar2.f42922d;
        int i5 = bVar2.f42920b;
        int i6 = bVar2.f42921c;
        int i7 = bVar2.f42919a;
        boolean z4 = this.f42980q == 0;
        int i10 = this.f42987x;
        byte[] bArr = this.f42978o;
        int[] iArr2 = this.f42969f;
        int i11 = 0;
        byte b5 = -1;
        while (i11 < i4) {
            int i12 = (i11 + i5) * i10;
            int i13 = i12 + i7;
            int i14 = i13 + i6;
            int i15 = i12 + i10;
            if (i15 < i14) {
                i14 = i15;
            }
            int i16 = bVar2.f42921c * i11;
            int i17 = i13;
            while (i17 < i14) {
                byte b6 = bArr[i16];
                int i18 = i4;
                int i19 = b6 & 255;
                if (i19 != b5) {
                    int i20 = iArr2[i19];
                    if (i20 != 0) {
                        iArr[i17] = i20;
                    } else {
                        b5 = b6;
                    }
                }
                i16++;
                i17++;
                i4 = i18;
            }
            i11++;
            bVar2 = bVar;
        }
        Boolean bool = this.f42988y;
        this.f42988y = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f42988y == null && z4 && b5 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    private void t(b bVar) {
        int i4;
        int i5;
        short s4;
        f fVar = this;
        if (bVar != null) {
            fVar.f42972i.position(bVar.f42928j);
        }
        if (bVar == null) {
            c cVar = fVar.f42981r;
            i4 = cVar.f42937f;
            i5 = cVar.f42938g;
        } else {
            i4 = bVar.f42921c;
            i5 = bVar.f42922d;
        }
        int i6 = i4 * i5;
        byte[] bArr = fVar.f42978o;
        if (bArr == null || bArr.length < i6) {
            fVar.f42978o = fVar.f42971h.b(i6);
        }
        byte[] bArr2 = fVar.f42978o;
        if (fVar.f42975l == null) {
            fVar.f42975l = new short[4096];
        }
        short[] sArr = fVar.f42975l;
        if (fVar.f42976m == null) {
            fVar.f42976m = new byte[4096];
        }
        byte[] bArr3 = fVar.f42976m;
        if (fVar.f42977n == null) {
            fVar.f42977n = new byte[l0.I];
        }
        byte[] bArr4 = fVar.f42977n;
        int x4 = x();
        int i7 = 1 << x4;
        int i10 = i7 + 1;
        int i11 = i7 + 2;
        int i12 = x4 + 1;
        int i13 = (1 << i12) - 1;
        int i14 = 0;
        for (int i15 = 0; i15 < i7; i15++) {
            sArr[i15] = 0;
            bArr3[i15] = (byte) i15;
        }
        byte[] bArr5 = fVar.f42973j;
        int i16 = i12;
        int i17 = i11;
        int i18 = i13;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = -1;
        while (true) {
            if (i14 >= i6) {
                break;
            }
            if (i19 == 0) {
                i19 = w();
                if (i19 <= 0) {
                    fVar.f42984u = 3;
                    break;
                }
                i20 = 0;
            }
            i22 += (bArr5[i20] & 255) << i21;
            i20++;
            i19--;
            int i27 = i21 + 8;
            int i28 = i17;
            int i29 = i16;
            int i30 = i26;
            int i31 = i12;
            int i32 = i24;
            while (true) {
                if (i27 < i29) {
                    i26 = i30;
                    i17 = i28;
                    i21 = i27;
                    fVar = this;
                    i24 = i32;
                    i12 = i31;
                    i16 = i29;
                    break;
                }
                int i33 = i11;
                int i34 = i22 & i18;
                i22 >>= i29;
                i27 -= i29;
                if (i34 == i7) {
                    i18 = i13;
                    i29 = i31;
                    i28 = i33;
                    i11 = i28;
                    i30 = -1;
                } else {
                    if (i34 == i10) {
                        i21 = i27;
                        i24 = i32;
                        i17 = i28;
                        i12 = i31;
                        i11 = i33;
                        i26 = i30;
                        i16 = i29;
                        fVar = this;
                        break;
                    }
                    if (i30 == -1) {
                        bArr2[i23] = bArr3[i34];
                        i23++;
                        i14++;
                        i30 = i34;
                        i32 = i30;
                        i11 = i33;
                        i27 = i27;
                    } else {
                        if (i34 >= i28) {
                            bArr4[i25] = (byte) i32;
                            i25++;
                            s4 = i30;
                        } else {
                            s4 = i34;
                        }
                        while (s4 >= i7) {
                            bArr4[i25] = bArr3[s4];
                            i25++;
                            s4 = sArr[s4];
                        }
                        i32 = bArr3[s4] & 255;
                        byte b5 = (byte) i32;
                        bArr2[i23] = b5;
                        while (true) {
                            i23++;
                            i14++;
                            if (i25 <= 0) {
                                break;
                            }
                            i25--;
                            bArr2[i23] = bArr4[i25];
                        }
                        byte[] bArr6 = bArr4;
                        if (i28 < 4096) {
                            sArr[i28] = (short) i30;
                            bArr3[i28] = b5;
                            i28++;
                            if ((i28 & i18) == 0 && i28 < 4096) {
                                i29++;
                                i18 += i28;
                            }
                        }
                        i30 = i34;
                        i11 = i33;
                        i27 = i27;
                        bArr4 = bArr6;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i23, i6, (byte) 0);
    }

    @o0
    private d u() {
        if (this.f42974k == null) {
            this.f42974k = new d();
        }
        return this.f42974k;
    }

    private Bitmap v() {
        Boolean bool = this.f42988y;
        Bitmap c5 = this.f42971h.c(this.f42987x, this.f42986w, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f42989z);
        c5.setHasAlpha(true);
        return c5;
    }

    private int w() {
        int x4 = x();
        if (x4 <= 0) {
            return x4;
        }
        ByteBuffer byteBuffer = this.f42972i;
        byteBuffer.get(this.f42973j, 0, Math.min(x4, byteBuffer.remaining()));
        return x4;
    }

    private int x() {
        return this.f42972i.get() & 255;
    }

    private Bitmap y(b bVar, b bVar2) {
        int i4;
        int i5;
        Bitmap bitmap;
        int[] iArr = this.f42979p;
        int i6 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f42982s;
            if (bitmap2 != null) {
                this.f42971h.a(bitmap2);
            }
            this.f42982s = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f42925g == 3 && this.f42982s == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i5 = bVar2.f42925g) > 0) {
            if (i5 == 2) {
                if (!bVar.f42924f) {
                    c cVar = this.f42981r;
                    int i7 = cVar.f42943l;
                    if (bVar.f42929k == null || cVar.f42941j != bVar.f42926h) {
                        i6 = i7;
                    }
                }
                int i10 = bVar2.f42922d;
                int i11 = this.f42985v;
                int i12 = i10 / i11;
                int i13 = bVar2.f42920b / i11;
                int i14 = bVar2.f42921c / i11;
                int i15 = bVar2.f42919a / i11;
                int i16 = this.f42987x;
                int i17 = (i13 * i16) + i15;
                int i18 = (i12 * i16) + i17;
                while (i17 < i18) {
                    int i19 = i17 + i14;
                    for (int i20 = i17; i20 < i19; i20++) {
                        iArr[i20] = i6;
                    }
                    i17 += this.f42987x;
                }
            } else if (i5 == 3 && (bitmap = this.f42982s) != null) {
                int i21 = this.f42987x;
                bitmap.getPixels(iArr, 0, i21, 0, 0, i21, this.f42986w);
            }
        }
        t(bVar);
        if (bVar.f42923e || this.f42985v != 1) {
            r(bVar);
        } else {
            s(bVar);
        }
        if (this.f42983t && ((i4 = bVar.f42925g) == 0 || i4 == 1)) {
            if (this.f42982s == null) {
                this.f42982s = v();
            }
            Bitmap bitmap3 = this.f42982s;
            int i22 = this.f42987x;
            bitmap3.setPixels(iArr, 0, i22, 0, 0, i22, this.f42986w);
        }
        Bitmap v4 = v();
        int i23 = this.f42987x;
        v4.setPixels(iArr, 0, i23, 0, 0, i23, this.f42986w);
        return v4;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int a(@q0 InputStream inputStream, int i4) {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i4 > 0 ? i4 + 4096 : 16384);
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
            this.f42984u = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        }
        return this.f42984u;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    @o0
    public ByteBuffer b() {
        return this.f42972i;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void c() {
        this.f42980q = (this.f42980q + 1) % this.f42981r.f42934c;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void clear() {
        this.f42981r = null;
        byte[] bArr = this.f42978o;
        if (bArr != null) {
            this.f42971h.e(bArr);
        }
        int[] iArr = this.f42979p;
        if (iArr != null) {
            this.f42971h.f(iArr);
        }
        Bitmap bitmap = this.f42982s;
        if (bitmap != null) {
            this.f42971h.a(bitmap);
        }
        this.f42982s = null;
        this.f42972i = null;
        this.f42988y = null;
        byte[] bArr2 = this.f42973j;
        if (bArr2 != null) {
            this.f42971h.e(bArr2);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int d() {
        return this.f42981r.f42934c;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void e(@o0 Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f42989z = config;
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("࠼") + config + ProtectedSandApp.s("࠽") + config3 + ProtectedSandApp.s("࠾") + config2);
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int f(int i4) {
        if (i4 >= 0) {
            c cVar = this.f42981r;
            if (i4 < cVar.f42934c) {
                return cVar.f42936e.get(i4).f42927i;
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int g() {
        int i4 = this.f42981r.f42944m;
        if (i4 == -1) {
            return 1;
        }
        if (i4 == 0) {
            return 0;
        }
        return i4 + 1;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int getHeight() {
        return this.f42981r.f42938g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x001f, B:13:0x0028, B:15:0x002f, B:16:0x0039, B:18:0x004a, B:19:0x0056, B:22:0x005f, B:24:0x0063, B:28:0x006c, B:30:0x0070, B:32:0x0082, B:34:0x0086, B:35:0x008a, B:38:0x005b, B:40:0x0090, B:43:0x0011, B:45:0x0019, B:46:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x001f, B:13:0x0028, B:15:0x002f, B:16:0x0039, B:18:0x004a, B:19:0x0056, B:22:0x005f, B:24:0x0063, B:28:0x006c, B:30:0x0070, B:32:0x0082, B:34:0x0086, B:35:0x008a, B:38:0x005b, B:40:0x0090, B:43:0x0011, B:45:0x0019, B:46:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x001f, B:13:0x0028, B:15:0x002f, B:16:0x0039, B:18:0x004a, B:19:0x0056, B:22:0x005f, B:24:0x0063, B:28:0x006c, B:30:0x0070, B:32:0x0082, B:34:0x0086, B:35:0x008a, B:38:0x005b, B:40:0x0090, B:43:0x0011, B:45:0x0019, B:46:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x001f, B:13:0x0028, B:15:0x002f, B:16:0x0039, B:18:0x004a, B:19:0x0056, B:22:0x005f, B:24:0x0063, B:28:0x006c, B:30:0x0070, B:32:0x0082, B:34:0x0086, B:35:0x008a, B:38:0x005b, B:40:0x0090, B:43:0x0011, B:45:0x0019, B:46:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005b A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x001f, B:13:0x0028, B:15:0x002f, B:16:0x0039, B:18:0x004a, B:19:0x0056, B:22:0x005f, B:24:0x0063, B:28:0x006c, B:30:0x0070, B:32:0x0082, B:34:0x0086, B:35:0x008a, B:38:0x005b, B:40:0x0090, B:43:0x0011, B:45:0x0019, B:46:0x001d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0055  */
    @Override // com.bumptech.glide.gifdecoder.a
    @androidx.annotation.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized android.graphics.Bitmap getNextFrame() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.bumptech.glide.gifdecoder.c r0 = r8.f42981r     // Catch: java.lang.Throwable -> Le
            int r0 = r0.f42934c     // Catch: java.lang.Throwable -> Le
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L11
            int r0 = r8.f42980q     // Catch: java.lang.Throwable -> Le
            if (r0 >= 0) goto L1f
            goto L11
        Le:
            r0 = move-exception
            goto L97
        L11:
            java.lang.String r0 = com.bumptech.glide.gifdecoder.f.A     // Catch: java.lang.Throwable -> Le
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L1d
            com.bumptech.glide.gifdecoder.c r0 = r8.f42981r     // Catch: java.lang.Throwable -> Le
            int r0 = r0.f42934c     // Catch: java.lang.Throwable -> Le
        L1d:
            r8.f42984u = r2     // Catch: java.lang.Throwable -> Le
        L1f:
            int r0 = r8.f42984u     // Catch: java.lang.Throwable -> Le
            r3 = 0
            if (r0 == r2) goto L90
            r4 = 2
            if (r0 != r4) goto L28
            goto L90
        L28:
            r0 = 0
            r8.f42984u = r0     // Catch: java.lang.Throwable -> Le
            byte[] r5 = r8.f42973j     // Catch: java.lang.Throwable -> Le
            if (r5 != 0) goto L39
            com.bumptech.glide.gifdecoder.a$a r5 = r8.f42971h     // Catch: java.lang.Throwable -> Le
            r6 = 255(0xff, float:3.57E-43)
            byte[] r5 = r5.b(r6)     // Catch: java.lang.Throwable -> Le
            r8.f42973j = r5     // Catch: java.lang.Throwable -> Le
        L39:
            com.bumptech.glide.gifdecoder.c r5 = r8.f42981r     // Catch: java.lang.Throwable -> Le
            java.util.List<com.bumptech.glide.gifdecoder.b> r5 = r5.f42936e     // Catch: java.lang.Throwable -> Le
            int r6 = r8.f42980q     // Catch: java.lang.Throwable -> Le
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.gifdecoder.b r5 = (com.bumptech.glide.gifdecoder.b) r5     // Catch: java.lang.Throwable -> Le
            int r6 = r8.f42980q     // Catch: java.lang.Throwable -> Le
            int r6 = r6 - r2
            if (r6 < 0) goto L55
            com.bumptech.glide.gifdecoder.c r7 = r8.f42981r     // Catch: java.lang.Throwable -> Le
            java.util.List<com.bumptech.glide.gifdecoder.b> r7 = r7.f42936e     // Catch: java.lang.Throwable -> Le
            java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.gifdecoder.b r6 = (com.bumptech.glide.gifdecoder.b) r6     // Catch: java.lang.Throwable -> Le
            goto L56
        L55:
            r6 = r3
        L56:
            int[] r7 = r5.f42929k     // Catch: java.lang.Throwable -> Le
            if (r7 == 0) goto L5b
            goto L5f
        L5b:
            com.bumptech.glide.gifdecoder.c r7 = r8.f42981r     // Catch: java.lang.Throwable -> Le
            int[] r7 = r7.f42932a     // Catch: java.lang.Throwable -> Le
        L5f:
            r8.f42969f = r7     // Catch: java.lang.Throwable -> Le
            if (r7 != 0) goto L6c
            java.lang.String r0 = com.bumptech.glide.gifdecoder.f.A     // Catch: java.lang.Throwable -> Le
            android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Le
            r8.f42984u = r2     // Catch: java.lang.Throwable -> Le
            monitor-exit(r8)
            return r3
        L6c:
            boolean r1 = r5.f42924f     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L8a
            int[] r1 = r8.f42970g     // Catch: java.lang.Throwable -> Le
            int r2 = r7.length     // Catch: java.lang.Throwable -> Le
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch: java.lang.Throwable -> Le
            int[] r1 = r8.f42970g     // Catch: java.lang.Throwable -> Le
            r8.f42969f = r1     // Catch: java.lang.Throwable -> Le
            int r2 = r5.f42926h     // Catch: java.lang.Throwable -> Le
            r1[r2] = r0     // Catch: java.lang.Throwable -> Le
            int r0 = r5.f42925g     // Catch: java.lang.Throwable -> Le
            if (r0 != r4) goto L8a
            int r0 = r8.f42980q     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L8a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Le
            r8.f42988y = r0     // Catch: java.lang.Throwable -> Le
        L8a:
            android.graphics.Bitmap r0 = r8.y(r5, r6)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r8)
            return r0
        L90:
            java.lang.String r0 = com.bumptech.glide.gifdecoder.f.A     // Catch: java.lang.Throwable -> Le
            android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r8)
            return r3
        L97:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Le
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.gifdecoder.f.getNextFrame():android.graphics.Bitmap");
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int getStatus() {
        return this.f42984u;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int getWidth() {
        return this.f42981r.f42937f;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    @Deprecated
    public int h() {
        int i4 = this.f42981r.f42944m;
        if (i4 == -1) {
            return 1;
        }
        return i4;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public synchronized void i(@o0 c cVar, @o0 byte[] bArr) {
        l(cVar, ByteBuffer.wrap(bArr));
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int j() {
        int i4;
        if (this.f42981r.f42934c <= 0 || (i4 = this.f42980q) < 0) {
            return 0;
        }
        return f(i4);
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void k() {
        this.f42980q = -1;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public synchronized void l(@o0 c cVar, @o0 ByteBuffer byteBuffer) {
        n(cVar, byteBuffer, 1);
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int m() {
        return this.f42980q;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public synchronized void n(@o0 c cVar, @o0 ByteBuffer byteBuffer, int i4) {
        String s4 = ProtectedSandApp.s("\u083f");
        synchronized (this) {
            try {
                if (i4 <= 0) {
                    throw new IllegalArgumentException(s4 + i4);
                }
                int highestOneBit = Integer.highestOneBit(i4);
                this.f42984u = 0;
                this.f42981r = cVar;
                this.f42980q = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f42972i = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f42972i.order(ByteOrder.LITTLE_ENDIAN);
                this.f42983t = false;
                Iterator<b> it = cVar.f42936e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().f42925g == 3) {
                        this.f42983t = true;
                        break;
                    }
                }
                this.f42985v = highestOneBit;
                int i5 = cVar.f42937f;
                this.f42987x = i5 / highestOneBit;
                int i6 = cVar.f42938g;
                this.f42986w = i6 / highestOneBit;
                this.f42978o = this.f42971h.b(i5 * i6);
                this.f42979p = this.f42971h.d(this.f42987x * this.f42986w);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int o() {
        return this.f42981r.f42944m;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int p() {
        return (this.f42979p.length * 4) + this.f42972i.limit() + this.f42978o.length;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public synchronized int read(@q0 byte[] bArr) {
        try {
            c d5 = u().r(bArr).d();
            this.f42981r = d5;
            if (bArr != null) {
                i(d5, bArr);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f42984u;
    }

    public f(@o0 a.InterfaceC0732a interfaceC0732a, c cVar, ByteBuffer byteBuffer, int i4) {
        this(interfaceC0732a);
        n(cVar, byteBuffer, i4);
    }

    public f(@o0 a.InterfaceC0732a interfaceC0732a) {
        this.f42970g = new int[256];
        this.f42989z = Bitmap.Config.ARGB_8888;
        this.f42971h = interfaceC0732a;
        this.f42981r = new c();
    }
}
