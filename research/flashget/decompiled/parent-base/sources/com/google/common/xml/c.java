package com.google.common.xml;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.escape.h;
import com.google.common.escape.i;
import kotlin.text.m0;
import okio.r0;
import org.apache.commons.lang3.m;

/* compiled from: XmlEscapers.java */
@a
@d9.b
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final char f58074a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final char f58075b = 31;

    /* renamed from: c, reason: collision with root package name */
    private static final h f58076c;

    /* renamed from: d, reason: collision with root package name */
    private static final h f58077d;

    /* renamed from: e, reason: collision with root package name */
    private static final h f58078e;

    static {
        i.c b5 = i.b();
        b5.d((char) 0, r0.f85266b);
        String s4 = ProtectedSandApp.s("祉");
        b5.e(s4);
        for (char c5 = 0; c5 <= 31; c5 = (char) (c5 + 1)) {
            if (c5 != '\t' && c5 != '\n' && c5 != '\r') {
                b5.b(c5, s4);
            }
        }
        b5.b(m0.amp, ProtectedSandApp.s("祈"));
        b5.b(m0.less, ProtectedSandApp.s("祐"));
        b5.b(m0.greater, ProtectedSandApp.s("祖"));
        f58077d = b5.c();
        b5.b('\'', ProtectedSandApp.s("祝"));
        b5.b(m0.quote, ProtectedSandApp.s("禍"));
        f58076c = b5.c();
        b5.b('\t', ProtectedSandApp.s("禎"));
        b5.b('\n', ProtectedSandApp.s("穀"));
        b5.b(m.f86065d, ProtectedSandApp.s("突"));
        f58078e = b5.c();
    }

    private c() {
    }

    public static h a() {
        return f58078e;
    }

    public static h b() {
        return f58077d;
    }
}
