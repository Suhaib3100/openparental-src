package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzio {
    static String zza(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b5 : bArr) {
            if (b5 == 34) {
                sb.append(ProtectedSandApp.s("\ud82c"));
            } else if (b5 == 39) {
                sb.append(ProtectedSandApp.s("\ud82b"));
            } else if (b5 != 92) {
                switch (b5) {
                    case 7:
                        sb.append(ProtectedSandApp.s("\ud829"));
                        break;
                    case 8:
                        sb.append(ProtectedSandApp.s("\ud828"));
                        break;
                    case 9:
                        sb.append(ProtectedSandApp.s("\ud827"));
                        break;
                    case 10:
                        sb.append(ProtectedSandApp.s("\ud826"));
                        break;
                    case 11:
                        sb.append(ProtectedSandApp.s("\ud825"));
                        break;
                    case 12:
                        sb.append(ProtectedSandApp.s("\ud824"));
                        break;
                    case 13:
                        sb.append(ProtectedSandApp.s("\ud823"));
                        break;
                    default:
                        if (b5 < 32 || b5 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b5 >>> 6) & 3) + 48));
                            sb.append((char) (((b5 >>> 3) & 7) + 48));
                            sb.append((char) ((b5 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b5);
                            break;
                        }
                }
            } else {
                sb.append(ProtectedSandApp.s("\ud82a"));
            }
        }
        return sb.toString();
    }
}
