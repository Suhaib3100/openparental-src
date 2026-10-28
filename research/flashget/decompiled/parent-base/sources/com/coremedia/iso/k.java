package com.coremedia.iso;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PropertyBoxParserImpl.java */
/* loaded from: classes3.dex */
public class k extends a {

    /* renamed from: h, reason: collision with root package name */
    static String[] f47639h = new String[0];

    /* renamed from: c, reason: collision with root package name */
    Properties f47640c;

    /* renamed from: d, reason: collision with root package name */
    Pattern f47641d = Pattern.compile(ProtectedSandApp.s("ᒸ"));

    /* renamed from: e, reason: collision with root package name */
    StringBuilder f47642e = new StringBuilder();

    /* renamed from: f, reason: collision with root package name */
    ThreadLocal<String> f47643f = new ThreadLocal<>();

    /* renamed from: g, reason: collision with root package name */
    ThreadLocal<String[]> f47644g = new ThreadLocal<>();

    public k(String... strArr) {
        InputStream a5 = ProtectedSandApp.a(getClass(), ProtectedSandApp.s("ᒹ"));
        try {
            Properties properties = new Properties();
            this.f47640c = properties;
            try {
                properties.load(a5);
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                Enumeration<URL> resources = (contextClassLoader == null ? ClassLoader.getSystemClassLoader() : contextClassLoader).getResources(ProtectedSandApp.s("ᒺ"));
                while (resources.hasMoreElements()) {
                    InputStream openStream = resources.nextElement().openStream();
                    try {
                        this.f47640c.load(openStream);
                        openStream.close();
                    } catch (Throwable th) {
                        openStream.close();
                        throw th;
                    }
                }
                for (String str : strArr) {
                    this.f47640c.load(ProtectedSandApp.a(getClass(), str));
                }
                try {
                    a5.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        } catch (Throwable th2) {
            try {
                a5.close();
            } catch (IOException e6) {
                e6.printStackTrace();
            }
            throw th2;
        }
    }

    @Override // com.coremedia.iso.a
    public com.coremedia.iso.boxes.b b(String str, byte[] bArr, String str2) {
        c(str, bArr, str2);
        String[] strArr = this.f47644g.get();
        try {
            Class<?> cls = Class.forName(this.f47643f.get());
            if (strArr.length <= 0) {
                return (com.coremedia.iso.boxes.b) cls.newInstance();
            }
            Class<?>[] clsArr = new Class[strArr.length];
            Object[] objArr = new Object[strArr.length];
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (ProtectedSandApp.s("ᒻ").equals(strArr[i4])) {
                    objArr[i4] = bArr;
                    clsArr[i4] = byte[].class;
                } else if (ProtectedSandApp.s("ᒼ").equals(strArr[i4])) {
                    objArr[i4] = str;
                    clsArr[i4] = String.class;
                } else {
                    if (!ProtectedSandApp.s("ᒽ").equals(strArr[i4])) {
                        throw new InternalError(ProtectedSandApp.s("ᒾ") + strArr[i4]);
                    }
                    objArr[i4] = str2;
                    clsArr[i4] = String.class;
                }
            }
            return (com.coremedia.iso.boxes.b) cls.getConstructor(clsArr).newInstance(objArr);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException(e4);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (InstantiationException e6) {
            throw new RuntimeException(e6);
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void c(String str, byte[] bArr, String str2) {
        String property;
        if (bArr != null) {
            String s4 = ProtectedSandApp.s("ᒿ");
            if (!s4.equals(str)) {
                throw new RuntimeException(ProtectedSandApp.s("ᓃ"));
            }
            Properties properties = this.f47640c;
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᓀ"));
            sb.append(e.b(bArr).toUpperCase());
            String s5 = ProtectedSandApp.s("ᓁ");
            sb.append(s5);
            property = properties.getProperty(sb.toString());
            if (property == null) {
                property = this.f47640c.getProperty(String.valueOf(str2) + ProtectedSandApp.s("ᓂ") + e.c(bArr, 0).toUpperCase() + s5);
            }
            if (property == null) {
                property = this.f47640c.getProperty(s4);
            }
        } else {
            property = this.f47640c.getProperty(str);
            if (property == null) {
                StringBuilder sb2 = this.f47642e;
                sb2.append(str2);
                sb2.append('-');
                sb2.append(str);
                String sb3 = sb2.toString();
                this.f47642e.setLength(0);
                property = this.f47640c.getProperty(sb3);
            }
        }
        if (property == null) {
            property = this.f47640c.getProperty(ProtectedSandApp.s("ᓄ"));
        }
        if (property == null) {
            throw new RuntimeException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("ᓈ"), str));
        }
        if (!property.endsWith(ProtectedSandApp.s("ᓅ"))) {
            this.f47644g.set(f47639h);
            this.f47643f.set(property);
            return;
        }
        Matcher matcher = this.f47641d.matcher(property);
        if (!matcher.matches()) {
            throw new RuntimeException(ProtectedSandApp.s("ᓇ").concat(property));
        }
        this.f47643f.set(matcher.group(1));
        if (matcher.group(2).length() == 0) {
            this.f47644g.set(f47639h);
        } else {
            this.f47644g.set(matcher.group(2).length() > 0 ? matcher.group(2).split(ProtectedSandApp.s("ᓆ")) : new String[0]);
        }
    }

    public k(Properties properties) {
        this.f47640c = properties;
    }
}
