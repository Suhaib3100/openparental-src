package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSessionManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.core.app.i0;
import androidx.fragment.app.k0;
import androidx.media.e;
import androidx.media.f;
import androidx.media.g;
import androidx.media.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: i, reason: collision with root package name */
    private static final float f30609i = 1.0E-5f;

    /* renamed from: m, reason: collision with root package name */
    static final int f30613m = 1;

    /* renamed from: n, reason: collision with root package name */
    static final int f30614n = 2;

    /* renamed from: o, reason: collision with root package name */
    static final int f30615o = 4;

    /* renamed from: p, reason: collision with root package name */
    @c1({c1.a.LIBRARY})
    public static final int f30616p = -1;

    /* renamed from: q, reason: collision with root package name */
    @c1({c1.a.LIBRARY})
    public static final int f30617q = 0;

    /* renamed from: r, reason: collision with root package name */
    @c1({c1.a.LIBRARY})
    public static final int f30618r = 1;

    /* renamed from: b, reason: collision with root package name */
    private g f30619b;

    /* renamed from: d, reason: collision with root package name */
    f f30621d;

    /* renamed from: f, reason: collision with root package name */
    MediaSessionCompat.Token f30623f;

    /* renamed from: g, reason: collision with root package name */
    static final String f30607g = "MBServiceCompat";

    /* renamed from: j, reason: collision with root package name */
    public static final String f30610j = "android.media.browse.MediaBrowserService";

    /* renamed from: k, reason: collision with root package name */
    @c1({c1.a.LIBRARY})
    public static final String f30611k = "media_item";

    /* renamed from: l, reason: collision with root package name */
    @c1({c1.a.LIBRARY})
    public static final String f30612l = "search_results";

    /* renamed from: h, reason: collision with root package name */
    static final boolean f30608h = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: c, reason: collision with root package name */
    final androidx.collection.a<IBinder, f> f30620c = new androidx.collection.a<>();

    /* renamed from: e, reason: collision with root package name */
    final q f30622e = new q();

    class a extends m<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f30624g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f30625h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Bundle f30626i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Bundle f30627j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, f fVar, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f30624g = fVar;
            this.f30625h = str;
            this.f30626i = bundle;
            this.f30627j = bundle2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.MediaBrowserServiceCompat.m
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void g(List<MediaBrowserCompat.MediaItem> list) {
            f fVar = MediaBrowserServiceCompat.this.f30620c.get(this.f30624g.f30646f.asBinder());
            f fVar2 = this.f30624g;
            if (fVar != fVar2) {
                if (MediaBrowserServiceCompat.f30608h) {
                    String str = fVar2.f30641a;
                }
            } else {
                if ((c() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.b(list, this.f30626i);
                }
                try {
                    this.f30624g.f30646f.a(this.f30625h, list, this.f30626i, this.f30627j);
                } catch (RemoteException unused) {
                    String str2 = this.f30624g.f30641a;
                }
            }
        }
    }

    class b extends m<MediaBrowserCompat.MediaItem> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ResultReceiver f30629g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f30629g = resultReceiver;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.MediaBrowserServiceCompat.m
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void g(MediaBrowserCompat.MediaItem mediaItem) {
            if ((c() & 2) != 0) {
                this.f30629g.send(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", mediaItem);
            this.f30629g.send(0, bundle);
        }
    }

    class c extends m<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ResultReceiver f30631g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f30631g = resultReceiver;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.MediaBrowserServiceCompat.m
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void g(List<MediaBrowserCompat.MediaItem> list) {
            if ((c() & 4) != 0 || list == null) {
                this.f30631g.send(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.f30631g.send(0, bundle);
        }
    }

    class d extends m<Bundle> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ResultReceiver f30633g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f30633g = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.m
        void e(Bundle bundle) {
            this.f30633g.send(-1, bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.m
        void f(Bundle bundle) {
            this.f30633g.send(1, bundle);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.MediaBrowserServiceCompat.m
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void g(Bundle bundle) {
            this.f30633g.send(0, bundle);
        }
    }

    public static final class e {

        /* renamed from: c, reason: collision with root package name */
        public static final String f30635c = "android.service.media.extra.RECENT";

        /* renamed from: d, reason: collision with root package name */
        public static final String f30636d = "android.service.media.extra.OFFLINE";

        /* renamed from: e, reason: collision with root package name */
        public static final String f30637e = "android.service.media.extra.SUGGESTED";

        /* renamed from: f, reason: collision with root package name */
        @Deprecated
        public static final String f30638f = "android.service.media.extra.SUGGESTION_KEYWORDS";

        /* renamed from: a, reason: collision with root package name */
        private final String f30639a;

        /* renamed from: b, reason: collision with root package name */
        private final Bundle f30640b;

        public e(@o0 String str, @q0 Bundle bundle) {
            if (str == null) {
                throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.");
            }
            this.f30639a = str;
            this.f30640b = bundle;
        }

        public Bundle a() {
            return this.f30640b;
        }

        public String b() {
            return this.f30639a;
        }
    }

    private class f implements IBinder.DeathRecipient {

        /* renamed from: a, reason: collision with root package name */
        public final String f30641a;

        /* renamed from: b, reason: collision with root package name */
        public final int f30642b;

        /* renamed from: c, reason: collision with root package name */
        public final int f30643c;

        /* renamed from: d, reason: collision with root package name */
        public final h.b f30644d;

        /* renamed from: e, reason: collision with root package name */
        public final Bundle f30645e;

        /* renamed from: f, reason: collision with root package name */
        public final o f30646f;

        /* renamed from: g, reason: collision with root package name */
        public final HashMap<String, List<androidx.core.util.s<IBinder, Bundle>>> f30647g = new HashMap<>();

        /* renamed from: h, reason: collision with root package name */
        public e f30648h;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = f.this;
                MediaBrowserServiceCompat.this.f30620c.remove(fVar.f30646f.asBinder());
            }
        }

        f(String str, int i4, int i5, Bundle bundle, o oVar) {
            this.f30641a = str;
            this.f30642b = i4;
            this.f30643c = i5;
            this.f30644d = new h.b(str, i4, i5);
            this.f30645e = bundle;
            this.f30646f = oVar;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            MediaBrowserServiceCompat.this.f30622e.post(new a());
        }
    }

    interface g {
        void a();

        IBinder b(Intent intent);

        h.b d();

        void g(String str, Bundle bundle);

        void h(MediaSessionCompat.Token token);

        Bundle i();

        void j(h.b bVar, String str, Bundle bundle);
    }

    @x0(21)
    class h implements g, e.d {

        /* renamed from: a, reason: collision with root package name */
        final List<Bundle> f30651a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        Object f30652b;

        /* renamed from: c, reason: collision with root package name */
        Messenger f30653c;

        class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MediaSessionCompat.Token f30655b;

            a(MediaSessionCompat.Token token) {
                this.f30655b = token;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!h.this.f30651a.isEmpty()) {
                    IMediaSession extraBinder = this.f30655b.getExtraBinder();
                    if (extraBinder != null) {
                        Iterator<Bundle> it = h.this.f30651a.iterator();
                        while (it.hasNext()) {
                            it.next().putBinder("extra_session_binder", extraBinder.asBinder());
                        }
                    }
                    h.this.f30651a.clear();
                }
                androidx.media.e.e(h.this.f30652b, this.f30655b.getToken());
            }
        }

        class b extends m<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ e.c f30657g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Object obj, e.c cVar) {
                super(obj);
                this.f30657g = cVar;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.m
            public void b() {
                this.f30657g.a();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.m
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public void g(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f30657g.c(arrayList);
            }
        }

        class c implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f30659b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f30660c;

            c(String str, Bundle bundle) {
                this.f30659b = str;
                this.f30660c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<IBinder> it = MediaBrowserServiceCompat.this.f30620c.keySet().iterator();
                while (it.hasNext()) {
                    h.this.n(MediaBrowserServiceCompat.this.f30620c.get(it.next()), this.f30659b, this.f30660c);
                }
            }
        }

        class d implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h.b f30662b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f30663c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f30664d;

            d(h.b bVar, String str, Bundle bundle) {
                this.f30662b = bVar;
                this.f30663c = str;
                this.f30664d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int i4 = 0; i4 < MediaBrowserServiceCompat.this.f30620c.getSize(); i4++) {
                    f valueAt = MediaBrowserServiceCompat.this.f30620c.valueAt(i4);
                    if (valueAt.f30644d.equals(this.f30662b)) {
                        h.this.n(valueAt, this.f30663c, this.f30664d);
                    }
                }
            }
        }

        h() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public void a() {
            e.b bVar = new e.b(MediaBrowserServiceCompat.this, this);
            this.f30652b = bVar;
            androidx.media.e.d(bVar);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public IBinder b(Intent intent) {
            return ((MediaBrowserService) this.f30652b).onBind(intent);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public h.b d() {
            f fVar = MediaBrowserServiceCompat.this.f30621d;
            if (fVar != null) {
                return fVar.f30644d;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // androidx.media.e.d
        public e.a f(String str, int i4, Bundle bundle) {
            Bundle bundle2;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                bundle2 = null;
            } else {
                bundle.remove("extra_client_version");
                this.f30653c = new Messenger(MediaBrowserServiceCompat.this.f30622e);
                bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                bundle2.putBinder("extra_messenger", this.f30653c.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.f30623f;
                if (token != null) {
                    IMediaSession extraBinder = token.getExtraBinder();
                    bundle2.putBinder("extra_session_binder", extraBinder == null ? null : extraBinder.asBinder());
                } else {
                    this.f30651a.add(bundle2);
                }
            }
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f30621d = mediaBrowserServiceCompat.new f(str, -1, i4, bundle, null);
            e l4 = MediaBrowserServiceCompat.this.l(str, i4, bundle);
            MediaBrowserServiceCompat.this.f30621d = null;
            if (l4 == null) {
                return null;
            }
            if (bundle2 == null) {
                bundle2 = l4.a();
            } else if (l4.a() != null) {
                bundle2.putAll(l4.a());
            }
            return new e.a(l4.b(), bundle2);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public void g(String str, Bundle bundle) {
            o(str, bundle);
            m(str, bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public void h(MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.f30622e.a(new a(token));
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public Bundle i() {
            if (this.f30653c == null) {
                return null;
            }
            f fVar = MediaBrowserServiceCompat.this.f30621d;
            if (fVar == null) {
                throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            if (fVar.f30645e == null) {
                return null;
            }
            return new Bundle(MediaBrowserServiceCompat.this.f30621d.f30645e);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public void j(h.b bVar, String str, Bundle bundle) {
            l(bVar, str, bundle);
        }

        @Override // androidx.media.e.d
        public void k(String str, e.c<List<Parcel>> cVar) {
            MediaBrowserServiceCompat.this.m(str, new b(str, cVar));
        }

        void l(h.b bVar, String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.f30622e.post(new d(bVar, str, bundle));
        }

        void m(String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.f30622e.post(new c(str, bundle));
        }

        void n(f fVar, String str, Bundle bundle) {
            List<androidx.core.util.s<IBinder, Bundle>> list = fVar.f30647g.get(str);
            if (list != null) {
                for (androidx.core.util.s<IBinder, Bundle> sVar : list) {
                    if (androidx.media.b.b(bundle, sVar.f26882b)) {
                        MediaBrowserServiceCompat.this.t(str, fVar, sVar.f26882b, bundle);
                    }
                }
            }
        }

        void o(String str, Bundle bundle) {
            androidx.media.e.b(this.f30652b, str);
        }
    }

    @x0(23)
    class i extends h implements f.b {

        class a extends m<MediaBrowserCompat.MediaItem> {

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ e.c f30667g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, e.c cVar) {
                super(obj);
                this.f30667g = cVar;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.m
            public void b() {
                this.f30667g.a();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.m
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public void g(MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f30667g.c(null);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                this.f30667g.c(obtain);
            }
        }

        i() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.h, androidx.media.MediaBrowserServiceCompat.g
        public void a() {
            f.a aVar = new f.a((Context) MediaBrowserServiceCompat.this, (e.d) this);
            this.f30652b = aVar;
            androidx.media.e.d(aVar);
        }

        @Override // androidx.media.f.b
        public void c(String str, e.c<Parcel> cVar) {
            MediaBrowserServiceCompat.this.o(str, new a(str, cVar));
        }
    }

    @x0(26)
    class j extends i implements g.c {

        class a extends m<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ g.b f30670g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, g.b bVar) {
                super(obj);
                this.f30670g = bVar;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.m
            public void b() {
                this.f30670g.a();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.MediaBrowserServiceCompat.m
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public void g(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f30670g.c(arrayList, c());
            }
        }

        j() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.i, androidx.media.MediaBrowserServiceCompat.h, androidx.media.MediaBrowserServiceCompat.g
        public void a() {
            Object a5 = androidx.media.g.a(MediaBrowserServiceCompat.this, this);
            this.f30652b = a5;
            androidx.media.e.d(a5);
        }

        @Override // androidx.media.g.c
        public void e(String str, g.b bVar, Bundle bundle) {
            MediaBrowserServiceCompat.this.n(str, new a(str, bVar), bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.h, androidx.media.MediaBrowserServiceCompat.g
        public Bundle i() {
            f fVar = MediaBrowserServiceCompat.this.f30621d;
            if (fVar == null) {
                return androidx.media.g.b(this.f30652b);
            }
            if (fVar.f30645e == null) {
                return null;
            }
            return new Bundle(MediaBrowserServiceCompat.this.f30621d.f30645e);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.h
        void o(String str, Bundle bundle) {
            if (bundle != null) {
                androidx.media.g.c(this.f30652b, str, bundle);
            } else {
                super.o(str, bundle);
            }
        }
    }

    @x0(28)
    class k extends j {
        k() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.h, androidx.media.MediaBrowserServiceCompat.g
        public h.b d() {
            MediaSessionManager.RemoteUserInfo currentBrowserInfo;
            f fVar = MediaBrowserServiceCompat.this.f30621d;
            if (fVar != null) {
                return fVar.f30644d;
            }
            currentBrowserInfo = ((MediaBrowserService) this.f30652b).getCurrentBrowserInfo();
            return new h.b(currentBrowserInfo);
        }
    }

    class l implements g {

        /* renamed from: a, reason: collision with root package name */
        private Messenger f30673a;

        class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MediaSessionCompat.Token f30675b;

            a(MediaSessionCompat.Token token) {
                this.f30675b = token;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<f> it = MediaBrowserServiceCompat.this.f30620c.values().iterator();
                while (it.hasNext()) {
                    f next = it.next();
                    try {
                        next.f30646f.c(next.f30648h.b(), this.f30675b, next.f30648h.a());
                    } catch (RemoteException unused) {
                        String str = next.f30641a;
                        it.remove();
                    }
                }
            }
        }

        class b implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f30677b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f30678c;

            b(String str, Bundle bundle) {
                this.f30677b = str;
                this.f30678c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<IBinder> it = MediaBrowserServiceCompat.this.f30620c.keySet().iterator();
                while (it.hasNext()) {
                    l.this.c(MediaBrowserServiceCompat.this.f30620c.get(it.next()), this.f30677b, this.f30678c);
                }
            }
        }

        class c implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h.b f30680b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f30681c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f30682d;

            c(h.b bVar, String str, Bundle bundle) {
                this.f30680b = bVar;
                this.f30681c = str;
                this.f30682d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int i4 = 0; i4 < MediaBrowserServiceCompat.this.f30620c.getSize(); i4++) {
                    f valueAt = MediaBrowserServiceCompat.this.f30620c.valueAt(i4);
                    if (valueAt.f30644d.equals(this.f30680b)) {
                        l.this.c(valueAt, this.f30681c, this.f30682d);
                        return;
                    }
                }
            }
        }

        l() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public void a() {
            this.f30673a = new Messenger(MediaBrowserServiceCompat.this.f30622e);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public IBinder b(Intent intent) {
            if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
                return this.f30673a.getBinder();
            }
            return null;
        }

        void c(f fVar, String str, Bundle bundle) {
            List<androidx.core.util.s<IBinder, Bundle>> list = fVar.f30647g.get(str);
            if (list != null) {
                for (androidx.core.util.s<IBinder, Bundle> sVar : list) {
                    if (androidx.media.b.b(bundle, sVar.f26882b)) {
                        MediaBrowserServiceCompat.this.t(str, fVar, sVar.f26882b, bundle);
                    }
                }
            }
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public h.b d() {
            f fVar = MediaBrowserServiceCompat.this.f30621d;
            if (fVar != null) {
                return fVar.f30644d;
            }
            throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public void g(@o0 String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.f30622e.post(new b(str, bundle));
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public void h(MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.f30622e.post(new a(token));
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public Bundle i() {
            f fVar = MediaBrowserServiceCompat.this.f30621d;
            if (fVar == null) {
                throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            if (fVar.f30645e == null) {
                return null;
            }
            return new Bundle(MediaBrowserServiceCompat.this.f30621d.f30645e);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public void j(@o0 h.b bVar, @o0 String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.f30622e.post(new c(bVar, str, bundle));
        }
    }

    public static class m<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Object f30684a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f30685b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f30686c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f30687d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f30688e;

        /* renamed from: f, reason: collision with root package name */
        private int f30689f;

        m(Object obj) {
            this.f30684a = obj;
        }

        private void a(Bundle bundle) {
            if (bundle != null && bundle.containsKey("android.media.browse.extra.DOWNLOAD_PROGRESS")) {
                float f4 = bundle.getFloat("android.media.browse.extra.DOWNLOAD_PROGRESS");
                if (f4 < -1.0E-5f || f4 > 1.00001f) {
                    throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].");
                }
            }
        }

        public void b() {
            if (this.f30685b) {
                throw new IllegalStateException("detach() called when detach() had already been called for: " + this.f30684a);
            }
            if (this.f30686c) {
                throw new IllegalStateException("detach() called when sendResult() had already been called for: " + this.f30684a);
            }
            if (!this.f30688e) {
                this.f30685b = true;
            } else {
                throw new IllegalStateException("detach() called when sendError() had already been called for: " + this.f30684a);
            }
        }

        int c() {
            return this.f30689f;
        }

        boolean d() {
            return this.f30685b || this.f30686c || this.f30688e;
        }

        void e(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f30684a);
        }

        void f(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an interim update for " + this.f30684a);
        }

        void g(T t4) {
        }

        public void h(Bundle bundle) {
            if (this.f30686c || this.f30688e) {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f30684a);
            }
            this.f30688e = true;
            e(bundle);
        }

        public void i(Bundle bundle) {
            if (this.f30686c || this.f30688e) {
                throw new IllegalStateException("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: " + this.f30684a);
            }
            a(bundle);
            this.f30687d = true;
            f(bundle);
        }

        public void j(T t4) {
            if (this.f30686c || this.f30688e) {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f30684a);
            }
            this.f30686c = true;
            g(t4);
        }

        void k(int i4) {
            this.f30689f = i4;
        }
    }

    private class n {

        class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f30691b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f30692c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f30693d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f30694e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Bundle f30695f;

            a(o oVar, String str, int i4, int i5, Bundle bundle) {
                this.f30691b = oVar;
                this.f30692c = str;
                this.f30693d = i4;
                this.f30694e = i5;
                this.f30695f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.f30691b.asBinder();
                MediaBrowserServiceCompat.this.f30620c.remove(asBinder);
                f fVar = MediaBrowserServiceCompat.this.new f(this.f30692c, this.f30693d, this.f30694e, this.f30695f, this.f30691b);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.f30621d = fVar;
                e l4 = mediaBrowserServiceCompat.l(this.f30692c, this.f30694e, this.f30695f);
                fVar.f30648h = l4;
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat2.f30621d = null;
                if (l4 == null) {
                    try {
                        this.f30691b.b();
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                try {
                    mediaBrowserServiceCompat2.f30620c.put(asBinder, fVar);
                    asBinder.linkToDeath(fVar, 0);
                    if (MediaBrowserServiceCompat.this.f30623f != null) {
                        this.f30691b.c(fVar.f30648h.b(), MediaBrowserServiceCompat.this.f30623f, fVar.f30648h.a());
                    }
                } catch (RemoteException unused2) {
                    MediaBrowserServiceCompat.this.f30620c.remove(asBinder);
                }
            }
        }

        class b implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f30697b;

            b(o oVar) {
                this.f30697b = oVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f remove = MediaBrowserServiceCompat.this.f30620c.remove(this.f30697b.asBinder());
                if (remove != null) {
                    remove.f30646f.asBinder().unlinkToDeath(remove, 0);
                }
            }
        }

        class c implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f30699b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f30700c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ IBinder f30701d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Bundle f30702e;

            c(o oVar, String str, IBinder iBinder, Bundle bundle) {
                this.f30699b = oVar;
                this.f30700c = str;
                this.f30701d = iBinder;
                this.f30702e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = MediaBrowserServiceCompat.this.f30620c.get(this.f30699b.asBinder());
                if (fVar == null) {
                    return;
                }
                MediaBrowserServiceCompat.this.a(this.f30700c, fVar, this.f30701d, this.f30702e);
            }
        }

        class d implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f30704b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f30705c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ IBinder f30706d;

            d(o oVar, String str, IBinder iBinder) {
                this.f30704b = oVar;
                this.f30705c = str;
                this.f30706d = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = MediaBrowserServiceCompat.this.f30620c.get(this.f30704b.asBinder());
                if (fVar == null) {
                    return;
                }
                MediaBrowserServiceCompat.this.w(this.f30705c, fVar, this.f30706d);
            }
        }

        class e implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f30708b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f30709c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ResultReceiver f30710d;

            e(o oVar, String str, ResultReceiver resultReceiver) {
                this.f30708b = oVar;
                this.f30709c = str;
                this.f30710d = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = MediaBrowserServiceCompat.this.f30620c.get(this.f30708b.asBinder());
                if (fVar == null) {
                    return;
                }
                MediaBrowserServiceCompat.this.u(this.f30709c, fVar, this.f30710d);
            }
        }

        class f implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f30712b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f30713c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f30714d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f30715e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Bundle f30716f;

            f(o oVar, String str, int i4, int i5, Bundle bundle) {
                this.f30712b = oVar;
                this.f30713c = str;
                this.f30714d = i4;
                this.f30715e = i5;
                this.f30716f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.f30712b.asBinder();
                MediaBrowserServiceCompat.this.f30620c.remove(asBinder);
                f fVar = MediaBrowserServiceCompat.this.new f(this.f30713c, this.f30714d, this.f30715e, this.f30716f, this.f30712b);
                MediaBrowserServiceCompat.this.f30620c.put(asBinder, fVar);
                try {
                    asBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                }
            }
        }

        class g implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f30718b;

            g(o oVar) {
                this.f30718b = oVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.f30718b.asBinder();
                f remove = MediaBrowserServiceCompat.this.f30620c.remove(asBinder);
                if (remove != null) {
                    asBinder.unlinkToDeath(remove, 0);
                }
            }
        }

        class h implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f30720b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f30721c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f30722d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ResultReceiver f30723e;

            h(o oVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f30720b = oVar;
                this.f30721c = str;
                this.f30722d = bundle;
                this.f30723e = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = MediaBrowserServiceCompat.this.f30620c.get(this.f30720b.asBinder());
                if (fVar == null) {
                    return;
                }
                MediaBrowserServiceCompat.this.v(this.f30721c, this.f30722d, fVar, this.f30723e);
            }
        }

        class i implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f30725b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f30726c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f30727d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ResultReceiver f30728e;

            i(o oVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f30725b = oVar;
                this.f30726c = str;
                this.f30727d = bundle;
                this.f30728e = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = MediaBrowserServiceCompat.this.f30620c.get(this.f30725b.asBinder());
                if (fVar == null) {
                    Objects.toString(this.f30727d);
                } else {
                    MediaBrowserServiceCompat.this.s(this.f30726c, this.f30727d, fVar, this.f30728e);
                }
            }
        }

        n() {
        }

        public void a(String str, IBinder iBinder, Bundle bundle, o oVar) {
            MediaBrowserServiceCompat.this.f30622e.a(new c(oVar, str, iBinder, bundle));
        }

        public void b(String str, int i4, int i5, Bundle bundle, o oVar) {
            if (!MediaBrowserServiceCompat.this.g(str, i5)) {
                throw new IllegalArgumentException(i0.a("Package/uid mismatch: uid=", i5, " package=", str));
            }
            MediaBrowserServiceCompat.this.f30622e.a(new a(oVar, str, i4, i5, bundle));
        }

        public void c(o oVar) {
            MediaBrowserServiceCompat.this.f30622e.a(new b(oVar));
        }

        public void d(String str, ResultReceiver resultReceiver, o oVar) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.f30622e.a(new e(oVar, str, resultReceiver));
        }

        public void e(o oVar, String str, int i4, int i5, Bundle bundle) {
            MediaBrowserServiceCompat.this.f30622e.a(new f(oVar, str, i4, i5, bundle));
        }

        public void f(String str, IBinder iBinder, o oVar) {
            MediaBrowserServiceCompat.this.f30622e.a(new d(oVar, str, iBinder));
        }

        public void g(String str, Bundle bundle, ResultReceiver resultReceiver, o oVar) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.f30622e.a(new h(oVar, str, bundle, resultReceiver));
        }

        public void h(String str, Bundle bundle, ResultReceiver resultReceiver, o oVar) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.f30622e.a(new i(oVar, str, bundle, resultReceiver));
        }

        public void i(o oVar) {
            MediaBrowserServiceCompat.this.f30622e.a(new g(oVar));
        }
    }

    private interface o {
        void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        IBinder asBinder();

        void b() throws RemoteException;

        void c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException;
    }

    private static class p implements o {

        /* renamed from: a, reason: collision with root package name */
        final Messenger f30730a;

        p(Messenger messenger) {
            this.f30730a = messenger;
        }

        private void d(int i4, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i4;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f30730a.send(obtain);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o
        public void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            d(3, bundle3);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o
        public IBinder asBinder() {
            return this.f30730a.getBinder();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o
        public void b() throws RemoteException {
            d(2, null);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o
        public void c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            d(1, bundle2);
        }
    }

    private final class q extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final n f30731a;

        q() {
            this.f30731a = MediaBrowserServiceCompat.this.new n();
        }

        public void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.ensureClassLoader(bundle);
                    this.f30731a.b(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new p(message.replyTo));
                    break;
                case 2:
                    this.f30731a.c(new p(message.replyTo));
                    break;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.ensureClassLoader(bundle2);
                    this.f30731a.a(data.getString("data_media_item_id"), data.getBinder("data_callback_token"), bundle2, new p(message.replyTo));
                    break;
                case 4:
                    this.f30731a.f(data.getString("data_media_item_id"), data.getBinder("data_callback_token"), new p(message.replyTo));
                    break;
                case 5:
                    this.f30731a.d(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"), new p(message.replyTo));
                    break;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.ensureClassLoader(bundle3);
                    this.f30731a.e(new p(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    break;
                case 7:
                    this.f30731a.i(new p(message.replyTo));
                    break;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.ensureClassLoader(bundle4);
                    this.f30731a.g(data.getString("data_search_query"), bundle4, (ResultReceiver) data.getParcelable("data_result_receiver"), new p(message.replyTo));
                    break;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.ensureClassLoader(bundle5);
                    this.f30731a.h(data.getString("data_custom_action"), bundle5, (ResultReceiver) data.getParcelable("data_result_receiver"), new p(message.replyTo));
                    break;
                default:
                    message.toString();
                    break;
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j4) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            data.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(message, j4);
        }
    }

    void a(String str, f fVar, IBinder iBinder, Bundle bundle) {
        List<androidx.core.util.s<IBinder, Bundle>> list = fVar.f30647g.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (androidx.core.util.s<IBinder, Bundle> sVar : list) {
            if (iBinder == sVar.f26881a && androidx.media.b.a(bundle, sVar.f26882b)) {
                return;
            }
        }
        list.add(new androidx.core.util.s<>(iBinder, bundle));
        fVar.f30647g.put(str, list);
        t(str, fVar, bundle, null);
        this.f30621d = fVar;
        q(str, bundle);
        this.f30621d = null;
    }

    List<MediaBrowserCompat.MediaItem> b(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i4 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i5 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i4 == -1 && i5 == -1) {
            return list;
        }
        int i6 = i5 * i4;
        int i7 = i6 + i5;
        if (i4 < 0 || i5 < 1 || i6 >= list.size()) {
            return Collections.emptyList();
        }
        if (i7 > list.size()) {
            i7 = list.size();
        }
        return list.subList(i6, i7);
    }

    @c1({c1.a.LIBRARY})
    public void c(Context context) {
        attachBaseContext(context);
    }

    public final Bundle d() {
        return this.f30619b.i();
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @o0
    public final h.b e() {
        return this.f30619b.d();
    }

    @q0
    public MediaSessionCompat.Token f() {
        return this.f30623f;
    }

    boolean g(String str, int i4) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i4)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void h(@o0 h.b bVar, @o0 String str, @o0 Bundle bundle) {
        if (bVar == null) {
            throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
        }
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle == null) {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        this.f30619b.j(bVar, str, bundle);
    }

    public void i(@o0 String str) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        this.f30619b.g(str, null);
    }

    public void j(@o0 String str, @o0 Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle == null) {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        this.f30619b.g(str, bundle);
    }

    public void k(@o0 String str, Bundle bundle, @o0 m<Bundle> mVar) {
        mVar.h(null);
    }

    @q0
    public abstract e l(@o0 String str, int i4, @q0 Bundle bundle);

    public abstract void m(@o0 String str, @o0 m<List<MediaBrowserCompat.MediaItem>> mVar);

    public void n(@o0 String str, @o0 m<List<MediaBrowserCompat.MediaItem>> mVar, @o0 Bundle bundle) {
        mVar.k(1);
        m(str, mVar);
    }

    public void o(String str, @o0 m<MediaBrowserCompat.MediaItem> mVar) {
        mVar.k(2);
        mVar.j(null);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f30619b.b(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            this.f30619b = new k();
        } else if (i4 >= 26) {
            this.f30619b = new j();
        } else {
            this.f30619b = new i();
        }
        this.f30619b.a();
    }

    public void p(@o0 String str, Bundle bundle, @o0 m<List<MediaBrowserCompat.MediaItem>> mVar) {
        mVar.k(4);
        mVar.j(null);
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void q(String str, Bundle bundle) {
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void r(String str) {
    }

    void s(String str, Bundle bundle, f fVar, ResultReceiver resultReceiver) {
        d dVar = new d(str, resultReceiver);
        this.f30621d = fVar;
        k(str, bundle, dVar);
        this.f30621d = null;
        if (dVar.d()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    void t(String str, f fVar, Bundle bundle, Bundle bundle2) {
        a aVar = new a(str, fVar, str, bundle, bundle2);
        this.f30621d = fVar;
        if (bundle == null) {
            m(str, aVar);
        } else {
            n(str, aVar, bundle);
        }
        this.f30621d = null;
        if (!aVar.d()) {
            throw new IllegalStateException(k0.a(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), fVar.f30641a, " id=", str));
        }
    }

    void u(String str, f fVar, ResultReceiver resultReceiver) {
        b bVar = new b(str, resultReceiver);
        this.f30621d = fVar;
        o(str, bVar);
        this.f30621d = null;
        if (!bVar.d()) {
            throw new IllegalStateException(androidx.constraintlayout.core.motion.key.c.a("onLoadItem must call detach() or sendResult() before returning for id=", str));
        }
    }

    void v(String str, Bundle bundle, f fVar, ResultReceiver resultReceiver) {
        c cVar = new c(str, resultReceiver);
        this.f30621d = fVar;
        p(str, bundle, cVar);
        this.f30621d = null;
        if (!cVar.d()) {
            throw new IllegalStateException(androidx.constraintlayout.core.motion.key.c.a("onSearch must call detach() or sendResult() before returning for query=", str));
        }
    }

    boolean w(String str, f fVar, IBinder iBinder) {
        boolean z4 = false;
        try {
            if (iBinder != null) {
                List<androidx.core.util.s<IBinder, Bundle>> list = fVar.f30647g.get(str);
                if (list != null) {
                    Iterator<androidx.core.util.s<IBinder, Bundle>> it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == it.next().f26881a) {
                            it.remove();
                            z4 = true;
                        }
                    }
                    if (list.size() == 0) {
                        fVar.f30647g.remove(str);
                    }
                }
            } else if (fVar.f30647g.remove(str) != null) {
                z4 = true;
            }
            return z4;
        } finally {
            this.f30621d = fVar;
            r(str);
            this.f30621d = null;
        }
    }

    public void x(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null.");
        }
        if (this.f30623f != null) {
            throw new IllegalStateException("The session token has already been set.");
        }
        this.f30623f = token;
        this.f30619b.h(token);
    }
}
