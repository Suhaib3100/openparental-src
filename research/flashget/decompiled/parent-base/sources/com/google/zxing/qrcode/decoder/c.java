package com.google.zxing.qrcode.decoder;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DataMask.java */
/* loaded from: classes6.dex */
abstract class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c DATA_MASK_000;
    public static final c DATA_MASK_001;
    public static final c DATA_MASK_010;
    public static final c DATA_MASK_011;
    public static final c DATA_MASK_100;
    public static final c DATA_MASK_101;
    public static final c DATA_MASK_110;
    public static final c DATA_MASK_111;

    /* compiled from: DataMask.java */
    enum a extends c {
        a(String str, int i4) {
            super(str, i4, null);
        }

        @Override // com.google.zxing.qrcode.decoder.c
        boolean isMasked(int i4, int i5) {
            return ((i4 + i5) & 1) == 0;
        }
    }

    static {
        a aVar = new a(ProtectedSandApp.s("ల\u0001"), 0);
        DATA_MASK_000 = aVar;
        c cVar = new c(ProtectedSandApp.s("ళ\u0001"), 1) { // from class: com.google.zxing.qrcode.decoder.c.b
            {
                a aVar2 = null;
            }

            @Override // com.google.zxing.qrcode.decoder.c
            boolean isMasked(int i4, int i5) {
                return (i4 & 1) == 0;
            }
        };
        DATA_MASK_001 = cVar;
        c cVar2 = new c(ProtectedSandApp.s("ఴ\u0001"), 2) { // from class: com.google.zxing.qrcode.decoder.c.c
            {
                a aVar2 = null;
            }

            @Override // com.google.zxing.qrcode.decoder.c
            boolean isMasked(int i4, int i5) {
                return i5 % 3 == 0;
            }
        };
        DATA_MASK_010 = cVar2;
        c cVar3 = new c(ProtectedSandApp.s("వ\u0001"), 3) { // from class: com.google.zxing.qrcode.decoder.c.d
            {
                a aVar2 = null;
            }

            @Override // com.google.zxing.qrcode.decoder.c
            boolean isMasked(int i4, int i5) {
                return (i4 + i5) % 3 == 0;
            }
        };
        DATA_MASK_011 = cVar3;
        c cVar4 = new c(ProtectedSandApp.s("శ\u0001"), 4) { // from class: com.google.zxing.qrcode.decoder.c.e
            {
                a aVar2 = null;
            }

            @Override // com.google.zxing.qrcode.decoder.c
            boolean isMasked(int i4, int i5) {
                return (((i5 / 3) + (i4 / 2)) & 1) == 0;
            }
        };
        DATA_MASK_100 = cVar4;
        c cVar5 = new c(ProtectedSandApp.s("ష\u0001"), 5) { // from class: com.google.zxing.qrcode.decoder.c.f
            {
                a aVar2 = null;
            }

            @Override // com.google.zxing.qrcode.decoder.c
            boolean isMasked(int i4, int i5) {
                return (i4 * i5) % 6 == 0;
            }
        };
        DATA_MASK_101 = cVar5;
        c cVar6 = new c(ProtectedSandApp.s("స\u0001"), 6) { // from class: com.google.zxing.qrcode.decoder.c.g
            {
                a aVar2 = null;
            }

            @Override // com.google.zxing.qrcode.decoder.c
            boolean isMasked(int i4, int i5) {
                return (i4 * i5) % 6 < 3;
            }
        };
        DATA_MASK_110 = cVar6;
        c cVar7 = new c(ProtectedSandApp.s("హ\u0001"), 7) { // from class: com.google.zxing.qrcode.decoder.c.h
            {
                a aVar2 = null;
            }

            @Override // com.google.zxing.qrcode.decoder.c
            boolean isMasked(int i4, int i5) {
                return ((((i4 * i5) % 3) + (i4 + i5)) & 1) == 0;
            }
        };
        DATA_MASK_111 = cVar7;
        $VALUES = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
    }

    private c(String str, int i4) {
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    abstract boolean isMasked(int i4, int i5);

    final void unmaskBitMatrix(com.google.zxing.common.b bVar, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            for (int i6 = 0; i6 < i4; i6++) {
                if (isMasked(i5, i6)) {
                    bVar.e(i6, i5);
                }
            }
        }
    }

    /* synthetic */ c(String str, int i4, a aVar) {
        this(str, i4);
    }
}
