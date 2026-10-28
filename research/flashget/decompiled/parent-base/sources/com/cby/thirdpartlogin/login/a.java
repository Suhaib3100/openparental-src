package com.cby.thirdpartlogin.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.f1;
import androidx.credentials.i1;
import androidx.credentials.j;
import androidx.credentials.l;
import androidx.credentials.m1;
import androidx.credentials.s1;
import androidx.fragment.app.Fragment;
import com.cby.thirdpartlogin.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException;
import fg.m;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.text.v;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import ld.p;
import org.apache.log4j.net.SyslogAppender;
import r8.a;

/* compiled from: GoogleCredentialsManager.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\nH\u0016¢\u0006\u0004\b(\u0010'J\u0017\u0010)\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b+\u0010*J\u0019\u0010-\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u0010\u0019\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b\u0019\u00100J\u0011\u00101\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b1\u00102J)\u00108\u001a\u00020\u00072\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u0002032\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0007H\u0016¢\u0006\u0004\b:\u0010\u0003R\u0018\u0010<\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010@R\u0016\u0010C\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010BR\u0018\u0010E\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010FR\u0018\u0010I\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010KR\u0016\u0010M\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010BR\u0018\u0010P\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lcom/cby/thirdpartlogin/login/a;", "Lcom/cby/thirdpartlogin/b;", "<init>", "()V", "Landroid/content/Context;", "t", "()Landroid/content/Context;", "Lkotlin/k2;", "y", "r", "", "autoSelectEnabled", "Lr8/a;", "u", "(Z)Lr8/a;", "Lr8/c;", "account", "Lz3/a;", "s", "(Lr8/c;)Lz3/a;", "Landroidx/credentials/i1;", "result", "w", "(Landroidx/credentials/i1;)V", "", "e", "Ly3/b;", "callback", "x", "(Ljava/lang/Throwable;Ly3/b;)V", "Landroidx/fragment/app/Fragment;", "fragment", "f", "(Landroidx/fragment/app/Fragment;)V", "Landroid/app/Activity;", "activity", "h", "(Landroid/app/Activity;)V", "i", "()Z", "j", "g", "(Ly3/b;)V", "c", "Ly3/c;", "d", "(Ly3/c;)V", "Ly3/a;", "(Ly3/a;)V", "b", "()Lz3/a;", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "a", "(IILandroid/content/Intent;)V", "k", "Landroid/app/Activity;", "mActivity", "Landroidx/fragment/app/Fragment;", "mFragment", "Lkotlinx/coroutines/r0;", "Lkotlinx/coroutines/r0;", "mScope", "Z", "isInited", "Ly3/b;", "mSignInCallback", "Ly3/c;", "mSignOutCallback", "Ly3/a;", "mRevokeAccessCallback", "Landroidx/credentials/l;", "Landroidx/credentials/l;", "mCredentialsManager", "isSignIn", "l", "Lz3/a;", "mResult", "ThirdPartLogin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nGoogleCredentialsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleCredentialsManager.kt\ncom/cby/thirdpartlogin/login/GoogleCredentialsManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,336:1\n1#2:337\n*E\n"})
/* loaded from: classes3.dex */
public final class a implements com.cby.thirdpartlogin.b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private Activity mActivity;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private Fragment mFragment;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @m
    private r0 mScope;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isInited;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @m
    private y3.b mSignInCallback;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @m
    private y3.c mSignOutCallback;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @m
    private y3.a mRevokeAccessCallback;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @m
    private l mCredentialsManager;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean isSignIn;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @m
    private z3.a mResult;

    /* compiled from: GoogleCredentialsManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.cby.thirdpartlogin.login.GoogleCredentialsManager$init$1", f = "GoogleCredentialsManager.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.cby.thirdpartlogin.login.a$a, reason: collision with other inner class name */
    static final class C0760a extends o implements p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f45788b;

        C0760a(kotlin.coroutines.d<? super C0760a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return a.this.new C0760a(dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r5.f45788b
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto Lf
                kotlin.a1.n(r6)     // Catch: java.lang.Throwable -> Ld
                goto L44
            Ld:
                r6 = move-exception
                goto L4c
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "ೇ"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r6.<init>(r0)
                throw r6
            L1b:
                kotlin.a1.n(r6)
                com.cby.thirdpartlogin.login.a r6 = com.cby.thirdpartlogin.login.a.this
                kotlin.z0$a r1 = kotlin.z0.INSTANCE     // Catch: java.lang.Throwable -> Ld
                androidx.credentials.h1$a r1 = new androidx.credentials.h1$a     // Catch: java.lang.Throwable -> Ld
                r1.<init>()     // Catch: java.lang.Throwable -> Ld
                r3 = 0
                r4 = 0
                r8.a r3 = com.cby.thirdpartlogin.login.a.v(r6, r3, r2, r4)     // Catch: java.lang.Throwable -> Ld
                androidx.credentials.h1$a r1 = r1.a(r3)     // Catch: java.lang.Throwable -> Ld
                androidx.credentials.h1 r1 = r1.b()     // Catch: java.lang.Throwable -> Ld
                androidx.credentials.l r6 = com.cby.thirdpartlogin.login.a.n(r6)     // Catch: java.lang.Throwable -> Ld
                if (r6 == 0) goto L47
                r5.f45788b = r2     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r6 = r6.e(r1, r5)     // Catch: java.lang.Throwable -> Ld
                if (r6 != r0) goto L44
                return r0
            L44:
                r4 = r6
                androidx.credentials.q1 r4 = (androidx.credentials.q1) r4     // Catch: java.lang.Throwable -> Ld
            L47:
                java.lang.Object r6 = kotlin.z0.b(r4)     // Catch: java.lang.Throwable -> Ld
                goto L52
            L4c:
                kotlin.z0$a r0 = kotlin.z0.INSTANCE
                java.lang.Object r6 = kotlin.a1.a(r6)
            L52:
                java.lang.Throwable r6 = kotlin.z0.e(r6)
                if (r6 == 0) goto L73
                a4.a r0 = a4.a.f185a
                java.lang.String r6 = r6.getMessage()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "ೈ"
                java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
                r1.<init>(r2)
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r0.b(r6)
            L73:
                kotlin.k2 r6 = kotlin.k2.f75408a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cby.thirdpartlogin.login.a.C0760a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // ld.p
        @m
        public final Object invoke(@fg.l r0 r0Var, @m kotlin.coroutines.d<? super k2> dVar) {
            return ((C0760a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: GoogleCredentialsManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class b extends n0 implements ld.l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f45790b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m Throwable th) {
            if (th != null) {
                a4.a.f185a.b(ProtectedSandApp.s("\u0cc9") + th.getMessage());
            }
        }
    }

    /* compiled from: GoogleCredentialsManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.cby.thirdpartlogin.login.GoogleCredentialsManager$revokeAccess$1", f = "GoogleCredentialsManager.kt", i = {}, l = {SyslogAppender.LOG_LOCAL6}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends o implements p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f45791b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f45792c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ y3.a f45793d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ a f45794e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y3.a aVar, a aVar2, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f45793d = aVar;
            this.f45794e = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f45793d, this.f45794e, dVar);
            cVar.f45792c = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r4) {
            /*
                r3 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r3.f45791b
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto Lf
                kotlin.a1.n(r4)     // Catch: java.lang.Throwable -> Ld
                goto L3a
            Ld:
                r4 = move-exception
                goto L43
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "ೊ"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r4.<init>(r0)
                throw r4
            L1b:
                kotlin.a1.n(r4)
                java.lang.Object r4 = r3.f45792c
                kotlinx.coroutines.r0 r4 = (kotlinx.coroutines.r0) r4
                com.cby.thirdpartlogin.login.a r4 = r3.f45794e
                kotlin.z0$a r1 = kotlin.z0.INSTANCE     // Catch: java.lang.Throwable -> Ld
                androidx.credentials.l r4 = com.cby.thirdpartlogin.login.a.n(r4)     // Catch: java.lang.Throwable -> Ld
                if (r4 == 0) goto L3d
                androidx.credentials.a r1 = new androidx.credentials.a     // Catch: java.lang.Throwable -> Ld
                r1.<init>()     // Catch: java.lang.Throwable -> Ld
                r3.f45791b = r2     // Catch: java.lang.Throwable -> Ld
                java.lang.Object r4 = r4.k(r1, r3)     // Catch: java.lang.Throwable -> Ld
                if (r4 != r0) goto L3a
                return r0
            L3a:
                kotlin.k2 r4 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> Ld
                goto L3e
            L3d:
                r4 = 0
            L3e:
                java.lang.Object r4 = kotlin.z0.b(r4)     // Catch: java.lang.Throwable -> Ld
                goto L49
            L43:
                kotlin.z0$a r0 = kotlin.z0.INSTANCE
                java.lang.Object r4 = kotlin.a1.a(r4)
            L49:
                java.lang.Throwable r4 = kotlin.z0.e(r4)
                if (r4 == 0) goto L6a
                a4.a r0 = a4.a.f185a
                java.lang.String r4 = r4.getMessage()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "ೋ"
                java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
                r1.<init>(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.b(r4)
            L6a:
                y3.a r4 = r3.f45793d
                if (r4 == 0) goto L71
                r4.onComplete()
            L71:
                kotlin.k2 r4 = kotlin.k2.f75408a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cby.thirdpartlogin.login.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // ld.p
        @m
        public final Object invoke(@fg.l r0 r0Var, @m kotlin.coroutines.d<? super k2> dVar) {
            return ((c) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: GoogleCredentialsManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class d extends n0 implements ld.l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f45795b = new d(1);

        d() {
            super(1);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m Throwable th) {
            if (th != null) {
                a4.a.f185a.b(ProtectedSandApp.s("ೌ") + th.getMessage());
            }
        }
    }

    /* compiled from: GoogleCredentialsManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.cby.thirdpartlogin.login.GoogleCredentialsManager$signIn$1", f = "GoogleCredentialsManager.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends o implements p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f45796b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f45797c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ y3.b f45798d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ a f45799e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(y3.b bVar, a aVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f45798d = bVar;
            this.f45799e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            e eVar = new e(this.f45798d, this.f45799e, dVar);
            eVar.f45797c = obj;
            return eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r6.f45796b
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 != r3) goto L14
                java.lang.Object r0 = r6.f45797c
                com.cby.thirdpartlogin.login.a r0 = (com.cby.thirdpartlogin.login.a) r0
                kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L12
                goto L59
            L12:
                r7 = move-exception
                goto L67
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "್"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r7.<init>(r0)
                throw r7
            L20:
                kotlin.a1.n(r7)
                java.lang.Object r7 = r6.f45797c
                kotlinx.coroutines.r0 r7 = (kotlinx.coroutines.r0) r7
                y3.b r7 = r6.f45798d
                r7.b()
                com.cby.thirdpartlogin.login.a r7 = r6.f45799e
                kotlin.z0$a r1 = kotlin.z0.INSTANCE     // Catch: java.lang.Throwable -> L12
                androidx.credentials.h1$a r1 = new androidx.credentials.h1$a     // Catch: java.lang.Throwable -> L12
                r1.<init>()     // Catch: java.lang.Throwable -> L12
                r4 = 0
                r8.a r4 = com.cby.thirdpartlogin.login.a.v(r7, r4, r3, r2)     // Catch: java.lang.Throwable -> L12
                androidx.credentials.h1$a r1 = r1.a(r4)     // Catch: java.lang.Throwable -> L12
                androidx.credentials.h1 r1 = r1.b()     // Catch: java.lang.Throwable -> L12
                androidx.credentials.l r4 = com.cby.thirdpartlogin.login.a.n(r7)     // Catch: java.lang.Throwable -> L12
                if (r4 == 0) goto L62
                android.content.Context r5 = com.cby.thirdpartlogin.login.a.l(r7)     // Catch: java.lang.Throwable -> L12
                r6.f45797c = r7     // Catch: java.lang.Throwable -> L12
                r6.f45796b = r3     // Catch: java.lang.Throwable -> L12
                java.lang.Object r1 = r4.f(r5, r1, r6)     // Catch: java.lang.Throwable -> L12
                if (r1 != r0) goto L57
                return r0
            L57:
                r0 = r7
                r7 = r1
            L59:
                androidx.credentials.i1 r7 = (androidx.credentials.i1) r7     // Catch: java.lang.Throwable -> L12
                if (r7 == 0) goto L62
                com.cby.thirdpartlogin.login.a.o(r0, r7)     // Catch: java.lang.Throwable -> L12
                kotlin.k2 r2 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L12
            L62:
                java.lang.Object r7 = kotlin.z0.b(r2)     // Catch: java.lang.Throwable -> L12
                goto L6d
            L67:
                kotlin.z0$a r0 = kotlin.z0.INSTANCE
                java.lang.Object r7 = kotlin.a1.a(r7)
            L6d:
                com.cby.thirdpartlogin.login.a r0 = r6.f45799e
                y3.b r1 = r6.f45798d
                java.lang.Throwable r7 = kotlin.z0.e(r7)
                if (r7 == 0) goto L95
                a4.a r2 = a4.a.f185a
                java.lang.String r3 = r7.getMessage()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "\u0cce"
                java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
                r4.<init>(r5)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                r2.b(r3)
                com.cby.thirdpartlogin.login.a.p(r0, r7, r1)
            L95:
                kotlin.k2 r7 = kotlin.k2.f75408a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cby.thirdpartlogin.login.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // ld.p
        @m
        public final Object invoke(@fg.l r0 r0Var, @m kotlin.coroutines.d<? super k2> dVar) {
            return ((e) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: GoogleCredentialsManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class f extends n0 implements ld.l<Throwable, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ y3.b f45801c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(y3.b bVar) {
            super(1);
            this.f45801c = bVar;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m Throwable th) {
            if (th == null) {
                if (a.this.isSignIn) {
                    this.f45801c.a(a.this.getMResult());
                    return;
                } else {
                    this.f45801c.c(0, ProtectedSandApp.s("\u0cd0"));
                    return;
                }
            }
            a4.a.f185a.b(ProtectedSandApp.s("\u0ccf") + th.getMessage());
            a.this.x(th, this.f45801c);
        }
    }

    /* compiled from: GoogleCredentialsManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.cby.thirdpartlogin.login.GoogleCredentialsManager$silentSignIn$1", f = "GoogleCredentialsManager.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends o implements p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f45802b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f45803c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ y3.b f45804d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ a f45805e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(y3.b bVar, a aVar, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f45804d = bVar;
            this.f45805e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            g gVar = new g(this.f45804d, this.f45805e, dVar);
            gVar.f45803c = obj;
            return gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r6.f45802b
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L13
                java.lang.Object r0 = r6.f45803c
                com.cby.thirdpartlogin.login.a r0 = (com.cby.thirdpartlogin.login.a) r0
                kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L11
                goto L57
            L11:
                r7 = move-exception
                goto L67
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "\u0cd1"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r7.<init>(r0)
                throw r7
            L1f:
                kotlin.a1.n(r7)
                java.lang.Object r7 = r6.f45803c
                kotlinx.coroutines.r0 r7 = (kotlinx.coroutines.r0) r7
                y3.b r7 = r6.f45804d
                r7.b()
                com.cby.thirdpartlogin.login.a r7 = r6.f45805e
                kotlin.z0$a r1 = kotlin.z0.INSTANCE     // Catch: java.lang.Throwable -> L11
                androidx.credentials.h1$a r1 = new androidx.credentials.h1$a     // Catch: java.lang.Throwable -> L11
                r1.<init>()     // Catch: java.lang.Throwable -> L11
                r8.a r3 = com.cby.thirdpartlogin.login.a.m(r7, r2)     // Catch: java.lang.Throwable -> L11
                androidx.credentials.h1$a r1 = r1.a(r3)     // Catch: java.lang.Throwable -> L11
                androidx.credentials.h1 r1 = r1.b()     // Catch: java.lang.Throwable -> L11
                androidx.credentials.l r3 = com.cby.thirdpartlogin.login.a.n(r7)     // Catch: java.lang.Throwable -> L11
                if (r3 == 0) goto L61
                android.content.Context r4 = com.cby.thirdpartlogin.login.a.l(r7)     // Catch: java.lang.Throwable -> L11
                r6.f45803c = r7     // Catch: java.lang.Throwable -> L11
                r6.f45802b = r2     // Catch: java.lang.Throwable -> L11
                java.lang.Object r1 = r3.f(r4, r1, r6)     // Catch: java.lang.Throwable -> L11
                if (r1 != r0) goto L55
                return r0
            L55:
                r0 = r7
                r7 = r1
            L57:
                androidx.credentials.i1 r7 = (androidx.credentials.i1) r7     // Catch: java.lang.Throwable -> L11
                if (r7 == 0) goto L61
                com.cby.thirdpartlogin.login.a.o(r0, r7)     // Catch: java.lang.Throwable -> L11
                kotlin.k2 r7 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L11
                goto L62
            L61:
                r7 = 0
            L62:
                java.lang.Object r7 = kotlin.z0.b(r7)     // Catch: java.lang.Throwable -> L11
                goto L6d
            L67:
                kotlin.z0$a r0 = kotlin.z0.INSTANCE
                java.lang.Object r7 = kotlin.a1.a(r7)
            L6d:
                com.cby.thirdpartlogin.login.a r0 = r6.f45805e
                y3.b r1 = r6.f45804d
                java.lang.Throwable r7 = kotlin.z0.e(r7)
                if (r7 == 0) goto L95
                a4.a r2 = a4.a.f185a
                java.lang.String r3 = r7.getMessage()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "\u0cd2"
                java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
                r4.<init>(r5)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                r2.b(r3)
                com.cby.thirdpartlogin.login.a.p(r0, r7, r1)
            L95:
                kotlin.k2 r7 = kotlin.k2.f75408a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cby.thirdpartlogin.login.a.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // ld.p
        @m
        public final Object invoke(@fg.l r0 r0Var, @m kotlin.coroutines.d<? super k2> dVar) {
            return ((g) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: GoogleCredentialsManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class h extends n0 implements ld.l<Throwable, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ y3.b f45807c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(y3.b bVar) {
            super(1);
            this.f45807c = bVar;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m Throwable th) {
            if (th == null) {
                if (a.this.isSignIn) {
                    this.f45807c.a(a.this.getMResult());
                    return;
                } else {
                    this.f45807c.c(0, ProtectedSandApp.s("\u0cd4"));
                    return;
                }
            }
            a4.a.f185a.b(ProtectedSandApp.s("\u0cd3") + th.getMessage());
            a.this.x(th, this.f45807c);
        }
    }

    private final void r() {
        if (!this.isInited) {
            throw new IllegalStateException(a.class.getSimpleName().concat(ProtectedSandApp.s("ೕ")).toString());
        }
    }

    private final z3.a s(r8.c account) {
        z3.a aVar = null;
        if (account != null) {
            String f89776e = account.getF89776e();
            String f89776e2 = account.getF89776e();
            String f89777f = account.getF89777f();
            String f89775d = account.getF89775d();
            Uri f89780i = account.getF89780i();
            aVar = new z3.a(f89776e, f89776e2, f89777f, f89775d, f89780i != null ? f89780i.getPath() : null);
        }
        a4.a.f185a.a(ProtectedSandApp.s("ೖ") + aVar);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context t() {
        Context context;
        Fragment fragment = this.mFragment;
        if (fragment == null || (context = fragment.getContext()) == null) {
            context = this.mActivity;
        }
        if (context != null) {
            return context;
        }
        throw new NullPointerException(ProtectedSandApp.s("\u0cd7"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r8.a u(boolean autoSelectEnabled) {
        String string = t().getString(c.l.J);
        l0.o(string, ProtectedSandApp.s("\u0cd8"));
        return new a.C1381a().d(false).g(string).c(autoSelectEnabled).b();
    }

    static /* synthetic */ r8.a v(a aVar, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        return aVar.u(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(i1 result) {
        String s4 = ProtectedSandApp.s("\u0cd9");
        j credential = result.getCredential();
        a4.a aVar = a4.a.f185a;
        aVar.a(ProtectedSandApp.s("\u0cda") + credential);
        if (credential instanceof s1) {
            aVar.a(ProtectedSandApp.s("\u0cdb") + ((s1) credential).getAuthenticationResponseJson());
            this.isSignIn = true;
            return;
        }
        if (credential instanceof m1) {
            m1 m1Var = (m1) credential;
            aVar.a(ProtectedSandApp.s("\u0cdc") + m1Var.getId() + ProtectedSandApp.s("ೝ") + m1Var.getPassword());
            this.isSignIn = true;
            return;
        }
        if (!(credential instanceof f1)) {
            aVar.b(ProtectedSandApp.s("೦"));
            return;
        }
        if (!l0.g(credential.getType(), ProtectedSandApp.s("ೞ"))) {
            aVar.b(ProtectedSandApp.s("\u0ce4"));
            y3.b bVar = this.mSignInCallback;
            if (bVar != null) {
                bVar.c(0, ProtectedSandApp.s("\u0ce5"));
                return;
            }
            return;
        }
        try {
            r8.c a5 = r8.c.INSTANCE.a(credential.getData());
            String f89776e = a5.getF89776e();
            aVar.a(v.p(s4 + a5.getF89775d() + ProtectedSandApp.s("\u0cdf") + f89776e + ProtectedSandApp.s("ೠ") + a5.getF89777f() + ProtectedSandApp.s("ೡ") + a5.getF89780i() + ProtectedSandApp.s("ೢ")));
            this.mResult = s(a5);
            this.isSignIn = true;
        } catch (GoogleIdTokenParsingException e4) {
            a4.a aVar2 = a4.a.f185a;
            String message = e4.getMessage();
            String s5 = ProtectedSandApp.s("ೣ");
            aVar2.b(s5 + message);
            y3.b bVar2 = this.mSignInCallback;
            if (bVar2 != null) {
                bVar2.c(0, s5 + e4.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(Throwable e4, y3.b callback) {
        if (e4 instanceof GetCredentialCancellationException) {
            callback.onCancel();
            return;
        }
        if (e4 instanceof NoCredentialException) {
            Intent intent = new Intent(ProtectedSandApp.s("೧"));
            intent.putExtra(ProtectedSandApp.s("೩"), new String[]{ProtectedSandApp.s("೨")});
            intent.setFlags(268468224);
            try {
                t().startActivity(intent);
            } catch (Exception e5) {
                a4.a aVar = a4.a.f185a;
                String localizedMessage = e5.getLocalizedMessage();
                l0.o(localizedMessage, ProtectedSandApp.s("೪"));
                aVar.b(localizedMessage);
            }
        }
        callback.c(0, e4.getMessage());
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x001e, code lost:
    
        r0 = kotlinx.coroutines.k.f(r1, null, null, new com.cby.thirdpartlogin.login.a.C0760a(r7, null), 3, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void y() {
        /*
            r7 = this;
            a4.a r0 = a4.a.f185a
            java.lang.String r1 = "೫"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r0.a(r1)
            androidx.credentials.l$a r0 = androidx.credentials.l.INSTANCE
            android.content.Context r1 = r7.t()
            androidx.credentials.l r0 = r0.a(r1)
            r7.mCredentialsManager = r0
            r0 = 1
            r7.isInited = r0
            kotlinx.coroutines.r0 r1 = r7.mScope
            if (r1 == 0) goto L33
            com.cby.thirdpartlogin.login.a$a r4 = new com.cby.thirdpartlogin.login.a$a
            r0 = 0
            r4.<init>(r0)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            kotlinx.coroutines.k2 r0 = kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L33
            com.cby.thirdpartlogin.login.a$b r1 = com.cby.thirdpartlogin.login.a.b.f45790b
            r0.F(r1)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cby.thirdpartlogin.login.a.y():void");
    }

    @Override // com.cby.thirdpartlogin.b
    public void a(int requestCode, int resultCode, @m Intent data) {
    }

    @Override // com.cby.thirdpartlogin.b
    @m
    /* renamed from: b, reason: from getter */
    public z3.a getMResult() {
        return this.mResult;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0020, code lost:
    
        r0 = kotlinx.coroutines.k.f(r2, null, null, new com.cby.thirdpartlogin.login.a.g(r9, r8, null), 3, null);
     */
    @Override // com.cby.thirdpartlogin.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(@fg.l y3.b r9) {
        /*
            r8 = this;
            java.lang.String r0 = "೬"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r9, r0)
            r8.r()
            a4.a r0 = a4.a.f185a
            java.lang.String r1 = "೭"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r0.a(r1)
            r8.mSignInCallback = r9
            r9.onStart()
            kotlinx.coroutines.r0 r2 = r8.mScope
            if (r2 == 0) goto L38
            com.cby.thirdpartlogin.login.a$g r5 = new com.cby.thirdpartlogin.login.a$g
            r0 = 0
            r5.<init>(r9, r8, r0)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            kotlinx.coroutines.k2 r0 = kotlinx.coroutines.i.e(r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L38
            com.cby.thirdpartlogin.login.a$h r1 = new com.cby.thirdpartlogin.login.a$h
            r1.<init>(r9)
            r0.F(r1)
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cby.thirdpartlogin.login.a.c(y3.b):void");
    }

    @Override // com.cby.thirdpartlogin.b
    public void d(@m y3.c callback) {
        r();
        a4.a.f185a.a(ProtectedSandApp.s("೮"));
        this.mSignOutCallback = callback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0014, code lost:
    
        r9 = kotlinx.coroutines.k.f(r2, null, null, new com.cby.thirdpartlogin.login.a.c(r9, r8, null), 3, null);
     */
    @Override // com.cby.thirdpartlogin.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(@fg.m y3.a r9) {
        /*
            r8 = this;
            r8.r()
            a4.a r0 = a4.a.f185a
            java.lang.String r1 = "೯"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r0.a(r1)
            r8.mRevokeAccessCallback = r9
            kotlinx.coroutines.r0 r2 = r8.mScope
            if (r2 == 0) goto L29
            com.cby.thirdpartlogin.login.a$c r5 = new com.cby.thirdpartlogin.login.a$c
            r0 = 0
            r5.<init>(r9, r8, r0)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            kotlinx.coroutines.k2 r9 = kotlinx.coroutines.i.e(r2, r3, r4, r5, r6, r7)
            if (r9 == 0) goto L29
            com.cby.thirdpartlogin.login.a$d r0 = com.cby.thirdpartlogin.login.a.d.f45795b
            r9.F(r0)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cby.thirdpartlogin.login.a.e(y3.a):void");
    }

    @Override // com.cby.thirdpartlogin.b
    public void f(@fg.l Fragment fragment) {
        l0.p(fragment, ProtectedSandApp.s("\u0cf0"));
        this.mFragment = fragment;
        this.mScope = s0.a(j1.c());
        y();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0020, code lost:
    
        r0 = kotlinx.coroutines.k.f(r2, null, null, new com.cby.thirdpartlogin.login.a.e(r9, r8, null), 3, null);
     */
    @Override // com.cby.thirdpartlogin.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(@fg.l y3.b r9) {
        /*
            r8 = this;
            java.lang.String r0 = "೬"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r9, r0)
            r8.r()
            a4.a r0 = a4.a.f185a
            java.lang.String r1 = "ೱ"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r0.a(r1)
            r8.mSignInCallback = r9
            r9.onStart()
            kotlinx.coroutines.r0 r2 = r8.mScope
            if (r2 == 0) goto L38
            com.cby.thirdpartlogin.login.a$e r5 = new com.cby.thirdpartlogin.login.a$e
            r0 = 0
            r5.<init>(r9, r8, r0)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            kotlinx.coroutines.k2 r0 = kotlinx.coroutines.i.e(r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L38
            com.cby.thirdpartlogin.login.a$f r1 = new com.cby.thirdpartlogin.login.a$f
            r1.<init>(r9)
            r0.F(r1)
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cby.thirdpartlogin.login.a.g(y3.b):void");
    }

    @Override // com.cby.thirdpartlogin.b
    public void h(@fg.l Activity activity) {
        l0.p(activity, ProtectedSandApp.s("ೲ"));
        this.mActivity = activity;
        this.mScope = s0.a(j1.c());
        y();
    }

    @Override // com.cby.thirdpartlogin.b
    /* renamed from: i, reason: from getter */
    public boolean getIsInited() {
        return this.isInited;
    }

    @Override // com.cby.thirdpartlogin.b
    /* renamed from: j, reason: from getter */
    public boolean getIsSignIn() {
        return this.isSignIn;
    }

    @Override // com.cby.thirdpartlogin.b
    public void k() {
        this.mSignInCallback = null;
        this.mSignOutCallback = null;
        this.mRevokeAccessCallback = null;
    }
}
