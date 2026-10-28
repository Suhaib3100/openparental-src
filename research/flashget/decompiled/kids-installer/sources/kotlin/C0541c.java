package kotlin;

import android.view.f1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.KClass;

/* compiled from: InitializerViewModelFactory.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\bJ\u0006\u0010\r\u001a\u00020\fR\u001e\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0014"}, d2 = {"Ll0/c;", "", "Landroidx/lifecycle/c1;", "T", "Lkotlin/reflect/d;", "clazz", "Lkotlin/Function1;", "Ll0/a;", "Lkotlin/u;", "initializer", "Lkotlin/m2;", "a", "Landroidx/lifecycle/f1$b;", "b", "", "Ll0/h;", "Ljava/util/List;", "initializers", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
@g
/* renamed from: l0.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0541c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final List<C0543h<?>> initializers = new ArrayList();

    public final <T extends android.view.c1> void a(@d5.d KClass<T> kClass, @d5.d q3.l<? super AbstractC0540a, ? extends T> lVar) {
        kotlin.jvm.internal.l0.p(kClass, ProtectedSandApp.s("ᭈ"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ᭉ"));
        this.initializers.add(new C0543h<>(p3.b.e(kClass), lVar));
    }

    @d5.d
    public final f1.b b() {
        Object[] array = this.initializers.toArray(new C0543h[0]);
        if (array == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᭊ"));
        }
        C0543h[] c0543hArr = (C0543h[]) array;
        return new b((C0543h[]) Arrays.copyOf(c0543hArr, c0543hArr.length));
    }
}
