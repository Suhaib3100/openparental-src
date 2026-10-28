package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
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
import kotlin.jvm.internal.r1;

/* compiled from: FastServiceLoader.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\t\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0082\b¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0019*\u00020\u001a2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u00000\u001bH\u0082\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0000¢\u0006\u0004\b#\u0010$J1\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b%\u0010\u0011R\u0014\u0010'\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010&¨\u0006("}, d2 = {"Lkotlinx/coroutines/internal/o;", "", "<init>", "()V", "Ljava/lang/Class;", "Lkotlinx/coroutines/internal/c0;", "baseClass", "", "serviceClass", "a", "(Ljava/lang/Class;Ljava/lang/String;)Lkotlinx/coroutines/internal/c0;", "S", "service", "Ljava/lang/ClassLoader;", "loader", "", "c", "(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;", "name", "b", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/net/URL;", "url", "f", "(Ljava/net/URL;)Ljava/util/List;", "R", "Ljava/util/jar/JarFile;", "Lkotlin/Function1;", "block", "h", "(Ljava/util/jar/JarFile;Lld/l;)Ljava/lang/Object;", "Ljava/io/BufferedReader;", "r", "g", "(Ljava/io/BufferedReader;)Ljava/util/List;", "d", "()Ljava/util/List;", "e", "Ljava/lang/String;", "PREFIX", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFastServiceLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,161:1\n77#1,5:162\n77#1,5:168\n131#1,13:183\n1#2:167\n1360#3:173\n1446#3,5:174\n1549#3:179\n1620#3,3:180\n1064#4,2:196\n*S KotlinDebug\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoader\n*L\n60#1:162,5\n61#1:168,5\n117#1:183,13\n99#1:173\n99#1:174,5\n101#1:179\n101#1:180,3\n153#1:196,2\n*E\n"})
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final String PREFIX = ProtectedSandApp.s("蟶\u0001");

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final o f80801a = new o();

    private o() {
    }

    private final c0 a(Class<c0> baseClass, String serviceClass) {
        try {
            return baseClass.cast(Class.forName(serviceClass, true, baseClass.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final <S> S b(String name, ClassLoader loader, Class<S> service) {
        Class<?> cls = Class.forName(name, false, loader);
        if (service.isAssignableFrom(cls)) {
            return service.cast(cls.getDeclaredConstructor(null).newInstance(null));
        }
        throw new IllegalArgumentException((ProtectedSandApp.s("蟷\u0001") + service + ProtectedSandApp.s("蟸\u0001") + cls).toString());
    }

    private final <S> List<S> c(Class<S> service, ClassLoader loader) {
        try {
            return e(service, loader);
        } catch (Throwable unused) {
            return kotlin.collections.w.V5(ServiceLoader.load(service, loader));
        }
    }

    private final List<String> f(URL url) {
        BufferedReader bufferedReader;
        String url2 = url.toString();
        if (!kotlin.text.v.s2(url2, ProtectedSandApp.s("蟹\u0001"), false, 2, null)) {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> g4 = f80801a.g(bufferedReader);
                kotlin.io.b.a(bufferedReader, null);
                return g4;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        }
        String u5 = kotlin.text.v.u5(kotlin.text.v.n5(url2, ProtectedSandApp.s("蟺\u0001"), null, 2, null), '!', null, 2, null);
        String n5 = kotlin.text.v.n5(url2, ProtectedSandApp.s("蟻\u0001"), null, 2, null);
        JarFile jarFile = new JarFile(u5, false);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(n5)), ProtectedSandApp.s("蟼\u0001")));
            try {
                List<String> g5 = f80801a.g(bufferedReader);
                kotlin.io.b.a(bufferedReader, null);
                jarFile.close();
                return g5;
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
                    kotlin.o.a(th2, th4);
                    throw th2;
                }
            }
        }
    }

    private final List<String> g(BufferedReader r4) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = r4.readLine();
            if (readLine == null) {
                return kotlin.collections.w.V5(linkedHashSet);
            }
            String obj = kotlin.text.v.C5(kotlin.text.v.v5(readLine, ProtectedSandApp.s("蟽\u0001"), null, 2, null)).toString();
            for (int i4 = 0; i4 < obj.length(); i4++) {
                char charAt = obj.charAt(i4);
                if (charAt != '.' && !Character.isJavaIdentifierPart(charAt)) {
                    throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("蟾\u0001"), obj).toString());
                }
            }
            if (obj.length() > 0) {
                linkedHashSet.add(obj);
            }
        }
    }

    private final <R> R h(JarFile jarFile, ld.l<? super JarFile, ? extends R> lVar) {
        try {
            R invoke = lVar.invoke(jarFile);
            jarFile.close();
            return invoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    jarFile.close();
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.o.a(th, th3);
                    throw th;
                }
            }
        }
    }

    @fg.l
    public final List<c0> d() {
        c0 c0Var;
        if (!p.a()) {
            return c(c0.class, c0.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            c0 c0Var2 = null;
            try {
                c0Var = (c0) c0.class.cast(Class.forName(ProtectedSandApp.s("蟿\u0001"), true, c0.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
            } catch (ClassNotFoundException unused) {
                c0Var = null;
            }
            if (c0Var != null) {
                arrayList.add(c0Var);
            }
            try {
                c0Var2 = (c0) c0.class.cast(Class.forName(ProtectedSandApp.s("蠀\u0001"), true, c0.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
            } catch (ClassNotFoundException unused2) {
            }
            if (c0Var2 == null) {
                return arrayList;
            }
            arrayList.add(c0Var2);
            return arrayList;
        } catch (Throwable unused3) {
            return c(c0.class, c0.class.getClassLoader());
        }
    }

    @fg.l
    public final <S> List<S> e(@fg.l Class<S> service, @fg.l ClassLoader loader) {
        ArrayList list = Collections.list(loader.getResources(ProtectedSandApp.s("蟶\u0001").concat(service.getName())));
        kotlin.jvm.internal.l0.o(list, ProtectedSandApp.s("蠁\u0001"));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.w.q0(arrayList, f80801a.f((URL) it.next()));
        }
        Set a6 = kotlin.collections.w.a6(arrayList);
        if (a6.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("蠂\u0001"));
        }
        Set set = a6;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.w.b0(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f80801a.b((String) it2.next(), loader, service));
        }
        return arrayList2;
    }
}
