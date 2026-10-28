package androidx.credentials.provider.utils;

import android.annotation.SuppressLint;
import android.app.slice.Slice;
import android.content.pm.SigningInfo;
import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialRequest;
import android.service.credentials.BeginCreateCredentialResponse;
import android.service.credentials.CallingAppInfo;
import android.service.credentials.CreateEntry;
import android.service.credentials.RemoteEntry;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.provider.e0;
import androidx.credentials.provider.g2;
import androidx.credentials.provider.s;
import androidx.credentials.provider.t;
import androidx.credentials.provider.utils.w;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: BeginCreateCredentialUtil.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/credentials/provider/utils/w;", "", "<init>", "()V", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(34)
/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: BeginCreateCredentialUtil.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/credentials/provider/utils/w$a;", "", "<init>", "()V", "Landroid/service/credentials/BeginCreateCredentialResponse$Builder;", "frameworkBuilder", "Landroidx/credentials/provider/g2;", "remoteEntry", "Lkotlin/k2;", "l", "(Landroid/service/credentials/BeginCreateCredentialResponse$Builder;Landroidx/credentials/provider/g2;)V", "", "Landroidx/credentials/provider/e0;", "createEntries", "k", "(Landroid/service/credentials/BeginCreateCredentialResponse$Builder;Ljava/util/List;)V", "Landroid/service/credentials/BeginCreateCredentialRequest;", "request", "Landroidx/credentials/provider/p;", "f", "(Landroid/service/credentials/BeginCreateCredentialRequest;)Landroidx/credentials/provider/p;", "Landroidx/credentials/provider/q;", "response", "Landroid/service/credentials/BeginCreateCredentialResponse;", "e", "(Landroidx/credentials/provider/q;)Landroid/service/credentials/BeginCreateCredentialResponse;", "d", "(Landroidx/credentials/provider/p;)Landroid/service/credentials/BeginCreateCredentialRequest;", "frameworkResponse", "g", "(Landroid/service/credentials/BeginCreateCredentialResponse;)Landroidx/credentials/provider/q;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nBeginCreateCredentialUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginCreateCredentialUtil.kt\nandroidx/credentials/provider/utils/BeginCreateCredentialUtil$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1855#2,2:155\n1#3:157\n*S KotlinDebug\n*F\n+ 1 BeginCreateCredentialUtil.kt\nandroidx/credentials/provider/utils/BeginCreateCredentialUtil$Companion\n*L\n108#1:155,2\n*E\n"})
    /* renamed from: androidx.credentials.provider.utils.w$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: BeginCreateCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/service/credentials/CreateEntry;", "kotlin.jvm.PlatformType", "entry", "Landroidx/credentials/provider/e0;", "a", "(Landroid/service/credentials/CreateEntry;)Landroidx/credentials/provider/e0;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.credentials.provider.utils.w$a$a, reason: collision with other inner class name */
        static final class C0454a extends kotlin.jvm.internal.n0 implements ld.l<CreateEntry, androidx.credentials.provider.e0> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0454a f28191b = new C0454a(1);

            C0454a() {
                super(1);
            }

            @fg.m
            public final androidx.credentials.provider.e0 a(CreateEntry createEntry) {
                Slice slice;
                e0.Companion companion = androidx.credentials.provider.e0.INSTANCE;
                slice = createEntry.getSlice();
                kotlin.jvm.internal.l0.o(slice, "entry.slice");
                return companion.b(slice);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ androidx.credentials.provider.e0 invoke(CreateEntry createEntry) {
                return a(v.a(createEntry));
            }
        }

        /* compiled from: BeginCreateCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/provider/e0;", "entry", "", "a", "(Landroidx/credentials/provider/e0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.credentials.provider.utils.w$a$b */
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.credentials.provider.e0, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public static final b f28192b = new b(1);

            b() {
                super(1);
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@fg.m androidx.credentials.provider.e0 e0Var) {
                return Boolean.valueOf(e0Var != null);
            }
        }

        /* compiled from: BeginCreateCredentialUtil.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/provider/e0;", "entry", "kotlin.jvm.PlatformType", "a", "(Landroidx/credentials/provider/e0;)Landroidx/credentials/provider/e0;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.credentials.provider.utils.w$a$c */
        static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.credentials.provider.e0, androidx.credentials.provider.e0> {

            /* renamed from: b, reason: collision with root package name */
            public static final c f28193b = new c(1);

            c() {
                super(1);
            }

            public final androidx.credentials.provider.e0 a(@fg.m androidx.credentials.provider.e0 e0Var) {
                kotlin.jvm.internal.l0.m(e0Var);
                return e0Var;
            }

            @Override // ld.l
            public androidx.credentials.provider.e0 invoke(androidx.credentials.provider.e0 e0Var) {
                androidx.credentials.provider.e0 e0Var2 = e0Var;
                kotlin.jvm.internal.l0.m(e0Var2);
                return e0Var2;
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.credentials.provider.e0 h(ld.l tmp0, Object obj) {
            kotlin.jvm.internal.l0.p(tmp0, "$tmp0");
            return (androidx.credentials.provider.e0) tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean i(ld.l tmp0, Object obj) {
            kotlin.jvm.internal.l0.p(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.credentials.provider.e0 j(ld.l tmp0, Object obj) {
            kotlin.jvm.internal.l0.p(tmp0, "$tmp0");
            return (androidx.credentials.provider.e0) tmp0.invoke(obj);
        }

        private final void k(BeginCreateCredentialResponse.Builder frameworkBuilder, List<androidx.credentials.provider.e0> createEntries) {
            Iterator<T> it = createEntries.iterator();
            while (it.hasNext()) {
                Slice c5 = androidx.credentials.provider.e0.INSTANCE.c((androidx.credentials.provider.e0) it.next());
                if (c5 != null) {
                    frameworkBuilder.addCreateEntry(g.a(c5));
                }
            }
        }

        @SuppressLint({"MissingPermission"})
        private final void l(BeginCreateCredentialResponse.Builder frameworkBuilder, g2 remoteEntry) {
            if (remoteEntry == null) {
                return;
            }
            f.a();
            frameworkBuilder.setRemoteCreateEntry(e.a(g2.INSTANCE.c(remoteEntry)));
        }

        @fg.l
        public final BeginCreateCredentialRequest d(@fg.l androidx.credentials.provider.p request) {
            CallingAppInfo callingAppInfo;
            kotlin.jvm.internal.l0.p(request, "request");
            if (request.getCallingAppInfo() != null) {
                androidx.credentials.provider.utils.c.a();
                callingAppInfo = q.a(request.getCallingAppInfo().getPackageName(), request.getCallingAppInfo().getSigningInfo(), request.getCallingAppInfo().getOrigin());
            } else {
                callingAppInfo = null;
            }
            d.a();
            return androidx.credentials.provider.utils.b.a(request.getType(), request.getCandidateQueryData(), callingAppInfo);
        }

        @fg.l
        public final BeginCreateCredentialResponse e(@fg.l androidx.credentials.provider.q response) {
            BeginCreateCredentialResponse build;
            kotlin.jvm.internal.l0.p(response, "response");
            BeginCreateCredentialResponse.Builder a5 = h.a();
            k(a5, response.c());
            l(a5, response.getRemoteEntry());
            build = a5.build();
            kotlin.jvm.internal.l0.o(build, "frameworkBuilder.build()");
            return build;
        }

        @fg.l
        @kd.n
        public final androidx.credentials.provider.p f(@fg.l BeginCreateCredentialRequest request) {
            String type;
            Bundle data;
            CallingAppInfo callingAppInfo;
            String packageName;
            SigningInfo signingInfo;
            String origin;
            String type2;
            Bundle data2;
            CallingAppInfo callingAppInfo2;
            androidx.credentials.provider.a0 a0Var;
            String packageName2;
            SigningInfo signingInfo2;
            String origin2;
            String type3;
            Bundle data3;
            CallingAppInfo callingAppInfo3;
            androidx.credentials.provider.a0 a0Var2;
            String packageName3;
            SigningInfo signingInfo3;
            String origin3;
            Bundle data4;
            CallingAppInfo callingAppInfo4;
            androidx.credentials.provider.a0 a0Var3;
            String packageName4;
            SigningInfo signingInfo4;
            String origin4;
            kotlin.jvm.internal.l0.p(request, "request");
            androidx.credentials.provider.a0 a0Var4 = null;
            try {
                type2 = request.getType();
                int hashCode = type2.hashCode();
                if (hashCode != -543568185) {
                    if (hashCode == -95037569 && type2.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        t.Companion companion = androidx.credentials.provider.t.INSTANCE;
                        data4 = request.getData();
                        kotlin.jvm.internal.l0.o(data4, "request.data");
                        callingAppInfo4 = request.getCallingAppInfo();
                        if (callingAppInfo4 != null) {
                            packageName4 = callingAppInfo4.getPackageName();
                            kotlin.jvm.internal.l0.o(packageName4, "it.packageName");
                            signingInfo4 = callingAppInfo4.getSigningInfo();
                            kotlin.jvm.internal.l0.o(signingInfo4, "it.signingInfo");
                            origin4 = callingAppInfo4.getOrigin();
                            a0Var3 = new androidx.credentials.provider.a0(packageName4, signingInfo4, origin4);
                        } else {
                            a0Var3 = null;
                        }
                        return companion.b(data4, a0Var3);
                    }
                } else if (type2.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    s.Companion companion2 = androidx.credentials.provider.s.INSTANCE;
                    data2 = request.getData();
                    kotlin.jvm.internal.l0.o(data2, "request.data");
                    callingAppInfo2 = request.getCallingAppInfo();
                    if (callingAppInfo2 != null) {
                        packageName2 = callingAppInfo2.getPackageName();
                        kotlin.jvm.internal.l0.o(packageName2, "it.packageName");
                        signingInfo2 = callingAppInfo2.getSigningInfo();
                        kotlin.jvm.internal.l0.o(signingInfo2, "it.signingInfo");
                        origin2 = callingAppInfo2.getOrigin();
                        a0Var = new androidx.credentials.provider.a0(packageName2, signingInfo2, origin2);
                    } else {
                        a0Var = null;
                    }
                    return companion2.a(data2, a0Var);
                }
                type3 = request.getType();
                kotlin.jvm.internal.l0.o(type3, "request.type");
                data3 = request.getData();
                kotlin.jvm.internal.l0.o(data3, "request.data");
                callingAppInfo3 = request.getCallingAppInfo();
                if (callingAppInfo3 != null) {
                    packageName3 = callingAppInfo3.getPackageName();
                    kotlin.jvm.internal.l0.o(packageName3, "it.packageName");
                    signingInfo3 = callingAppInfo3.getSigningInfo();
                    kotlin.jvm.internal.l0.o(signingInfo3, "it.signingInfo");
                    origin3 = callingAppInfo3.getOrigin();
                    a0Var2 = new androidx.credentials.provider.a0(packageName3, signingInfo3, origin3);
                } else {
                    a0Var2 = null;
                }
                return new androidx.credentials.provider.r(type3, data3, a0Var2);
            } catch (FrameworkClassParsingException unused) {
                type = request.getType();
                kotlin.jvm.internal.l0.o(type, "request.type");
                data = request.getData();
                kotlin.jvm.internal.l0.o(data, "request.data");
                callingAppInfo = request.getCallingAppInfo();
                if (callingAppInfo != null) {
                    packageName = callingAppInfo.getPackageName();
                    kotlin.jvm.internal.l0.o(packageName, "it.packageName");
                    signingInfo = callingAppInfo.getSigningInfo();
                    kotlin.jvm.internal.l0.o(signingInfo, "it.signingInfo");
                    origin = callingAppInfo.getOrigin();
                    a0Var4 = new androidx.credentials.provider.a0(packageName, signingInfo, origin);
                }
                return new androidx.credentials.provider.r(type, data, a0Var4);
            }
        }

        @fg.l
        public final androidx.credentials.provider.q g(@fg.l BeginCreateCredentialResponse frameworkResponse) {
            List createEntries;
            RemoteEntry remoteCreateEntry;
            g2 g2Var;
            Slice slice;
            kotlin.jvm.internal.l0.p(frameworkResponse, "frameworkResponse");
            createEntries = frameworkResponse.getCreateEntries();
            Stream stream = createEntries.stream();
            final C0454a c0454a = C0454a.f28191b;
            Stream map = stream.map(new Function() { // from class: androidx.credentials.provider.utils.r
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    androidx.credentials.provider.e0 h4;
                    h4 = w.Companion.h(ld.l.this, obj);
                    return h4;
                }
            });
            final b bVar = b.f28192b;
            Stream filter = map.filter(new Predicate() { // from class: androidx.credentials.provider.utils.s
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean i4;
                    i4 = w.Companion.i(ld.l.this, obj);
                    return i4;
                }
            });
            final c cVar = c.f28193b;
            Object collect = filter.map(new Function() { // from class: androidx.credentials.provider.utils.t
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    androidx.credentials.provider.e0 j4;
                    j4 = w.Companion.j(ld.l.this, obj);
                    return j4;
                }
            }).collect(Collectors.toList());
            kotlin.jvm.internal.l0.o(collect, "frameworkResponse.create…lect(Collectors.toList())");
            List list = (List) collect;
            remoteCreateEntry = frameworkResponse.getRemoteCreateEntry();
            if (remoteCreateEntry != null) {
                g2.Companion companion = g2.INSTANCE;
                slice = remoteCreateEntry.getSlice();
                kotlin.jvm.internal.l0.o(slice, "it.slice");
                g2Var = companion.b(slice);
            } else {
                g2Var = null;
            }
            return new androidx.credentials.provider.q(list, g2Var);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    @fg.l
    @kd.n
    public static final androidx.credentials.provider.p a(@fg.l BeginCreateCredentialRequest beginCreateCredentialRequest) {
        return INSTANCE.f(beginCreateCredentialRequest);
    }
}
