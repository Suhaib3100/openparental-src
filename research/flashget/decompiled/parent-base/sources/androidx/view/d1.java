package androidx.view;

import android.app.Application;
import androidx.annotation.c1;
import androidx.content.preferences.protobuf.o1;
import fg.l;
import fg.m;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;

/* compiled from: SavedStateViewModelFactory.kt */
@c1({c1.a.LIBRARY})
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\u001aK\u0010\t\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0010\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u001e\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u001e\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/h1;", "T", "Ljava/lang/Class;", "modelClass", "Ljava/lang/reflect/Constructor;", "constructor", "", "", "params", "d", "(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/h1;", "", "signature", "c", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;", "a", "Ljava/util/List;", "ANDROID_VIEWMODEL_SIGNATURE", "b", "VIEWMODEL_SIGNATURE", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    @l
    private static final List<Class<?>> f30280a = w.O(Application.class, y0.class);

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final List<Class<?>> f30281b = w.k(y0.class);

    @m
    public static final <T> Constructor<T> c(@l Class<T> modelClass, @l List<? extends Class<?>> signature) {
        l0.p(modelClass, "modelClass");
        l0.p(signature, "signature");
        Object[] constructors = modelClass.getConstructors();
        l0.o(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            l0.o(parameterTypes, "constructor.parameterTypes");
            List Ky = kotlin.collections.l.Ky(parameterTypes);
            if (l0.g(signature, Ky)) {
                l0.n(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == Ky.size() && Ky.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends h1> T d(@l Class<T> modelClass, @l Constructor<T> constructor, @l Object... params) {
        l0.p(modelClass, "modelClass");
        l0.p(constructor, "constructor");
        l0.p(params, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(o1.a("Failed to access ", modelClass), e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(o1.a("An exception happened in constructor of ", modelClass), e6.getCause());
        }
    }
}
