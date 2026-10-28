package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* compiled from: LocalBroadcastManager.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f30549g = false;

    /* renamed from: h, reason: collision with root package name */
    static final int f30550h = 1;

    /* renamed from: j, reason: collision with root package name */
    private static a f30552j;

    /* renamed from: a, reason: collision with root package name */
    private final Context f30553a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<c>> f30554b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, ArrayList<c>> f30555c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<b> f30556d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private final Handler f30557e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f30548f = "LocalBroadcastManager";

    /* renamed from: i, reason: collision with root package name */
    private static final Object f30551i = new Object();

    /* compiled from: LocalBroadcastManager.java */
    /* renamed from: androidx.localbroadcastmanager.content.a$a, reason: collision with other inner class name */
    class HandlerC0510a extends Handler {
        HandlerC0510a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    /* compiled from: LocalBroadcastManager.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Intent f30559a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<c> f30560b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.f30559a = intent;
            this.f30560b = arrayList;
        }
    }

    /* compiled from: LocalBroadcastManager.java */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f30561a;

        /* renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f30562b;

        /* renamed from: c, reason: collision with root package name */
        boolean f30563c;

        /* renamed from: d, reason: collision with root package name */
        boolean f30564d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f30561a = intentFilter;
            this.f30562b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder a5 = androidx.fragment.app.a.a(128, "Receiver{");
            a5.append(this.f30562b);
            a5.append(" filter=");
            a5.append(this.f30561a);
            if (this.f30564d) {
                a5.append(" DEAD");
            }
            a5.append("}");
            return a5.toString();
        }
    }

    private a(Context context) {
        this.f30553a = context;
        this.f30557e = new HandlerC0510a(context.getMainLooper());
    }

    @o0
    public static a b(@o0 Context context) {
        a aVar;
        synchronized (f30551i) {
            try {
                if (f30552j == null) {
                    f30552j = new a(context.getApplicationContext());
                }
                aVar = f30552j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f30554b) {
                try {
                    size = this.f30556d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.f30556d.toArray(bVarArr);
                    this.f30556d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i4 = 0; i4 < size; i4++) {
                b bVar = bVarArr[i4];
                int size2 = bVar.f30560b.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    c cVar = bVar.f30560b.get(i5);
                    if (!cVar.f30564d) {
                        cVar.f30562b.onReceive(this.f30553a, bVar.f30559a);
                    }
                }
            }
        }
    }

    public void c(@o0 BroadcastReceiver broadcastReceiver, @o0 IntentFilter intentFilter) {
        synchronized (this.f30554b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList<c> arrayList = this.f30554b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f30554b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i4 = 0; i4 < intentFilter.countActions(); i4++) {
                    String action = intentFilter.getAction(i4);
                    ArrayList<c> arrayList2 = this.f30555c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f30555c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d(@o0 Intent intent) {
        int i4;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        boolean z4;
        synchronized (this.f30554b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f30553a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z5 = true;
                boolean z6 = (intent.getFlags() & 8) != 0;
                if (z6) {
                    intent.toString();
                }
                ArrayList<c> arrayList3 = this.f30555c.get(intent.getAction());
                if (arrayList3 != null) {
                    if (z6) {
                        arrayList3.toString();
                    }
                    ArrayList arrayList4 = null;
                    int i5 = 0;
                    while (i5 < arrayList3.size()) {
                        c cVar = arrayList3.get(i5);
                        if (z6) {
                            Objects.toString(cVar.f30561a);
                        }
                        if (cVar.f30563c) {
                            i4 = i5;
                            arrayList2 = arrayList3;
                            str = action;
                            str2 = resolveTypeIfNeeded;
                            arrayList = arrayList4;
                            z4 = z5;
                        } else {
                            IntentFilter intentFilter = cVar.f30561a;
                            String str3 = action;
                            String str4 = resolveTypeIfNeeded;
                            i4 = i5;
                            str = action;
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            str2 = resolveTypeIfNeeded;
                            z4 = z5;
                            int match = intentFilter.match(str3, str4, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z6) {
                                    Integer.toHexString(match);
                                }
                                arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                                arrayList4.add(cVar);
                                cVar.f30563c = z4;
                                i5 = i4 + 1;
                                z5 = z4;
                                action = str;
                                arrayList3 = arrayList2;
                                resolveTypeIfNeeded = str2;
                            }
                        }
                        arrayList4 = arrayList;
                        i5 = i4 + 1;
                        z5 = z4;
                        action = str;
                        arrayList3 = arrayList2;
                        resolveTypeIfNeeded = str2;
                    }
                    ArrayList arrayList5 = arrayList4;
                    boolean z7 = z5;
                    if (arrayList5 != null) {
                        for (int i6 = 0; i6 < arrayList5.size(); i6++) {
                            ((c) arrayList5.get(i6)).f30563c = false;
                        }
                        this.f30556d.add(new b(intent, arrayList5));
                        if (!this.f30557e.hasMessages(z7 ? 1 : 0)) {
                            this.f30557e.sendEmptyMessage(z7 ? 1 : 0);
                        }
                        return z7;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(@o0 Intent intent) {
        if (d(intent)) {
            a();
        }
    }

    public void f(@o0 BroadcastReceiver broadcastReceiver) {
        synchronized (this.f30554b) {
            try {
                ArrayList<c> remove = this.f30554b.remove(broadcastReceiver);
                if (remove == null) {
                    return;
                }
                for (int size = remove.size() - 1; size >= 0; size--) {
                    c cVar = remove.get(size);
                    cVar.f30564d = true;
                    for (int i4 = 0; i4 < cVar.f30561a.countActions(); i4++) {
                        String action = cVar.f30561a.getAction(i4);
                        ArrayList<c> arrayList = this.f30555c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = arrayList.get(size2);
                                if (cVar2.f30562b == broadcastReceiver) {
                                    cVar2.f30564d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f30555c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
