package androidx.window.sidecar;

import android.app.Activity;
import android.graphics.Rect;
import androidx.annotation.x0;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import fg.l;
import fg.m;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.c0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;

/* compiled from: SafeWindowLayoutComponentProvider.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\f\u0010\bJ\u001d\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u0006*\u00020\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u0006*\u00020\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u0012\u0012\u0002\b\u0003 \u0019*\b\u0012\u0002\b\u0003\u0018\u00010\u00160\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u0012\u0012\u0002\b\u0003 \u0019*\b\u0012\u0002\b\u0003\u0018\u00010\u00160\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ'\u0010\u001d\u001a\u0012\u0012\u0002\b\u0003 \u0019*\b\u0012\u0002\b\u0003\u0018\u00010\u00160\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ'\u0010\u001e\u001a\u0012\u0012\u0002\b\u0003 \u0019*\b\u0012\u0002\b\u0003\u0018\u00010\u00160\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001bR\u001d\u0010$\u001a\u0004\u0018\u00010\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010'\u001a\u00020\u0006*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/window/layout/s;", "", "<init>", "()V", "Ljava/lang/ClassLoader;", "classLoader", "", "i", "(Ljava/lang/ClassLoader;)Z", "r", "p", "n", "q", "Lkotlin/Function0;", "block", "s", "(Lld/a;)Z", "Ljava/lang/reflect/Method;", "Lkotlin/reflect/d;", "clazz", "k", "(Ljava/lang/reflect/Method;Lkotlin/reflect/d;)Z", "Ljava/lang/Class;", "j", "(Ljava/lang/reflect/Method;Ljava/lang/Class;)Z", "kotlin.jvm.PlatformType", "u", "(Ljava/lang/ClassLoader;)Ljava/lang/Class;", "t", "l", "v", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "b", "Lkotlin/b0;", "m", "()Landroidx/window/extensions/layout/WindowLayoutComponent;", "windowLayoutComponent", "o", "(Ljava/lang/reflect/Method;)Z", "isPublic", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final s f35841a = new s();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private static final b0 windowLayoutComponent = c0.c(e.f35847b);

    /* compiled from: SafeWindowLayoutComponentProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    static final class a extends n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ClassLoader f35843b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ClassLoader classLoader) {
            super(0);
            this.f35843b = classLoader;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            boolean z4;
            s sVar = s.f35841a;
            Class d5 = s.d(sVar, this.f35843b);
            Method getBoundsMethod = d5.getMethod("getBounds", null);
            Method getTypeMethod = d5.getMethod("getType", null);
            Method getStateMethod = d5.getMethod("getState", null);
            l0.o(getBoundsMethod, "getBoundsMethod");
            if (sVar.k(getBoundsMethod, l1.d(Rect.class)) && sVar.o(getBoundsMethod)) {
                l0.o(getTypeMethod, "getTypeMethod");
                Class cls = Integer.TYPE;
                if (sVar.k(getTypeMethod, l1.d(cls)) && sVar.o(getTypeMethod)) {
                    l0.o(getStateMethod, "getStateMethod");
                    if (sVar.k(getStateMethod, l1.d(cls)) && sVar.o(getStateMethod)) {
                        z4 = true;
                        return Boolean.valueOf(z4);
                    }
                }
            }
            z4 = false;
            return Boolean.valueOf(z4);
        }
    }

    /* compiled from: SafeWindowLayoutComponentProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    static final class b extends n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ClassLoader f35844b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ClassLoader classLoader) {
            super(0);
            this.f35844b = classLoader;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            boolean z4;
            s sVar = s.f35841a;
            Method getWindowLayoutComponentMethod = s.f(sVar, this.f35844b).getMethod("getWindowLayoutComponent", null);
            Class windowLayoutComponentClass = s.h(sVar, this.f35844b);
            l0.o(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
            if (sVar.o(getWindowLayoutComponentMethod)) {
                l0.o(windowLayoutComponentClass, "windowLayoutComponentClass");
                if (sVar.j(getWindowLayoutComponentMethod, windowLayoutComponentClass)) {
                    z4 = true;
                    return Boolean.valueOf(z4);
                }
            }
            z4 = false;
            return Boolean.valueOf(z4);
        }
    }

    /* compiled from: SafeWindowLayoutComponentProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    static final class c extends n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ClassLoader f35845b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ClassLoader classLoader) {
            super(0);
            this.f35845b = classLoader;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            boolean z4;
            s sVar = s.f35841a;
            Class h4 = s.h(sVar, this.f35845b);
            Method addListenerMethod = h4.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
            Method removeListenerMethod = h4.getMethod("removeWindowLayoutInfoListener", Consumer.class);
            l0.o(addListenerMethod, "addListenerMethod");
            if (sVar.o(addListenerMethod)) {
                l0.o(removeListenerMethod, "removeListenerMethod");
                if (sVar.o(removeListenerMethod)) {
                    z4 = true;
                    return Boolean.valueOf(z4);
                }
            }
            z4 = false;
            return Boolean.valueOf(z4);
        }
    }

    /* compiled from: SafeWindowLayoutComponentProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    static final class d extends n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ClassLoader f35846b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ClassLoader classLoader) {
            super(0);
            this.f35846b = classLoader;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            s sVar = s.f35841a;
            Method getWindowExtensionsMethod = s.g(sVar, this.f35846b).getDeclaredMethod("getWindowExtensions", null);
            Class windowExtensionsClass = s.f(sVar, this.f35846b);
            l0.o(getWindowExtensionsMethod, "getWindowExtensionsMethod");
            l0.o(windowExtensionsClass, "windowExtensionsClass");
            return Boolean.valueOf(sVar.j(getWindowExtensionsMethod, windowExtensionsClass) && sVar.o(getWindowExtensionsMethod));
        }
    }

    /* compiled from: SafeWindowLayoutComponentProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/window/extensions/layout/WindowLayoutComponent;", "a", "()Landroidx/window/extensions/layout/WindowLayoutComponent;"}, k = 3, mv = {1, 6, 0})
    static final class e extends n0 implements ld.a<WindowLayoutComponent> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f35847b = new e(0);

        e() {
            super(0);
        }

        @Override // ld.a
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WindowLayoutComponent invoke() {
            ClassLoader classLoader = s.class.getClassLoader();
            if (classLoader == null || !s.f35841a.i(classLoader)) {
                return null;
            }
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            } catch (UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    private s() {
    }

    public static final Class d(s sVar, ClassLoader classLoader) {
        sVar.getClass();
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    public static final Class f(s sVar, ClassLoader classLoader) {
        sVar.getClass();
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    public static final Class g(s sVar, ClassLoader classLoader) {
        sVar.getClass();
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    public static final Class h(s sVar, ClassLoader classLoader) {
        sVar.getClass();
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i(ClassLoader classLoader) {
        return r(classLoader) && p(classLoader) && q(classLoader) && n(classLoader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(Method method, Class<?> cls) {
        return method.getReturnType().equals(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k(Method method, kotlin.reflect.d<?> dVar) {
        return j(method, kd.b.e(dVar));
    }

    private final Class<?> l(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    private final boolean n(ClassLoader classLoader) {
        return s(new a(classLoader));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    private final boolean p(ClassLoader classLoader) {
        return s(new b(classLoader));
    }

    @x0(24)
    private final boolean q(ClassLoader classLoader) {
        return s(new c(classLoader));
    }

    private final boolean r(ClassLoader classLoader) {
        return s(new d(classLoader));
    }

    private final boolean s(ld.a<Boolean> block) {
        try {
            return block.invoke().booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    private final Class<?> t(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    private final Class<?> u(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    private final Class<?> v(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }

    @m
    public final WindowLayoutComponent m() {
        return (WindowLayoutComponent) windowLayoutComponent.getValue();
    }
}
