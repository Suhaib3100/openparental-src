package top.zibin.luban;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: Checker.java */
/* loaded from: classes9.dex */
enum b {
    SINGLE;

    private final byte[] JPEG_SIGNATURE = {-1, -40, -1};
    private static final String JPG = ProtectedSandApp.s("ꙶ\u0001");
    private static final String PNG = ProtectedSandApp.s("ꙷ\u0001");
    private static final String TAG = ProtectedSandApp.s("ꙸ\u0001");

    b() {
    }

    private int pack(byte[] bArr, int i4, int i5, boolean z4) {
        int i6;
        if (z4) {
            i4 += i5 - 1;
            i6 = -1;
        } else {
            i6 = 1;
        }
        int i7 = 0;
        while (true) {
            int i10 = i5 - 1;
            if (i5 <= 0) {
                return i7;
            }
            i7 = (bArr[i4] & 255) | (i7 << 8);
            i4 += i6;
            i5 = i10;
        }
    }

    private byte[] toByteArray(InputStream inputStream) {
        if (inputStream == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                try {
                    int read = inputStream.read(bArr, 0, 4096);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    }
                } finally {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (Exception unused3) {
                byte[] bArr2 = new byte[0];
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused4) {
                }
                return bArr2;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    String extSuffix(g gVar, boolean z4) {
        return z4 ? ProtectedSandApp.s("ꙷ\u0001") : ProtectedSandApp.s("ꙶ\u0001");
    }

    int getOrientation(InputStream inputStream) {
        return getOrientation(toByteArray(inputStream));
    }

    boolean isJPG(InputStream inputStream) {
        return isJPG(toByteArray(inputStream));
    }

    boolean needCompress(int i4, String str) {
        if (i4 <= 0) {
            return true;
        }
        File file = new File(str);
        return file.exists() && file.length() > ((long) (i4 << 10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        if (r8 <= 8) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
    
        r2 = pack(r11, r1, 4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        if (r2 == 1229531648) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r2 == 1296891946) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        if (r2 != 1229531648) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0074, code lost:
    
        r2 = pack(r11, r1 + 4, 4, r4) + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007d, code lost:
    
        if (r2 < 10) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007f, code lost:
    
        if (r2 <= r8) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0082, code lost:
    
        r1 = r1 + r2;
        r8 = r8 - r2;
        r2 = pack(r11, r1 - 2, 2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008a, code lost:
    
        r3 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008c, code lost:
    
        if (r2 <= 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0090, code lost:
    
        if (r8 < 12) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0098, code lost:
    
        if (pack(r11, r1, 2, r4) != 274) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b1, code lost:
    
        r1 = r1 + 12;
        r8 = r8 - 12;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009a, code lost:
    
        r11 = pack(r11, r1 + 8, 2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a0, code lost:
    
        if (r11 == 3) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a3, code lost:
    
        if (r11 == 6) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a5, code lost:
    
        if (r11 == 8) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a7, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
    
        return 270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ab, code lost:
    
        return 90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ae, code lost:
    
        return 180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b7, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x005b, code lost:
    
        r8 = 0;
        r1 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int getOrientation(byte[] r11) {
        /*
            Method dump skipped, instructions count: 184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.zibin.luban.b.getOrientation(byte[]):int");
    }

    private boolean isJPG(byte[] bArr) {
        if (bArr == null || bArr.length < 3) {
            return false;
        }
        return Arrays.equals(this.JPEG_SIGNATURE, new byte[]{bArr[0], bArr[1], bArr[2]});
    }
}
