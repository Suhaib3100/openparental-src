package kotlin;

import android.view.f1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: InitializerViewModelFactory.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u000e\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n\"\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\u000e\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Ll0/b;", "Landroidx/lifecycle/f1$b;", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "Ll0/a;", "extras", "c", "(Ljava/lang/Class;Ll0/a;)Landroidx/lifecycle/c1;", "", "Ll0/h;", "b", "[Ll0/h;", "initializers", "<init>", "([Ll0/h;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class b implements f1.b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final C0543h<?>[] initializers;

    public b(@d5.d C0543h<?>... c0543hArr) {
        kotlin.jvm.internal.l0.p(c0543hArr, ProtectedSandApp.s("⯥"));
        this.initializers = c0543hArr;
    }

    @Override // androidx.lifecycle.f1.b
    @d5.d
    public <T extends android.view.c1> T c(@d5.d Class<T> modelClass, @d5.d AbstractC0540a extras) {
        kotlin.jvm.internal.l0.p(modelClass, ProtectedSandApp.s("⯦"));
        kotlin.jvm.internal.l0.p(extras, ProtectedSandApp.s("⯧"));
        T t5 = null;
        for (C0543h<?> c0543h : this.initializers) {
            if (kotlin.jvm.internal.l0.g(c0543h.a(), modelClass)) {
                Object N = c0543h.b().N(extras);
                t5 = N instanceof android.view.c1 ? (T) N : null;
            }
        }
        if (t5 != null) {
            return t5;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("⯨").concat(modelClass.getName()));
    }
}
