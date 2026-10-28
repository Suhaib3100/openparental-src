package kotlin;

import android.view.c1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: InitializerViewModelFactory.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B.\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R+\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\b\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Ll0/h;", "Landroidx/lifecycle/c1;", "T", "", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "()Ljava/lang/Class;", "clazz", "Lkotlin/Function1;", "Ll0/a;", "Lkotlin/u;", "b", "Lq3/l;", "()Lq3/l;", "initializer", "<init>", "(Ljava/lang/Class;Lq3/l;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
/* renamed from: l0.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0543h<T extends android.view.c1> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Class<T> clazz;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final q3.l<AbstractC0540a, T> initializer;

    /* JADX WARN: Multi-variable type inference failed */
    public C0543h(@d5.d Class<T> cls, @d5.d q3.l<? super AbstractC0540a, ? extends T> lVar) {
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("\u1b4e"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("\u1b4f"));
        this.clazz = cls;
        this.initializer = lVar;
    }

    @d5.d
    public final Class<T> a() {
        return this.clazz;
    }

    @d5.d
    public final q3.l<AbstractC0540a, T> b() {
        return this.initializer;
    }
}
