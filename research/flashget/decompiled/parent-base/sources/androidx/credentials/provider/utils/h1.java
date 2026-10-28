package androidx.credentials.provider.utils;

import android.annotation.SuppressLint;
import android.app.slice.Slice;
import android.content.pm.SigningInfo;
import android.os.Bundle;
import android.service.credentials.Action;
import android.service.credentials.BeginGetCredentialOption;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.BeginGetCredentialResponse;
import android.service.credentials.CallingAppInfo;
import android.service.credentials.CredentialEntry;
import android.service.credentials.RemoteEntry;
import androidx.annotation.c1;
import androidx.credentials.provider.a;
import androidx.credentials.provider.f0;
import androidx.credentials.provider.g2;
import androidx.credentials.provider.o;
import androidx.credentials.provider.u;
import androidx.credentials.provider.utils.h1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: BeginGetCredentialUtil.kt */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/credentials/provider/utils/h1;", "", "<init>", "()V", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(34)
/* loaded from: classes3.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: BeginGetCredentialUtil.kt */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ%\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020!2\u0006\u0010\"\u001a\u00020#¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Landroidx/credentials/provider/utils/h1$a;", "", "<init>", "()V", "Landroid/service/credentials/BeginGetCredentialResponse$Builder;", "frameworkBuilder", "Landroidx/credentials/provider/g2;", "remoteEntry", "Lkotlin/k2;", "D", "(Landroid/service/credentials/BeginGetCredentialResponse$Builder;Landroidx/credentials/provider/g2;)V", "", "Landroidx/credentials/provider/o;", "authenticationActions", "B", "(Landroid/service/credentials/BeginGetCredentialResponse$Builder;Ljava/util/List;)V", "builder", "Landroidx/credentials/provider/a;", "actionEntries", "A", "Landroidx/credentials/provider/f0;", "credentialEntries", "C", "Landroidx/credentials/provider/u;", "option", "Landroid/service/credentials/BeginGetCredentialOption;", "o", "(Landroidx/credentials/provider/u;)Landroid/service/credentials/BeginGetCredentialOption;", "Landroid/service/credentials/BeginGetCredentialRequest;", "request", "Landroidx/credentials/provider/v;", "p", "(Landroid/service/credentials/BeginGetCredentialRequest;)Landroidx/credentials/provider/v;", "Landroidx/credentials/provider/w;", "response", "Landroid/service/credentials/BeginGetCredentialResponse;", "n", "(Landroidx/credentials/provider/w;)Landroid/service/credentials/BeginGetCredentialResponse;", "l", "(Landroidx/credentials/provider/v;)Landroid/service/credentials/BeginGetCredentialRequest;", "q", "(Landroid/service/credentials/BeginGetCredentialResponse;)Landroidx/credentials/provider/w;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nBeginGetCredentialUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginGetCredentialUtil.kt\nandroidx/credentials/provider/utils/BeginGetCredentialUtil$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1855#2,2:187\n1855#2,2:189\n1855#2,2:191\n1855#2,2:193\n1#3:195\n*S KotlinDebug\n*F\n+ 1 BeginGetCredentialUtil.kt\nandroidx/credentials/provider/utils/BeginGetCredentialUtil$Companion\n*L\n42#1:187,2\n85#1:189,2\n96#1:191,2\n105#1:193,2\n*E\n"})
    /* renamed from: androidx.credentials.provider.utils.h1$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: BeginGetCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/credentials/provider/u;", "kotlin.jvm.PlatformType", "option", "Landroid/service/credentials/BeginGetCredentialOption;", "a", "(Landroidx/credentials/provider/u;)Landroid/service/credentials/BeginGetCredentialOption;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.credentials.provider.utils.h1$a$a, reason: collision with other inner class name */
        static final class C0453a extends kotlin.jvm.internal.n0 implements ld.l<androidx.credentials.provider.u, BeginGetCredentialOption> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0453a f28162b = new C0453a(1);

            C0453a() {
                super(1);
            }

            @Override // ld.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BeginGetCredentialOption invoke(androidx.credentials.provider.u option) {
                Companion companion = h1.INSTANCE;
                kotlin.jvm.internal.l0.o(option, "option");
                return companion.o(option);
            }
        }

        /* compiled from: BeginGetCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/service/credentials/CredentialEntry;", "kotlin.jvm.PlatformType", "entry", "Landroidx/credentials/provider/f0;", "a", "(Landroid/service/credentials/CredentialEntry;)Landroidx/credentials/provider/f0;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.credentials.provider.utils.h1$a$b */
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<CredentialEntry, androidx.credentials.provider.f0> {

            /* renamed from: b, reason: collision with root package name */
            public static final b f28163b = new b(1);

            b() {
                super(1);
            }

            @fg.m
            public final androidx.credentials.provider.f0 a(CredentialEntry credentialEntry) {
                Slice slice;
                f0.Companion companion = androidx.credentials.provider.f0.INSTANCE;
                slice = credentialEntry.getSlice();
                kotlin.jvm.internal.l0.o(slice, "entry.slice");
                return companion.b(slice);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ androidx.credentials.provider.f0 invoke(CredentialEntry credentialEntry) {
                return a(i1.a(credentialEntry));
            }
        }

        /* compiled from: BeginGetCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/provider/f0;", "entry", "", "a", "(Landroidx/credentials/provider/f0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.credentials.provider.utils.h1$a$c */
        static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.credentials.provider.f0, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public static final c f28164b = new c(1);

            c() {
                super(1);
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@fg.m androidx.credentials.provider.f0 f0Var) {
                return Boolean.valueOf(f0Var != null);
            }
        }

        /* compiled from: BeginGetCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/provider/f0;", "entry", "kotlin.jvm.PlatformType", "a", "(Landroidx/credentials/provider/f0;)Landroidx/credentials/provider/f0;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.credentials.provider.utils.h1$a$d */
        static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.credentials.provider.f0, androidx.credentials.provider.f0> {

            /* renamed from: b, reason: collision with root package name */
            public static final d f28165b = new d(1);

            d() {
                super(1);
            }

            public final androidx.credentials.provider.f0 a(@fg.m androidx.credentials.provider.f0 f0Var) {
                kotlin.jvm.internal.l0.m(f0Var);
                return f0Var;
            }

            @Override // ld.l
            public androidx.credentials.provider.f0 invoke(androidx.credentials.provider.f0 f0Var) {
                androidx.credentials.provider.f0 f0Var2 = f0Var;
                kotlin.jvm.internal.l0.m(f0Var2);
                return f0Var2;
            }
        }

        /* compiled from: BeginGetCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/service/credentials/Action;", "kotlin.jvm.PlatformType", "entry", "Landroidx/credentials/provider/a;", "a", "(Landroid/service/credentials/Action;)Landroidx/credentials/provider/a;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.credentials.provider.utils.h1$a$e */
        static final class e extends kotlin.jvm.internal.n0 implements ld.l<Action, androidx.credentials.provider.a> {

            /* renamed from: b, reason: collision with root package name */
            public static final e f28166b = new e(1);

            e() {
                super(1);
            }

            @fg.m
            public final androidx.credentials.provider.a a(Action action) {
                Slice slice;
                a.Companion companion = androidx.credentials.provider.a.INSTANCE;
                slice = action.getSlice();
                kotlin.jvm.internal.l0.o(slice, "entry.slice");
                return companion.b(slice);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ androidx.credentials.provider.a invoke(Action action) {
                return a(l1.a(action));
            }
        }

        /* compiled from: BeginGetCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/provider/a;", "entry", "", "a", "(Landroidx/credentials/provider/a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.credentials.provider.utils.h1$a$f */
        static final class f extends kotlin.jvm.internal.n0 implements ld.l<androidx.credentials.provider.a, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public static final f f28167b = new f(1);

            f() {
                super(1);
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@fg.m androidx.credentials.provider.a aVar) {
                return Boolean.valueOf(aVar != null);
            }
        }

        /* compiled from: BeginGetCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/provider/a;", "entry", "kotlin.jvm.PlatformType", "a", "(Landroidx/credentials/provider/a;)Landroidx/credentials/provider/a;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.credentials.provider.utils.h1$a$g */
        static final class g extends kotlin.jvm.internal.n0 implements ld.l<androidx.credentials.provider.a, androidx.credentials.provider.a> {

            /* renamed from: b, reason: collision with root package name */
            public static final g f28168b = new g(1);

            g() {
                super(1);
            }

            public final androidx.credentials.provider.a a(@fg.m androidx.credentials.provider.a aVar) {
                kotlin.jvm.internal.l0.m(aVar);
                return aVar;
            }

            @Override // ld.l
            public androidx.credentials.provider.a invoke(androidx.credentials.provider.a aVar) {
                androidx.credentials.provider.a aVar2 = aVar;
                kotlin.jvm.internal.l0.m(aVar2);
                return aVar2;
            }
        }

        /* compiled from: BeginGetCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/service/credentials/Action;", "kotlin.jvm.PlatformType", "entry", "Landroidx/credentials/provider/o;", "a", "(Landroid/service/credentials/Action;)Landroidx/credentials/provider/o;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.credentials.provider.utils.h1$a$h */
        static final class h extends kotlin.jvm.internal.n0 implements ld.l<Action, androidx.credentials.provider.o> {

            /* renamed from: b, reason: collision with root package name */
            public static final h f28169b = new h(1);

            h() {
                super(1);
            }

            @fg.m
            public final androidx.credentials.provider.o a(Action action) {
                Slice slice;
                o.Companion companion = androidx.credentials.provider.o.INSTANCE;
                slice = action.getSlice();
                kotlin.jvm.internal.l0.o(slice, "entry.slice");
                return companion.b(slice);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ androidx.credentials.provider.o invoke(Action action) {
                return a(l1.a(action));
            }
        }

        /* compiled from: BeginGetCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/provider/o;", "entry", "", "a", "(Landroidx/credentials/provider/o;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.credentials.provider.utils.h1$a$i */
        static final class i extends kotlin.jvm.internal.n0 implements ld.l<androidx.credentials.provider.o, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public static final i f28170b = new i(1);

            i() {
                super(1);
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@fg.m androidx.credentials.provider.o oVar) {
                return Boolean.valueOf(oVar != null);
            }
        }

        /* compiled from: BeginGetCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/provider/o;", "entry", "kotlin.jvm.PlatformType", "a", "(Landroidx/credentials/provider/o;)Landroidx/credentials/provider/o;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.credentials.provider.utils.h1$a$j */
        static final class j extends kotlin.jvm.internal.n0 implements ld.l<androidx.credentials.provider.o, androidx.credentials.provider.o> {

            /* renamed from: b, reason: collision with root package name */
            public static final j f28171b = new j(1);

            j() {
                super(1);
            }

            public final androidx.credentials.provider.o a(@fg.m androidx.credentials.provider.o oVar) {
                kotlin.jvm.internal.l0.m(oVar);
                return oVar;
            }

            @Override // ld.l
            public androidx.credentials.provider.o invoke(androidx.credentials.provider.o oVar) {
                androidx.credentials.provider.o oVar2 = oVar;
                kotlin.jvm.internal.l0.m(oVar2);
                return oVar2;
            }
        }

        private Companion() {
        }

        private final void A(BeginGetCredentialResponse.Builder builder, List<androidx.credentials.provider.a> actionEntries) {
            for (androidx.credentials.provider.a aVar : actionEntries) {
                j0.a();
                builder.addAction(h0.a(androidx.credentials.provider.a.INSTANCE.c(aVar)));
            }
        }

        private final void B(BeginGetCredentialResponse.Builder frameworkBuilder, List<androidx.credentials.provider.o> authenticationActions) {
            for (androidx.credentials.provider.o oVar : authenticationActions) {
                j0.a();
                frameworkBuilder.addAuthenticationAction(h0.a(androidx.credentials.provider.o.INSTANCE.c(oVar)));
            }
        }

        private final void C(BeginGetCredentialResponse.Builder builder, List<? extends androidx.credentials.provider.f0> credentialEntries) {
            for (androidx.credentials.provider.f0 f0Var : credentialEntries) {
                Slice c5 = androidx.credentials.provider.f0.INSTANCE.c(f0Var);
                if (c5 != null) {
                    m0.a();
                    n0.a();
                    builder.addCredentialEntry(l0.a(k0.a(f0Var.getBeginGetCredentialOption().getId(), f0Var.getType(), Bundle.EMPTY), c5));
                }
            }
        }

        @SuppressLint({"MissingPermission"})
        private final void D(BeginGetCredentialResponse.Builder frameworkBuilder, g2 remoteEntry) {
            if (remoteEntry == null) {
                return;
            }
            androidx.credentials.provider.utils.f.a();
            frameworkBuilder.setRemoteCredentialEntry(androidx.credentials.provider.utils.e.a(g2.INSTANCE.c(remoteEntry)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BeginGetCredentialOption m(ld.l tmp0, Object obj) {
            kotlin.jvm.internal.l0.p(tmp0, "$tmp0");
            return r0.a(tmp0.invoke(obj));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final BeginGetCredentialOption o(androidx.credentials.provider.u option) {
            n0.a();
            return k0.a(option.getId(), option.getType(), option.getCandidateQueryData());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean r(ld.l tmp0, Object obj) {
            kotlin.jvm.internal.l0.p(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.credentials.provider.a s(ld.l tmp0, Object obj) {
            kotlin.jvm.internal.l0.p(tmp0, "$tmp0");
            return (androidx.credentials.provider.a) tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.credentials.provider.o t(ld.l tmp0, Object obj) {
            kotlin.jvm.internal.l0.p(tmp0, "$tmp0");
            return (androidx.credentials.provider.o) tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean u(ld.l tmp0, Object obj) {
            kotlin.jvm.internal.l0.p(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.credentials.provider.o v(ld.l tmp0, Object obj) {
            kotlin.jvm.internal.l0.p(tmp0, "$tmp0");
            return (androidx.credentials.provider.o) tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.credentials.provider.f0 w(ld.l tmp0, Object obj) {
            kotlin.jvm.internal.l0.p(tmp0, "$tmp0");
            return (androidx.credentials.provider.f0) tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean x(ld.l tmp0, Object obj) {
            kotlin.jvm.internal.l0.p(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.credentials.provider.f0 y(ld.l tmp0, Object obj) {
            kotlin.jvm.internal.l0.p(tmp0, "$tmp0");
            return (androidx.credentials.provider.f0) tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.credentials.provider.a z(ld.l tmp0, Object obj) {
            kotlin.jvm.internal.l0.p(tmp0, "$tmp0");
            return (androidx.credentials.provider.a) tmp0.invoke(obj);
        }

        @fg.l
        public final BeginGetCredentialRequest l(@fg.l androidx.credentials.provider.v request) {
            BeginGetCredentialRequest.Builder beginGetCredentialOptions;
            BeginGetCredentialRequest build;
            kotlin.jvm.internal.l0.p(request, "request");
            BeginGetCredentialRequest.Builder a5 = g0.a();
            if (request.getCallingAppInfo() != null) {
                androidx.credentials.provider.utils.c.a();
                a5.setCallingAppInfo(q.a(request.getCallingAppInfo().getPackageName(), request.getCallingAppInfo().getSigningInfo(), request.getCallingAppInfo().getOrigin()));
            }
            Stream<androidx.credentials.provider.u> stream = request.c().stream();
            final C0453a c0453a = C0453a.f28162b;
            beginGetCredentialOptions = a5.setBeginGetCredentialOptions((List) stream.map(new Function() { // from class: androidx.credentials.provider.utils.g1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    BeginGetCredentialOption m4;
                    m4 = h1.Companion.m(ld.l.this, obj);
                    return m4;
                }
            }).collect(Collectors.toList()));
            build = beginGetCredentialOptions.build();
            kotlin.jvm.internal.l0.o(build, "builder\n                …\n                .build()");
            return build;
        }

        @fg.l
        public final BeginGetCredentialResponse n(@fg.l androidx.credentials.provider.w response) {
            BeginGetCredentialResponse build;
            kotlin.jvm.internal.l0.p(response, "response");
            BeginGetCredentialResponse.Builder a5 = o0.a();
            C(a5, response.e());
            A(a5, response.c());
            B(a5, response.d());
            D(a5, response.getRemoteEntry());
            build = a5.build();
            kotlin.jvm.internal.l0.o(build, "frameworkBuilder.build()");
            return build;
        }

        @fg.l
        @kd.n
        public final androidx.credentials.provider.v p(@fg.l BeginGetCredentialRequest request) {
            List beginGetCredentialOptions;
            CallingAppInfo callingAppInfo;
            androidx.credentials.provider.a0 a0Var;
            String packageName;
            SigningInfo signingInfo;
            String origin;
            String id2;
            String type;
            Bundle candidateQueryData;
            kotlin.jvm.internal.l0.p(request, "request");
            ArrayList arrayList = new ArrayList();
            beginGetCredentialOptions = request.getBeginGetCredentialOptions();
            kotlin.jvm.internal.l0.o(beginGetCredentialOptions, "request.beginGetCredentialOptions");
            Iterator it = beginGetCredentialOptions.iterator();
            while (it.hasNext()) {
                BeginGetCredentialOption a5 = r0.a(it.next());
                u.Companion companion = androidx.credentials.provider.u.INSTANCE;
                id2 = a5.getId();
                kotlin.jvm.internal.l0.o(id2, "it.id");
                type = a5.getType();
                kotlin.jvm.internal.l0.o(type, "it.type");
                candidateQueryData = a5.getCandidateQueryData();
                kotlin.jvm.internal.l0.o(candidateQueryData, "it.candidateQueryData");
                arrayList.add(companion.a(id2, type, candidateQueryData));
            }
            callingAppInfo = request.getCallingAppInfo();
            if (callingAppInfo != null) {
                packageName = callingAppInfo.getPackageName();
                kotlin.jvm.internal.l0.o(packageName, "it.packageName");
                signingInfo = callingAppInfo.getSigningInfo();
                kotlin.jvm.internal.l0.o(signingInfo, "it.signingInfo");
                origin = callingAppInfo.getOrigin();
                a0Var = new androidx.credentials.provider.a0(packageName, signingInfo, origin);
            } else {
                a0Var = null;
            }
            return new androidx.credentials.provider.v(arrayList, a0Var);
        }

        @fg.l
        public final androidx.credentials.provider.w q(@fg.l BeginGetCredentialResponse response) {
            List credentialEntries;
            List actions;
            List authenticationActions;
            RemoteEntry remoteCredentialEntry;
            g2 g2Var;
            Slice slice;
            kotlin.jvm.internal.l0.p(response, "response");
            credentialEntries = response.getCredentialEntries();
            Stream stream = credentialEntries.stream();
            final b bVar = b.f28163b;
            Stream map = stream.map(new Function() { // from class: androidx.credentials.provider.utils.z0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    androidx.credentials.provider.f0 w4;
                    w4 = h1.Companion.w(ld.l.this, obj);
                    return w4;
                }
            });
            final c cVar = c.f28164b;
            Stream filter = map.filter(new Predicate() { // from class: androidx.credentials.provider.utils.a1
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean x4;
                    x4 = h1.Companion.x(ld.l.this, obj);
                    return x4;
                }
            });
            final d dVar = d.f28165b;
            Object collect = filter.map(new Function() { // from class: androidx.credentials.provider.utils.b1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    androidx.credentials.provider.f0 y4;
                    y4 = h1.Companion.y(ld.l.this, obj);
                    return y4;
                }
            }).collect(Collectors.toList());
            kotlin.jvm.internal.l0.o(collect, "response.credentialEntri…lect(Collectors.toList())");
            List list = (List) collect;
            actions = response.getActions();
            Stream stream2 = actions.stream();
            final e eVar = e.f28166b;
            Stream map2 = stream2.map(new Function() { // from class: androidx.credentials.provider.utils.c1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    androidx.credentials.provider.a z4;
                    z4 = h1.Companion.z(ld.l.this, obj);
                    return z4;
                }
            });
            final f fVar = f.f28167b;
            Stream filter2 = map2.filter(new Predicate() { // from class: androidx.credentials.provider.utils.d1
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean r4;
                    r4 = h1.Companion.r(ld.l.this, obj);
                    return r4;
                }
            });
            final g gVar = g.f28168b;
            Object collect2 = filter2.map(new Function() { // from class: androidx.credentials.provider.utils.e1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    androidx.credentials.provider.a s4;
                    s4 = h1.Companion.s(ld.l.this, obj);
                    return s4;
                }
            }).collect(Collectors.toList());
            kotlin.jvm.internal.l0.o(collect2, "response.actions\n       …lect(Collectors.toList())");
            List list2 = (List) collect2;
            authenticationActions = response.getAuthenticationActions();
            Stream stream3 = authenticationActions.stream();
            final h hVar = h.f28169b;
            Stream map3 = stream3.map(new Function() { // from class: androidx.credentials.provider.utils.f1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    androidx.credentials.provider.o t4;
                    t4 = h1.Companion.t(ld.l.this, obj);
                    return t4;
                }
            });
            final i iVar = i.f28170b;
            Stream filter3 = map3.filter(new Predicate() { // from class: androidx.credentials.provider.utils.x0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean u4;
                    u4 = h1.Companion.u(ld.l.this, obj);
                    return u4;
                }
            });
            final j jVar = j.f28171b;
            Object collect3 = filter3.map(new Function() { // from class: androidx.credentials.provider.utils.y0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    androidx.credentials.provider.o v4;
                    v4 = h1.Companion.v(ld.l.this, obj);
                    return v4;
                }
            }).collect(Collectors.toList());
            kotlin.jvm.internal.l0.o(collect3, "response.authenticationA…lect(Collectors.toList())");
            List list3 = (List) collect3;
            remoteCredentialEntry = response.getRemoteCredentialEntry();
            if (remoteCredentialEntry != null) {
                g2.Companion companion = g2.INSTANCE;
                slice = remoteCredentialEntry.getSlice();
                kotlin.jvm.internal.l0.o(slice, "it.slice");
                g2Var = companion.b(slice);
            } else {
                g2Var = null;
            }
            return new androidx.credentials.provider.w(list, list2, list3, g2Var);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    @fg.l
    @kd.n
    public static final androidx.credentials.provider.v a(@fg.l BeginGetCredentialRequest beginGetCredentialRequest) {
        return INSTANCE.p(beginGetCredentialRequest);
    }
}
