package android.view;

import android.app.Application;
import androidx.annotation.c1;
import d5.e;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.AbstractC0540a;
import kotlin.C0542e;
import kotlin.C0543h;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p3.f;
import p3.j;
import p3.n;

/* compiled from: ViewModelProvider.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0006\n\u0013\u001cB#\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aB\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u001bJ(\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0097\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0097\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/f1;", "", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/c1;", "", "key", "b", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/c1;", "Landroidx/lifecycle/h1;", "Landroidx/lifecycle/h1;", "store", "Landroidx/lifecycle/f1$b;", "Landroidx/lifecycle/f1$b;", "factory", "Ll0/a;", "c", "Ll0/a;", "defaultCreationExtras", "<init>", "(Landroidx/lifecycle/h1;Landroidx/lifecycle/f1$b;Ll0/a;)V", "Landroidx/lifecycle/i1;", "owner", "(Landroidx/lifecycle/i1;)V", "(Landroidx/lifecycle/i1;Landroidx/lifecycle/f1$b;)V", "d", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class f1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final h1 store;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final b factory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final AbstractC0540a defaultCreationExtras;

    /* compiled from: ViewModelProvider.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/f1$b;", "", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/c1;", "Ll0/a;", "extras", "c", "(Ljava/lang/Class;Ll0/a;)Landroidx/lifecycle/c1;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
    public interface b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        public static final Companion INSTANCE = Companion.f8552a;

        /* compiled from: ViewModelProvider.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0006\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\"\u0006\u0012\u0002\b\u00030\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/lifecycle/f1$b$a;", "", "", "Ll0/h;", "initializers", "Landroidx/lifecycle/f1$b;", "a", "([Ll0/h;)Landroidx/lifecycle/f1$b;", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
        /* renamed from: androidx.lifecycle.f1$b$a, reason: from kotlin metadata */
        public static final class Companion {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ Companion f8552a = new Companion();

            private Companion() {
            }

            @d5.d
            @n
            public final b a(@d5.d C0543h<?>... initializers) {
                l0.p(initializers, "initializers");
                return new kotlin.b((C0543h[]) Arrays.copyOf(initializers, initializers.length));
            }
        }

        @d5.d
        @n
        static b b(@d5.d C0543h<?>... c0543hArr) {
            return INSTANCE.a(c0543hArr);
        }

        @d5.d
        default <T extends c1> T a(@d5.d Class<T> modelClass) {
            l0.p(modelClass, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        @d5.d
        default <T extends c1> T c(@d5.d Class<T> modelClass, @d5.d AbstractC0540a extras) {
            l0.p(modelClass, "modelClass");
            l0.p(extras, "extras");
            return (T) a(modelClass);
        }
    }

    /* compiled from: ViewModelProvider.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/f1$c;", "Landroidx/lifecycle/f1$b;", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/c1;", "<init>", "()V", "b", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static class c implements b {

        /* renamed from: c, reason: collision with root package name */
        @e
        private static c f8554c;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.d
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: d, reason: collision with root package name */
        @d5.d
        @f
        public static final AbstractC0540a.b<String> f8555d = Companion.C0095a.f8556a;

        /* compiled from: ViewModelProvider.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/f1$c$a;", "", "Landroidx/lifecycle/f1$c;", "a", "()Landroidx/lifecycle/f1$c;", "getInstance$annotations", "()V", "instance", "Ll0/a$b;", "", "VIEW_MODEL_KEY", "Ll0/a$b;", "sInstance", "Landroidx/lifecycle/f1$c;", "<init>", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
        /* renamed from: androidx.lifecycle.f1$c$a, reason: from kotlin metadata */
        /* loaded from: classes.dex */
        public static final class Companion {

            /* compiled from: ViewModelProvider.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/f1$c$a$a;", "Ll0/a$b;", "", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
            /* renamed from: androidx.lifecycle.f1$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            private static final class C0095a implements AbstractC0540a.b<String> {

                /* renamed from: a, reason: collision with root package name */
                @d5.d
                public static final C0095a f8556a = new C0095a();

                private C0095a() {
                }
            }

            private Companion() {
            }

            @n
            public static /* synthetic */ void b() {
            }

            @c1({c1.a.LIBRARY_GROUP})
            @d5.d
            public final c a() {
                if (c.f8554c == null) {
                    c.f8554c = new c();
                }
                c cVar = c.f8554c;
                l0.m(cVar);
                return cVar;
            }

            public Companion(w wVar) {
            }
        }

        @c1({c1.a.LIBRARY_GROUP})
        @d5.d
        public static final c f() {
            return INSTANCE.a();
        }

        @Override // androidx.lifecycle.f1.b
        @d5.d
        public <T extends c1> T a(@d5.d Class<T> modelClass) {
            l0.p(modelClass, "modelClass");
            try {
                T newInstance = modelClass.newInstance();
                l0.o(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e6) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e6);
            } catch (InstantiationException e7) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e7);
            }
        }
    }

    /* compiled from: ViewModelProvider.kt */
    @c1({c1.a.LIBRARY_GROUP})
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Landroidx/lifecycle/f1$d;", "", "Landroidx/lifecycle/c1;", "viewModel", "Lkotlin/m2;", "d", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
    public static class d {
        public void d(@d5.d c1 viewModel) {
            l0.p(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public f1(@d5.d h1 store, @d5.d b factory) {
        this(store, factory, null, 4, null);
        l0.p(store, "store");
        l0.p(factory, "factory");
    }

    @androidx.annotation.l0
    @d5.d
    public <T extends c1> T a(@d5.d Class<T> modelClass) {
        l0.p(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @androidx.annotation.l0
    @d5.d
    public <T extends c1> T b(@d5.d String key, @d5.d Class<T> modelClass) {
        T t5;
        l0.p(key, "key");
        l0.p(modelClass, "modelClass");
        T viewModel = (T) this.store.b(key);
        if (!modelClass.isInstance(viewModel)) {
            C0542e c0542e = new C0542e(this.defaultCreationExtras);
            c0542e.c(c.f8555d, key);
            try {
                t5 = (T) this.factory.c(modelClass, c0542e);
            } catch (AbstractMethodError unused) {
                t5 = (T) this.factory.a(modelClass);
            }
            this.store.d(key, t5);
            return t5;
        }
        Object obj = this.factory;
        d dVar = obj instanceof d ? (d) obj : null;
        if (dVar != null) {
            l0.o(viewModel, "viewModel");
            dVar.d(viewModel);
        }
        if (viewModel != null) {
            return viewModel;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
    }

    /* compiled from: ViewModelProvider.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u000eB\u001b\b\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\t\b\u0016¢\u0006\u0004\b\u0015\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0018J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Landroidx/lifecycle/f1$a;", "Landroidx/lifecycle/f1$c;", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "Landroid/app/Application;", "app", "i", "(Ljava/lang/Class;Landroid/app/Application;)Landroidx/lifecycle/c1;", "Ll0/a;", "extras", "c", "(Ljava/lang/Class;Ll0/a;)Landroidx/lifecycle/c1;", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/c1;", "e", "Landroid/app/Application;", "application", "", "unused", "<init>", "(Landroid/app/Application;I)V", "()V", "(Landroid/app/Application;)V", "f", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static class a extends c {

        /* renamed from: h, reason: collision with root package name */
        @e
        private static a f8547h;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @e
        private final Application application;

        /* renamed from: g, reason: collision with root package name */
        @d5.d
        public static final String f8546g = "androidx.lifecycle.ViewModelProvider.DefaultKey";

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @d5.d
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: i, reason: collision with root package name */
        @d5.d
        @f
        public static final AbstractC0540a.b<Application> f8548i = Companion.C0094a.f8550a;

        /* compiled from: ViewModelProvider.kt */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/f1$a$a;", "", "Landroidx/lifecycle/i1;", "owner", "Landroidx/lifecycle/f1$b;", "a", "(Landroidx/lifecycle/i1;)Landroidx/lifecycle/f1$b;", "Landroid/app/Application;", "application", "Landroidx/lifecycle/f1$a;", "b", "Ll0/a$b;", "APPLICATION_KEY", "Ll0/a$b;", "", "DEFAULT_KEY", "Ljava/lang/String;", "sInstance", "Landroidx/lifecycle/f1$a;", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
        /* renamed from: androidx.lifecycle.f1$a$a, reason: collision with other inner class name and from kotlin metadata */
        /* loaded from: classes.dex */
        public static final class Companion {

            /* compiled from: ViewModelProvider.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/f1$a$a$a;", "Ll0/a$b;", "Landroid/app/Application;", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
            /* renamed from: androidx.lifecycle.f1$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            private static final class C0094a implements AbstractC0540a.b<Application> {

                /* renamed from: a, reason: collision with root package name */
                @d5.d
                public static final C0094a f8550a = new C0094a();

                private C0094a() {
                }
            }

            private Companion() {
            }

            @d5.d
            public final b a(@d5.d i1 owner) {
                l0.p(owner, "owner");
                if (!(owner instanceof s)) {
                    return c.INSTANCE.a();
                }
                b defaultViewModelProviderFactory = ((s) owner).getDefaultViewModelProviderFactory();
                l0.o(defaultViewModelProviderFactory, "owner.defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }

            @d5.d
            @n
            public final a b(@d5.d Application application) {
                l0.p(application, "application");
                if (a.f8547h == null) {
                    a.f8547h = new a(application);
                }
                a aVar = a.f8547h;
                l0.m(aVar);
                return aVar;
            }

            public Companion(w wVar) {
            }
        }

        private a(Application application, int i5) {
            this.application = application;
        }

        private final <T extends c1> T i(Class<T> modelClass, Application app) {
            if (!C0524b.class.isAssignableFrom(modelClass)) {
                return (T) super.a(modelClass);
            }
            try {
                T newInstance = modelClass.getConstructor(Application.class).newInstance(app);
                l0.o(newInstance, "{\n                try {\n…          }\n            }");
                return newInstance;
            } catch (IllegalAccessException e6) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e6);
            } catch (InstantiationException e7) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e7);
            } catch (NoSuchMethodException e8) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e8);
            } catch (InvocationTargetException e9) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e9);
            }
        }

        @d5.d
        @n
        public static final a j(@d5.d Application application) {
            return INSTANCE.b(application);
        }

        @Override // androidx.lifecycle.f1.c, androidx.lifecycle.f1.b
        @d5.d
        public <T extends c1> T a(@d5.d Class<T> modelClass) {
            l0.p(modelClass, "modelClass");
            Application application = this.application;
            if (application != null) {
                return (T) i(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.f1.b
        @d5.d
        public <T extends c1> T c(@d5.d Class<T> modelClass, @d5.d AbstractC0540a extras) {
            l0.p(modelClass, "modelClass");
            l0.p(extras, "extras");
            if (this.application != null) {
                return (T) a(modelClass);
            }
            Application application = (Application) extras.a(f8548i);
            if (application != null) {
                return (T) i(modelClass, application);
            }
            if (C0524b.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.a(modelClass);
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@d5.d Application application) {
            this(application, 0);
            l0.p(application, "application");
        }
    }

    @j
    public f1(@d5.d h1 store, @d5.d b factory, @d5.d AbstractC0540a defaultCreationExtras) {
        l0.p(store, "store");
        l0.p(factory, "factory");
        l0.p(defaultCreationExtras, "defaultCreationExtras");
        this.store = store;
        this.factory = factory;
        this.defaultCreationExtras = defaultCreationExtras;
    }

    public /* synthetic */ f1(h1 h1Var, b bVar, AbstractC0540a abstractC0540a, int i5, w wVar) {
        this(h1Var, bVar, (i5 & 4) != 0 ? AbstractC0540a.C0459a.f29101b : abstractC0540a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f1(@d5.d android.view.i1 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.l0.p(r3, r0)
            androidx.lifecycle.h1 r0 = r3.getViewModelStore()
            java.lang.String r1 = "owner.viewModelStore"
            kotlin.jvm.internal.l0.o(r0, r1)
            androidx.lifecycle.f1$a$a r1 = androidx.lifecycle.f1.a.INSTANCE
            androidx.lifecycle.f1$b r1 = r1.a(r3)
            l0.a r3 = android.view.g1.a(r3)
            r2.<init>(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.view.f1.<init>(androidx.lifecycle.i1):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f1(@d5.d android.view.i1 r3, @d5.d androidx.lifecycle.f1.b r4) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.l0.p(r3, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.l0.p(r4, r0)
            androidx.lifecycle.h1 r0 = r3.getViewModelStore()
            java.lang.String r1 = "owner.viewModelStore"
            kotlin.jvm.internal.l0.o(r0, r1)
            l0.a r3 = android.view.g1.a(r3)
            r2.<init>(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.view.f1.<init>(androidx.lifecycle.i1, androidx.lifecycle.f1$b):void");
    }
}
