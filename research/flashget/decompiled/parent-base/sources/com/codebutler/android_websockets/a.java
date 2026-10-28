package com.codebutler.android_websockets;

import androidx.content.preferences.protobuf.r;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.UnsupportedEncodingException;

/* compiled from: Base64.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f47524a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f47525b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f47526c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f47527d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f47528e = 8;

    /* renamed from: f, reason: collision with root package name */
    public static final int f47529f = 16;

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ boolean f47530g = false;

    /* compiled from: Base64.java */
    /* renamed from: com.codebutler.android_websockets.a$a, reason: collision with other inner class name */
    static abstract class AbstractC0767a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f47531a;

        /* renamed from: b, reason: collision with root package name */
        public int f47532b;

        AbstractC0767a() {
        }

        public abstract int a(int i4);

        public abstract boolean b(byte[] bArr, int i4, int i5, boolean z4);
    }

    /* compiled from: Base64.java */
    static class b extends AbstractC0767a {

        /* renamed from: f, reason: collision with root package name */
        private static final int[] f47533f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: g, reason: collision with root package name */
        private static final int[] f47534g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: h, reason: collision with root package name */
        private static final int f47535h = -1;

        /* renamed from: i, reason: collision with root package name */
        private static final int f47536i = -2;

        /* renamed from: c, reason: collision with root package name */
        private int f47537c;

        /* renamed from: d, reason: collision with root package name */
        private int f47538d;

        /* renamed from: e, reason: collision with root package name */
        private final int[] f47539e;

        public b(int i4, byte[] bArr) {
            this.f47531a = bArr;
            this.f47539e = (i4 & 8) == 0 ? f47533f : f47534g;
            this.f47537c = 0;
            this.f47538d = 0;
        }

        @Override // com.codebutler.android_websockets.a.AbstractC0767a
        public int a(int i4) {
            return r.a(i4, 3, 4, 10);
        }

        @Override // com.codebutler.android_websockets.a.AbstractC0767a
        public boolean b(byte[] bArr, int i4, int i5, boolean z4) {
            int i6 = this.f47537c;
            if (i6 == 6) {
                return false;
            }
            int i7 = i5 + i4;
            int i10 = this.f47538d;
            byte[] bArr2 = this.f47531a;
            int[] iArr = this.f47539e;
            int i11 = 0;
            int i12 = i10;
            int i13 = i6;
            int i14 = i4;
            while (i14 < i7) {
                if (i13 == 0) {
                    while (true) {
                        int i15 = i14 + 4;
                        if (i15 > i7 || (i12 = (iArr[bArr[i14] & 255] << 18) | (iArr[bArr[i14 + 1] & 255] << 12) | (iArr[bArr[i14 + 2] & 255] << 6) | iArr[bArr[i14 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i11 + 2] = (byte) i12;
                        bArr2[i11 + 1] = (byte) (i12 >> 8);
                        bArr2[i11] = (byte) (i12 >> 16);
                        i11 += 3;
                        i14 = i15;
                    }
                    if (i14 >= i7) {
                        break;
                    }
                }
                int i16 = i14 + 1;
                int i17 = iArr[bArr[i14] & 255];
                if (i13 != 0) {
                    if (i13 == 1) {
                        if (i17 < 0) {
                            if (i17 != -1) {
                                this.f47537c = 6;
                                return false;
                            }
                        }
                        i17 |= i12 << 6;
                    } else if (i13 == 2) {
                        if (i17 < 0) {
                            if (i17 == -2) {
                                bArr2[i11] = (byte) (i12 >> 4);
                                i11++;
                                i13 = 4;
                            } else if (i17 != -1) {
                                this.f47537c = 6;
                                return false;
                            }
                        }
                        i17 |= i12 << 6;
                    } else if (i13 != 3) {
                        if (i13 != 4) {
                            if (i13 == 5 && i17 != -1) {
                                this.f47537c = 6;
                                return false;
                            }
                        } else if (i17 == -2) {
                            i13++;
                        } else if (i17 != -1) {
                            this.f47537c = 6;
                            return false;
                        }
                    } else if (i17 >= 0) {
                        int i18 = i17 | (i12 << 6);
                        bArr2[i11 + 2] = (byte) i18;
                        bArr2[i11 + 1] = (byte) (i18 >> 8);
                        bArr2[i11] = (byte) (i18 >> 16);
                        i11 += 3;
                        i12 = i18;
                        i13 = 0;
                    } else if (i17 == -2) {
                        bArr2[i11 + 1] = (byte) (i12 >> 2);
                        bArr2[i11] = (byte) (i12 >> 10);
                        i11 += 2;
                        i13 = 5;
                    } else if (i17 != -1) {
                        this.f47537c = 6;
                        return false;
                    }
                    i13++;
                    i12 = i17;
                } else {
                    if (i17 < 0) {
                        if (i17 != -1) {
                            this.f47537c = 6;
                            return false;
                        }
                    }
                    i13++;
                    i12 = i17;
                }
                i14 = i16;
            }
            if (!z4) {
                this.f47537c = i13;
                this.f47538d = i12;
                this.f47532b = i11;
                return true;
            }
            if (i13 == 1) {
                this.f47537c = 6;
                return false;
            }
            if (i13 == 2) {
                bArr2[i11] = (byte) (i12 >> 4);
                i11++;
            } else if (i13 == 3) {
                int i19 = i11 + 1;
                bArr2[i11] = (byte) (i12 >> 10);
                i11 += 2;
                bArr2[i19] = (byte) (i12 >> 2);
            } else if (i13 == 4) {
                this.f47537c = 6;
                return false;
            }
            this.f47537c = i13;
            this.f47532b = i11;
            return true;
        }
    }

    /* compiled from: Base64.java */
    static class c extends AbstractC0767a {

        /* renamed from: j, reason: collision with root package name */
        public static final int f47540j = 19;

        /* renamed from: k, reason: collision with root package name */
        private static final byte[] f47541k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: l, reason: collision with root package name */
        private static final byte[] f47542l = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: m, reason: collision with root package name */
        static final /* synthetic */ boolean f47543m = false;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f47544c;

        /* renamed from: d, reason: collision with root package name */
        int f47545d;

        /* renamed from: e, reason: collision with root package name */
        private int f47546e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f47547f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f47548g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f47549h;

        /* renamed from: i, reason: collision with root package name */
        private final byte[] f47550i;

        public c(int i4, byte[] bArr) {
            this.f47531a = bArr;
            this.f47547f = (i4 & 1) == 0;
            boolean z4 = (i4 & 2) == 0;
            this.f47548g = z4;
            this.f47549h = (i4 & 4) != 0;
            this.f47550i = (i4 & 8) == 0 ? f47541k : f47542l;
            this.f47544c = new byte[2];
            this.f47545d = 0;
            this.f47546e = z4 ? 19 : -1;
        }

        @Override // com.codebutler.android_websockets.a.AbstractC0767a
        public int a(int i4) {
            return r.a(i4, 8, 5, 10);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00e6 A[SYNTHETIC] */
        @Override // com.codebutler.android_websockets.a.AbstractC0767a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean b(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 481
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.codebutler.android_websockets.a.c.b(byte[], int, int, boolean):boolean");
        }
    }

    private a() {
    }

    public static byte[] a(String str, int i4) {
        byte[] bytes = str.getBytes();
        return c(bytes, 0, bytes.length, i4);
    }

    public static byte[] b(byte[] bArr, int i4) {
        return c(bArr, 0, bArr.length, i4);
    }

    public static byte[] c(byte[] bArr, int i4, int i5, int i6) {
        b bVar = new b(i6, new byte[(i5 * 3) / 4]);
        if (!bVar.b(bArr, i4, i5, true)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("༟"));
        }
        int i7 = bVar.f47532b;
        byte[] bArr2 = bVar.f47531a;
        if (i7 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i7];
        System.arraycopy(bArr2, 0, bArr3, 0, i7);
        return bArr3;
    }

    public static byte[] d(byte[] bArr, int i4) {
        return e(bArr, 0, bArr.length, i4);
    }

    public static byte[] e(byte[] bArr, int i4, int i5, int i6) {
        c cVar = new c(i6, null);
        int i7 = (i5 / 3) * 4;
        if (!cVar.f47547f) {
            int i10 = i5 % 3;
            if (i10 == 1) {
                i7 += 2;
            } else if (i10 == 2) {
                i7 += 3;
            }
        } else if (i5 % 3 > 0) {
            i7 += 4;
        }
        if (cVar.f47548g && i5 > 0) {
            i7 += androidx.appcompat.widget.a.a(i5, 1, 57, 1) * (cVar.f47549h ? 2 : 1);
        }
        cVar.f47531a = new byte[i7];
        cVar.b(bArr, i4, i5, true);
        return cVar.f47531a;
    }

    public static String f(byte[] bArr, int i4) {
        try {
            return new String(e(bArr, 0, bArr.length, i4), ProtectedSandApp.s("༠"));
        } catch (UnsupportedEncodingException e4) {
            throw new AssertionError(e4);
        }
    }

    public static String g(byte[] bArr, int i4, int i5, int i6) {
        try {
            return new String(e(bArr, i4, i5, i6), ProtectedSandApp.s("༠"));
        } catch (UnsupportedEncodingException e4) {
            throw new AssertionError(e4);
        }
    }
}
