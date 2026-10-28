package com.tencent.cos.xml.utils;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes7.dex */
public class DateUtils {
    private static final String GMT_TIME_FORMAT = ProtectedSandApp.s("僢\u0001");

    public static String getFormatTime(String str, long j4) {
        return new SimpleDateFormat(str, Locale.ENGLISH).format(new Date(j4));
    }

    public static Date toDate(String str) throws CosXmlClientException {
        try {
            return new SimpleDateFormat(ProtectedSandApp.s("僢\u0001"), Locale.ENGLISH).parse(str);
        } catch (ParseException e4) {
            throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), e4);
        }
    }

    public static String toString(Date date) {
        return new SimpleDateFormat(ProtectedSandApp.s("僢\u0001"), Locale.ENGLISH).format(date);
    }

    public static String toString(long j4) {
        return new SimpleDateFormat(ProtectedSandApp.s("僢\u0001"), Locale.ENGLISH).format(new Date(j4));
    }
}
