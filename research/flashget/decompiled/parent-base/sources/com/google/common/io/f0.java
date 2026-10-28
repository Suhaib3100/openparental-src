package com.google.common.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Resources.java */
@p
@d9.c
/* loaded from: classes6.dex */
public final class f0 {

    /* compiled from: Resources.java */
    class a implements w<List<String>> {

        /* renamed from: a, reason: collision with root package name */
        final List<String> f57117a = new ArrayList();

        a() {
        }

        @Override // com.google.common.io.w
        public boolean b(String str) {
            this.f57117a.add(str);
            return true;
        }

        @Override // com.google.common.io.w
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<String> a() {
            return this.f57117a;
        }
    }

    /* compiled from: Resources.java */
    private static final class b extends f {

        /* renamed from: a, reason: collision with root package name */
        private final URL f57118a;

        /* synthetic */ b(URL url, a aVar) {
            this(url);
        }

        @Override // com.google.common.io.f
        public InputStream m() throws IOException {
            return this.f57118a.openStream();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f57118a);
            return com.google.common.base.h.a(valueOf.length() + 24, ProtectedSandApp.s("\uf695"), valueOf, ProtectedSandApp.s("\uf696"));
        }

        private b(URL url) {
            url.getClass();
            this.f57118a = url;
        }
    }

    private f0() {
    }

    public static f a(URL url) {
        return new b(url, null);
    }

    public static j b(URL url, Charset charset) {
        return a(url).a(charset);
    }

    public static void c(URL url, OutputStream outputStream) throws IOException {
        a(url).g(outputStream);
    }

    @f9.a
    public static URL d(Class<?> cls, String str) {
        URL resource = cls.getResource(str);
        l0.y(resource != null, ProtectedSandApp.s("\uf697"), str, cls.getName());
        return resource;
    }

    @f9.a
    public static URL e(String str) {
        URL resource = ((ClassLoader) com.google.common.base.d0.a(Thread.currentThread().getContextClassLoader(), f0.class.getClassLoader())).getResource(str);
        l0.u(resource != null, ProtectedSandApp.s("\uf698"), str);
        return resource;
    }

    @c0
    @f9.a
    public static <T> T f(URL url, Charset charset, w<T> wVar) throws IOException {
        return (T) b(url, charset).q(wVar);
    }

    public static List<String> g(URL url, Charset charset) throws IOException {
        return (List) f(url, charset, new a());
    }

    public static byte[] h(URL url) throws IOException {
        return a(url).o();
    }

    public static String i(URL url, Charset charset) throws IOException {
        return b(url, charset).n();
    }
}
