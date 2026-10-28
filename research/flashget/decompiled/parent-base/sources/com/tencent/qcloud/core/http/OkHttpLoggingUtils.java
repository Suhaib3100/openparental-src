package com.tencent.qcloud.core.http;

import android.support.v4.media.d;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.constraintlayout.core.e;
import com.flashget.kid.common.configs.log.o;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.http.HttpLoggingInterceptor;
import com.tencent.qcloud.core.util.OkhttpInternalUtils;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Map;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.u;
import okhttp3.x;
import okio.m;

/* loaded from: classes7.dex */
public class OkHttpLoggingUtils {
    private static final Charset UTF8 = Charset.forName(ProtectedSandApp.s("姢\u0001"));

    private static boolean bodyEncoded(u uVar) {
        String f4 = uVar.f(ProtectedSandApp.s("姣\u0001"));
        return (f4 == null || f4.equalsIgnoreCase(ProtectedSandApp.s("姤\u0001"))) ? false : true;
    }

    private static boolean isContentLengthTooLarge(long j4) {
        return j4 > PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
    }

    private static boolean isPlaintext(m mVar) {
        try {
            m mVar2 = new m();
            mVar.n(mVar2, 0L, mVar.size() < 64 ? mVar.size() : 64L);
            for (int i4 = 0; i4 < 16; i4++) {
                if (mVar2.t2()) {
                    return true;
                }
                int Z2 = mVar2.Z2();
                if (Character.isISOControl(Z2) && !Character.isWhitespace(Z2)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static void logMessage(String str, HttpLoggingInterceptor.Logger logger) {
        logger.logRequest(str);
    }

    public static void logQuicRequestHeaders(Map<String, String> map, HttpLoggingInterceptor.Logger logger) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            logger.logRequest(entry.getKey() + ProtectedSandApp.s("姥\u0001") + entry.getValue());
        }
    }

    public static void logRequest(d0 d0Var, c0 c0Var, HttpLoggingInterceptor.Level level, HttpLoggingInterceptor.Logger logger) throws IOException {
        boolean z4 = level == HttpLoggingInterceptor.Level.BODY;
        boolean z5 = z4 || level == HttpLoggingInterceptor.Level.HEADERS;
        e0 f4 = d0Var.f();
        boolean z6 = f4 != null;
        String str = ProtectedSandApp.s("姦\u0001") + d0Var.m() + ' ' + d0Var.q() + ' ' + c0Var;
        String s4 = ProtectedSandApp.s("姧\u0001");
        String s5 = ProtectedSandApp.s("姨\u0001");
        if (!z5 && z6) {
            StringBuilder a5 = e.a(str, s5);
            a5.append(f4.contentLength());
            a5.append(s4);
            str = a5.toString();
        }
        logger.logRequest(str);
        if (z5) {
            if (z6) {
                if (f4.getContentType() != null) {
                    logger.logRequest(ProtectedSandApp.s("姩\u0001") + f4.getContentType());
                }
                if (f4.contentLength() != -1) {
                    logger.logRequest(ProtectedSandApp.s("姪\u0001") + f4.contentLength());
                }
            }
            u k4 = d0Var.k();
            int size = k4.size();
            for (int i4 = 0; i4 < size; i4++) {
                String j4 = k4.j(i4);
                if (!ProtectedSandApp.s("姫\u0001").equalsIgnoreCase(j4) && !ProtectedSandApp.s("姬\u0001").equalsIgnoreCase(j4)) {
                    StringBuilder a6 = e.a(j4, ProtectedSandApp.s("姥\u0001"));
                    a6.append(k4.s(i4));
                    logger.logRequest(a6.toString());
                }
            }
            String s6 = ProtectedSandApp.s("姭\u0001");
            if (!z4 || !z6 || isContentLengthTooLarge(f4.contentLength())) {
                logger.logRequest(s6 + d0Var.m());
                return;
            }
            if (bodyEncoded(d0Var.k())) {
                logger.logRequest(s6 + d0Var.m() + ProtectedSandApp.s("姮\u0001"));
                return;
            }
            try {
                m mVar = new m();
                f4.writeTo(mVar);
                Charset charset = UTF8;
                x contentType = f4.getContentType();
                if (contentType != null) {
                    charset = contentType.f(charset);
                }
                logger.logRequest("");
                if (!isPlaintext(mVar)) {
                    logger.logRequest(s6 + d0Var.m() + ProtectedSandApp.s("姯\u0001") + f4.contentLength() + ProtectedSandApp.s("姰\u0001"));
                    return;
                }
                logger.logRequest(mVar.X2(charset));
                logger.logRequest(s6 + d0Var.m() + s5 + f4.contentLength() + s4);
            } catch (Exception unused) {
                logger.logRequest(s6 + d0Var.m());
            }
        }
    }

    public static void logResponse(f0 f0Var, long j4, HttpLoggingInterceptor.Level level, HttpLoggingInterceptor.Logger logger) {
        boolean z4 = level == HttpLoggingInterceptor.Level.BODY;
        boolean z5 = z4 || level == HttpLoggingInterceptor.Level.HEADERS;
        g0 o4 = f0Var.o();
        boolean z6 = o4 != null;
        long contentLength = z6 ? o4.getContentLength() : 0L;
        String a5 = contentLength != -1 ? o.a(contentLength, ProtectedSandApp.s("姱\u0001")) : ProtectedSandApp.s("姲\u0001");
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("姳\u0001"));
        sb.append(f0Var.u());
        sb.append(' ');
        sb.append(f0Var.getMessage());
        sb.append(' ');
        sb.append(f0Var.getRequest().q());
        sb.append(ProtectedSandApp.s("姨\u0001"));
        sb.append(j4);
        sb.append(ProtectedSandApp.s("姴\u0001"));
        sb.append(!z5 ? d.a(ProtectedSandApp.s("姵\u0001"), a5, ProtectedSandApp.s("姶\u0001")) : "");
        sb.append(')');
        logger.logResponse(f0Var, sb.toString());
        if (z5) {
            u headers = f0Var.getHeaders();
            int size = headers.size();
            for (int i4 = 0; i4 < size; i4++) {
                logger.logResponse(f0Var, headers.j(i4) + ProtectedSandApp.s("姥\u0001") + headers.s(i4));
            }
            String s4 = ProtectedSandApp.s("姷\u0001");
            if (!z4 || !OkhttpInternalUtils.hasBody(f0Var) || !z6 || isContentLengthTooLarge(contentLength)) {
                logger.logResponse(f0Var, s4);
                return;
            }
            if (bodyEncoded(f0Var.getHeaders())) {
                logger.logResponse(f0Var, ProtectedSandApp.s("姸\u0001"));
                return;
            }
            try {
                okio.o source = o4.getSource();
                source.h1(Long.MAX_VALUE);
                m r4 = source.r();
                Charset charset = UTF8;
                x f84143e = o4.getF84143e();
                if (f84143e != null) {
                    try {
                        charset = f84143e.f(charset);
                    } catch (UnsupportedCharsetException unused) {
                        logger.logResponse(f0Var, "");
                        logger.logResponse(f0Var, ProtectedSandApp.s("姹\u0001"));
                        logger.logResponse(f0Var, s4);
                        return;
                    }
                }
                if (!isPlaintext(r4)) {
                    logger.logResponse(f0Var, "");
                    logger.logResponse(f0Var, ProtectedSandApp.s("姺\u0001") + r4.size() + ProtectedSandApp.s("姰\u0001"));
                    return;
                }
                if (contentLength != 0) {
                    logger.logResponse(f0Var, "");
                    logger.logResponse(f0Var, r4.g().X2(charset));
                }
                logger.logResponse(f0Var, ProtectedSandApp.s("姻\u0001") + r4.size() + ProtectedSandApp.s("姧\u0001"));
            } catch (Exception unused2) {
                logger.logResponse(f0Var, s4);
            }
        }
    }
}
