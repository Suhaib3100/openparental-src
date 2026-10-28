package androidx.view;

import android.app.Application;
import androidx.annotation.c1;
import androidx.content.preferences.protobuf.o1;
import fg.l;
import fg.m;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kd.f;
import kd.j;
import kd.n;
import kotlin.AbstractC1477a;
import kotlin.C1478b;
import kotlin.C1481e;
import kotlin.C1484h;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: ViewModelProvider.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0012\u0016\u001a\u001cB#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\rJ(\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u000f*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0097\u0002¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u0016\u001a\u00028\u0000\"\b\b\u0000\u0010\u000f*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0097\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/k1;", "", "Landroidx/lifecycle/n1;", "store", "Landroidx/lifecycle/k1$b;", "factory", "Lm2/a;", "defaultCreationExtras", "<init>", "(Landroidx/lifecycle/n1;Landroidx/lifecycle/k1$b;Lm2/a;)V", "Landroidx/lifecycle/o1;", "owner", "(Landroidx/lifecycle/o1;)V", "(Landroidx/lifecycle/o1;Landroidx/lifecycle/k1$b;)V", "Landroidx/lifecycle/h1;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/h1;", "", "key", "b", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/h1;", "Landroidx/lifecycle/n1;", "Landroidx/lifecycle/k1$b;", "c", "Lm2/a;", "d", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nViewModelProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProvider.kt\nandroidx/lifecycle/ViewModelProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,375:1\n1#2:376\n*E\n"})
/* loaded from: classes3.dex */
public class k1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final n1 store;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final b factory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final AbstractC1477a defaultCreationExtras;

    /* compiled from: ViewModelProvider.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/k1$b;", "", "Landroidx/lifecycle/h1;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/h1;", "Lm2/a;", "extras", "b", "(Ljava/lang/Class;Lm2/a;)Landroidx/lifecycle/h1;", "a", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        public static final Companion INSTANCE = Companion.f30376a;

        /* compiled from: ViewModelProvider.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\u00020\u00072\u001a\u0010\u0006\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004\"\u0006\u0012\u0002\b\u00030\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/lifecycle/k1$b$a;", "", "<init>", "()V", "", "Lm2/h;", "initializers", "Landroidx/lifecycle/k1$b;", "a", "([Lm2/h;)Landroidx/lifecycle/k1$b;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.lifecycle.k1$b$a, reason: from kotlin metadata */
        public static final class Companion {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ Companion f30376a = new Companion();

            private Companion() {
            }

            @l
            @n
            public final b a(@l C1484h<?>... initializers) {
                l0.p(initializers, "initializers");
                return new C1478b((C1484h[]) Arrays.copyOf(initializers, initializers.length));
            }
        }

        @l
        @n
        static b a(@l C1484h<?>... c1484hArr) {
            return INSTANCE.a(c1484hArr);
        }

        @l
        default <T extends h1> T b(@l Class<T> modelClass, @l AbstractC1477a extras) {
            l0.p(modelClass, "modelClass");
            l0.p(extras, "extras");
            return (T) create(modelClass);
        }

        @l
        default <T extends h1> T create(@l Class<T> modelClass) {
            l0.p(modelClass, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }
    }

    /* compiled from: ViewModelProvider.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/lifecycle/k1$c;", "Landroidx/lifecycle/k1$b;", "<init>", "()V", "Landroidx/lifecycle/h1;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/h1;", "b", "a", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class c implements b {

        /* renamed from: c, reason: collision with root package name */
        @m
        private static c f30378c;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: d, reason: collision with root package name */
        @l
        @f
        public static final AbstractC1477a.b<String> f30379d = Companion.C0494a.f30380a;

        /* compiled from: ViewModelProvider.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/k1$c$a;", "", "<init>", "()V", "Landroidx/lifecycle/k1$c;", "a", "()Landroidx/lifecycle/k1$c;", "b", "instance", "Lm2/a$b;", "", "VIEW_MODEL_KEY", "Lm2/a$b;", "sInstance", "Landroidx/lifecycle/k1$c;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.lifecycle.k1$c$a, reason: from kotlin metadata */
        public static final class Companion {

            /* compiled from: ViewModelProvider.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/k1$c$a$a;", "Lm2/a$b;", "", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.lifecycle.k1$c$a$a, reason: collision with other inner class name */
            private static final class C0494a implements AbstractC1477a.b<String> {

                /* renamed from: a, reason: collision with root package name */
                @l
                public static final C0494a f30380a = new C0494a();

                private C0494a() {
                }
            }

            private Companion() {
            }

            @n
            public static /* synthetic */ void b() {
            }

            @l
            @c1({c1.a.LIBRARY_GROUP})
            public final c a() {
                if (c.f30378c == null) {
                    c.f30378c = new c();
                }
                c cVar = c.f30378c;
                l0.m(cVar);
                return cVar;
            }

            public Companion(w wVar) {
            }
        }

        @l
        @c1({c1.a.LIBRARY_GROUP})
        public static final c e() {
            return INSTANCE.a();
        }

        @Override // androidx.lifecycle.k1.b
        @l
        public <T extends h1> T create(@l Class<T> modelClass) {
            l0.p(modelClass, "modelClass");
            try {
                T newInstance = modelClass.getDeclaredConstructor(null).newInstance(null);
                l0.o(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e4) {
                throw new RuntimeException(o1.a("Cannot create an instance of ", modelClass), e4);
            } catch (InstantiationException e5) {
                throw new RuntimeException(o1.a("Cannot create an instance of ", modelClass), e5);
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException(o1.a("Cannot create an instance of ", modelClass), e6);
            }
        }
    }

    /* compiled from: ViewModelProvider.kt */
    @c1({c1.a.LIBRARY_GROUP})
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/k1$d;", "", "<init>", "()V", "Landroidx/lifecycle/h1;", "viewModel", "Lkotlin/k2;", "c", "(Landroidx/lifecycle/h1;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class d {
        public void c(@l h1 viewModel) {
            l0.p(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public k1(@l n1 store, @l b factory) {
        this(store, factory, null, 4, null);
        l0.p(store, "store");
        l0.p(factory, "factory");
    }

    @l
    @androidx.annotation.l0
    public <T extends h1> T a(@l Class<T> modelClass) {
        l0.p(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @l
    @androidx.annotation.l0
    public <T extends h1> T b(@l String key, @l Class<T> modelClass) {
        T t4;
        l0.p(key, "key");
        l0.p(modelClass, "modelClass");
        T t5 = (T) this.store.b(key);
        if (!modelClass.isInstance(t5)) {
            C1481e c1481e = new C1481e(this.defaultCreationExtras);
            c1481e.c(c.f30379d, key);
            try {
                t4 = (T) this.factory.b(modelClass, c1481e);
            } catch (AbstractMethodError unused) {
                t4 = (T) this.factory.create(modelClass);
            }
            this.store.d(key, t4);
            return t4;
        }
        Object obj = this.factory;
        d dVar = obj instanceof d ? (d) obj : null;
        if (dVar != null) {
            l0.m(t5);
            dVar.c(t5);
        }
        l0.n(t5, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return t5;
    }

    /* compiled from: ViewModelProvider.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ/\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/k1$a;", "Landroidx/lifecycle/k1$c;", "Landroid/app/Application;", "application", "", "unused", "<init>", "(Landroid/app/Application;I)V", "()V", "(Landroid/app/Application;)V", "Landroidx/lifecycle/h1;", "T", "Ljava/lang/Class;", "modelClass", "app", "h", "(Ljava/lang/Class;Landroid/app/Application;)Landroidx/lifecycle/h1;", "Lm2/a;", "extras", "b", "(Ljava/lang/Class;Lm2/a;)Landroidx/lifecycle/h1;", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/h1;", "e", "Landroid/app/Application;", "f", "a", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class a extends c {

        /* renamed from: h, reason: collision with root package name */
        @m
        private static a f30371h;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @m
        private final Application application;

        /* renamed from: g, reason: collision with root package name */
        @l
        public static final String f30370g = "androidx.lifecycle.ViewModelProvider.DefaultKey";

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: i, reason: collision with root package name */
        @l
        @f
        public static final AbstractC1477a.b<Application> f30372i = Companion.C0493a.f30374a;

        /* compiled from: ViewModelProvider.kt */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/k1$a$a;", "", "<init>", "()V", "Landroidx/lifecycle/o1;", "owner", "Landroidx/lifecycle/k1$b;", "a", "(Landroidx/lifecycle/o1;)Landroidx/lifecycle/k1$b;", "Landroid/app/Application;", "application", "Landroidx/lifecycle/k1$a;", "b", "(Landroid/app/Application;)Landroidx/lifecycle/k1$a;", "Lm2/a$b;", "APPLICATION_KEY", "Lm2/a$b;", "", "DEFAULT_KEY", "Ljava/lang/String;", "sInstance", "Landroidx/lifecycle/k1$a;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.lifecycle.k1$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {

            /* compiled from: ViewModelProvider.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/k1$a$a$a;", "Lm2/a$b;", "Landroid/app/Application;", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.lifecycle.k1$a$a$a, reason: collision with other inner class name */
            private static final class C0493a implements AbstractC1477a.b<Application> {

                /* renamed from: a, reason: collision with root package name */
                @l
                public static final C0493a f30374a = new C0493a();

                private C0493a() {
                }
            }

            private Companion() {
            }

            @l
            public final b a(@l o1 owner) {
                l0.p(owner, "owner");
                return owner instanceof InterfaceC1449v ? ((InterfaceC1449v) owner).getDefaultViewModelProviderFactory() : c.INSTANCE.a();
            }

            @l
            @n
            public final a b(@l Application application) {
                l0.p(application, "application");
                if (a.f30371h == null) {
                    a.f30371h = new a(application);
                }
                a aVar = a.f30371h;
                l0.m(aVar);
                return aVar;
            }

            public Companion(w wVar) {
            }
        }

        private a(Application application, int i4) {
            this.application = application;
        }

        private final <T extends h1> T h(Class<T> modelClass, Application app) {
            if (!C1415b.class.isAssignableFrom(modelClass)) {
                return (T) super.create(modelClass);
            }
            try {
                T newInstance = modelClass.getConstructor(Application.class).newInstance(app);
                l0.o(newInstance, "{\n                try {\n…          }\n            }");
                return newInstance;
            } catch (IllegalAccessException e4) {
                throw new RuntimeException(o1.a("Cannot create an instance of ", modelClass), e4);
            } catch (InstantiationException e5) {
                throw new RuntimeException(o1.a("Cannot create an instance of ", modelClass), e5);
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException(o1.a("Cannot create an instance of ", modelClass), e6);
            } catch (InvocationTargetException e7) {
                throw new RuntimeException(o1.a("Cannot create an instance of ", modelClass), e7);
            }
        }

        @l
        @n
        public static final a i(@l Application application) {
            return INSTANCE.b(application);
        }

        @Override // androidx.lifecycle.k1.b
        @l
        public <T extends h1> T b(@l Class<T> modelClass, @l AbstractC1477a extras) {
            l0.p(modelClass, "modelClass");
            l0.p(extras, "extras");
            if (this.application != null) {
                return (T) create(modelClass);
            }
            Application application = (Application) extras.a(f30372i);
            if (application != null) {
                return (T) h(modelClass, application);
            }
            if (C1415b.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.create(modelClass);
        }

        @Override // androidx.lifecycle.k1.c, androidx.lifecycle.k1.b
        @l
        public <T extends h1> T create(@l Class<T> modelClass) {
            l0.p(modelClass, "modelClass");
            Application application = this.application;
            if (application != null) {
                return (T) h(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@l Application application) {
            this(application, 0);
            l0.p(application, "application");
        }
    }

    @j
    public k1(@l n1 store, @l b factory, @l AbstractC1477a defaultCreationExtras) {
        l0.p(store, "store");
        l0.p(factory, "factory");
        l0.p(defaultCreationExtras, "defaultCreationExtras");
        this.store = store;
        this.factory = factory;
        this.defaultCreationExtras = defaultCreationExtras;
    }

    public /* synthetic */ k1(n1 n1Var, b bVar, AbstractC1477a abstractC1477a, int i4, w wVar) {
        this(n1Var, bVar, (i4 & 4) != 0 ? AbstractC1477a.C1272a.f81491b : abstractC1477a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k1(@l o1 owner) {
        this(owner.getViewModelStore(), a.INSTANCE.a(owner), l1.a(owner));
        l0.p(owner, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k1(@l o1 owner, @l b factory) {
        this(owner.getViewModelStore(), factory, l1.a(owner));
        l0.p(owner, "owner");
        l0.p(factory, "factory");
    }
}
