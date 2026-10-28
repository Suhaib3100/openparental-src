package f1;

import android.app.Application;
import android.view.C0524b;
import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import org.apache.log4j.Logger;

/* compiled from: KidAboutActivityViewModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/flashget/kidsdownloader/viewmodel/KidAboutActivityViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "logger", "Lorg/apache/log4j/Logger;", "kotlin.jvm.PlatformType", "Install_intlRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends C0524b {

    /* renamed from: e, reason: collision with root package name */
    private final Logger f22548e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@d Application application) {
        super(application);
        l0.p(application, ProtectedSandApp.s("⯢"));
        this.f22548e = Logger.getLogger(ProtectedSandApp.s("⯣"));
    }
}
