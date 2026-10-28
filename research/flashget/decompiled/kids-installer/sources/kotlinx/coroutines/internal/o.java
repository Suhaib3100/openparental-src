package kotlinx.coroutines.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.Metadata;

/* compiled from: FastServiceLoader.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J!\u0010\u0007\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0082\bJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J3\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J.\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0014*\u00020\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00028\u00000\u0016H\u0082\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010!¨\u0006%"}, d2 = {"Lkotlinx/coroutines/internal/o;", "", "Ljava/lang/Class;", "Lkotlinx/coroutines/internal/d0;", "baseClass", "", "serviceClass", "a", "S", "service", "Ljava/lang/ClassLoader;", "loader", "", "c", "name", "b", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/net/URL;", "url", "f", "R", "Ljava/util/jar/JarFile;", "Lkotlin/Function1;", "block", "h", "(Ljava/util/jar/JarFile;Lq3/l;)Ljava/lang/Object;", "Ljava/io/BufferedReader;", "r", "g", "d", "()Ljava/util/List;", "e", "(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;", "Ljava/lang/String;", "PREFIX", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private static final String PREFIX = ProtectedSandApp.s("巠");

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final o f28735a = new o();

    private o() {
    }

    private final d0 a(Class<d0> baseClass, String serviceClass) {
        try {
            return baseClass.cast(Class.forName(serviceClass, true, baseClass.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final <S> S b(String name, ClassLoader loader, Class<S> service) {
        Class<?> cls = Class.forName(name, false, loader);
        if (service.isAssignableFrom(cls)) {
            return service.cast(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException((ProtectedSandApp.s("巡") + service + ProtectedSandApp.s("巢") + cls).toString());
    }

    private final <S> List<S> c(Class<S> service, ClassLoader loader) {
        List<S> V5;
        try {
            return e(service, loader);
        } catch (Throwable unused) {
            V5 = kotlin.collections.j0.V5(ServiceLoader.load(service, loader));
            return V5;
        }
    }

    private final List<String> f(URL url) {
        boolean s22;
        BufferedReader bufferedReader;
        String n5;
        String u5;
        String n52;
        String url2 = url.toString();
        s22 = kotlin.text.e0.s2(url2, ProtectedSandApp.s("巣"), false, 2, null);
        if (!s22) {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> g5 = f28735a.g(bufferedReader);
                kotlin.io.b.a(bufferedReader, null);
                return g5;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        }
        n5 = kotlin.text.h0.n5(url2, ProtectedSandApp.s("巤"), null, 2, null);
        u5 = kotlin.text.h0.u5(n5, '!', null, 2, null);
        n52 = kotlin.text.h0.n5(url2, ProtectedSandApp.s("工"), null, 2, null);
        JarFile jarFile = new JarFile(u5, false);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(n52)), ProtectedSandApp.s("左")));
            try {
                List<String> g6 = f28735a.g(bufferedReader);
                kotlin.io.b.a(bufferedReader, null);
                jarFile.close();
                return g6;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    jarFile.close();
                    throw th3;
                } catch (Throwable th4) {
                    kotlin.p.a(th2, th4);
                    throw th2;
                }
            }
        }
    }

    private final List<String> g(BufferedReader r5) {
        List<String> V5;
        String v5;
        CharSequence C5;
        boolean z5;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = r5.readLine();
            if (readLine == null) {
                V5 = kotlin.collections.j0.V5(linkedHashSet);
                return V5;
            }
            v5 = kotlin.text.h0.v5(readLine, ProtectedSandApp.s("巧"), null, 2, null);
            C5 = kotlin.text.h0.C5(v5);
            String obj = C5.toString();
            int i5 = 0;
            while (true) {
                if (i5 >= obj.length()) {
                    z5 = true;
                    break;
                }
                char charAt = obj.charAt(i5);
                if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                    z5 = false;
                    break;
                }
                i5++;
            }
            if (!z5) {
                throw new IllegalArgumentException(androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("巨"), obj).toString());
            }
            if (obj.length() > 0) {
                linkedHashSet.add(obj);
            }
        }
    }

    private final <R> R h(JarFile jarFile, q3.l<? super JarFile, ? extends R> lVar) {
        try {
            R N = lVar.N(jarFile);
            jarFile.close();
            return N;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    jarFile.close();
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.p.a(th, th3);
                    throw th;
                }
            }
        }
    }

    @d5.d
    public final List<d0> d() {
        d0 d0Var;
        if (!p.a()) {
            return c(d0.class, d0.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            d0 d0Var2 = null;
            try {
                d0Var = (d0) d0.class.cast(Class.forName(ProtectedSandApp.s("巩"), true, d0.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                d0Var = null;
            }
            if (d0Var != null) {
                arrayList.add(d0Var);
            }
            try {
                d0Var2 = (d0) d0.class.cast(Class.forName(ProtectedSandApp.s("巪"), true, d0.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (d0Var2 == null) {
                return arrayList;
            }
            arrayList.add(d0Var2);
            return arrayList;
        } catch (Throwable unused3) {
            return c(d0.class, d0.class.getClassLoader());
        }
    }

    @d5.d
    public final <S> List<S> e(@d5.d Class<S> service, @d5.d ClassLoader loader) {
        Set a6;
        int b02;
        ArrayList list = Collections.list(loader.getResources(ProtectedSandApp.s("巫").concat(service.getName())));
        kotlin.jvm.internal.l0.o(list, ProtectedSandApp.s("巬"));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.f0.q0(arrayList, f28735a.f((URL) it.next()));
        }
        a6 = kotlin.collections.j0.a6(arrayList);
        if (!(!a6.isEmpty())) {
            throw new IllegalArgumentException(ProtectedSandApp.s("巭").toString());
        }
        b02 = kotlin.collections.b0.b0(a6, 10);
        ArrayList arrayList2 = new ArrayList(b02);
        Iterator it2 = a6.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f28735a.b((String) it2.next(), loader, service));
        }
        return arrayList2;
    }
}
