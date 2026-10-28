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
/* loaded from: classes.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f8766g = false;

    /* renamed from: h, reason: collision with root package name */
    static final int f8767h = 1;

    /* renamed from: j, reason: collision with root package name */
    private static a f8769j;

    /* renamed from: a, reason: collision with root package name */
    private final Context f8770a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<c>> f8771b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, ArrayList<c>> f8772c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<b> f8773d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private final Handler f8774e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f8765f = "LocalBroadcastManager";

    /* renamed from: i, reason: collision with root package name */
    private static final Object f8768i = new Object();

    /* compiled from: LocalBroadcastManager.java */
    /* renamed from: androidx.localbroadcastmanager.content.a$a, reason: collision with other inner class name */
    class HandlerC0105a extends Handler {
        HandlerC0105a(Looper looper) {
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
        final Intent f8776a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<c> f8777b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.f8776a = intent;
            this.f8777b = arrayList;
        }
    }

    /* compiled from: LocalBroadcastManager.java */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f8778a;

        /* renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f8779b;

        /* renamed from: c, reason: collision with root package name */
        boolean f8780c;

        /* renamed from: d, reason: collision with root package name */
        boolean f8781d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f8778a = intentFilter;
            this.f8779b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f8779b);
            sb.append(" filter=");
            sb.append(this.f8778a);
            if (this.f8781d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private a(Context context) {
        this.f8770a = context;
        this.f8774e = new HandlerC0105a(context.getMainLooper());
    }

    @o0
    public static a b(@o0 Context context) {
        a aVar;
        synchronized (f8768i) {
            if (f8769j == null) {
                f8769j = new a(context.getApplicationContext());
            }
            aVar = f8769j;
        }
        return aVar;
    }

    void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f8771b) {
                size = this.f8773d.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new b[size];
                this.f8773d.toArray(bVarArr);
                this.f8773d.clear();
            }
            for (int i5 = 0; i5 < size; i5++) {
                b bVar = bVarArr[i5];
                int size2 = bVar.f8777b.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    c cVar = bVar.f8777b.get(i6);
                    if (!cVar.f8781d) {
                        cVar.f8779b.onReceive(this.f8770a, bVar.f8776a);
                    }
                }
            }
        }
    }

    public void c(@o0 BroadcastReceiver broadcastReceiver, @o0 IntentFilter intentFilter) {
        synchronized (this.f8771b) {
            c cVar = new c(intentFilter, broadcastReceiver);
            ArrayList<c> arrayList = this.f8771b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f8771b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i5 = 0; i5 < intentFilter.countActions(); i5++) {
                String action = intentFilter.getAction(i5);
                ArrayList<c> arrayList2 = this.f8772c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f8772c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public boolean d(@o0 Intent intent) {
        int i5;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        boolean z5;
        synchronized (this.f8771b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f8770a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z6 = true;
            boolean z7 = (intent.getFlags() & 8) != 0;
            if (z7) {
                intent.toString();
            }
            ArrayList<c> arrayList3 = this.f8772c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z7) {
                    arrayList3.toString();
                }
                ArrayList arrayList4 = null;
                int i6 = 0;
                while (i6 < arrayList3.size()) {
                    c cVar = arrayList3.get(i6);
                    if (z7) {
                        Objects.toString(cVar.f8778a);
                    }
                    if (cVar.f8780c) {
                        i5 = i6;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                        z5 = z6;
                    } else {
                        IntentFilter intentFilter = cVar.f8778a;
                        String str3 = action;
                        String str4 = resolveTypeIfNeeded;
                        i5 = i6;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        z5 = z6;
                        int match = intentFilter.match(str3, str4, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z7) {
                                Integer.toHexString(match);
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(cVar);
                            cVar.f8780c = z5;
                            i6 = i5 + 1;
                            z6 = z5;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        }
                    }
                    arrayList4 = arrayList;
                    i6 = i5 + 1;
                    z6 = z5;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                boolean z8 = z6;
                if (arrayList5 != null) {
                    for (int i7 = 0; i7 < arrayList5.size(); i7++) {
                        ((c) arrayList5.get(i7)).f8780c = false;
                    }
                    this.f8773d.add(new b(intent, arrayList5));
                    if (!this.f8774e.hasMessages(z8 ? 1 : 0)) {
                        this.f8774e.sendEmptyMessage(z8 ? 1 : 0);
                    }
                    return z8;
                }
            }
            return false;
        }
    }

    public void e(@o0 Intent intent) {
        if (d(intent)) {
            a();
        }
    }

    public void f(@o0 BroadcastReceiver broadcastReceiver) {
        synchronized (this.f8771b) {
            ArrayList<c> remove = this.f8771b.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                c cVar = remove.get(size);
                cVar.f8781d = true;
                for (int i5 = 0; i5 < cVar.f8778a.countActions(); i5++) {
                    String action = cVar.f8778a.getAction(i5);
                    ArrayList<c> arrayList = this.f8772c.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            c cVar2 = arrayList.get(size2);
                            if (cVar2.f8779b == broadcastReceiver) {
                                cVar2.f8781d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f8772c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
