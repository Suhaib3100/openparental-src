package okhttp3.internal.platform;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okhttp3.c0;

/* compiled from: Jdk8WithJettyBootPlatform.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001d¨\u0006!"}, d2 = {"Lokhttp3/internal/platform/e;", "Lokhttp3/internal/platform/j;", "Ljava/lang/reflect/Method;", "putMethod", "getMethod", "removeMethod", "Ljava/lang/Class;", "clientProviderClass", "serverProviderClass", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/c0;", "protocols", "Lkotlin/k2;", "f", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "c", "(Ljavax/net/ssl/SSLSocket;)V", "j", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/lang/reflect/Method;", "g", "h", "i", "Ljava/lang/Class;", "k", "a", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class e extends j {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Method putMethod;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Method getMethod;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Method removeMethod;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Class<?> clientProviderClass;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Class<?> serverProviderClass;

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J2\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0010\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/platform/e$a;", "Ljava/lang/reflect/InvocationHandler;", "", "", "protocols", "<init>", "(Ljava/util/List;)V", "", "proxy", "Ljava/lang/reflect/Method;", "method", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "", "a", "Z", "b", "()Z", "d", "(Z)V", "unsupported", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "(Ljava/lang/String;)V", "selected", "Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 4, 0})
    private static final class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean unsupported;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @m
        private String selected;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<String> protocols;

        public a(@l List<String> list) {
            l0.p(list, ProtectedSandApp.s("Ḳ"));
            this.protocols = list;
        }

        @m
        /* renamed from: a, reason: from getter */
        public final String getSelected() {
            return this.selected;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getUnsupported() {
            return this.unsupported;
        }

        public final void c(@m String str) {
            this.selected = str;
        }

        public final void d(boolean z4) {
            this.unsupported = z4;
        }

        @Override // java.lang.reflect.InvocationHandler
        @m
        public Object invoke(@l Object proxy, @l Method method, @m Object[] args) throws Throwable {
            l0.p(proxy, ProtectedSandApp.s("ḳ"));
            l0.p(method, ProtectedSandApp.s("Ḵ"));
            if (args == null) {
                args = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (l0.g(name, ProtectedSandApp.s("ḵ")) && l0.g(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (l0.g(name, ProtectedSandApp.s("Ḷ")) && l0.g(Void.TYPE, returnType)) {
                this.unsupported = true;
                return null;
            }
            if (l0.g(name, ProtectedSandApp.s("Ḳ")) && args.length == 0) {
                return this.protocols;
            }
            boolean g4 = l0.g(name, ProtectedSandApp.s("ḷ"));
            String s4 = ProtectedSandApp.s("Ḹ");
            if ((g4 || l0.g(name, ProtectedSandApp.s("ḹ"))) && l0.g(String.class, returnType) && args.length == 1) {
                Object obj = args[0];
                if (obj instanceof List) {
                    if (obj == null) {
                        throw new NullPointerException(ProtectedSandApp.s("Ḻ"));
                    }
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i4 = 0;
                        while (true) {
                            Object obj2 = list.get(i4);
                            if (obj2 == null) {
                                throw new NullPointerException(s4);
                            }
                            String str = (String) obj2;
                            if (!this.protocols.contains(str)) {
                                if (i4 == size) {
                                    break;
                                }
                                i4++;
                            } else {
                                this.selected = str;
                                return str;
                            }
                        }
                    }
                    String str2 = this.protocols.get(0);
                    this.selected = str2;
                    return str2;
                }
            }
            if ((!l0.g(name, ProtectedSandApp.s("ḻ")) && !l0.g(name, ProtectedSandApp.s("Ḽ"))) || args.length != 1) {
                return method.invoke(this, Arrays.copyOf(args, args.length));
            }
            Object obj3 = args[0];
            if (obj3 == null) {
                throw new NullPointerException(s4);
            }
            this.selected = (String) obj3;
            return null;
        }
    }

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/platform/e$b;", "", "<init>", "()V", "Lokhttp3/internal/platform/j;", "a", "()Lokhttp3/internal/platform/j;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.platform.e$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @m
        public final j a() {
            String property = System.getProperty(ProtectedSandApp.s("ḽ"), ProtectedSandApp.s("Ḿ"));
            try {
                l0.o(property, ProtectedSandApp.s("ḿ"));
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName(ProtectedSandApp.s("Ṁ"), true, null);
                Class<?> cls2 = Class.forName(ProtectedSandApp.s("ṁ"), true, null);
                Class<?> cls3 = Class.forName(ProtectedSandApp.s("Ṃ"), true, null);
                Class<?> cls4 = Class.forName(ProtectedSandApp.s("ṃ"), true, null);
                Method method = cls.getMethod(ProtectedSandApp.s("Ṅ"), SSLSocket.class, cls2);
                Method method2 = cls.getMethod(ProtectedSandApp.s("ṅ"), SSLSocket.class);
                Method method3 = cls.getMethod(ProtectedSandApp.s("Ṇ"), SSLSocket.class);
                l0.o(method, ProtectedSandApp.s("ṇ"));
                l0.o(method2, ProtectedSandApp.s("Ṉ"));
                l0.o(method3, ProtectedSandApp.s("ṉ"));
                l0.o(cls3, ProtectedSandApp.s("Ṋ"));
                l0.o(cls4, ProtectedSandApp.s("ṋ"));
                return new e(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        public Companion(w wVar) {
        }
    }

    public e(@l Method method, @l Method method2, @l Method method3, @l Class<?> cls, @l Class<?> cls2) {
        l0.p(method, ProtectedSandApp.s("Ṍ"));
        l0.p(method2, ProtectedSandApp.s("ṍ"));
        l0.p(method3, ProtectedSandApp.s("Ṏ"));
        l0.p(cls, ProtectedSandApp.s("ṏ"));
        l0.p(cls2, ProtectedSandApp.s("Ṑ"));
        this.putMethod = method;
        this.getMethod = method2;
        this.removeMethod = method3;
        this.clientProviderClass = cls;
        this.serverProviderClass = cls2;
    }

    @Override // okhttp3.internal.platform.j
    public void c(@l SSLSocket sslSocket) {
        String s4 = ProtectedSandApp.s("ṑ");
        l0.p(sslSocket, ProtectedSandApp.s("Ṓ"));
        try {
            this.removeMethod.invoke(null, sslSocket);
        } catch (IllegalAccessException e4) {
            throw new AssertionError(s4, e4);
        } catch (InvocationTargetException e5) {
            throw new AssertionError(s4, e5);
        }
    }

    @Override // okhttp3.internal.platform.j
    public void f(@l SSLSocket sslSocket, @m String hostname, @l List<? extends c0> protocols) {
        String s4 = ProtectedSandApp.s("ṓ");
        l0.p(sslSocket, ProtectedSandApp.s("Ṓ"));
        l0.p(protocols, ProtectedSandApp.s("Ṕ"));
        try {
            this.putMethod.invoke(null, sslSocket, Proxy.newProxyInstance(j.class.getClassLoader(), new Class[]{this.clientProviderClass, this.serverProviderClass}, new a(j.INSTANCE.b(protocols))));
        } catch (IllegalAccessException e4) {
            throw new AssertionError(s4, e4);
        } catch (InvocationTargetException e5) {
            throw new AssertionError(s4, e5);
        }
    }

    @Override // okhttp3.internal.platform.j
    @m
    public String j(@l SSLSocket sslSocket) {
        String s4 = ProtectedSandApp.s("ṕ");
        l0.p(sslSocket, ProtectedSandApp.s("Ṓ"));
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.getMethod.invoke(null, sslSocket));
            if (invocationHandler == null) {
                throw new NullPointerException(ProtectedSandApp.s("ṗ"));
            }
            a aVar = (a) invocationHandler;
            if (!aVar.getUnsupported() && aVar.getSelected() == null) {
                j.n(this, ProtectedSandApp.s("Ṗ"), 0, null, 6, null);
                return null;
            }
            if (aVar.getUnsupported()) {
                return null;
            }
            return aVar.getSelected();
        } catch (IllegalAccessException e4) {
            throw new AssertionError(s4, e4);
        } catch (InvocationTargetException e5) {
            throw new AssertionError(s4, e5);
        }
    }
}
