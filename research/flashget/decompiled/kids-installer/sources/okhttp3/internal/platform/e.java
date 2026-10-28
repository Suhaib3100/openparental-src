package okhttp3.internal.platform;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
import okhttp3.d0;

/* compiled from: Jdk8WithJettyBootPlatform.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001dB7\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0014\u0012\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0018\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/platform/e;", "Lokhttp3/internal/platform/j;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/d0;", "protocols", "Lkotlin/m2;", "f", "c", "j", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "putMethod", "g", "getMethod", "h", "removeMethod", "Ljava/lang/Class;", "i", "Ljava/lang/Class;", "clientProviderClass", "serverProviderClass", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V", "k", "a", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class e extends j {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

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
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ2\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/platform/e$a;", "Ljava/lang/reflect/InvocationHandler;", "", "proxy", "Ljava/lang/reflect/Method;", "method", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "", "a", "Z", "b", "()Z", "d", "(Z)V", "unsupported", "", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "(Ljava/lang/String;)V", "selected", "", "Ljava/util/List;", "protocols", "<init>", "(Ljava/util/List;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    private static final class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean unsupported;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private String selected;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<String> protocols;

        public a(@d5.d List<String> list) {
            l0.p(list, ProtectedSandApp.s("斧"));
            this.protocols = list;
        }

        @d5.e
        /* renamed from: a, reason: from getter */
        public final String getSelected() {
            return this.selected;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getUnsupported() {
            return this.unsupported;
        }

        public final void c(@d5.e String str) {
            this.selected = str;
        }

        public final void d(boolean z5) {
            this.unsupported = z5;
        }

        @Override // java.lang.reflect.InvocationHandler
        @d5.e
        public Object invoke(@d5.d Object proxy, @d5.d Method method, @d5.e Object[] args) throws Throwable {
            l0.p(proxy, ProtectedSandApp.s("斨"));
            l0.p(method, ProtectedSandApp.s("斩"));
            if (args == null) {
                args = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (l0.g(name, ProtectedSandApp.s("斪")) && l0.g(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (l0.g(name, ProtectedSandApp.s("斫")) && l0.g(Void.TYPE, returnType)) {
                this.unsupported = true;
                return null;
            }
            if (l0.g(name, ProtectedSandApp.s("斬"))) {
                if (args.length == 0) {
                    return this.protocols;
                }
            }
            boolean g5 = l0.g(name, ProtectedSandApp.s("断"));
            String s5 = ProtectedSandApp.s("斮");
            if ((g5 || l0.g(name, ProtectedSandApp.s("斯"))) && l0.g(String.class, returnType) && args.length == 1) {
                Object obj = args[0];
                if (obj instanceof List) {
                    if (obj == null) {
                        throw new NullPointerException(ProtectedSandApp.s("新"));
                    }
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i5 = 0;
                        while (true) {
                            Object obj2 = list.get(i5);
                            if (obj2 == null) {
                                throw new NullPointerException(s5);
                            }
                            String str = (String) obj2;
                            if (!this.protocols.contains(str)) {
                                if (i5 == size) {
                                    break;
                                }
                                i5++;
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
            if ((!l0.g(name, ProtectedSandApp.s("斱")) && !l0.g(name, ProtectedSandApp.s("斲"))) || args.length != 1) {
                return method.invoke(this, Arrays.copyOf(args, args.length));
            }
            Object obj3 = args[0];
            if (obj3 == null) {
                throw new NullPointerException(s5);
            }
            this.selected = (String) obj3;
            return null;
        }
    }

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/platform/e$b;", "", "Lokhttp3/internal/platform/j;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.platform.e$b, reason: from kotlin metadata */
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        @d5.e
        public final j a() {
            String property = System.getProperty(ProtectedSandApp.s("斳"), ProtectedSandApp.s("斴"));
            try {
                l0.o(property, ProtectedSandApp.s("斵"));
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName(ProtectedSandApp.s("斶"), true, null);
                Class<?> cls2 = Class.forName(ProtectedSandApp.s("斷"), true, null);
                Class<?> cls3 = Class.forName(ProtectedSandApp.s("斸"), true, null);
                Class<?> cls4 = Class.forName(ProtectedSandApp.s("方"), true, null);
                Method method = cls.getMethod(ProtectedSandApp.s("斺"), SSLSocket.class, cls2);
                Method method2 = cls.getMethod(ProtectedSandApp.s("斻"), SSLSocket.class);
                Method method3 = cls.getMethod(ProtectedSandApp.s("於"), SSLSocket.class);
                l0.o(method, ProtectedSandApp.s("施"));
                l0.o(method2, ProtectedSandApp.s("斾"));
                l0.o(method3, ProtectedSandApp.s("斿"));
                l0.o(cls3, ProtectedSandApp.s("旀"));
                l0.o(cls4, ProtectedSandApp.s("旁"));
                return new e(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        public Companion(w wVar) {
        }
    }

    public e(@d5.d Method method, @d5.d Method method2, @d5.d Method method3, @d5.d Class<?> cls, @d5.d Class<?> cls2) {
        l0.p(method, ProtectedSandApp.s("釵"));
        l0.p(method2, ProtectedSandApp.s("釶"));
        l0.p(method3, ProtectedSandApp.s("釷"));
        l0.p(cls, ProtectedSandApp.s("釸"));
        l0.p(cls2, ProtectedSandApp.s("釹"));
        this.putMethod = method;
        this.getMethod = method2;
        this.removeMethod = method3;
        this.clientProviderClass = cls;
        this.serverProviderClass = cls2;
    }

    @Override // okhttp3.internal.platform.j
    public void c(@d5.d SSLSocket sSLSocket) {
        String s5 = ProtectedSandApp.s("釺");
        l0.p(sSLSocket, ProtectedSandApp.s("釻"));
        try {
            this.removeMethod.invoke(null, sSLSocket);
        } catch (IllegalAccessException e6) {
            throw new AssertionError(s5, e6);
        } catch (InvocationTargetException e7) {
            throw new AssertionError(s5, e7);
        }
    }

    @Override // okhttp3.internal.platform.j
    public void f(@d5.d SSLSocket sSLSocket, @d5.e String str, @d5.d List<? extends d0> list) {
        String s5 = ProtectedSandApp.s("釼");
        l0.p(sSLSocket, ProtectedSandApp.s("釽"));
        l0.p(list, ProtectedSandApp.s("釾"));
        try {
            this.putMethod.invoke(null, sSLSocket, Proxy.newProxyInstance(j.class.getClassLoader(), new Class[]{this.clientProviderClass, this.serverProviderClass}, new a(j.INSTANCE.b(list))));
        } catch (IllegalAccessException e6) {
            throw new AssertionError(s5, e6);
        } catch (InvocationTargetException e7) {
            throw new AssertionError(s5, e7);
        }
    }

    @Override // okhttp3.internal.platform.j
    @d5.e
    public String j(@d5.d SSLSocket sslSocket) {
        String s5 = ProtectedSandApp.s("釿");
        l0.p(sslSocket, ProtectedSandApp.s("鈀"));
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.getMethod.invoke(null, sslSocket));
            if (invocationHandler == null) {
                throw new NullPointerException(ProtectedSandApp.s("鈂"));
            }
            a aVar = (a) invocationHandler;
            if (!aVar.getUnsupported() && aVar.getSelected() == null) {
                j.n(this, ProtectedSandApp.s("鈁"), 0, null, 6, null);
                return null;
            }
            if (aVar.getUnsupported()) {
                return null;
            }
            return aVar.getSelected();
        } catch (IllegalAccessException e6) {
            throw new AssertionError(s5, e6);
        } catch (InvocationTargetException e7) {
            throw new AssertionError(s5, e7);
        }
    }
}
