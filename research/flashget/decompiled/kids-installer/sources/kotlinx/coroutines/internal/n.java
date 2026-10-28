package kotlinx.coroutines.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* compiled from: ExceptionsConstructor.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a2\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002\u001a*\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002\u001a1\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b2\u0014\b\u0004\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0007H\u0082\b\u001a\u0018\u0010\u0011\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u001a\u001b\u0010\u0013\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u000fH\u0082\u0010\"\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018*(\b\u0002\u0010\u001a\"\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00072\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007¨\u0006\u001b"}, d2 = {"", "E", "exception", "h", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/Class;", "clz", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "b", "Ljava/lang/reflect/Constructor;", "constructor", "c", "block", "g", "", "defaultValue", "f", "accumulator", "d", "a", "I", "throwableFields", "Lkotlinx/coroutines/internal/k;", "Lkotlinx/coroutines/internal/k;", "ctorCache", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final int f28726a = f(Throwable.class, -1);

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final k f28727b;

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$c", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            int l5;
            l5 = kotlin.comparisons.g.l(Integer.valueOf(((Constructor) t6).getParameterTypes().length), Integer.valueOf(((Constructor) t5).getParameterTypes().length));
            return l5;
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "E", "it", "", "a", "(Ljava/lang/Throwable;)Ljava/lang/Void;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.l {

        /* renamed from: p, reason: collision with root package name */
        public static final b f28728p = new b();

        b() {
            super(1);
        }

        @Override // q3.l
        public Object N(Object obj) {
            return null;
        }

        @d5.e
        public final Void a(@d5.d Throwable th) {
            return null;
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "kotlinx/coroutines/internal/n$g"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class c extends Lambda implements q3.l<Throwable, Throwable> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Constructor f28729p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.f28729p = constructor;
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable N(@d5.d Throwable th) {
            Object a6;
            Object newInstance;
            try {
                Result.a aVar = Result.f27242p;
                newInstance = this.f28729p.newInstance(th.getMessage(), th);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f27242p;
                a6 = kotlin.a1.a(th2);
            }
            if (newInstance == null) {
                throw new NullPointerException(ProtectedSandApp.s("鄼"));
            }
            a6 = Result.b((Throwable) newInstance);
            if (Result.i(a6)) {
                a6 = null;
            }
            return (Throwable) a6;
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "kotlinx/coroutines/internal/n$g"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class d extends Lambda implements q3.l<Throwable, Throwable> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Constructor f28730p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.f28730p = constructor;
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable N(@d5.d Throwable th) {
            Object a6;
            Object newInstance;
            try {
                Result.a aVar = Result.f27242p;
                newInstance = this.f28730p.newInstance(th);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f27242p;
                a6 = kotlin.a1.a(th2);
            }
            if (newInstance == null) {
                throw new NullPointerException(ProtectedSandApp.s("鄽"));
            }
            a6 = Result.b((Throwable) newInstance);
            if (Result.i(a6)) {
                a6 = null;
            }
            return (Throwable) a6;
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "kotlinx/coroutines/internal/n$g"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class e extends Lambda implements q3.l<Throwable, Throwable> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Constructor f28731p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Constructor constructor) {
            super(1);
            this.f28731p = constructor;
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable N(@d5.d Throwable th) {
            Object a6;
            Object newInstance;
            try {
                Result.a aVar = Result.f27242p;
                newInstance = this.f28731p.newInstance(th.getMessage());
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f27242p;
                a6 = kotlin.a1.a(th2);
            }
            if (newInstance == null) {
                throw new NullPointerException(ProtectedSandApp.s("鄾"));
            }
            Throwable th3 = (Throwable) newInstance;
            th3.initCause(th);
            a6 = Result.b(th3);
            if (Result.i(a6)) {
                a6 = null;
            }
            return (Throwable) a6;
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "kotlinx/coroutines/internal/n$g"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class f extends Lambda implements q3.l<Throwable, Throwable> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Constructor f28732p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Constructor constructor) {
            super(1);
            this.f28732p = constructor;
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable N(@d5.d Throwable th) {
            Object a6;
            Object newInstance;
            try {
                Result.a aVar = Result.f27242p;
                newInstance = this.f28732p.newInstance(new Object[0]);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f27242p;
                a6 = kotlin.a1.a(th2);
            }
            if (newInstance == null) {
                throw new NullPointerException(ProtectedSandApp.s("鄿"));
            }
            Throwable th3 = (Throwable) newInstance;
            th3.initCause(th);
            a6 = Result.b(th3);
            if (Result.i(a6)) {
                a6 = null;
            }
            return (Throwable) a6;
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class g extends Lambda implements q3.l<Throwable, Throwable> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.l<Throwable, Throwable> f28733p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(q3.l<? super Throwable, ? extends Throwable> lVar) {
            super(1);
            this.f28733p = lVar;
        }

        @Override // q3.l
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable N(@d5.d Throwable th) {
            Object a6;
            q3.l<Throwable, Throwable> lVar = this.f28733p;
            try {
                Result.a aVar = Result.f27242p;
                a6 = Result.b(lVar.N(th));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f27242p;
                a6 = kotlin.a1.a(th2);
            }
            if (Result.i(a6)) {
                a6 = null;
            }
            return (Throwable) a6;
        }
    }

    static {
        k kVar;
        try {
            kVar = p.a() ? d1.f28696a : kotlinx.coroutines.internal.e.f28699a;
        } catch (Throwable unused) {
            kVar = d1.f28696a;
        }
        f28727b = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> q3.l<Throwable, Throwable> b(Class<E> cls) {
        List Lv;
        b bVar = b.f28728p;
        if (f28726a != f(cls, 0)) {
            return bVar;
        }
        Lv = kotlin.collections.t.Lv(cls.getConstructors(), new a());
        Iterator it = Lv.iterator();
        while (it.hasNext()) {
            q3.l<Throwable, Throwable> c6 = c((Constructor) it.next());
            if (c6 != null) {
                return c6;
            }
        }
        return bVar;
    }

    private static final q3.l<Throwable, Throwable> c(Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new f(constructor);
        }
        if (length != 1) {
            if (length == 2 && kotlin.jvm.internal.l0.g(parameterTypes[0], String.class) && kotlin.jvm.internal.l0.g(parameterTypes[1], Throwable.class)) {
                return new c(constructor);
            }
            return null;
        }
        Class<?> cls = parameterTypes[0];
        if (kotlin.jvm.internal.l0.g(cls, Throwable.class)) {
            return new d(constructor);
        }
        if (kotlin.jvm.internal.l0.g(cls, String.class)) {
            return new e(constructor);
        }
        return null;
    }

    private static final int d(Class<?> cls, int i5) {
        do {
            int length = cls.getDeclaredFields().length;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                if (!Modifier.isStatic(r0[i7].getModifiers())) {
                    i6++;
                }
            }
            i5 += i6;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i5;
    }

    static /* synthetic */ int e(Class cls, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 0;
        }
        return d(cls, i5);
    }

    private static final int f(Class<?> cls, int i5) {
        Object a6;
        p3.b.i(cls);
        try {
            Result.a aVar = Result.f27242p;
            a6 = Result.b(Integer.valueOf(e(cls, 0, 1, null)));
        } catch (Throwable th) {
            Result.a aVar2 = Result.f27242p;
            a6 = kotlin.a1.a(th);
        }
        Integer valueOf = Integer.valueOf(i5);
        if (Result.i(a6)) {
            a6 = valueOf;
        }
        return ((Number) a6).intValue();
    }

    private static final q3.l<Throwable, Throwable> g(q3.l<? super Throwable, ? extends Throwable> lVar) {
        return new g(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d5.e
    public static final <E extends Throwable> E h(@d5.d E e6) {
        Object a6;
        if (!(e6 instanceof kotlinx.coroutines.m0)) {
            return (E) f28727b.a(e6.getClass()).N(e6);
        }
        try {
            Result.a aVar = Result.f27242p;
            a6 = Result.b(((kotlinx.coroutines.m0) e6).a());
        } catch (Throwable th) {
            Result.a aVar2 = Result.f27242p;
            a6 = kotlin.a1.a(th);
        }
        if (Result.i(a6)) {
            a6 = null;
        }
        return (E) a6;
    }
}
