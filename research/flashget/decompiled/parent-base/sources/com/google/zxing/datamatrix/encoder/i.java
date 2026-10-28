package com.google.zxing.datamatrix.encoder;

import com.android.internal.telephony.SmsConstants;
import com.android.internal.telephony.cdma.UserData;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.config.PictureConfig;
import org.apache.http.HttpStatus;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: ErrorCorrection.java */
/* loaded from: classes6.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    private static final int f62870c = 301;

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f62868a = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};

    /* renamed from: b, reason: collision with root package name */
    private static final int[][] f62869b = {new int[]{228, 48, 15, 111, 62}, new int[]{23, 68, 144, SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER, 240, 92, 254}, new int[]{28, 24, 185, 166, 223, 248, 116, 255, 110, 61}, new int[]{175, 138, HttpStatus.SC_RESET_CONTENT, 12, 194, SyslogAppender.LOG_LOCAL5, 39, 245, 60, 97, 120}, new int[]{41, SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER, 158, 91, 61, 42, 142, 213, 97, 178, 100, 242}, new int[]{156, 97, 192, 252, 95, 9, 157, 119, 138, 45, 18, 186, 83, 185}, new int[]{83, 195, 100, 39, PictureConfig.CHOOSE_REQUEST, 75, 66, 61, 241, 213, 109, 129, 94, 254, 225, 48, 90, PictureConfig.CHOOSE_REQUEST}, new int[]{15, 195, 244, 9, 233, 71, SyslogAppender.LOG_LOCAL5, 2, PictureConfig.CHOOSE_REQUEST, 160, SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER, 145, 253, 79, 108, 82, 27, 174, 186, 172}, new int[]{52, 190, 88, HttpStatus.SC_RESET_CONTENT, 109, 39, SyslogAppender.LOG_LOCAL6, 21, 155, 197, 251, 223, 155, 21, 5, 172, 254, 124, 12, 181, SyslogAppender.LOG_LOCAL7, 96, 50, 193}, new int[]{211, 231, 43, 97, 71, 96, 103, 174, 37, 151, 170, 53, 75, 34, 249, 121, 17, 138, 110, 213, 141, SyslogAppender.LOG_LOCAL1, 120, 151, 233, SyslogAppender.LOG_LOCAL5, 93, 255}, new int[]{245, 127, 242, 218, UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS, 250, 162, 181, 102, 120, 84, 179, 220, 251, 80, 182, 229, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, 175, SyslogAppender.LOG_LOCAL7, 59, 25, 225, 98, 81, 112}, new int[]{77, 193, 137, 31, 19, 38, 22, SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER, 247, 105, 122, 2, 245, UserData.IS91_MSG_TYPE_SHORT_MESSAGE, 242, 8, 175, 95, 100, 9, 167, 105, 214, 111, 57, 121, 21, 1, 253, 57, 54, 101, 248, 202, 69, 50, 150, 177, 226, 5, 9, 5}, new int[]{245, UserData.IS91_MSG_TYPE_CLI, 172, 223, 96, 32, 117, 22, 238, UserData.IS91_MSG_TYPE_SHORT_MESSAGE, 238, 231, HttpStatus.SC_RESET_CONTENT, PictureConfig.CHOOSE_REQUEST, 237, 87, 191, 106, 16, 147, 118, 23, 37, 90, 170, HttpStatus.SC_RESET_CONTENT, UserData.IS91_MSG_TYPE_SHORT_MESSAGE_FULL, 88, 120, 100, 66, 138, 186, 240, 82, 44, SyslogAppender.LOG_LOCAL6, 87, 187, 147, 160, 175, 69, 213, 92, 253, 225, 19}, new int[]{175, 9, 223, 238, 12, 17, 220, 208, 100, 29, 175, 170, 230, 192, 215, 235, 150, 159, 36, 223, 38, 200, UserData.IS91_MSG_TYPE_CLI, 54, 228, 146, 218, 234, 117, 203, 29, 232, 144, 238, 22, 150, 201, 117, 62, 207, 164, 13, 137, 245, 127, 67, 247, 28, 155, 43, 203, 107, 233, 53, 143, 46}, new int[]{242, 93, 169, 50, 144, 210, 39, 118, 202, PictureConfig.CHOOSE_REQUEST, 201, 189, 143, 108, 196, 37, 185, 112, SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER, 230, 245, 63, 197, 190, 250, 106, 185, 221, 175, 64, 114, 71, 161, 44, 147, 6, 27, 218, 51, 63, 87, 10, 40, UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS, PictureConfig.CHOOSE_REQUEST, 17, 163, 31, SyslogAppender.LOG_LOCAL6, 170, 4, 107, 232, 7, 94, 166, 224, 124, 86, 47, 11, 204}, new int[]{220, 228, 173, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, 127, 213, SyslogAppender.LOG_LOCAL1, 248, 180, 234, 197, 158, 177, 68, 122, 93, 213, 15, 160, 227, 236, 66, 139, SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER, 185, 202, 167, 179, 25, 220, 232, 96, 210, 231, SyslogAppender.LOG_LOCAL1, 223, 239, 181, 241, 59, 52, 172, 25, 49, 232, 211, 189, 64, 54, 108, SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER, UserData.IS91_MSG_TYPE_CLI, 63, 96, 103, 82, 186}};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f62871d = new int[256];

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f62872e = new int[255];

    static {
        int i4 = 1;
        for (int i5 = 0; i5 < 255; i5++) {
            f62872e[i5] = i4;
            f62871d[i4] = i5;
            i4 <<= 1;
            if (i4 >= 256) {
                i4 ^= 301;
            }
        }
    }

    private i() {
    }

    private static String a(CharSequence charSequence, int i4) {
        int i5;
        int i6;
        int i7 = 0;
        while (true) {
            int[] iArr = f62868a;
            if (i7 >= iArr.length) {
                i7 = -1;
                break;
            }
            if (iArr[i7] == i4) {
                break;
            }
            i7++;
        }
        if (i7 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("જ\u0001").concat(String.valueOf(i4)));
        }
        int[] iArr2 = f62869b[i7];
        char[] cArr = new char[i4];
        for (int i10 = 0; i10 < i4; i10++) {
            cArr[i10] = 0;
        }
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            int i12 = i4 - 1;
            int charAt = cArr[i12] ^ charSequence.charAt(i11);
            while (i12 > 0) {
                if (charAt == 0 || (i6 = iArr2[i12]) == 0) {
                    cArr[i12] = cArr[i12 - 1];
                } else {
                    char c5 = cArr[i12 - 1];
                    int[] iArr3 = f62872e;
                    int[] iArr4 = f62871d;
                    cArr[i12] = (char) (iArr3[(iArr4[charAt] + iArr4[i6]) % 255] ^ c5);
                }
                i12--;
            }
            if (charAt == 0 || (i5 = iArr2[0]) == 0) {
                cArr[0] = 0;
            } else {
                int[] iArr5 = f62872e;
                int[] iArr6 = f62871d;
                cArr[0] = (char) iArr5[(iArr6[charAt] + iArr6[i5]) % 255];
            }
        }
        char[] cArr2 = new char[i4];
        for (int i13 = 0; i13 < i4; i13++) {
            cArr2[i13] = cArr[(i4 - i13) - 1];
        }
        return String.valueOf(cArr2);
    }

    public static String b(String str, k kVar) {
        if (str.length() != kVar.b()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ઝ\u0001"));
        }
        StringBuilder sb = new StringBuilder(kVar.d() + kVar.b());
        sb.append(str);
        int g4 = kVar.g();
        if (g4 == 1) {
            sb.append(a(str, kVar.d()));
        } else {
            sb.setLength(sb.capacity());
            int[] iArr = new int[g4];
            int[] iArr2 = new int[g4];
            int i4 = 0;
            while (i4 < g4) {
                int i5 = i4 + 1;
                iArr[i4] = kVar.c(i5);
                iArr2[i4] = kVar.e(i5);
                i4 = i5;
            }
            for (int i6 = 0; i6 < g4; i6++) {
                StringBuilder sb2 = new StringBuilder(iArr[i6]);
                for (int i7 = i6; i7 < kVar.b(); i7 += g4) {
                    sb2.append(str.charAt(i7));
                }
                String a5 = a(sb2.toString(), iArr2[i6]);
                int i10 = 0;
                int i11 = i6;
                while (i11 < iArr2[i6] * g4) {
                    sb.setCharAt(kVar.b() + i11, a5.charAt(i10));
                    i11 += g4;
                    i10++;
                }
            }
        }
        return sb.toString();
    }
}
