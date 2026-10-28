package com.tencent.cos.xml.utils;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* loaded from: classes7.dex */
public class URLEncodeUtils {
    public static String cosPathEncode(String str) throws CosXmlClientException {
        String s4 = ProtectedSandApp.s("儂\u0001");
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        try {
            String[] split = str.split(s4, -1);
            int length = split.length;
            for (int i4 = 0; i4 < length; i4++) {
                if (i4 == 0 && "".equals(split[i4])) {
                    sb.append('/');
                } else {
                    if (length > 1 && i4 == length - 1 && "".equals(split[i4])) {
                        break;
                    }
                    if (!"".equals(split[i4])) {
                        String[] split2 = split[i4].split(ProtectedSandApp.s("儃\u0001"), -1);
                        int length2 = split2.length;
                        for (int i5 = 0; i5 < length2; i5++) {
                            String s5 = ProtectedSandApp.s("億\u0001");
                            if (i5 == 0 && "".equals(split2[i5])) {
                                sb.append(s5);
                            } else {
                                if (length2 > 1 && i5 == length2 - 1 && "".equals(split2[i5])) {
                                    break;
                                }
                                sb.append(URLEncoder.encode(split2[i5], ProtectedSandApp.s("儅\u0001")));
                                if (i5 != length2 - 1) {
                                    sb.append(s5);
                                }
                            }
                        }
                    }
                    if (i4 != length - 1) {
                        sb.append(s4);
                    }
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e4) {
            throw new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), e4);
        }
    }
}
