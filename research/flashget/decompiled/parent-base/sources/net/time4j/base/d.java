package net.time4j.base;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.ServiceLoader;

/* compiled from: ResourceLoader.java */
/* loaded from: classes7.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f81888a = ProtectedSandApp.s("览\u0001");

    /* renamed from: b, reason: collision with root package name */
    public static final String f81889b = ProtectedSandApp.s("觉\u0001");

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f81890c;

    /* renamed from: d, reason: collision with root package name */
    private static final d f81891d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f81892e;

    /* compiled from: ResourceLoader.java */
    private static class a extends d {
        a() {
            if (d.f81890c) {
                throw new IllegalStateException(ProtectedSandApp.s("訉\u0001"));
            }
        }

        @Override // net.time4j.base.d
        public InputStream e(URI uri, boolean z4) {
            if (uri != null && !d.f81892e) {
                try {
                    URL url = uri.toURL();
                    if (!z4) {
                        return url.openStream();
                    }
                    URLConnection openConnection = url.openConnection();
                    openConnection.setUseCaches(false);
                    openConnection.connect();
                    return openConnection.getInputStream();
                } catch (IOException e4) {
                    if (uri.toString().contains(ProtectedSandApp.s("訊\u0001"))) {
                        PrintStream printStream = System.err;
                        printStream.println(ProtectedSandApp.s("訋\u0001") + uri + ProtectedSandApp.s("訌\u0001") + e4.getMessage() + ProtectedSandApp.s("訍\u0001"));
                        e4.printStackTrace(printStream);
                    }
                }
            }
            return null;
        }

        @Override // net.time4j.base.d
        public URI f(String str, Class<?> cls, String str2) {
            String str3;
            String s4 = ProtectedSandApp.s("討\u0001");
            try {
                try {
                    ProtectionDomain protectionDomain = cls.getProtectionDomain();
                    CodeSource codeSource = protectionDomain == null ? null : protectionDomain.getCodeSource();
                    if (codeSource != null) {
                        str3 = codeSource.getLocation().toExternalForm();
                        try {
                            if (str3.endsWith(ProtectedSandApp.s("訏\u0001"))) {
                                str3 = s4 + str3 + ProtectedSandApp.s("訐\u0001");
                            }
                            str3 = str3 + str2;
                            return new URI(str3);
                        } catch (URISyntaxException unused) {
                            System.err.println(ProtectedSandApp.s("訑\u0001") + str3);
                            return null;
                        }
                    }
                } catch (SecurityException unused2) {
                }
            } catch (URISyntaxException unused3) {
                str3 = null;
            }
            return null;
        }

        @Override // net.time4j.base.d
        public <S> Iterable<S> g(Class<S> cls) {
            return ServiceLoader.load(cls, cls.getClassLoader());
        }
    }

    static {
        boolean equalsIgnoreCase = ProtectedSandApp.s("觋\u0001").equalsIgnoreCase(System.getProperty(ProtectedSandApp.s("觊\u0001")));
        f81890c = equalsIgnoreCase;
        f81892e = !equalsIgnoreCase && Boolean.getBoolean(ProtectedSandApp.s("觉\u0001"));
        String property = System.getProperty(ProtectedSandApp.s("览\u0001"));
        if (property == null) {
            f81891d = new a();
            return;
        }
        try {
            f81891d = (d) Class.forName(property).newInstance();
        } catch (Exception e4) {
            throw new AssertionError(ProtectedSandApp.s("觌\u0001") + e4.getMessage());
        }
    }

    protected d() {
    }

    public static d c() {
        return f81891d;
    }

    public final InputStream d(Class<?> cls, String str, boolean z4) throws IOException {
        if (f81890c) {
            throw new FileNotFoundException(str);
        }
        URL resource = cls.getClassLoader().getResource(str);
        if (resource == null) {
            throw new FileNotFoundException(str);
        }
        if (!z4) {
            return resource.openStream();
        }
        URLConnection openConnection = resource.openConnection();
        openConnection.setUseCaches(false);
        openConnection.connect();
        return openConnection.getInputStream();
    }

    public abstract InputStream e(URI uri, boolean z4);

    public abstract URI f(String str, Class<?> cls, String str2);

    public abstract <S> Iterable<S> g(Class<S> cls);
}
