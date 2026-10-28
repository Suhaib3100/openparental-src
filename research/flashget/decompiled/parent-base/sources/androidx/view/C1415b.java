package androidx.view;

import android.app.Application;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: AndroidViewModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0006*\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/b;", "Landroidx/lifecycle/h1;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "T", "b", "()Landroid/app/Application;", "a", "Landroid/app/Application;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1415b extends h1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final Application application;

    public C1415b(@l Application application) {
        l0.p(application, "application");
        this.application = application;
    }

    @l
    public <T extends Application> T b() {
        T t4 = (T) this.application;
        l0.n(t4, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t4;
    }
}
