package com.google.zxing;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.oned.b0;
import com.google.zxing.oned.u;
import java.util.Map;

/* compiled from: MultiFormatWriter.java */
/* loaded from: classes6.dex */
public final class j implements r {

    /* compiled from: MultiFormatWriter.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62911a;

        static {
            int[] iArr = new int[com.google.zxing.a.values().length];
            f62911a = iArr;
            try {
                iArr[com.google.zxing.a.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62911a[com.google.zxing.a.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62911a[com.google.zxing.a.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62911a[com.google.zxing.a.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62911a[com.google.zxing.a.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62911a[com.google.zxing.a.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62911a[com.google.zxing.a.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f62911a[com.google.zxing.a.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f62911a[com.google.zxing.a.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f62911a[com.google.zxing.a.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f62911a[com.google.zxing.a.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f62911a[com.google.zxing.a.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f62911a[com.google.zxing.a.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // com.google.zxing.r
    public com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i4, int i5, Map<f, ?> map) throws WriterException {
        r lVar;
        switch (a.f62911a[aVar.ordinal()]) {
            case 1:
                lVar = new com.google.zxing.oned.l();
                break;
            case 2:
                lVar = new b0();
                break;
            case 3:
                lVar = new com.google.zxing.oned.j();
                break;
            case 4:
                lVar = new u();
                break;
            case 5:
                lVar = new com.google.zxing.qrcode.b();
                break;
            case 6:
                lVar = new com.google.zxing.oned.f();
                break;
            case 7:
                lVar = new com.google.zxing.oned.h();
                break;
            case 8:
                lVar = new com.google.zxing.oned.d();
                break;
            case 9:
                lVar = new com.google.zxing.oned.o();
                break;
            case 10:
                lVar = new ta.d();
                break;
            case 11:
                lVar = new com.google.zxing.oned.b();
                break;
            case 12:
                lVar = new qa.b();
                break;
            case 13:
                lVar = new oa.c();
                break;
            default:
                throw new IllegalArgumentException(ProtectedSandApp.s("હ\u0001").concat(String.valueOf(aVar)));
        }
        return lVar.a(str, aVar, i4, i5, map);
    }

    @Override // com.google.zxing.r
    public com.google.zxing.common.b b(String str, com.google.zxing.a aVar, int i4, int i5) throws WriterException {
        return a(str, aVar, i4, i5, null);
    }
}
