package com.tencent.qcloud.network.sonar.command;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public abstract class NetCommandTask<T> extends CommandTask<T> {
    protected static final String MATCH_TRACE_IP = ProtectedSandApp.s("嫭\u0001");
    protected static final String MATCH_PING_TIME = ProtectedSandApp.s("嫰\u0001");
    protected static final String MATCH_PING_TTL = ProtectedSandApp.s("嫮\u0001");
    protected static final String MATCH_TTL_EXCEEDED = ProtectedSandApp.s("嫯\u0001");
    protected static final String MATCH_PING_IP = ProtectedSandApp.s("嫬\u0001");

    protected String getIpFromMatcher(Matcher matcher) {
        String group = matcher.group();
        int indexOf = group.indexOf(40);
        return indexOf >= 0 ? group.substring(indexOf + 1) : group;
    }

    protected String getPingDelayFromMatcher(Matcher matcher) {
        String s4;
        if (matcher.find()) {
            s4 = matcher.group();
            if (!TextUtils.isEmpty(s4)) {
                s4 = s4.replace(ProtectedSandApp.s("嫪\u0001"), "");
            }
        } else {
            s4 = ProtectedSandApp.s("嫫\u0001");
        }
        return s4.trim();
    }

    protected String getPingTTLFromMatcher(Matcher matcher) {
        return (matcher.find() ? matcher.group() : ProtectedSandApp.s("嫫\u0001")).trim();
    }

    protected Matcher matcherIp(String str) {
        return Pattern.compile(ProtectedSandApp.s("嫬\u0001")).matcher(str);
    }

    protected Matcher matcherRouteNode(String str) {
        return Pattern.compile(ProtectedSandApp.s("嫭\u0001")).matcher(str);
    }

    protected Matcher matcherTTL(String str) {
        return Pattern.compile(ProtectedSandApp.s("嫮\u0001")).matcher(str);
    }

    protected Matcher matcherTTLExceeded(String str) {
        return Pattern.compile(ProtectedSandApp.s("嫯\u0001")).matcher(str);
    }

    protected Matcher matcherTime(String str) {
        return Pattern.compile(ProtectedSandApp.s("嫰\u0001")).matcher(str);
    }
}
