package com.google.common.reflect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import com.google.common.base.q0;
import com.google.common.base.r0;
import com.google.common.collect.e7;
import com.google.common.collect.f3;
import com.google.common.collect.h3;
import com.google.common.collect.o1;
import com.google.common.collect.q3;
import com.google.common.io.f0;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ClassPath.java */
@d
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final q3<C0880c> f57564a;

    /* renamed from: d, reason: collision with root package name */
    private static final String f57563d = ProtectedSandApp.s("契");

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f57561b = Logger.getLogger(c.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final q0 f57562c = q0.k(ProtectedSandApp.s("金")).g();

    /* compiled from: ClassPath.java */
    public static final class a extends C0880c {

        /* renamed from: d, reason: collision with root package name */
        private final String f57565d;

        a(File file, String str, ClassLoader classLoader) {
            super(file, str, classLoader);
            this.f57565d = c.e(str);
        }

        public String g() {
            return this.f57565d;
        }

        public String h() {
            return k.b(this.f57565d);
        }

        public String i() {
            int lastIndexOf = this.f57565d.lastIndexOf(36);
            if (lastIndexOf != -1) {
                return com.google.common.base.f.m('0', '9').V(this.f57565d.substring(lastIndexOf + 1));
            }
            String b5 = k.b(this.f57565d);
            return b5.isEmpty() ? this.f57565d : this.f57565d.substring(b5.length() + 1);
        }

        public boolean j() {
            return this.f57565d.indexOf(36) == -1;
        }

        public Class<?> k() {
            try {
                return this.f57570c.loadClass(this.f57565d);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(e4);
            }
        }

        @Override // com.google.common.reflect.c.C0880c
        public String toString() {
            return this.f57565d;
        }
    }

    /* compiled from: ClassPath.java */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final File f57566a;

        /* renamed from: b, reason: collision with root package name */
        private final ClassLoader f57567b;

        b(File file, ClassLoader classLoader) {
            file.getClass();
            this.f57566a = file;
            classLoader.getClass();
            this.f57567b = classLoader;
        }

        private void b(File file, Set<File> set, q3.a<C0880c> aVar) throws IOException {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        c(file, aVar);
                    } else {
                        e(file, set, aVar);
                    }
                }
            } catch (SecurityException e4) {
                Logger logger = c.f57561b;
                String valueOf = String.valueOf(file);
                String valueOf2 = String.valueOf(e4);
                logger.warning(com.google.common.base.e.a(valueOf2.length() + valueOf.length() + 16, ProtectedSandApp.s("滑"), valueOf, ProtectedSandApp.s("串"), valueOf2));
            }
        }

        private void c(File file, q3.a<C0880c> aVar) throws IOException {
            HashSet hashSet = new HashSet();
            hashSet.add(file.getCanonicalFile());
            d(file, "", hashSet, aVar);
        }

        private void d(File file, String str, Set<File> set, q3.a<C0880c> aVar) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                Logger logger = c.f57561b;
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(valueOf.length() + 22);
                sb.append(ProtectedSandApp.s("句"));
                sb.append(valueOf);
                logger.warning(sb.toString());
                return;
            }
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (file2.isDirectory()) {
                    File canonicalFile = file2.getCanonicalFile();
                    if (set.add(canonicalFile)) {
                        d(canonicalFile, com.google.common.base.h.a(com.google.android.gms.common.internal.b.a(name, com.google.android.gms.common.internal.b.a(str, 1)), str, name, ProtectedSandApp.s("龜")), set, aVar);
                        set.remove(canonicalFile);
                    }
                } else {
                    String valueOf2 = String.valueOf(str);
                    String valueOf3 = String.valueOf(name);
                    String concat = valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
                    if (!concat.equals(ProtectedSandApp.s("龜"))) {
                        aVar.a(C0880c.e(file2, concat, this.f57567b));
                    }
                }
            }
        }

        private void e(File file, Set<File> set, q3.a<C0880c> aVar) throws IOException {
            try {
                JarFile jarFile = new JarFile(file);
                try {
                    e7<File> it = c.h(file, jarFile.getManifest()).iterator();
                    while (it.hasNext()) {
                        File next = it.next();
                        if (set.add(next.getCanonicalFile())) {
                            b(next, set, aVar);
                        }
                    }
                    f(jarFile, aVar);
                    try {
                        jarFile.close();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th) {
                    try {
                        jarFile.close();
                    } catch (IOException unused2) {
                    }
                    throw th;
                }
            } catch (IOException unused3) {
            }
        }

        private void f(JarFile jarFile, q3.a<C0880c> aVar) {
            Enumeration<JarEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) {
                JarEntry nextElement = entries.nextElement();
                if (!nextElement.isDirectory() && !nextElement.getName().equals(ProtectedSandApp.s("龜"))) {
                    aVar.a(C0880c.e(new File(jarFile.getName()), nextElement.getName(), this.f57567b));
                }
            }
        }

        public final File a() {
            return this.f57566a;
        }

        public boolean equals(@zc.a Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f57566a.equals(bVar.f57566a) && this.f57567b.equals(bVar.f57567b);
        }

        public q3<C0880c> g() throws IOException {
            return h(new HashSet());
        }

        public q3<C0880c> h(Set<File> set) throws IOException {
            q3.a<C0880c> r4 = q3.r();
            set.add(this.f57566a);
            b(this.f57566a, set, r4);
            return r4.e();
        }

        public int hashCode() {
            return this.f57566a.hashCode();
        }

        public String toString() {
            return this.f57566a.toString();
        }
    }

    /* compiled from: ClassPath.java */
    /* renamed from: com.google.common.reflect.c$c, reason: collision with other inner class name */
    public static class C0880c {

        /* renamed from: a, reason: collision with root package name */
        private final File f57568a;

        /* renamed from: b, reason: collision with root package name */
        private final String f57569b;

        /* renamed from: c, reason: collision with root package name */
        final ClassLoader f57570c;

        C0880c(File file, String str, ClassLoader classLoader) {
            file.getClass();
            this.f57568a = file;
            str.getClass();
            this.f57569b = str;
            classLoader.getClass();
            this.f57570c = classLoader;
        }

        static C0880c e(File file, String str, ClassLoader classLoader) {
            return str.endsWith(ProtectedSandApp.s("賈")) ? new a(file, str, classLoader) : new C0880c(file, str, classLoader);
        }

        public final com.google.common.io.f a() {
            return f0.a(f());
        }

        public final com.google.common.io.j b(Charset charset) {
            return f0.b(f(), charset);
        }

        final File c() {
            return this.f57568a;
        }

        public final String d() {
            return this.f57569b;
        }

        public boolean equals(@zc.a Object obj) {
            if (!(obj instanceof C0880c)) {
                return false;
            }
            C0880c c0880c = (C0880c) obj;
            return this.f57569b.equals(c0880c.f57569b) && this.f57570c == c0880c.f57570c;
        }

        public final URL f() {
            URL resource = this.f57570c.getResource(this.f57569b);
            if (resource != null) {
                return resource;
            }
            throw new NoSuchElementException(this.f57569b);
        }

        public int hashCode() {
            return this.f57569b.hashCode();
        }

        public String toString() {
            return this.f57569b;
        }
    }

    private c(q3<C0880c> q3Var) {
        this.f57564a = q3Var;
    }

    public static c b(ClassLoader classLoader) throws IOException {
        q3<b> m4 = m(classLoader);
        HashSet hashSet = new HashSet();
        e7<b> it = m4.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().f57566a);
        }
        q3.a r4 = q3.r();
        e7<b> it2 = m4.iterator();
        while (it2.hasNext()) {
            r4.c(it2.next().h(hashSet));
        }
        return new c(r4.e());
    }

    private static f3<URL> d(ClassLoader classLoader) {
        return classLoader instanceof URLClassLoader ? f3.D(((URLClassLoader) classLoader).getURLs()) : classLoader.equals(ClassLoader.getSystemClassLoader()) ? n() : f3.H();
    }

    @d9.d
    static String e(String str) {
        return str.substring(0, str.length() - 6).replace('/', '.');
    }

    @d9.d
    static h3<File, ClassLoader> f(ClassLoader classLoader) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ClassLoader parent = classLoader.getParent();
        if (parent != null) {
            linkedHashMap.putAll(f(parent));
        }
        e7<URL> it = d(classLoader).iterator();
        while (it.hasNext()) {
            URL next = it.next();
            if (next.getProtocol().equals(ProtectedSandApp.s("喇"))) {
                File o4 = o(next);
                if (!linkedHashMap.containsKey(o4)) {
                    linkedHashMap.put(o4, classLoader);
                }
            }
        }
        return h3.i(linkedHashMap);
    }

    @d9.d
    static URL g(File file, String str) throws MalformedURLException {
        return new URL(file.toURI().toURL(), str);
    }

    @d9.d
    static q3<File> h(File file, @zc.a Manifest manifest) {
        if (manifest == null) {
            return q3.I();
        }
        q3.a r4 = q3.r();
        String value = manifest.getMainAttributes().getValue(Attributes.Name.CLASS_PATH.toString());
        if (value != null) {
            for (String str : f57562c.n(value)) {
                try {
                    URL g4 = g(file, str);
                    if (g4.getProtocol().equals(ProtectedSandApp.s("喇"))) {
                        r4.a(o(g4));
                    }
                } catch (MalformedURLException unused) {
                    Logger logger = f57561b;
                    String valueOf = String.valueOf(str);
                    int length = valueOf.length();
                    String s4 = ProtectedSandApp.s("奈");
                    logger.warning(length != 0 ? s4.concat(valueOf) : new String(s4));
                }
            }
        }
        return r4.e();
    }

    static q3<b> m(ClassLoader classLoader) {
        q3.a r4 = q3.r();
        e7<Map.Entry<File, ClassLoader>> it = f(classLoader).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<File, ClassLoader> next = it.next();
            r4.a(new b(next.getKey(), next.getValue()));
        }
        return r4.e();
    }

    @d9.d
    static f3<URL> n() {
        f3.a r4 = f3.r();
        for (String str : q0.k(r0.PATH_SEPARATOR.value()).n(r0.JAVA_CLASS_PATH.value())) {
            try {
                try {
                    r4.j(new File(str).toURI().toURL());
                } catch (SecurityException unused) {
                    r4.j(new URL(ProtectedSandApp.s("喇"), (String) null, new File(str).getAbsolutePath()));
                }
            } catch (MalformedURLException e4) {
                Logger logger = f57561b;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(str);
                int length = valueOf.length();
                String s4 = ProtectedSandApp.s("懶");
                logger.log(level, length != 0 ? s4.concat(valueOf) : new String(s4), (Throwable) e4);
            }
        }
        return r4.e();
    }

    @d9.d
    static File o(URL url) {
        l0.d(url.getProtocol().equals(ProtectedSandApp.s("喇")));
        try {
            return new File(url.toURI());
        } catch (URISyntaxException unused) {
            return new File(url.getPath());
        }
    }

    public q3<a> c() {
        return o1.F(this.f57564a).w(a.class).W();
    }

    public q3<C0880c> i() {
        return this.f57564a;
    }

    public q3<a> j() {
        return o1.F(this.f57564a).w(a.class).v(new com.google.common.reflect.b()).W();
    }

    public q3<a> k(String str) {
        str.getClass();
        q3.a r4 = q3.r();
        e7<a> it = j().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.h().equals(str)) {
                r4.a(next);
            }
        }
        return r4.e();
    }

    public q3<a> l(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder(str.length() + 1);
        sb.append(str);
        sb.append('.');
        String sb2 = sb.toString();
        q3.a r4 = q3.r();
        e7<a> it = j().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.g().startsWith(sb2)) {
                r4.a(next);
            }
        }
        return r4.e();
    }
}
