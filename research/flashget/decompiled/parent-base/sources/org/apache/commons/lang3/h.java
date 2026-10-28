package org.apache.commons.lang3;

import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;

/* compiled from: CharEncoding.java */
@Deprecated
/* loaded from: classes6.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f86004a = "ISO-8859-1";

    /* renamed from: b, reason: collision with root package name */
    public static final String f86005b = "US-ASCII";

    /* renamed from: c, reason: collision with root package name */
    public static final String f86006c = "UTF-16";

    /* renamed from: d, reason: collision with root package name */
    public static final String f86007d = "UTF-16BE";

    /* renamed from: e, reason: collision with root package name */
    public static final String f86008e = "UTF-16LE";

    /* renamed from: f, reason: collision with root package name */
    public static final String f86009f = "UTF-8";

    @Deprecated
    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        try {
            return Charset.isSupported(str);
        } catch (IllegalCharsetNameException unused) {
            return false;
        }
    }
}
