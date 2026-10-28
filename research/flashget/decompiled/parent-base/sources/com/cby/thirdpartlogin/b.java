package com.cby.thirdpartlogin;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;

/* compiled from: IThirdLogin.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \"2\u00020\u0001:\u0001\"J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0013\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\"\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010 H&¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0004H&¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/cby/thirdpartlogin/b;", "", "Landroidx/fragment/app/Fragment;", "fragment", "Lkotlin/k2;", "f", "(Landroidx/fragment/app/Fragment;)V", "Landroid/app/Activity;", "activity", "h", "(Landroid/app/Activity;)V", "", "i", "()Z", "j", "Ly3/b;", "callback", "g", "(Ly3/b;)V", "c", "Ly3/c;", "d", "(Ly3/c;)V", "Ly3/a;", "e", "(Ly3/a;)V", "Lz3/a;", "b", "()Lz3/a;", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "a", "(IILandroid/content/Intent;)V", "k", "()V", "ThirdPartLogin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = Companion.f45015a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f45014b = 301;

    /* compiled from: IThirdLogin.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/cby/thirdpartlogin/b$a;", "", "<init>", "()V", "", "b", "I", "RC_SIGN_IN", "ThirdPartLogin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.cby.thirdpartlogin.b$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f45015a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int RC_SIGN_IN = 301;

        private Companion() {
        }
    }

    /* compiled from: IThirdLogin.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.cby.thirdpartlogin.b$b, reason: collision with other inner class name */
    public static final class C0758b {
        public static /* synthetic */ void a(b bVar, y3.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("\u0cc5"));
            }
            if ((i4 & 1) != 0) {
                aVar = null;
            }
            bVar.e(aVar);
        }

        public static /* synthetic */ void b(b bVar, y3.c cVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("ೆ"));
            }
            if ((i4 & 1) != 0) {
                cVar = null;
            }
            bVar.d(cVar);
        }
    }

    void a(int requestCode, int resultCode, @m Intent data);

    @m
    z3.a b();

    void c(@l y3.b callback);

    void d(@m y3.c callback);

    void e(@m y3.a callback);

    void f(@l Fragment fragment);

    void g(@l y3.b callback);

    void h(@l Activity activity);

    boolean i();

    boolean j();

    void k();
}
