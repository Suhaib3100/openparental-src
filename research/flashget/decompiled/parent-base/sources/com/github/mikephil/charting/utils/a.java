package com.github.mikephil.charting.utils;

import android.content.res.Resources;
import android.graphics.Color;
import com.android.internal.telephony.SmsConstants;
import com.android.internal.telephony.cdma.UserData;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.event.open.EventResult;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: ColorTemplate.java */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f50619a = 1122867;

    /* renamed from: b, reason: collision with root package name */
    public static final int f50620b = 1122868;

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f50621c = {Color.rgb(207, 248, 246), Color.rgb(148, 212, 212), Color.rgb(SyslogAppender.LOG_LOCAL1, 180, 187), Color.rgb(118, 174, 175), Color.rgb(42, 109, UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS)};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f50622d = {Color.rgb(217, 80, 138), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120), Color.rgb(106, 167, SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER), Color.rgb(53, 194, 209)};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f50623e = {Color.rgb(64, 89, 128), Color.rgb(149, 165, 124), Color.rgb(217, SyslogAppender.LOG_LOCAL7, 162), Color.rgb(191, SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER, SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER), Color.rgb(179, 48, 80)};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f50624f = {Color.rgb(193, 37, 82), Color.rgb(255, 102, 0), Color.rgb(245, EventResult.ERROR_CODE_OTHER, 0), Color.rgb(106, 150, 31), Color.rgb(179, 100, 53)};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f50625g = {Color.rgb(192, 255, SmsConstants.MAX_USER_DATA_BYTES), Color.rgb(255, 247, SmsConstants.MAX_USER_DATA_BYTES), Color.rgb(255, 208, SmsConstants.MAX_USER_DATA_BYTES), Color.rgb(SmsConstants.MAX_USER_DATA_BYTES, 234, 255), Color.rgb(255, SmsConstants.MAX_USER_DATA_BYTES, 157)};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f50626h = {e(ProtectedSandApp.s("쑗")), e(ProtectedSandApp.s("쑘")), e(ProtectedSandApp.s("쑙")), e(ProtectedSandApp.s("쑚"))};

    public static int a(int i4, int i5) {
        return (i4 & 16777215) | ((i5 & 255) << 24);
    }

    public static List<Integer> b(Resources resources, int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i4 : iArr) {
            arrayList.add(Integer.valueOf(resources.getColor(i4)));
        }
        return arrayList;
    }

    public static List<Integer> c(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i4 : iArr) {
            arrayList.add(Integer.valueOf(i4));
        }
        return arrayList;
    }

    public static int d() {
        return Color.rgb(51, 181, 229);
    }

    public static int e(String str) {
        int parseLong = (int) Long.parseLong(str.replace(ProtectedSandApp.s("쑛"), ""), 16);
        return Color.rgb((parseLong >> 16) & 255, (parseLong >> 8) & 255, parseLong & 255);
    }
}
